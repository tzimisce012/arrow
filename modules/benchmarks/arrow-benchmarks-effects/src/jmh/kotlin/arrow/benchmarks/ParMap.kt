package arrow.benchmarks

import arrow.effects.IO
import arrow.effects.IODispatchers
import arrow.effects.IOOf
import arrow.effects.extensions.io.concurrent.parMapN
import arrow.effects.fix
import arrow.effects.racePair
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.runBlocking
import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.CompilerControl
import org.openjdk.jmh.annotations.Fork
import org.openjdk.jmh.annotations.Measurement
import org.openjdk.jmh.annotations.Param
import org.openjdk.jmh.annotations.Scope
import org.openjdk.jmh.annotations.State
import org.openjdk.jmh.annotations.Warmup
import java.util.concurrent.TimeUnit
import kotlin.coroutines.CoroutineContext

@State(Scope.Thread)
@Fork(2)
@Warmup(iterations = 10, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 10)
@CompilerControl(CompilerControl.Mode.DONT_INLINE)
open class ParMap {

  @Param("100")
  var size: Int = 0

  private val arrowCtx = IODispatchers.CommonPool
  private val kotlinCtx = Dispatchers.Default

  private fun ioHelper(): IO<Int> = (0 until size).fold(IO.just(1)) { acc, i ->
    IO.parMapN(arrowCtx, acc, IO { i }) { a, b -> a + b }
  }

  private suspend fun kotlinxHelper(): Int = (0 until size).fold(1) { acc, i ->
    coroutineScope {
      val defA = async(kotlinCtx) { acc }
      val defB = async(kotlinCtx) { i }
      defA.await() + defB.await()
    }
  }

  @Benchmark
  fun io(): Int =
    ioHelper().unsafeRunSync()

  @Benchmark
  fun kotlinx(): Int = runBlocking {
    kotlinxHelper()
  }

  /** This will end up in IO.Companion in the coming weeks **/
  fun <A, B, C> IO.Companion.parMapN(ctx: CoroutineContext, fa: IOOf<A>, fb: IOOf<B>, f: (A, B) -> C): IO<C> =
    racePair(ctx, fa, fb).flatMap {
      it.fold(
        { (a, fiberB) -> fiberB.join().fix().map { b -> f(a, b) } },
        { (fiberA, b) -> fiberA.join().fix().map { a -> f(a, b) } }
      )
    }
}
