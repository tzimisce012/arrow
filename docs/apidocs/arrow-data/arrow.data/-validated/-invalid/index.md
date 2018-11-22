---
title: Validated.Invalid - arrow-data
---

[arrow-data](../../../index.html) / [arrow.data](../../index.html) / [Validated](../index.html) / [Invalid](./index.html)

# Invalid

`data class Invalid<out E> : `[`Validated`](../index.html)`<`[`E`](index.html#E)`, `[`Nothing`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `Invalid(e: `[`E`](index.html#E)`)` |

### Properties

| [e](e.html) | `val e: `[`E`](index.html#E) |

### Inherited Properties

| [isInvalid](../is-invalid.html) | `val isInvalid: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isValid](../is-valid.html) | `val isValid: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

### Inherited Functions

| [bimap](../bimap.html) | `fun <EE, AA> bimap(fe: (`[`E`](../index.html#E)`) -> `[`EE`](../bimap.html#EE)`, fa: (`[`A`](../index.html#A)`) -> `[`AA`](../bimap.html#AA)`): `[`Validated`](../index.html)`<`[`EE`](../bimap.html#EE)`, `[`AA`](../bimap.html#AA)`>`<br>Validated is a [functor.Bifunctor](#), this method applies one of the given functions. |
| [exist](../exist.html) | `fun exist(predicate: (`[`A`](../index.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Is this Valid and matching the given predicate |
| [fold](../fold.html) | `fun <B> fold(fe: (`[`E`](../index.html#E)`) -> `[`B`](../fold.html#B)`, fa: (`[`A`](../index.html#A)`) -> `[`B`](../fold.html#B)`): `[`B`](../fold.html#B) |
| [foldLeft](../fold-left.html) | `fun <B> foldLeft(b: `[`B`](../fold-left.html#B)`, f: (`[`B`](../fold-left.html#B)`, `[`A`](../index.html#A)`) -> `[`B`](../fold-left.html#B)`): `[`B`](../fold-left.html#B)<br>apply the given function to the value with the given B when valid, otherwise return the given B |
| [foldRight](../fold-right.html) | `fun <B> foldRight(lb: Eval<`[`B`](../fold-right.html#B)`>, f: (`[`A`](../index.html#A)`, Eval<`[`B`](../fold-right.html#B)`>) -> Eval<`[`B`](../fold-right.html#B)`>): Eval<`[`B`](../fold-right.html#B)`>` |
| [leftMap](../left-map.html) | `fun <EE> leftMap(f: (`[`E`](../index.html#E)`) -> `[`EE`](../left-map.html#EE)`): `[`Validated`](../index.html)`<`[`EE`](../left-map.html#EE)`, `[`A`](../index.html#A)`>`<br>Apply a function to an Invalid value, returning a new Invalid value. Or, if the original valid was Valid, return it. |
| [map](../map.html) | `fun <B> map(f: (`[`A`](../index.html#A)`) -> `[`B`](../map.html#B)`): `[`Validated`](../index.html)`<`[`E`](../index.html#E)`, `[`B`](../map.html#B)`>`<br>Apply a function to a Valid value, returning a new Valid value |
| [swap](../swap.html) | `fun swap(): `[`Validated`](../index.html)`<`[`A`](../index.html#A)`, `[`E`](../index.html#E)`>` |
| [toEither](../to-either.html) | `fun toEither(): Either<`[`E`](../index.html#E)`, `[`A`](../index.html#A)`>`<br>Converts the value to an Either&lt;E, A&gt; |
| [toList](../to-list.html) | `fun toList(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`A`](../index.html#A)`>`<br>Convert this value to a single element List if it is Valid, otherwise return an empty List |
| [toOption](../to-option.html) | `fun toOption(): Option<`[`A`](../index.html#A)`>`<br>Returns Valid values wrapped in Some, and None for Invalid values |
| [toValidatedNel](../to-validated-nel.html) | `fun toValidatedNel(): `[`ValidatedNel`](../../-validated-nel.html)`<`[`E`](../index.html#E)`, `[`A`](../index.html#A)`>`<br>Lift the Invalid value into a NonEmptyList. |
| [withEither](../with-either.html) | `fun <EE, B> withEither(f: (Either<`[`E`](../index.html#E)`, `[`A`](../index.html#A)`>) -> Either<`[`EE`](../with-either.html#EE)`, `[`B`](../with-either.html#B)`>): `[`Validated`](../index.html)`<`[`EE`](../with-either.html#EE)`, `[`B`](../with-either.html#B)`>`<br>Convert to an Either, apply a function, convert back. This is handy when you want to use the Monadic properties of the Either type. |

