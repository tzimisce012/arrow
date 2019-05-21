package arrow.benchmarks

import arrow.effects.IO
import arrow.effects.IODispatchers
import arrow.effects.fix
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.CompilerControl
import org.openjdk.jmh.annotations.Fork
import org.openjdk.jmh.annotations.Measurement
import org.openjdk.jmh.annotations.Param
import org.openjdk.jmh.annotations.Scope
import org.openjdk.jmh.annotations.State
import org.openjdk.jmh.annotations.Warmup
import java.util.concurrent.TimeUnit

@State(Scope.Thread)
@Fork(2)
@Warmup(iterations = 10, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 10)
@CompilerControl(CompilerControl.Mode.DONT_INLINE)
open class ForkFiber {

  @Param("100")
  var size: Int = 0

  private val arrowCtx = IODispatchers.CommonPool
  private val kotlinxCtx = Dispatchers.Default

  private fun ioStartLoop(i: Int): IO<Int> =
    if (i < size) {
      IO.just(i + 1).startFiber(arrowCtx).flatMap { fiber ->
        fiber.join().fix().flatMap { ioStartLoop(it) }
      }
    } else IO.just(i)

  private suspend fun kotlinxStartLoop(i: Int): Int =
    if (i < size) {
      coroutineScope {
        val ii = withContext(kotlinxCtx) { i + 1 }
        kotlinxStartLoop(ii)
      }
    } else i

  @Benchmark
  fun io(): Int =
    ioStartLoop(0).unsafeRunSync()

  @Benchmark
  fun kotlinx(): Int = runBlocking {
    kotlinxStartLoop(0)
  }
}
