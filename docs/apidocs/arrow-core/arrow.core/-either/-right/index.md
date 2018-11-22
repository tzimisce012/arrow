---
title: Either.Right - arrow-core
---

[arrow-core](../../../index.html) / [arrow.core](../../index.html) / [Either](../index.html) / [Right](./index.html)

# Right

`data class Right<out B> : `[`Either`](../index.html)`<`[`Nothing`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)`, `[`B`](index.html#B)`>`

The right side of the disjoint union, as opposed to the [Left](../-left/index.html) side.

### Properties

| [b](b.html) | `val b: `[`B`](index.html#B) |

### Inherited Functions

| [bimap](../bimap.html) | `fun <C, D> bimap(leftOperation: (`[`A`](../index.html#A)`) -> `[`C`](../bimap.html#C)`, rightOperation: (`[`B`](../index.html#B)`) -> `[`D`](../bimap.html#D)`): `[`Either`](../index.html)`<`[`C`](../bimap.html#C)`, `[`D`](../bimap.html#D)`>`<br>Map over Left and Right of this Either |
| [exists](../exists.html) | `fun exists(predicate: (`[`B`](../index.html#B)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns `false` if [Left](../-left/index.html) or returns the result of the application of the given predicate to the [Right](./index.html) value. |
| [fold](../fold.html) | `fun <C> fold(ifLeft: (`[`A`](../index.html#A)`) -> `[`C`](../fold.html#C)`, ifRight: (`[`B`](../index.html#B)`) -> `[`C`](../fold.html#C)`): `[`C`](../fold.html#C)<br>Applies `ifLeft` if this is a [Left](../-left/index.html) or `ifRight` if this is a [Right](./index.html). |
| [foldLeft](../fold-left.html) | `fun <C> foldLeft(initial: `[`C`](../fold-left.html#C)`, rightOperation: (`[`C`](../fold-left.html#C)`, `[`B`](../index.html#B)`) -> `[`C`](../fold-left.html#C)`): `[`C`](../fold-left.html#C) |
| [foldRight](../fold-right.html) | `fun <C> foldRight(initial: `[`Eval`](../../-eval/index.html)`<`[`C`](../fold-right.html#C)`>, rightOperation: (`[`B`](../index.html#B)`, `[`Eval`](../../-eval/index.html)`<`[`C`](../fold-right.html#C)`>) -> `[`Eval`](../../-eval/index.html)`<`[`C`](../fold-right.html#C)`>): `[`Eval`](../../-eval/index.html)`<`[`C`](../fold-right.html#C)`>` |
| [isLeft](../is-left.html) | `fun isLeft(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isRight](../is-right.html) | `fun isRight(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [map](../map.html) | `fun <C> map(f: (`[`B`](../index.html#B)`) -> `[`C`](../map.html#C)`): `[`Either`](../index.html)`<`[`A`](../index.html#A)`, `[`C`](../map.html#C)`>`<br>The given function is applied if this is a `Right`. |
| [mapLeft](../map-left.html) | `fun <C> mapLeft(f: (`[`A`](../index.html#A)`) -> `[`C`](../map-left.html#C)`): `[`Either`](../index.html)`<`[`C`](../map-left.html#C)`, `[`B`](../index.html#B)`>`<br>The given function is applied if this is a `Left`. |
| [swap](../swap.html) | `fun swap(): `[`Either`](../index.html)`<`[`B`](../index.html#B)`, `[`A`](../index.html#A)`>`<br>If this is a `Left`, then return the left value in `Right` or vice versa. |
| [toOption](../to-option.html) | `fun toOption(): `[`Option`](../../-option/index.html)`<`[`B`](../index.html#B)`>`<br>Returns a [Some](../../-some/index.html) containing the [Right](./index.html) value if it exists or a [None](../../-none/index.html) if this is a [Left](../-left/index.html). |

### Companion Object Functions

| [invoke](invoke.html) | `operator fun <B> invoke(b: `[`B`](invoke.html#B)`): `[`Either`](../index.html)`<`[`Nothing`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)`, `[`B`](invoke.html#B)`>` |

