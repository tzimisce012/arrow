package arrow.test.laws

import arrow.Kind
import arrow.core.Either
import arrow.core.Right
import arrow.core.Tuple2
import arrow.core.identity
import arrow.effects.CancelToken
import arrow.effects.typeclasses.Concurrent
import arrow.effects.typeclasses.ExitCase
import arrow.effects.typeclasses.fold
import arrow.test.generators.applicativeError
import arrow.test.generators.either
import arrow.test.generators.throwable
import arrow.typeclasses.Eq
import io.kotlintest.properties.Gen
import io.kotlintest.properties.forAll
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicReference

@Suppress("LargeClass")
object ConcurrentLaws {

  fun <F> laws(
    CF: Concurrent<F>,
    EQ: Eq<Kind<F, Int>>,
    EQ_EITHER: Eq<Kind<F, Either<Throwable, Int>>>,
    EQ_UNIT: Eq<Kind<F, Unit>>,
    testStackSafety: Boolean = true
  ): List<Law> =
    AsyncLaws.laws(CF, EQ, EQ_EITHER, testStackSafety) + listOf(
      Law("Concurrent Laws: cancel on bracket releases") { CF.cancelOnBracketReleases(EQ) },
      Law("Concurrent Laws: acquire is not cancelable") { CF.acquireBracketIsNotCancelable(EQ) },
      Law("Concurrent Laws: release is not cancelable") { CF.releaseBracketIsNotCancelable(EQ) },
      Law("Concurrent Laws: async cancelable coherence") { CF.asyncCancelableCoherence(EQ) },
      Law("Concurrent Laws: cancelable cancelableF coherence") { CF.cancelableCancelableFCoherence(EQ) },
      Law("Concurrent Laws: cancelable should run CancelToken on cancel") { CF.cancelableReceivesCancelSignal(EQ) },
      Law("Concurrent Laws: cancelableF should run CancelToken on cancel") { CF.cancelableFReceivesCancelSignal(EQ) },
      Law("Concurrent Laws: async can cancel upstream") { CF.asyncCanCancelUpstream(EQ) },
      Law("Concurrent Laws: async should run KindConnection on Fiber#cancel") { CF.asyncShouldRunKindConnectionOnCancel(EQ) },
      Law("Concurrent Laws: asyncF register can be cancelled") { CF.asyncFRegisterCanBeCancelled(EQ) },
      Law("Concurrent Laws: asyncF can cancel upstream") { CF.asyncFCanCancelUpstream(EQ) },
      Law("Concurrent Laws: asyncF should run KindConnection on Fiber#cancel") { CF.asyncFShouldRunKindConnectionOnCancel(EQ) },
      Law("Concurrent Laws: start join is identity") { CF.startJoinIsIdentity(EQ) },
      Law("Concurrent Laws: join is idempotent") { CF.joinIsIdempotent(EQ) },
      Law("Concurrent Laws: start cancel is unit") { CF.startCancelIsUnit(EQ_UNIT) },
      Law("Concurrent Laws: uncancelable mirrors source") { CF.uncancelableMirrorsSource(EQ) },
      Law("Concurrent Laws: race pair mirrors left winner") { CF.racePairMirrorsLeftWinner(EQ) },
      Law("Concurrent Laws: race pair mirrors right winner") { CF.racePairMirrorsRightWinner(EQ) },
      Law("Concurrent Laws: race pair can cancel loser") { CF.racePairCanCancelsLoser(EQ) },
      Law("Concurrent Laws: race pair can join left") { CF.racePairCanJoinLeft(EQ) },
      Law("Concurrent Laws: race pair can join right") { CF.racePairCanJoinRight(EQ) },
      Law("Concurrent Laws: cancelling race pair cancels both") { CF.racePairCancelCancelsBoth(EQ) },
      Law("Concurrent Laws: race pair is cancellable by participants") { CF.racePairCanBeCancelledByParticipants(EQ) },
      Law("Concurrent Laws: race triple mirrors left winner") { CF.raceTripleMirrorsLeftWinner(EQ) },
      Law("Concurrent Laws: race triple mirrors middle winner") { CF.raceTripleMirrorsMiddleWinner(EQ) },
      Law("Concurrent Laws: race triple mirrors right winner") { CF.raceTripleMirrorsRightWinner(EQ) },
      Law("Concurrent Laws: race triple can cancel loser") { CF.raceTripleCanCancelsLoser(EQ) },
      Law("Concurrent Laws: race triple can join left") { CF.raceTripleCanJoinLeft(EQ) },
      Law("Concurrent Laws: race triple can join middle") { CF.raceTripleCanJoinMiddle(EQ) },
      Law("Concurrent Laws: race triple can join right") { CF.raceTripleCanJoinRight(EQ) },
      Law("Concurrent Laws: race triple is cancellable by participants") { CF.raceTripleCanBeCancelledByParticipants(EQ) },
      Law("Concurrent Laws: cancelling race triple cancels all") { CF.raceTripleCancelCancelsAll(EQ) },
      Law("Concurrent Laws: race mirrors left winner") { CF.raceMirrorsLeftWinner(EQ) },
      Law("Concurrent Laws: race mirrors right winner") { CF.raceMirrorsRightWinner(EQ) },
      Law("Concurrent Laws: race cancels loser") { CF.raceCancelsLoser(EQ) },
      Law("Concurrent Laws: race cancels both") { CF.raceCancelCancelsBoth(EQ) },
      Law("Concurrent Laws: race is cancellable by participants") { CF.raceCanBeCancelledByParticipants(EQ) },
      Law("Concurrent Laws: parallel map cancels both") { CF.parMapCancelCancelsBoth(EQ) },
      Law("Concurrent Laws: parallel is cancellable by participants") { CF.parMapCanBeCancelledByParticipants(EQ) },
      Law("Concurrent Laws: action concurrent with pure value is just action") { CF.actionConcurrentWithPureValueIsJustAction(EQ) }
    )

