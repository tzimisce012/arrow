package arrow.benchmarks

import arrow.effects.IO
import kotlinx.coroutines.runBlocking
import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.CompilerControl
import org.openjdk.jmh.annotations.Fork
import org.openjdk.jmh.annotations.Measurement
import org.openjdk.jmh.annotations.Scope
import org.openjdk.jmh.annotations.State
import org.openjdk.jmh.annotations.Warmup
import java.util.concurrent.TimeUnit

@State(Scope.Thread)
@Fork(2)
@Warmup(iterations = 10, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 10)
@CompilerControl(CompilerControl.Mode.DONT_INLINE)
open class DirectSyntax {

  fun ioFibLazy(n: Int): IO<Int> =
    if (n <= 1) IO { n }
    else ioFibLazy(n - 1).flatMap { a ->
      ioFibLazy(n - 2).flatMap { b -> IO { a + b } }
    }

  tailrec fun directFibLazy(index: Int, prev: Int = 1, current: Int = 0): Int =
    if (index <= 0) current
    else directFibLazy(index - 1, prev = prev + current, current = prev)

  @Benchmark
  fun io(): Int =
    ioFibLazy(10).unsafeRunSync()

  @Benchmark
  fun directIO(): Int = TODO()

  @Benchmark
  fun kotlinx(): Int = runBlocking {
    directFibLazy(10)
  }
}
