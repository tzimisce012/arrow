---
title: Id - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [Id](./index.html)

# Id

`@higherkind data class Id<out A> : `[`IdOf`](../-id-of.html)`<`[`A`](index.html#A)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `Id(value: `[`A`](index.html#A)`)` |

### Properties

| [value](value.html) | `val value: `[`A`](index.html#A) |

### Functions

| [ap](ap.html) | `fun <B> ap(ff: `[`IdOf`](../-id-of.html)`<(`[`A`](index.html#A)`) -> `[`B`](ap.html#B)`>): `[`Id`](./index.html)`<`[`B`](ap.html#B)`>` |
| [coflatMap](coflat-map.html) | `fun <B> coflatMap(f: (`[`IdOf`](../-id-of.html)`<`[`A`](index.html#A)`>) -> `[`B`](coflat-map.html#B)`): `[`Id`](./index.html)`<`[`B`](coflat-map.html#B)`>` |
| [equals](equals.html) | `fun equals(other: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [extract](extract.html) | `fun extract(): `[`A`](index.html#A) |
| [flatMap](flat-map.html) | `fun <B> flatMap(f: (`[`A`](index.html#A)`) -> `[`IdOf`](../-id-of.html)`<`[`B`](flat-map.html#B)`>): `[`Id`](./index.html)`<`[`B`](flat-map.html#B)`>` |
| [foldLeft](fold-left.html) | `fun <B> foldLeft(initial: `[`B`](fold-left.html#B)`, operation: (`[`B`](fold-left.html#B)`, `[`A`](index.html#A)`) -> `[`B`](fold-left.html#B)`): `[`B`](fold-left.html#B) |
| [foldRight](fold-right.html) | `fun <B> foldRight(initial: `[`Eval`](../-eval/index.html)`<`[`B`](fold-right.html#B)`>, operation: (`[`A`](index.html#A)`, `[`Eval`](../-eval/index.html)`<`[`B`](fold-right.html#B)`>) -> `[`Eval`](../-eval/index.html)`<`[`B`](fold-right.html#B)`>): `[`Eval`](../-eval/index.html)`<`[`B`](fold-right.html#B)`>` |
| [map](map.html) | `fun <B> map(f: (`[`A`](index.html#A)`) -> `[`B`](map.html#B)`): `[`Id`](./index.html)`<`[`B`](map.html#B)`>` |

### Companion Object Functions

| [just](just.html) | `fun <A> just(a: `[`A`](just.html#A)`): `[`Id`](./index.html)`<`[`A`](just.html#A)`>` |
| [tailRecM](tail-rec-m.html) | `tailrec fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> `[`IdOf`](../-id-of.html)`<`[`Either`](../-either/index.html)`<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): `[`Id`](./index.html)`<`[`B`](tail-rec-m.html#B)`>` |

### Extension Functions

| [ap](../arrow.-kind/ap.html) | `fun <A, B, C> `[`EitherOf`](../-either-of.html)`<`[`A`](../arrow.-kind/ap.html#A)`, `[`B`](../arrow.-kind/ap.html#B)`>.ap(ff: `[`EitherOf`](../-either-of.html)`<`[`A`](../arrow.-kind/ap.html#A)`, (`[`B`](../arrow.-kind/ap.html#B)`) -> `[`C`](../arrow.-kind/ap.html#C)`>): `[`Either`](../-either/index.html)`<`[`A`](../arrow.-kind/ap.html#A)`, `[`C`](../arrow.-kind/ap.html#C)`>` |
| [combineK](../arrow.-kind/combine-k.html) | `fun <A, B> `[`EitherOf`](../-either-of.html)`<`[`A`](../arrow.-kind/combine-k.html#A)`, `[`B`](../arrow.-kind/combine-k.html#B)`>.combineK(y: `[`EitherOf`](../-either-of.html)`<`[`A`](../arrow.-kind/combine-k.html#A)`, `[`B`](../arrow.-kind/combine-k.html#B)`>): `[`Either`](../-either/index.html)`<`[`A`](../arrow.-kind/combine-k.html#A)`, `[`B`](../arrow.-kind/combine-k.html#B)`>` |
| [contains](../arrow.-kind/contains.html) | `fun <A, B> `[`EitherOf`](../-either-of.html)`<`[`A`](../arrow.-kind/contains.html#A)`, `[`B`](../arrow.-kind/contains.html#B)`>.contains(elem: `[`B`](../arrow.-kind/contains.html#B)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns `true` if this is a [Either.Right](../-either/-right/index.html) and its value is equal to `elem` (as determined by `==`), returns `false` otherwise. |
| [filterOrElse](../arrow.-kind/filter-or-else.html) | `fun <A, B> `[`EitherOf`](../-either-of.html)`<`[`A`](../arrow.-kind/filter-or-else.html#A)`, `[`B`](../arrow.-kind/filter-or-else.html#B)`>.filterOrElse(predicate: (`[`B`](../arrow.-kind/filter-or-else.html#B)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, default: () -> `[`A`](../arrow.-kind/filter-or-else.html#A)`): `[`Either`](../-either/index.html)`<`[`A`](../arrow.-kind/filter-or-else.html#A)`, `[`B`](../arrow.-kind/filter-or-else.html#B)`>`
* Returns [Either.Right](../-either/-right/index.html) with the existing value of [Either.Right](../-either/-right/index.html) if this is a [Either.Right](../-either/-right/index.html) and the given predicate holds for the right value.
* Returns `Left(default)` if this is a [Either.Right](../-either/-right/index.html) and the given predicate does not hold for the right value.
* Returns [Either.Left](../-either/-left/index.html) with the existing value of [Either.Left](../-either/-left/index.html) if this is a [Either.Left](../-either/-left/index.html).
<br> |
| [flatMap](../arrow.-kind/flat-map.html) | `fun <A, B, C> `[`EitherOf`](../-either-of.html)`<`[`A`](../arrow.-kind/flat-map.html#A)`, `[`B`](../arrow.-kind/flat-map.html#B)`>.flatMap(f: (`[`B`](../arrow.-kind/flat-map.html#B)`) -> `[`Either`](../-either/index.html)`<`[`A`](../arrow.-kind/flat-map.html#A)`, `[`C`](../arrow.-kind/flat-map.html#C)`>): `[`Either`](../-either/index.html)`<`[`A`](../arrow.-kind/flat-map.html#A)`, `[`C`](../arrow.-kind/flat-map.html#C)`>`<br>Binds the given function across [Either.Right](../-either/-right/index.html). |
| [getOrDefault](../arrow.-kind/get-or-default.html) | `fun <B> `[`TryOf`](../-try-of.html)`<`[`B`](../arrow.-kind/get-or-default.html#B)`>.getOrDefault(default: () -> `[`B`](../arrow.-kind/get-or-default.html#B)`): `[`B`](../arrow.-kind/get-or-default.html#B)<br>Returns the value from this `Success` or the given `default` argument if this is a `Failure`. |
| [getOrElse](../arrow.-kind/get-or-else.html) | `fun <B> `[`EitherOf`](../-either-of.html)`<*, `[`B`](../arrow.-kind/get-or-else.html#B)`>.getOrElse(default: () -> `[`B`](../arrow.-kind/get-or-else.html#B)`): `[`B`](../arrow.-kind/get-or-else.html#B)<br>Returns the value from this [Either.Right](../-either/-right/index.html) or the given argument if this is a [Either.Left](../-either/-left/index.html).`fun <B> `[`TryOf`](../-try-of.html)`<`[`B`](../arrow.-kind/get-or-else.html#B)`>.getOrElse(default: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`B`](../arrow.-kind/get-or-else.html#B)`): `[`B`](../arrow.-kind/get-or-else.html#B)<br>Returns the value from this `Success` or the given `default` argument if this is a `Failure`. |
| [getOrHandle](../arrow.-kind/get-or-handle.html) | `fun <A, B> `[`EitherOf`](../-either-of.html)`<`[`A`](../arrow.-kind/get-or-handle.html#A)`, `[`B`](../arrow.-kind/get-or-handle.html#B)`>.getOrHandle(default: (`[`A`](../arrow.-kind/get-or-handle.html#A)`) -> `[`B`](../arrow.-kind/get-or-handle.html#B)`): `[`B`](../arrow.-kind/get-or-handle.html#B)<br>Returns the value from this [Either.Right](../-either/-right/index.html) or allows clients to transform [Either.Left](../-either/-left/index.html) to [Either.Right](../-either/-right/index.html) while providing access to the value of [Either.Left](../-either/-left/index.html). |
| [invoke](../arrow.-kind/invoke.html) | `operator fun <A> `[`Function0Of`](../-function0-of.html)`<`[`A`](../arrow.-kind/invoke.html#A)`>.invoke(): `[`A`](../arrow.-kind/invoke.html#A)<br>`operator fun <I, O> `[`Function1Of`](../-function1-of.html)`<`[`I`](../arrow.-kind/invoke.html#I)`, `[`O`](../arrow.-kind/invoke.html#O)`>.invoke(i: `[`I`](../arrow.-kind/invoke.html#I)`): `[`O`](../arrow.-kind/invoke.html#O) |
| [leftIfNull](../arrow.-kind/left-if-null.html) | `fun <A, B> `[`EitherOf`](../-either-of.html)`<`[`A`](../arrow.-kind/left-if-null.html#A)`, `[`B`](../arrow.-kind/left-if-null.html#B)`?>.leftIfNull(default: () -> `[`A`](../arrow.-kind/left-if-null.html#A)`): `[`Either`](../-either/index.html)`<`[`A`](../arrow.-kind/left-if-null.html#A)`, `[`B`](../arrow.-kind/left-if-null.html#B)`>`
* Returns [Either.Right](../-either/-right/index.html) with the existing value of [Either.Right](../-either/-right/index.html) if this is an [Either.Right](../-either/-right/index.html) with a non-null value. The returned Either.Right type is not nullable.
* Returns `Left(default())` if this is an [Either.Right](../-either/-right/index.html) and the existing value is null
* Returns [Either.Left](../-either/-left/index.html) with the existing value of [Either.Left](../-either/-left/index.html) if this is an [Either.Left](../-either/-left/index.html).
<br> |
| [or](../arrow.-kind/or.html) | `infix fun <T> `[`OptionOf`](../-option-of.html)`<`[`T`](../arrow.-kind/or.html#T)`>.or(value: `[`Option`](../-option/index.html)`<`[`T`](../arrow.-kind/or.html#T)`>): `[`Option`](../-option/index.html)`<`[`T`](../arrow.-kind/or.html#T)`>` |
| [orElse](../arrow.-kind/or-else.html) | `fun <A> `[`OptionOf`](../-option-of.html)`<`[`A`](../arrow.-kind/or-else.html#A)`>.orElse(alternative: () -> `[`Option`](../-option/index.html)`<`[`A`](../arrow.-kind/or-else.html#A)`>): `[`Option`](../-option/index.html)`<`[`A`](../arrow.-kind/or-else.html#A)`>`<br>Returns this option's if the option is nonempty, otherwise returns another option provided lazily by `default`.`fun <B, A : `[`B`](../arrow.-kind/or-else.html#B)`> `[`TryOf`](../-try-of.html)`<`[`A`](../arrow.-kind/or-else.html#A)`>.orElse(f: () -> `[`TryOf`](../-try-of.html)`<`[`B`](../arrow.-kind/or-else.html#B)`>): `[`Try`](../-try/index.html)`<`[`B`](../arrow.-kind/or-else.html#B)`>` |
| [recover](../arrow.-kind/recover.html) | `fun <B> `[`TryOf`](../-try-of.html)`<`[`B`](../arrow.-kind/recover.html#B)`>.recover(f: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`B`](../arrow.-kind/recover.html#B)`): `[`Try`](../-try/index.html)`<`[`B`](../arrow.-kind/recover.html#B)`>`<br>Applies the given function `f` if this is a `Failure`, otherwise returns this if this is a `Success`. This is like map for the exception. |
| [recoverWith](../arrow.-kind/recover-with.html) | `fun <B> `[`TryOf`](../-try-of.html)`<`[`B`](../arrow.-kind/recover-with.html#B)`>.recoverWith(f: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`TryOf`](../-try-of.html)`<`[`B`](../arrow.-kind/recover-with.html#B)`>): `[`Try`](../-try/index.html)`<`[`B`](../arrow.-kind/recover-with.html#B)`>`<br>Applies the given function `f` if this is a `Failure`, otherwise returns this if this is a `Success`. This is like `flatMap` for the exception. |
| [rescue](../arrow.-kind/rescue.html) | `fun <A> `[`TryOf`](../-try-of.html)`<`[`A`](../arrow.-kind/rescue.html#A)`>.~~rescue~~(f: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`TryOf`](../-try-of.html)`<`[`A`](../arrow.-kind/rescue.html#A)`>): `[`Try`](../-try/index.html)`<`[`A`](../arrow.-kind/rescue.html#A)`>` |
| [value](../arrow.-kind/value.html) | `fun <A> `[`IdOf`](../-id-of.html)`<`[`A`](../arrow.-kind/value.html#A)`>.value(): `[`A`](../arrow.-kind/value.html#A) |