  fun <F> Concurrent<F>.cancelOnBracketReleases(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.int()) { i ->
      bindingCancellable {
        val startLatch = Promise<Int>().bind() // A promise that `use` was executed
        val exitLatch = Promise<Int>().bind() // A promise that `release` was executed

        val (_, cancel) = just(i).bracketCase(
          use = { a -> startLatch.complete(a).flatMap { never<Int>() } },
          release = { r, exitCase ->
            when (exitCase) {
              is ExitCase.Canceled -> exitLatch.complete(r) // Fulfil promise that `release` was executed with Canceled
              else -> just(Unit)
            }
          }
        ).fork().bind() // Fork execution, allowing us to cancel it later

        val waitStart = startLatch.get().bind() // Waits on promise of `use`
        cancel.fork().bind() // Cancel bracketCase
        val waitExit = exitLatch.get().bind() // Observes cancellation via bracket's `release`

        waitStart + waitExit
      }.a.equalUnderTheLaw(just(i + i), EQ)
    }

  fun <F> Concurrent<F>.acquireBracketIsNotCancelable(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.int(), Gen.int()) { a, b ->
      bindingCancellable {
        val mvar = MVar(a).bind()
        val p = Promise<Unit>().bind()
        val task = p.complete(Unit).flatMap { mvar.put(b) }
          .bracket(use = { never<Int>() }, release = { just(Unit) })
        val (_, cancel) = task.fork().bind()
        p.get().bind()
        cancel.fork().bind()
        continueOn(dispatchers().default())
        mvar.take().bind()
        mvar.take().bind()
      }.a.equalUnderTheLaw(just(b), EQ)
    }

