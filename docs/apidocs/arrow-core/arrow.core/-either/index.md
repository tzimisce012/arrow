---
title: Either - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [Either](./index.html)

# Either

`@higherkind sealed class Either<out A, out B> : `[`EitherOf`](../-either-of.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`>`

Port of https://github.com/scala/scala/blob/v2.12.1/src/library/scala/util/Either.scala

Represents a value of one of two possible types (a disjoint union.)
An instance of Either is either an instance of [Left](-left/index.html) or [Right](-right/index.html).

### Types

| [Left](-left/index.html) | `data class Left<out A> : `[`Either`](./index.html)`<`[`A`](-left/index.html#A)`, `[`Nothing`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)`>`<br>The left side of the disjoint union, as opposed to the [Right](-right/index.html) side. |
| [Right](-right/index.html) | `data class Right<out B> : `[`Either`](./index.html)`<`[`Nothing`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)`, `[`B`](-right/index.html#B)`>`<br>The right side of the disjoint union, as opposed to the [Left](-left/index.html) side. |

### Functions

| [bimap](bimap.html) | `fun <C, D> bimap(leftOperation: (`[`A`](index.html#A)`) -> `[`C`](bimap.html#C)`, rightOperation: (`[`B`](index.html#B)`) -> `[`D`](bimap.html#D)`): `[`Either`](./index.html)`<`[`C`](bimap.html#C)`, `[`D`](bimap.html#D)`>`<br>Map over Left and Right of this Either |
| [exists](exists.html) | `fun exists(predicate: (`[`B`](index.html#B)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns `false` if [Left](-left/index.html) or returns the result of the application of the given predicate to the [Right](-right/index.html) value. |
| [fold](fold.html) | `fun <C> fold(ifLeft: (`[`A`](index.html#A)`) -> `[`C`](fold.html#C)`, ifRight: (`[`B`](index.html#B)`) -> `[`C`](fold.html#C)`): `[`C`](fold.html#C)<br>Applies `ifLeft` if this is a [Left](-left/index.html) or `ifRight` if this is a [Right](-right/index.html). |
| [foldLeft](fold-left.html) | `fun <C> foldLeft(initial: `[`C`](fold-left.html#C)`, rightOperation: (`[`C`](fold-left.html#C)`, `[`B`](index.html#B)`) -> `[`C`](fold-left.html#C)`): `[`C`](fold-left.html#C) |
| [foldRight](fold-right.html) | `fun <C> foldRight(initial: `[`Eval`](../-eval/index.html)`<`[`C`](fold-right.html#C)`>, rightOperation: (`[`B`](index.html#B)`, `[`Eval`](../-eval/index.html)`<`[`C`](fold-right.html#C)`>) -> `[`Eval`](../-eval/index.html)`<`[`C`](fold-right.html#C)`>): `[`Eval`](../-eval/index.html)`<`[`C`](fold-right.html#C)`>` |
| [isLeft](is-left.html) | `fun isLeft(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isRight](is-right.html) | `fun isRight(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [map](map.html) | `fun <C> map(f: (`[`B`](index.html#B)`) -> `[`C`](map.html#C)`): `[`Either`](./index.html)`<`[`A`](index.html#A)`, `[`C`](map.html#C)`>`<br>The given function is applied if this is a `Right`. |
| [mapLeft](map-left.html) | `fun <C> mapLeft(f: (`[`A`](index.html#A)`) -> `[`C`](map-left.html#C)`): `[`Either`](./index.html)`<`[`C`](map-left.html#C)`, `[`B`](index.html#B)`>`<br>The given function is applied if this is a `Left`. |
| [swap](swap.html) | `fun swap(): `[`Either`](./index.html)`<`[`B`](index.html#B)`, `[`A`](index.html#A)`>`<br>If this is a `Left`, then return the left value in `Right` or vice versa. |
| [toOption](to-option.html) | `fun toOption(): `[`Option`](../-option/index.html)`<`[`B`](index.html#B)`>`<br>Returns a [Some](../-some/index.html) containing the [Right](-right/index.html) value if it exists or a [None](../-none/index.html) if this is a [Left](-left/index.html). |

### Companion Object Functions

| [cond](cond.html) | `fun <L, R> cond(test: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, ifTrue: () -> `[`R`](cond.html#R)`, ifFalse: () -> `[`L`](cond.html#L)`): `[`Either`](./index.html)`<`[`L`](cond.html#L)`, `[`R`](cond.html#R)`>` |
| [left](left.html) | `fun <L> left(left: `[`L`](left.html#L)`): `[`Either`](./index.html)`<`[`L`](left.html#L)`, `[`Nothing`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)`>` |
| [right](right.html) | `fun <R> right(right: `[`R`](right.html#R)`): `[`Either`](./index.html)`<`[`Nothing`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)`, `[`R`](right.html#R)`>` |
| [tailRecM](tail-rec-m.html) | `tailrec fun <L, A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> Kind<`[`EitherPartialOf`](../-either-partial-of.html)`<`[`L`](tail-rec-m.html#L)`>, `[`Either`](./index.html)`<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): `[`Either`](./index.html)`<`[`L`](tail-rec-m.html#L)`, `[`B`](tail-rec-m.html#B)`>` |

### Extension Functions

| [ap](../arrow.-kind/ap.html) | `fun <A, B, C> `[`EitherOf`](../-either-of.html)`<`[`A`](../arrow.-kind/ap.html#A)`, `[`B`](../arrow.-kind/ap.html#B)`>.ap(ff: `[`EitherOf`](../-either-of.html)`<`[`A`](../arrow.-kind/ap.html#A)`, (`[`B`](../arrow.-kind/ap.html#B)`) -> `[`C`](../arrow.-kind/ap.html#C)`>): `[`Either`](./index.html)`<`[`A`](../arrow.-kind/ap.html#A)`, `[`C`](../arrow.-kind/ap.html#C)`>` |
| [combineK](../arrow.-kind/combine-k.html) | `fun <A, B> `[`EitherOf`](../-either-of.html)`<`[`A`](../arrow.-kind/combine-k.html#A)`, `[`B`](../arrow.-kind/combine-k.html#B)`>.combineK(y: `[`EitherOf`](../-either-of.html)`<`[`A`](../arrow.-kind/combine-k.html#A)`, `[`B`](../arrow.-kind/combine-k.html#B)`>): `[`Either`](./index.html)`<`[`A`](../arrow.-kind/combine-k.html#A)`, `[`B`](../arrow.-kind/combine-k.html#B)`>` |
| [contains](../arrow.-kind/contains.html) | `fun <A, B> `[`EitherOf`](../-either-of.html)`<`[`A`](../arrow.-kind/contains.html#A)`, `[`B`](../arrow.-kind/contains.html#B)`>.contains(elem: `[`B`](../arrow.-kind/contains.html#B)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns `true` if this is a [Either.Right](-right/index.html) and its value is equal to `elem` (as determined by `==`), returns `false` otherwise. |
| [filterOrElse](../arrow.-kind/filter-or-else.html) | `fun <A, B> `[`EitherOf`](../-either-of.html)`<`[`A`](../arrow.-kind/filter-or-else.html#A)`, `[`B`](../arrow.-kind/filter-or-else.html#B)`>.filterOrElse(predicate: (`[`B`](../arrow.-kind/filter-or-else.html#B)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, default: () -> `[`A`](../arrow.-kind/filter-or-else.html#A)`): `[`Either`](./index.html)`<`[`A`](../arrow.-kind/filter-or-else.html#A)`, `[`B`](../arrow.-kind/filter-or-else.html#B)`>`
* Returns [Either.Right](-right/index.html) with the existing value of [Either.Right](-right/index.html) if this is a [Either.Right](-right/index.html) and the given predicate holds for the right value.
* Returns `Left(default)` if this is a [Either.Right](-right/index.html) and the given predicate does not hold for the right value.
* Returns [Either.Left](-left/index.html) with the existing value of [Either.Left](-left/index.html) if this is a [Either.Left](-left/index.html).
<br> |
| [flatMap](../arrow.-kind/flat-map.html) | `fun <A, B, C> `[`EitherOf`](../-either-of.html)`<`[`A`](../arrow.-kind/flat-map.html#A)`, `[`B`](../arrow.-kind/flat-map.html#B)`>.flatMap(f: (`[`B`](../arrow.-kind/flat-map.html#B)`) -> `[`Either`](./index.html)`<`[`A`](../arrow.-kind/flat-map.html#A)`, `[`C`](../arrow.-kind/flat-map.html#C)`>): `[`Either`](./index.html)`<`[`A`](../arrow.-kind/flat-map.html#A)`, `[`C`](../arrow.-kind/flat-map.html#C)`>`<br>Binds the given function across [Either.Right](-right/index.html). |
| [getOrDefault](../arrow.-kind/get-or-default.html) | `fun <B> `[`TryOf`](../-try-of.html)`<`[`B`](../arrow.-kind/get-or-default.html#B)`>.getOrDefault(default: () -> `[`B`](../arrow.-kind/get-or-default.html#B)`): `[`B`](../arrow.-kind/get-or-default.html#B)<br>Returns the value from this `Success` or the given `default` argument if this is a `Failure`. |
| [getOrElse](../arrow.-kind/get-or-else.html) | `fun <B> `[`EitherOf`](../-either-of.html)`<*, `[`B`](../arrow.-kind/get-or-else.html#B)`>.getOrElse(default: () -> `[`B`](../arrow.-kind/get-or-else.html#B)`): `[`B`](../arrow.-kind/get-or-else.html#B)<br>Returns the value from this [Either.Right](-right/index.html) or the given argument if this is a [Either.Left](-left/index.html).`fun <B> `[`TryOf`](../-try-of.html)`<`[`B`](../arrow.-kind/get-or-else.html#B)`>.getOrElse(default: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`B`](../arrow.-kind/get-or-else.html#B)`): `[`B`](../arrow.-kind/get-or-else.html#B)<br>Returns the value from this `Success` or the given `default` argument if this is a `Failure`. |
| [getOrHandle](../arrow.-kind/get-or-handle.html) | `fun <A, B> `[`EitherOf`](../-either-of.html)`<`[`A`](../arrow.-kind/get-or-handle.html#A)`, `[`B`](../arrow.-kind/get-or-handle.html#B)`>.getOrHandle(default: (`[`A`](../arrow.-kind/get-or-handle.html#A)`) -> `[`B`](../arrow.-kind/get-or-handle.html#B)`): `[`B`](../arrow.-kind/get-or-handle.html#B)<br>Returns the value from this [Either.Right](-right/index.html) or allows clients to transform [Either.Left](-left/index.html) to [Either.Right](-right/index.html) while providing access to the value of [Either.Left](-left/index.html). |
| [invoke](../arrow.-kind/invoke.html) | `operator fun <A> `[`Function0Of`](../-function0-of.html)`<`[`A`](../arrow.-kind/invoke.html#A)`>.invoke(): `[`A`](../arrow.-kind/invoke.html#A)<br>`operator fun <I, O> `[`Function1Of`](../-function1-of.html)`<`[`I`](../arrow.-kind/invoke.html#I)`, `[`O`](../arrow.-kind/invoke.html#O)`>.invoke(i: `[`I`](../arrow.-kind/invoke.html#I)`): `[`O`](../arrow.-kind/invoke.html#O) |
| [leftIfNull](../arrow.-kind/left-if-null.html) | `fun <A, B> `[`EitherOf`](../-either-of.html)`<`[`A`](../arrow.-kind/left-if-null.html#A)`, `[`B`](../arrow.-kind/left-if-null.html#B)`?>.leftIfNull(default: () -> `[`A`](../arrow.-kind/left-if-null.html#A)`): `[`Either`](./index.html)`<`[`A`](../arrow.-kind/left-if-null.html#A)`, `[`B`](../arrow.-kind/left-if-null.html#B)`>`
* Returns [Either.Right](-right/index.html) with the existing value of [Either.Right](-right/index.html) if this is an [Either.Right](-right/index.html) with a non-null value. The returned Either.Right type is not nullable.
* Returns `Left(default())` if this is an [Either.Right](-right/index.html) and the existing value is null
* Returns [Either.Left](-left/index.html) with the existing value of [Either.Left](-left/index.html) if this is an [Either.Left](-left/index.html).
<br> |
| [or](../arrow.-kind/or.html) | `infix fun <T> `[`OptionOf`](../-option-of.html)`<`[`T`](../arrow.-kind/or.html#T)`>.or(value: `[`Option`](../-option/index.html)`<`[`T`](../arrow.-kind/or.html#T)`>): `[`Option`](../-option/index.html)`<`[`T`](../arrow.-kind/or.html#T)`>` |
| [orElse](../arrow.-kind/or-else.html) | `fun <A> `[`OptionOf`](../-option-of.html)`<`[`A`](../arrow.-kind/or-else.html#A)`>.orElse(alternative: () -> `[`Option`](../-option/index.html)`<`[`A`](../arrow.-kind/or-else.html#A)`>): `[`Option`](../-option/index.html)`<`[`A`](../arrow.-kind/or-else.html#A)`>`<br>Returns this option's if the option is nonempty, otherwise returns another option provided lazily by `default`.`fun <B, A : `[`B`](../arrow.-kind/or-else.html#B)`> `[`TryOf`](../-try-of.html)`<`[`A`](../arrow.-kind/or-else.html#A)`>.orElse(f: () -> `[`TryOf`](../-try-of.html)`<`[`B`](../arrow.-kind/or-else.html#B)`>): `[`Try`](../-try/index.html)`<`[`B`](../arrow.-kind/or-else.html#B)`>` |
| [recover](../arrow.-kind/recover.html) | `fun <B> `[`TryOf`](../-try-of.html)`<`[`B`](../arrow.-kind/recover.html#B)`>.recover(f: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`B`](../arrow.-kind/recover.html#B)`): `[`Try`](../-try/index.html)`<`[`B`](../arrow.-kind/recover.html#B)`>`<br>Applies the given function `f` if this is a `Failure`, otherwise returns this if this is a `Success`. This is like map for the exception. |
| [recoverWith](../arrow.-kind/recover-with.html) | `fun <B> `[`TryOf`](../-try-of.html)`<`[`B`](../arrow.-kind/recover-with.html#B)`>.recoverWith(f: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`TryOf`](../-try-of.html)`<`[`B`](../arrow.-kind/recover-with.html#B)`>): `[`Try`](../-try/index.html)`<`[`B`](../arrow.-kind/recover-with.html#B)`>`<br>Applies the given function `f` if this is a `Failure`, otherwise returns this if this is a `Success`. This is like `flatMap` for the exception. |
| [rescue](../arrow.-kind/rescue.html) | `fun <A> `[`TryOf`](../-try-of.html)`<`[`A`](../arrow.-kind/rescue.html#A)`>.~~rescue~~(f: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`TryOf`](../-try-of.html)`<`[`A`](../arrow.-kind/rescue.html#A)`>): `[`Try`](../-try/index.html)`<`[`A`](../arrow.-kind/rescue.html#A)`>` |
| [value](../arrow.-kind/value.html) | `fun <A> `[`IdOf`](../-id-of.html)`<`[`A`](../arrow.-kind/value.html#A)`>.value(): `[`A`](../arrow.-kind/value.html#A) |

### Inheritors

| [Left](-left/index.html) | `data class Left<out A> : `[`Either`](./index.html)`<`[`A`](-left/index.html#A)`, `[`Nothing`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)`>`<br>The left side of the disjoint union, as opposed to the [Right](-right/index.html) side. |
| [Right](-right/index.html) | `data class Right<out B> : `[`Either`](./index.html)`<`[`Nothing`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)`, `[`B`](-right/index.html#B)`>`<br>The right side of the disjoint union, as opposed to the [Left](-left/index.html) side. |

