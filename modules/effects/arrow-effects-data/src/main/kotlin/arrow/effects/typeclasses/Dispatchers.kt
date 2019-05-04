package arrow.effects.typeclasses

import kotlin.coroutines.CoroutineContext

interface Dispatchers<F> {
  fun default(): CoroutineContext
  fun main(): CoroutineContext
  fun newPool(n: Int): CoroutineContext
}