  fun <F> Concurrent<F>.releaseBracketIsNotCancelable(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.int(), Gen.int()) { a, b ->
      bindingCancellable {
        val mvar = MVar(a).bind()
        val p = Promise<Unit>().bind()
        val task = p.complete(Unit)
          .bracket(use = { never<Int>() }, release = { mvar.put(b) })
        val (_, cancel) = task.fork().bind()
        p.get().bind()
        cancel.fork().bind()
        continueOn(dispatchers().default())
        mvar.take().bind()
        mvar.take().bind()
      }.a.equalUnderTheLaw(just(b), EQ)
    }

  fun <F> Concurrent<F>.asyncCancelableCoherence(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.either(Gen.throwable(), Gen.int())) { eith ->
      async<Int> { cb -> cb(eith) }
        .equalUnderTheLaw(cancelable { cb -> cb(eith); just<Unit>(Unit) }, EQ)
    }

  fun <F> Concurrent<F>.cancelableCancelableFCoherence(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.either(Gen.throwable(), Gen.int())) { eith ->
      cancelable<Int> { cb -> cb(eith); just<Unit>(Unit) }
        .equalUnderTheLaw(cancelableF { cb -> delay { cb(eith); just<Unit>(Unit) } }, EQ)
    }

  fun <F> Concurrent<F>.cancelableReceivesCancelSignal(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.int()) { i ->
      bindingCancellable {
        val release = Promise<Int>().bind()
        val cancelToken: CancelToken<F> = release.complete(i)
        val latch = CountDownLatch(1)

        val (_, cancel) = cancelable<Unit> {
          latch.countDown()
          cancelToken
        }.fork().bind()

        shift().followedBy(asyncF<Unit> { cb ->
          delay { latch.await(500, TimeUnit.MILLISECONDS) }
            .map { cb(Right(Unit)) }
        }).bind()

        cancel.bind()
        release.get().bind()
      }.a.equalUnderTheLaw(just(i), EQ)
    }

  fun <F> Concurrent<F>.cancelableFReceivesCancelSignal(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.int()) { i ->
      bindingCancellable {
        val release = Promise<Int>().bind()
        val latch = Promise<Unit>().bind()
        val async = cancelableF<Unit> {
          latch.complete(Unit)
            .map { release.complete(i) }
        }
        val (_, cancel) = async.fork().bind()
        asyncF<Unit> { cb -> latch.get().map { cb(Right(it)) } }.bind()
        cancel.bind()
        release.get().bind()
      }.a.equalUnderTheLaw(just(i), EQ)
    }

  fun <F> Concurrent<F>.asyncCanCancelUpstream(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.int()) { i ->
      bindingCancellable {
        val latch = Promise<Int>().bind()
        val cancelToken = AtomicReference<CancelToken<F>>()
        val cancelLatch = CountDownLatch(1)

        val upstream = async<Unit> { conn, cb ->
          conn.push(latch.complete(i))
          cb(Right(Unit))
        }

        val downstream = async<Unit> { conn, _ ->
          cancelToken.set(conn.cancel())
          cancelLatch.countDown()
        }

        upstream.followedBy(downstream).fork().bind()

        delay(dispatchers().default()) {
          cancelLatch.await(500, TimeUnit.MILLISECONDS)
        }.flatMap { cancelToken.get() ?: raiseError(AssertionError("CancelToken was not set.")) }.fork().bind()

        latch.get().bind()
      }.a.equalUnderTheLaw(just(i), EQ)
    }

  fun <F> Concurrent<F>.asyncShouldRunKindConnectionOnCancel(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.int()) { i ->
      bindingCancellable {
        val latch = Promise<Int>().bind()
        val startLatch = CountDownLatch(1)

        val (_, cancel) = async<Unit> { conn, _ ->
          conn.push(latch.complete(i))
          startLatch.countDown()
        }.fork().bind()

        delay(dispatchers().default()) {
          startLatch.await(500, TimeUnit.MILLISECONDS)
        }.followedBy(cancel).bind()

        latch.get().bind()
      }.a.equalUnderTheLaw(just(i), EQ)
    }

