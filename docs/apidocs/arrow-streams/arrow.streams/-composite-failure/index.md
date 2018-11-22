---
title: CompositeFailure - arrow-streams
---

[arrow-streams](../../index.html) / [arrow.streams](../index.html) / [CompositeFailure](./index.html)

# CompositeFailure

`data class CompositeFailure : `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)

Represents multiple (&gt;1) exceptions were thrown.

### Constructors

| [&lt;init&gt;](-init-.html) | `CompositeFailure(head: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, tail: Nel<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>)`<br>Represents multiple (&gt;1) exceptions were thrown. |

### Properties

| [all](all.html) | `val all: NonEmptyList<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>`<br>Gets all causes (guaranteed to have at least 2 elements). |
| [head](head.html) | `val head: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) |
| [tail](tail.html) | `val tail: Nel<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>` |

### Companion Object Functions

| [fromList](from-list.html) | `fun fromList(error: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>): Option<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>` |
| [fromResults](from-results.html) | `fun fromResults(first: Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, second: Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`<br>Builds composite failure from the results supplied. |
| [invoke](invoke.html) | `operator fun invoke(first: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, second: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, rest: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`> = emptyList()): `[`CompositeFailure`](./index.html) |

### Extension Functions

| [raiseError](../../arrow.streams.internal.freec.applicative-error/kotlin.-throwable/raise-error.html) | `fun <F, A> `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`.raiseError(): `[`FreeC`](../../arrow.streams.internal/-free-c/index.html)`<`[`F`](../../arrow.streams.internal.freec.applicative-error/kotlin.-throwable/raise-error.html#F)`, `[`A`](../../arrow.streams.internal.freec.applicative-error/kotlin.-throwable/raise-error.html#A)`>` |

