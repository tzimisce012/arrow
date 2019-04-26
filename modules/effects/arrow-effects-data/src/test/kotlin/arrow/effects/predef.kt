package arrow.effects

import arrow.Kind
import arrow.core.extensions.either.eq.eq
import arrow.core.extensions.option.eq.eq
import arrow.effects.typeclasses.Duration
import arrow.effects.typeclasses.seconds
import arrow.typeclasses.Eq
import java.util.concurrent.ExecutorService
import java.util.concurrent.SynchronousQueue
import java.util.concurrent.ThreadFactory
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicInteger

fun <A> EQ(EQA: Eq<A> = Eq.any(), timeout: Duration = 60.seconds): Eq<Kind<ForIO, A>> = Eq { a, b ->
  arrow.core.Option.eq(arrow.core.Either.eq(Eq.any(), EQA)).run {
    a.fix().attempt().unsafeRunTimed(timeout).eqv(b.fix().attempt().unsafeRunTimed(timeout))
  }
}

class CountingThreadFactory(val name: String) : ThreadFactory {
  private val counter = AtomicInteger()
  override fun newThread(r: Runnable): Thread =
    Thread(r, "$name-${counter.getAndIncrement()}")
}

// Creates a ExecutorService that uses every thread only once, so every task is scheduled on a differently numbered Thread.
fun newTestingScheduler(name: String): ExecutorService =
  ThreadPoolExecutor(0, 2, 0, TimeUnit.MILLISECONDS, SynchronousQueue<Runnable>(), CountingThreadFactory(name))