  fun <F> Concurrent<F>.asyncFRegisterCanBeCancelled(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.int()) { i ->
      bindingCancellable {
        val release = Promise<Int>().bind()
        val acquire = Promise<Unit>().bind()
        val task = asyncF<Unit> { _, _ ->
          acquire.complete(Unit).bracket(use = { never<Unit>() }, release = { release.complete(i) })
        }
        val (_, cancel) = task.fork().bind()
        acquire.get().bind()
        cancel.fork().bind()
        release.get().bind()
      }.a.equalUnderTheLaw(just(i), EQ)
    }

  fun <F> Concurrent<F>.asyncFCanCancelUpstream(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.int()) { i ->
      bindingCancellable {
        val latch = Promise<Int>().bind()
        val upstream = async<Unit> { conn, cb ->
          conn.push(latch.complete(i))
          cb(Right(Unit))
        }
        val downstream = asyncF<Unit> { conn, _ ->
          conn.cancel()
        }

        upstream.followedBy(downstream).fork().bind()

        latch.get().bind()
      }.a.equalUnderTheLaw(just(i), EQ)
    }

  fun <F> Concurrent<F>.asyncFShouldRunKindConnectionOnCancel(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.int()) { i ->
      bindingCancellable {
        val latch = Promise<Int>().bind()
        val startLatch = Promise<Unit>().bind()

        val (_, cancel) = asyncF<Unit> { conn, _ ->
          conn.push(latch.complete(i))
          // Wait with cancellation until it is run, if it doesn't run its cancellation is also doesn't run.
          startLatch.complete(Unit)
        }.fork().bind()

        startLatch.get().flatMap { cancel }.bind()

        latch.get().bind()
      }.a.equalUnderTheLaw(just(i), EQ)
    }

  fun <F> Concurrent<F>.startJoinIsIdentity(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.int().applicativeError(this)) { fa ->
      fa.fork().flatMap { it.join() }.equalUnderTheLaw(fa, EQ)
    }

  fun <F> Concurrent<F>.joinIsIdempotent(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.int()) { i ->
      Promise<Int>().flatMap { p ->
        p.complete(i).fork()
          .flatMap { (join, _) -> join.followedBy(join) }
          .flatMap { p.get() }
      }.equalUnderTheLaw(just(i), EQ)
    }

  fun <F> Concurrent<F>.startCancelIsUnit(EQ_UNIT: Eq<Kind<F, Unit>>): Unit =
    forAll(Gen.int().applicativeError(this)) { fa ->
      fa.fork().flatMap { (_, cancel) -> cancel }
        .equalUnderTheLaw(just<Unit>(Unit), EQ_UNIT)
    }

  fun <F> Concurrent<F>.uncancelableMirrorsSource(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.int()) { i ->
      just(i).uncancelable().equalUnderTheLaw(just(i), EQ)
    }

  fun <F> Concurrent<F>.raceMirrorsLeftWinner(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.int().applicativeError(this)) { fa ->
      raceN(fa, never<Int>()).flatMap { either ->
        either.fold({ just(it) }, { raiseError(IllegalStateException("never() finished race")) })
      }.equalUnderTheLaw(fa, EQ)
    }

  fun <F> Concurrent<F>.raceMirrorsRightWinner(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.int().applicativeError(this)) { fa ->
      raceN(never<Int>(), fa).flatMap { either ->
        either.fold({ raiseError<Int>(IllegalStateException("never() finished race")) }, { just(it) })
      }.equalUnderTheLaw(fa, EQ)
    }

  fun <F> Concurrent<F>.raceCancelsLoser(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.either(Gen.throwable(), Gen.string()), Gen.bool(), Gen.int()) { eith, leftWins, i ->
      bindingCancellable {
        val s = Semaphore(0L).bind()
        val promise = Promise<Int>().bind()
        val winner = s.acquire().flatMap { async<String> { cb -> cb(eith) } }
        val loser = s.release().bracket(use = { never<Int>() }, release = { promise.complete(i) })
        val race =
          if (leftWins) raceN(winner, loser)
          else raceN(loser, winner)

        race.attempt().flatMap { promise.get() }.bind()
      }.a.equalUnderTheLaw(just(i), EQ)
    }

