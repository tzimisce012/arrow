import arrow.effects.suspended.fx.Fx
import kotlinx.coroutines.asCoroutineDispatcher
import java.util.concurrent.ExecutorService
import java.util.concurrent.SynchronousQueue
import java.util.concurrent.ThreadFactory
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicInteger
import kotlin.coroutines.AbstractCoroutineContextElement
import kotlin.coroutines.Continuation
import kotlin.coroutines.ContinuationInterceptor
import kotlin.coroutines.CoroutineContext

class CountingThreadFactory(val name: String) : ThreadFactory {
  private val counter = AtomicInteger()
  override fun newThread(r: Runnable): Thread =
    Thread(r, "$name-${counter.getAndIncrement()}")
}

// Creates a ExecutorService that uses every thread only once, so every task is scheduled on a differently numbered Thread.
fun newTestingScheduler(name: String): ExecutorService =
  ThreadPoolExecutor(0, 2, 0, TimeUnit.MILLISECONDS, SynchronousQueue<Runnable>(), CountingThreadFactory(name))

// class TrampolineCtx(private val trampoline: EventLoop = EventLoop()) : AbstractCoroutineContextElement(ContinuationInterceptor), ContinuationInterceptor {
//   override fun <T> interceptContinuation(continuation: Continuation<T>): Continuation<T> =
//     TrampolineContinuation(trampoline, continuation.context.fold(continuation) { cont, element ->
//       if (element != this@TrampolineCtx && element is ContinuationInterceptor)
//         element.interceptContinuation(cont) else cont
//     })
// }
//
// private class TrampolineContinuation<T>(
//   val trampoline: EventLoop,
//   val cont: Continuation<T>
// ) : Continuation<T> {
//   override val context: CoroutineContext = cont.context
//
//   override fun resumeWith(result: Result<T>) {
//     trampoline.collectEvent(Runnable { cont.resumeWith(result) })
//   }
// }

fun main() {

  // runBlocking { }

  // Fx.unsafeRunBlocking(
  //   Fx.unit
  //     .continueOn(newTestingScheduler("test").asCoroutineDispatcher())
  //     .flatMap { Fx.lazy { Thread.currentThread().name } }
  // ).let(::println)

  val initialCC = newTestingScheduler("original-context").asCoroutineDispatcher()
  val asyncCC = newTestingScheduler("test-evalOn").asCoroutineDispatcher()
  val printThread = Fx.lazy { _ -> println(Thread.currentThread().name) }


  println("Start correctly")
  Fx.unsafeRunBlocking(                         // Starts on (EmptyCoroutineContext)
    printThread                                 // "main"
      .continueOn(initialCC)
      .flatMap { printThread }                 // "original-context-0"
      .flatMap { printThread.evalOn(asyncCC) } // "test-evalOn-0"
      .flatMap { printThread }                 // "original-context-1"
  )

  println("\nStart non correctly")
  Fx.unsafeRunBlocking(                        // Starts on (EmptyCoroutineContext)
    printThread                                // "main"
      .flatMap { printThread.evalOn(asyncCC) } // "test-evalOn-0"
      .flatMap { printThread }                 // "test-evalOn-0"
  )
}
