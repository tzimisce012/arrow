package arrow.effects

import arrow.core.*
import arrow.core.Nel
import arrow.core.NonEmptyList

/**
 * Represents multiple (>1) exceptions were thrown.
 * */
data class CompositeFailure(
  val head: Throwable,
  val tail: Nel<Throwable>
) : Throwable("Multiple exceptions were thrown (${1 + tail.size}), first $head: ${head.message}", head) {

  /**
   * Gets all causes (guaranteed to have at least 2 elements).
   */
  val all: NonEmptyList<Throwable> = Nel(head, tail.all)

  companion object {

    /**
     * Constructor to create [CompositeFailure] from 2 [Throwable] and an optional rest of [Throwable]s.
     */
    operator fun invoke(first: Throwable, second: Throwable, rest: List<Throwable> = emptyList()): CompositeFailure =
      CompositeFailure(first, Nel(second, rest))

    /**
     * Tries to create a [CompositeFailure] from a [List].
     *
     * @return [Some] in case there were (>1) exceptions, or [None] otherwise.
     */
    fun fromList(error: List<Throwable>): Option<Throwable> = when {
      error.isEmpty() -> None
      error.size == 1 -> Some(error[0])
      else -> Some(invoke(error[0], error[1], error.drop(2)))
    }

  }
}