  fun <F> Concurrent<F>.raceCancelCancelsBoth(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.int(), Gen.int()) { a, b ->
      bindingCancellable {
        val s = Semaphore(0L).bind()
        val pa = Promise<Int>().bind()
        val pb = Promise<Int>().bind()

        val loserA = s.release().bracket(use = { never<String>() }, release = { pa.complete(a) })
        val loserB = s.release().bracket(use = { never<Int>() }, release = { pb.complete(b) })

        val (_, cancelRace) = raceN(loserA, loserB).fork().bind()
        s.acquireN(2L).flatMap { cancelRace }.bind()
        pa.get().bind() + pb.get().bind()
      }.a.equalUnderTheLaw(just(a + b), EQ)
    }

  fun <F> Concurrent<F>.raceCanBeCancelledByParticipants(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.int(), Gen.bool()) { i, shouldLeftCancel ->
      bindingCancellable {
        val endLatch = Promise<Int>().bind()
        val startLatch = Promise<Unit>().bind()

        val cancel = asyncF<Unit> { conn, cb -> startLatch.get().flatMap { conn.cancel().map { cb(Right(Unit)) } } }
        val loser = startLatch.complete(Unit) // guarantees that both cancel & loser started
          .bracket(use = { never<Int>() }, release = { endLatch.complete(i) })

        if (shouldLeftCancel) raceN(cancel, loser).fork().bind()
        else raceN(loser, cancel).fork().bind()

        endLatch.get().bind()
      }.a.equalUnderTheLaw(just(i), EQ)
    }

  fun <F> Concurrent<F>.racePairMirrorsLeftWinner(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.int().applicativeError(this)) { fa ->
      val never = never<Int>()
      val received = racePair(fa, never).flatMap { either ->
        either.fold({ (a, fiberB) ->
          fiberB.cancel().map { a }
        }, { raiseError(AssertionError("never() finished race")) })
      }

      received.equalUnderTheLaw(raceN(fa, never).map { it.fold(::identity, ::identity) }, EQ)
    }

  fun <F> Concurrent<F>.racePairMirrorsRightWinner(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.int().applicativeError(this)) { fa ->
      val never = never<Int>()
      val received = racePair(never, fa).flatMap { either ->
        either.fold({
          raiseError<Int>(AssertionError("never() finished race"))
        }, { (fiberA, b) -> fiberA.cancel().map { b } })
      }

      received.equalUnderTheLaw(raceN(never, fa).map { it.fold(::identity, ::identity) }, EQ)
    }

  fun <F> Concurrent<F>.racePairCanCancelsLoser(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.either(Gen.throwable(), Gen.string()), Gen.bool(), Gen.int()) { eith, leftWinner, i ->
      val received = bindingCancellable {
        val s = Semaphore(0L).bind()
        val p = Promise<Int>().bind()
        val winner = s.acquire().flatMap { async<String> { cb -> cb(eith) } }
        val loser = s.release().bracket(use = { never<String>() }, release = { p.complete(i) })
        val race = if (leftWinner) racePair(winner, loser)
        else racePair(loser, winner)

        race.attempt()
          .flatMap { attempt ->
            attempt.fold({ p.get() },
              {
                it.fold(
                  { (_, fiberB) -> fiberB.cancel().fork().flatMap { p.get() } },
                  { (fiberA, _) -> fiberA.cancel().fork().flatMap { p.get() } })
              })
          }.bind()
      }

      received.a.equalUnderTheLaw(just(i), EQ)
    }

