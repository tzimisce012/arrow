---
title: Eval - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [Eval](./index.html)

# Eval

`@higherkind sealed class Eval<out A> : `[`EvalOf`](../-eval-of.html)`<`[`A`](index.html#A)`>`

Eval is a monad which controls evaluation of a value or a computation that produces a value.

Three basic evaluation strategies:

* Now:    evaluated immediately
* Later:  evaluated once when value is needed
* Always: evaluated every time value is needed

The Later and Always are both lazy strategies while Now is eager.
Later and Always are distinguished from each other only by
memoization: once evaluated Later will save the value to be returned
immediately if it is needed again. Always will run its computation
every time.

methods, which use an internal trampoline to avoid stack overflows.
Computation done within .map and .flatMap is always done lazily,
even when applied to a Now instance.

It is not generally good style to pattern-match on Eval instances.
Rather, use .map and .flatMap to chain computation, and use .value
to get the result when needed. It is also not good style to create
Eval instances whose computation involves calling .value on another
Eval instance -- this can defeat the trampolining and lead to stack
overflows.

### Types

| [Always](-always/index.html) | `data class Always<out A> : `[`Eval`](./index.html)`<`[`A`](-always/index.html#A)`>`<br>Construct a lazy Eval instance. |
| [Defer](-defer/index.html) | `data class Defer<out A> : `[`Eval`](./index.html)`<`[`A`](-defer/index.html#A)`>`<br>Defer is a type of Eval that is used to defer computations which produce Eval. |
| [Later](-later/index.html) | `data class Later<out A> : `[`Eval`](./index.html)`<`[`A`](-later/index.html#A)`>`<br>Construct a lazy Eval instance. |
| [Now](-now/index.html) | `data class Now<out A> : `[`Eval`](./index.html)`<`[`A`](-now/index.html#A)`>`<br>Construct an eager Eval instance. In some sense it is equivalent to using a val. |

### Functions

| [ap](ap.html) | `fun <B> ap(ff: `[`EvalOf`](../-eval-of.html)`<(`[`A`](index.html#A)`) -> `[`B`](ap.html#B)`>): `[`Eval`](./index.html)`<`[`B`](ap.html#B)`>` |
| [coflatMap](coflat-map.html) | `fun <B> coflatMap(f: (`[`EvalOf`](../-eval-of.html)`<`[`A`](index.html#A)`>) -> `[`B`](coflat-map.html#B)`): `[`Eval`](./index.html)`<`[`B`](coflat-map.html#B)`>` |
| [extract](extract.html) | `fun extract(): `[`A`](index.html#A) |
| [flatMap](flat-map.html) | `fun <B> flatMap(f: (`[`A`](index.html#A)`) -> `[`EvalOf`](../-eval-of.html)`<`[`B`](flat-map.html#B)`>): `[`Eval`](./index.html)`<`[`B`](flat-map.html#B)`>` |
| [map](map.html) | `fun <B> map(f: (`[`A`](index.html#A)`) -> `[`B`](map.html#B)`): `[`Eval`](./index.html)`<`[`B`](map.html#B)`>` |
| [memoize](memoize.html) | `abstract fun memoize(): `[`Eval`](./index.html)`<`[`A`](index.html#A)`>` |
| [value](value.html) | `abstract fun value(): `[`A`](index.html#A) |

### Companion Object Properties

| [False](-false.html) | `val False: `[`Eval`](./index.html)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>` |
| [One](-one.html) | `val One: `[`Eval`](./index.html)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>` |
| [True](-true.html) | `val True: `[`Eval`](./index.html)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>` |
| [Unit](-unit.html) | `val Unit: `[`Eval`](./index.html)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [Zero](-zero.html) | `val Zero: `[`Eval`](./index.html)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>` |

### Companion Object Functions

| [always](always.html) | `fun <A> always(f: () -> `[`A`](always.html#A)`): `[`Always`](-always/index.html)`<`[`A`](always.html#A)`>` |
| [defer](defer.html) | `fun <A> defer(f: () -> `[`Eval`](./index.html)`<`[`A`](defer.html#A)`>): `[`Eval`](./index.html)`<`[`A`](defer.html#A)`>` |
| [just](just.html) | `fun <A> just(a: `[`A`](just.html#A)`): `[`Eval`](./index.html)`<`[`A`](just.html#A)`>` |
| [later](later.html) | `fun <A> later(f: () -> `[`A`](later.html#A)`): `[`Later`](-later/index.html)`<`[`A`](later.html#A)`>` |
| [now](now.html) | `fun <A> now(a: `[`A`](now.html#A)`): `[`Now`](-now/index.html)`<`[`A`](now.html#A)`>` |
| [raise](raise.html) | `fun raise(t: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): `[`Eval`](./index.html)`<`[`Nothing`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)`>` |
| [tailRecM](tail-rec-m.html) | `fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> `[`EvalOf`](../-eval-of.html)`<`[`Either`](../-either/index.html)`<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): `[`Eval`](./index.html)`<`[`B`](tail-rec-m.html#B)`>` |

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

### Inheritors

| [Always](-always/index.html) | `data class Always<out A> : `[`Eval`](./index.html)`<`[`A`](-always/index.html#A)`>`<br>Construct a lazy Eval instance. |
| [Defer](-defer/index.html) | `data class Defer<out A> : `[`Eval`](./index.html)`<`[`A`](-defer/index.html#A)`>`<br>Defer is a type of Eval that is used to defer computations which produce Eval. |
| [Later](-later/index.html) | `data class Later<out A> : `[`Eval`](./index.html)`<`[`A`](-later/index.html#A)`>`<br>Construct a lazy Eval instance. |
| [Now](-now/index.html) | `data class Now<out A> : `[`Eval`](./index.html)`<`[`A`](-now/index.html#A)`>`<br>Construct an eager Eval instance. In some sense it is equivalent to using a val. |

