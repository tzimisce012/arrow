---
title: Ior.Right - arrow-data
---

[arrow-data](../../../index.html) / [arrow.data](../../index.html) / [Ior](../index.html) / [Right](./index.html)

# Right

`data class Right<out A, out B> : `[`Ior`](../index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`>`

### Properties

| [isBoth](is-both.html) | `val isBoth: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns `true` if this is a [Left](../-left/index.html), `false` otherwise. |
| [isLeft](is-left.html) | `val isLeft: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns `true` if this is a [Left](../-left/index.html), `false` otherwise. |
| [isRight](is-right.html) | `val isRight: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns `true` if this is a [Right](./index.html), `false` otherwise. |
| [value](value.html) | `val value: `[`B`](index.html#B) |

### Inherited Functions

| [bimap](../bimap.html) | `fun <C, D> bimap(fa: (`[`A`](../index.html#A)`) -> `[`C`](../bimap.html#C)`, fb: (`[`B`](../index.html#B)`) -> `[`D`](../bimap.html#D)`): `[`Ior`](../index.html)`<`[`C`](../bimap.html#C)`, `[`D`](../bimap.html#D)`>`<br>Apply `fa` if this is a [Left](../-left/index.html) or [Both](../-both/index.html) to `A` and apply `fb` if this is [Right](./index.html) or [Both](../-both/index.html) to `B` |
| [fold](../fold.html) | `fun <C> fold(fa: (`[`A`](../index.html#A)`) -> `[`C`](../fold.html#C)`, fb: (`[`B`](../index.html#B)`) -> `[`C`](../fold.html#C)`, fab: (`[`A`](../index.html#A)`, `[`B`](../index.html#B)`) -> `[`C`](../fold.html#C)`): `[`C`](../fold.html#C)<br>Applies `fa` if this is a [Left](../-left/index.html), `fb` if this is a [Right](./index.html) or `fab` if this is a [Both](../-both/index.html) |
| [foldLeft](../fold-left.html) | `fun <C> foldLeft(c: `[`C`](../fold-left.html#C)`, f: (`[`C`](../fold-left.html#C)`, `[`B`](../index.html#B)`) -> `[`C`](../fold-left.html#C)`): `[`C`](../fold-left.html#C) |
| [foldRight](../fold-right.html) | `fun <C> foldRight(lc: Eval<`[`C`](../fold-right.html#C)`>, f: (`[`B`](../index.html#B)`, Eval<`[`C`](../fold-right.html#C)`>) -> Eval<`[`C`](../fold-right.html#C)`>): Eval<`[`C`](../fold-right.html#C)`>` |
| [map](../map.html) | `fun <D> map(f: (`[`B`](../index.html#B)`) -> `[`D`](../map.html#D)`): `[`Ior`](../index.html)`<`[`A`](../index.html#A)`, `[`D`](../map.html#D)`>`<br>The given function is applied if this is a [Right](./index.html) or [Both](../-both/index.html) to `B`. |
| [mapLeft](../map-left.html) | `fun <C> mapLeft(fa: (`[`A`](../index.html#A)`) -> `[`C`](../map-left.html#C)`): `[`Ior`](../index.html)`<`[`C`](../map-left.html#C)`, `[`B`](../index.html#B)`>`<br>The given function is applied if this is a [Left](../-left/index.html) or [Both](../-both/index.html) to `A`. |
| [pad](../pad.html) | `fun pad(): `[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<Option<`[`A`](../index.html#A)`>, Option<`[`B`](../index.html#B)`>>`<br>Return this [Ior](../index.html) as [Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html) of [Option](#) |
| [swap](../swap.html) | `fun swap(): `[`Ior`](../index.html)`<`[`B`](../index.html#B)`, `[`A`](../index.html#A)`>`<br>If this is a [Left](../-left/index.html), then return the left value in [Right](./index.html) or vice versa, when this is [Both](../-both/index.html) , left and right values are swap |
| [toEither](../to-either.html) | `fun toEither(): Either<`[`A`](../index.html#A)`, `[`B`](../index.html#B)`>`<br>Returns a [Either.Right](#) containing the [Right](./index.html) value or `B` if this is [Right](./index.html) or [Both](../-both/index.html) and [Either.Left](#) if this is a [Left](../-left/index.html). |
| [toOption](../to-option.html) | `fun toOption(): Option<`[`B`](../index.html#B)`>`<br>Returns a [Some](#) containing the [Right](./index.html) value or `B` if this is [Right](./index.html) or [Both](../-both/index.html) and [None](#) if this is a [Left](../-left/index.html). |
| [toValidated](../to-validated.html) | `fun toValidated(): `[`Validated`](../../-validated/index.html)`<`[`A`](../index.html#A)`, `[`B`](../index.html#B)`>`<br>Returns a [Validated.Valid](../../-validated/-valid/index.html) containing the [Right](./index.html) value or `B` if this is [Right](./index.html) or [Both](../-both/index.html) and [Validated.Invalid](../../-validated/-invalid/index.html) if this is a [Left](../-left/index.html). |
| [traverse](../traverse.html) | `fun <G, C> traverse(GA: Applicative<`[`G`](../traverse.html#G)`>, f: (`[`B`](../index.html#B)`) -> Kind<`[`G`](../traverse.html#G)`, `[`C`](../traverse.html#C)`>): Kind<`[`G`](../traverse.html#G)`, `[`Ior`](../index.html)`<`[`A`](../index.html#A)`, `[`C`](../traverse.html#C)`>>` |
| [unwrap](../unwrap.html) | `fun unwrap(): Either<Either<`[`A`](../index.html#A)`, `[`B`](../index.html#B)`>, `[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<`[`A`](../index.html#A)`, `[`B`](../index.html#B)`>>`<br>Return the isomorphic [Either](#) of this [Ior](../index.html) |

### Companion Object Functions

| [invoke](invoke.html) | `operator fun <B> invoke(b: `[`B`](invoke.html#B)`): `[`Ior`](../index.html)`<`[`Nothing`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)`, `[`B`](invoke.html#B)`>` |