  fun <F> Concurrent<F>.racePairCanJoinLeft(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.int()) { i ->
      Promise<Int>().flatMap { p ->
        racePair(p.get(), just(Unit)).flatMap { eith ->
          eith.fold(
            { (unit, _) -> just(unit) },
            { (fiber, _) -> p.complete(i).flatMap { fiber.join() } }
          )
        }
      }.equalUnderTheLaw(just(i), EQ)
    }

  fun <F> Concurrent<F>.racePairCanJoinRight(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.int()) { i ->
      Promise<Int>().flatMap { p ->
        racePair(just(Unit), p.get()).flatMap { eith ->
          eith.fold(
            { (_, fiber) -> p.complete(i).flatMap { fiber.join() } },
            { (_, unit) -> just(unit) }
          )
        }
      }.equalUnderTheLaw(just(i), EQ)
    }

  fun <F> Concurrent<F>.racePairCancelCancelsBoth(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.int(), Gen.int()) { a, b ->
      bindingCancellable {
        val s = Semaphore(0L).bind()
        val pa = Promise<Int>().bind()
        val pb = Promise<Int>().bind()

        val loserA: Kind<F, Int> = s.release().bracket(use = { never<Int>() }, release = { pa.complete(a) })
        val loserB: Kind<F, Int> = s.release().bracket(use = { never<Int>() }, release = { pb.complete(b) })

        val (_, cancelRacePair) = racePair(loserA, loserB).fork().bind()

        s.acquireN(2L).flatMap { cancelRacePair }.bind()
        pa.get().bind() + pb.get().bind()
      }.a.equalUnderTheLaw(just(a + b), EQ)
    }

  fun <F> Concurrent<F>.racePairCanBeCancelledByParticipants(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.int(), Gen.bool()) { i, shouldLeftCancel ->
      bindingCancellable {
        val endLatch = Promise<Int>().bind()
        val startLatch = Promise<Unit>().bind()

        val cancel = asyncF<Unit> { conn, cb -> startLatch.get().flatMap { conn.cancel().map { cb(Right(Unit)) } } }

        val loser = startLatch.complete(Unit) // guarantees that both cancel & loser actually started
          .bracket(use = { never<Int>() }, release = { endLatch.complete(i) })

        if (shouldLeftCancel) racePair(cancel, loser).fork().bind()
        else racePair(loser, cancel).fork().bind()

        endLatch.get().bind()
      }.a.equalUnderTheLaw(just(i), EQ)
    }

  fun <F> Concurrent<F>.raceTripleMirrorsLeftWinner(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.int().applicativeError(this)) { fa ->
      val never = never<Int>()
      val received = raceTriple(fa, never, never).flatMap { either ->
        either.fold(
          { (a, fiberB, fiberC) -> fiberB.cancel().followedBy(fiberC.cancel()).map { a } },
          { raiseError(AssertionError("never() finished race")) },
          { raiseError(AssertionError("never() finished race")) })
      }

      received.equalUnderTheLaw(raceN(fa, never, never).map { it.fold(::identity, ::identity, ::identity) }, EQ)
    }

  fun <F> Concurrent<F>.raceTripleMirrorsMiddleWinner(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.int().applicativeError(this)) { fa ->
      val never = never<Int>()
      val received = raceTriple(never, fa, never).flatMap { either ->
        either.fold(
          { raiseError<Int>(AssertionError("never() finished race")) },
          { (fiberA, b, fiberC) -> fiberA.cancel().followedBy(fiberC.cancel()).map { b } },
          { raiseError(AssertionError("never() finished race")) })
      }

      received.equalUnderTheLaw(raceN(never, fa, never).map { it.fold(::identity, ::identity, ::identity) }, EQ)
    }

  fun <F> Concurrent<F>.raceTripleMirrorsRightWinner(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.int().applicativeError(this)) { fa ->
      val never = never<Int>()
      val received = raceTriple(never, never, fa).flatMap { either ->
        either.fold(
          { raiseError<Int>(AssertionError("never() finished race")) },
          { raiseError(AssertionError("never() finished race")) },
          { (fiberA, fiberB, c) -> fiberA.cancel().followedBy(fiberB.cancel()).map { c } })
      }

      received.equalUnderTheLaw(raceN(never, never, fa).map { it.fold(::identity, ::identity, ::identity) }, EQ)
    }

