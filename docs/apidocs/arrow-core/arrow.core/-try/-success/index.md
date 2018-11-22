---
title: Try.Success - arrow-core
---

[arrow-core](../../../index.html) / [arrow.core](../../index.html) / [Try](../index.html) / [Success](./index.html)

# Success

`data class Success<out A> : `[`Try`](../index.html)`<`[`A`](index.html#A)`>`

The `Success` type represents a computation that return a successfully computed value.

### Constructors

| [&lt;init&gt;](-init-.html) | `Success(value: `[`A`](index.html#A)`)`<br>The `Success` type represents a computation that return a successfully computed value. |

### Properties

| [value](value.html) | `val value: `[`A`](index.html#A) |

### Functions

| [isFailure](is-failure.html) | `fun isFailure(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isSuccess](is-success.html) | `fun isSuccess(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

### Inherited Functions

| [ap](../ap.html) | `fun <B> ap(ff: `[`TryOf`](../../-try-of.html)`<(`[`A`](../index.html#A)`) -> `[`B`](../ap.html#B)`>): `[`Try`](../index.html)`<`[`B`](../ap.html#B)`>` |
| [exists](../exists.html) | `fun exists(predicate: `[`Predicate`](../../-predicate.html)`<`[`A`](../index.html#A)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [failed](../failed.html) | `fun failed(): `[`Try`](../index.html)`<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>`<br>Inverts this `Try`. If this is a `Failure`, returns its exception wrapped in a `Success`. If this is a `Success`, returns a `Failure` containing an `UnsupportedOperationException`. |
| [filter](../filter.html) | `fun filter(p: `[`Predicate`](../../-predicate.html)`<`[`A`](../index.html#A)`>): `[`Try`](../index.html)`<`[`A`](../index.html#A)`>`<br>Converts this to a `Failure` if the predicate is not satisfied. |
| [flatMap](../flat-map.html) | `fun <B> flatMap(f: (`[`A`](../index.html#A)`) -> `[`TryOf`](../../-try-of.html)`<`[`B`](../flat-map.html#B)`>): `[`Try`](../index.html)`<`[`B`](../flat-map.html#B)`>`<br>Returns the given function applied to the value from this `Success` or returns this if this is a `Failure`. |
| [fold](../fold.html) | `fun <B> fold(ifFailure: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`B`](../fold.html#B)`, ifSuccess: (`[`A`](../index.html#A)`) -> `[`B`](../fold.html#B)`): `[`B`](../fold.html#B)<br>Applies `ifFailure` if this is a `Failure` or `ifSuccess` if this is a `Success`. |
| [foldLeft](../fold-left.html) | `fun <B> foldLeft(initial: `[`B`](../fold-left.html#B)`, operation: (`[`B`](../fold-left.html#B)`, `[`A`](../index.html#A)`) -> `[`B`](../fold-left.html#B)`): `[`B`](../fold-left.html#B) |
| [foldRight](../fold-right.html) | `fun <B> foldRight(initial: `[`Eval`](../../-eval/index.html)`<`[`B`](../fold-right.html#B)`>, operation: (`[`A`](../index.html#A)`, `[`Eval`](../../-eval/index.html)`<`[`B`](../fold-right.html#B)`>) -> `[`Eval`](../../-eval/index.html)`<`[`B`](../fold-right.html#B)`>): `[`Eval`](../../-eval/index.html)`<`[`B`](../fold-right.html#B)`>` |
| [map](../map.html) | `fun <B> map(f: (`[`A`](../index.html#A)`) -> `[`B`](../map.html#B)`): `[`Try`](../index.html)`<`[`B`](../map.html#B)`>`<br>Maps the given function to the value from this `Success` or returns this if this is a `Failure`. |
| [mapFilter](../map-filter.html) | `fun <B> mapFilter(f: (`[`A`](../index.html#A)`) -> `[`Option`](../../-option/index.html)`<`[`B`](../map-filter.html#B)`>): `[`Try`](../index.html)`<`[`B`](../map-filter.html#B)`>` |
| [toEither](../to-either.html) | `fun toEither(): `[`Either`](../../-either/index.html)`<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](../index.html#A)`>``fun <B> toEither(onLeft: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`B`](../to-either.html#B)`): `[`Either`](../../-either/index.html)`<`[`B`](../to-either.html#B)`, `[`A`](../index.html#A)`>`
* Convenient method to solve a common scenario when using [Try](../index.html). The created [Try](../index.html) object is often converted to [Either](../../-either/index.html), and right after [Either.mapLeft](../../-either/map-left.html) is called to translate the [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) to a domain specific error object.
* To make it easier this method takes an [onLeft](../to-either.html#arrow.core.Try$toEither(kotlin.Function1((kotlin.Throwable, arrow.core.Try.toEither.B)))/onLeft) error domain object supplier, which does the conversion to domain error in the same time as conversion to [Either](../../-either/index.html) occurs.
* So instead of
<br> |
| [toOption](../to-option.html) | `fun toOption(): `[`Option`](../../-option/index.html)`<`[`A`](../index.html#A)`>` |