  fun <F> Concurrent<F>.raceTripleCanCancelsLoser(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.either(Gen.throwable(), Gen.string()), Gen.from(listOf(1, 2, 3)), Gen.int(), Gen.int()) { eith, leftWinner, a, b ->
      val received = bindingCancellable {
        val s = Semaphore(0L).bind()
        val pa = Promise<Int>().bind()
        val pb = Promise<Int>().bind()

        val winner = s.acquireN(2).flatMap { async<String> { cb -> cb(eith) } }
        val loser = s.release().bracket(use = { never<String>() }, release = { pa.complete(a) })
        val loser2 = s.release().bracket(use = { never<String>() }, release = { pb.complete(b) })

        val race = when (leftWinner) {
          1 -> raceTriple(winner, loser, loser2)
          2 -> raceTriple(loser, winner, loser2)
          else -> raceTriple(loser, loser2, winner)
        }

        val combinePromises = pa.get().flatMap { a -> pb.get().map { b -> a + b } }

        race.attempt()
          .flatMap { attempt ->
            attempt.fold({ combinePromises },
              {
                it.fold(
                  { (_, fiberB, fiberC) ->
                    fiberB.cancel().followedBy(fiberC.cancel()).fork().flatMap { combinePromises }
                  },
                  { (fiberA, _, fiberC) ->
                    fiberA.cancel().followedBy(fiberC.cancel()).fork().flatMap { combinePromises }
                  },
                  { (fiberA, fiberB, _) ->
                    fiberA.cancel().followedBy(fiberB.cancel()).fork().flatMap { combinePromises }
                  })
              })
          }.bind()
      }

      received.a.equalUnderTheLaw(just(a + b), EQ)
    }

  fun <F> Concurrent<F>.raceTripleCanJoinLeft(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.int()) { i ->
      Promise<Int>().flatMap { p ->
        raceTriple(p.get(), just(Unit), never<Unit>()).flatMap { result ->
          result.fold(
            { raiseError<Int>(AssertionError("Promise#get can never win race")) },
            { (fiber, _, _) -> p.complete(i).flatMap { fiber.join() } },
            { raiseError(AssertionError("never() can never win race")) }
          )
        }
      }.equalUnderTheLaw(just(i), EQ)
    }

  fun <F> Concurrent<F>.raceTripleCanJoinMiddle(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.int()) { i ->
      Promise<Int>().flatMap { p ->
        raceTriple(just(Unit), p.get(), never<Unit>()).flatMap { result ->
          result.fold(
            { (_, fiber, _) -> p.complete(i).flatMap { fiber.join() } },
            { raiseError(AssertionError("Promise#get can never win race")) },
            { raiseError(AssertionError("never() can never win race")) }
          )
        }
      }.equalUnderTheLaw(just(i), EQ)
    }

  fun <F> Concurrent<F>.raceTripleCanJoinRight(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.int()) { i ->
      Promise<Int>().flatMap { p ->
        raceTriple(just(Unit), never<Unit>(), p.get()).flatMap { result ->
          result.fold(
            { (_, _, fiber) -> p.complete(i).flatMap { fiber.join() } },
            { raiseError(AssertionError("never() can never win race")) },
            { raiseError(AssertionError("Promise#get can never win race")) }
          )
        }
      }.equalUnderTheLaw(just(i), EQ)
    }

  fun <F> Concurrent<F>.raceTripleCanBeCancelledByParticipants(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.int(), Gen.from(listOf(1, 2, 3))) { i, shouldCancel ->
      bindingCancellable {
        val endLatch = Promise<Int>().bind()
        val startLatch = Promise<Unit>().bind()
        val start2Latch = Promise<Unit>().bind()

        val cancel = asyncF<Unit> { conn, cb ->
          startLatch.get().followedBy(start2Latch.get())
            .flatMap { conn.cancel().map { cb(Right(Unit)) } }
        }

        val loser = startLatch.complete(Unit) // guarantees that both cancel & loser actually started
          .bracket(use = { never<Int>() }, release = { endLatch.complete(i) })
        val loser2 = start2Latch.complete(Unit) // guarantees that both cancel & loser actually started
          .bracket(use = { never<Int>() }, release = { endLatch.complete(i) })

        when (shouldCancel) {
          1 -> raceTriple(cancel, loser, loser2).fork().bind()
          2 -> raceTriple(loser, cancel, loser2).fork().bind()
          else -> raceTriple(loser, loser2, cancel).fork().bind()
        }

        endLatch.get().bind()
      }.a.equalUnderTheLaw(just(i), EQ)
    }

  fun <F> Concurrent<F>.raceTripleCancelCancelsAll(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.int(), Gen.int(), Gen.int()) { a, b, c ->
      bindingCancellable {
        val s = Semaphore(0L).bind()
        val pa = Promise<Int>().bind()
        val pb = Promise<Int>().bind()
        val pc = Promise<Int>().bind()

        val loserA: Kind<F, Int> = s.release().bracket(use = { never<Int>() }, release = { pa.complete(a) })
        val loserB: Kind<F, Int> = s.release().bracket(use = { never<Int>() }, release = { pb.complete(b) })
        val loserC: Kind<F, Int> = s.release().bracket(use = { never<Int>() }, release = { pc.complete(c) })

        val (_, cancelRacePair) = raceTriple(loserA, loserB, loserC).fork().bind()

        s.acquireN(3L).flatMap { cancelRacePair }.bind()
        pa.get().bind() + pb.get().bind() + pc.get().bind()
      }.a.equalUnderTheLaw(just(a + b + c), EQ)
    }

  fun <F> Concurrent<F>.parMapCancelCancelsBoth(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.int(), Gen.int()) { a, b ->
      bindingCancellable {
        val s = Semaphore(0L).bind()
        val pa = Promise<Int>().bind()
        val pb = Promise<Int>().bind()

        val loserA = s.release().bracket(use = { never<String>() }, release = { pa.complete(a) })
        val loserB = s.release().bracket(use = { never<Int>() }, release = { pb.complete(b) })

        val (_, cancelParMapN) = parMapN(loserA, loserB, ::Tuple2).fork().bind()
        s.acquireN(2L).flatMap { cancelParMapN }.bind()
        pa.get().bind() + pb.get().bind()
      }.a.equalUnderTheLaw(just(a + b), EQ)
    }

  fun <F> Concurrent<F>.parMapCanBeCancelledByParticipants(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.int(), Gen.bool()) { i, shouldLeftCancel ->
      bindingCancellable {
        val endLatch = Promise<Int>().bind()
        val startLatch = Promise<Unit>().bind()

        val cancel = asyncF<Unit> { conn, cb -> startLatch.get().flatMap { conn.cancel().map { cb(Right(Unit)) } } }
        val loser = startLatch.complete(Unit).bracket(use = { never<Int>() }, release = { endLatch.complete(i) })

        if (shouldLeftCancel) parMapN(cancel, loser, ::Tuple2).fork().bind()
        else parMapN(loser, cancel, ::Tuple2).fork().bind()

        endLatch.get().bind()
      }.a.equalUnderTheLaw(just(i), EQ)
    }

  fun <F> Concurrent<F>.actionConcurrentWithPureValueIsJustAction(EQ: Eq<Kind<F, Int>>): Unit =
    forAll(Gen.int().map(::just), Gen.int()) { fa, i ->
      i.just().fork().flatMap { (join, _) ->
        fa.flatMap {
          join.map { i }
        }
      }.equalUnderTheLaw(just(i), EQ)
    }
}
