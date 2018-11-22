---
title: Tuple22 - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [Tuple22](./index.html)

# Tuple22

`@higherkind data class Tuple22<out A, out B, out C, out D, out E, out F, out G, out H, out I, out J, out K, out L, out M, out N, out O, out P, out Q, out R, out S, out T, out U, out V> : `[`Tuple22Of`](../-tuple22-of.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](index.html#C)`, `[`D`](index.html#D)`, `[`E`](index.html#E)`, `[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`H`](index.html#H)`, `[`I`](index.html#I)`, `[`J`](index.html#J)`, `[`K`](index.html#K)`, `[`L`](index.html#L)`, `[`M`](index.html#M)`, `[`N`](index.html#N)`, `[`O`](index.html#O)`, `[`P`](index.html#P)`, `[`Q`](index.html#Q)`, `[`R`](index.html#R)`, `[`S`](index.html#S)`, `[`T`](index.html#T)`, `[`U`](index.html#U)`, `[`V`](index.html#V)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `Tuple22(a: `[`A`](index.html#A)`, b: `[`B`](index.html#B)`, c: `[`C`](index.html#C)`, d: `[`D`](index.html#D)`, e: `[`E`](index.html#E)`, f: `[`F`](index.html#F)`, g: `[`G`](index.html#G)`, h: `[`H`](index.html#H)`, i: `[`I`](index.html#I)`, j: `[`J`](index.html#J)`, k: `[`K`](index.html#K)`, l: `[`L`](index.html#L)`, m: `[`M`](index.html#M)`, n: `[`N`](index.html#N)`, o: `[`O`](index.html#O)`, p: `[`P`](index.html#P)`, q: `[`Q`](index.html#Q)`, r: `[`R`](index.html#R)`, s: `[`S`](index.html#S)`, t: `[`T`](index.html#T)`, u: `[`U`](index.html#U)`, v: `[`V`](index.html#V)`)` |

### Properties

| [a](a.html) | `val a: `[`A`](index.html#A) |
| [b](b.html) | `val b: `[`B`](index.html#B) |
| [c](c.html) | `val c: `[`C`](index.html#C) |
| [d](d.html) | `val d: `[`D`](index.html#D) |
| [e](e.html) | `val e: `[`E`](index.html#E) |
| [f](f.html) | `val f: `[`F`](index.html#F) |
| [g](g.html) | `val g: `[`G`](index.html#G) |
| [h](h.html) | `val h: `[`H`](index.html#H) |
| [i](i.html) | `val i: `[`I`](index.html#I) |
| [j](j.html) | `val j: `[`J`](index.html#J) |
| [k](k.html) | `val k: `[`K`](index.html#K) |
| [l](l.html) | `val l: `[`L`](index.html#L) |
| [m](m.html) | `val m: `[`M`](index.html#M) |
| [n](n.html) | `val n: `[`N`](index.html#N) |
| [o](o.html) | `val o: `[`O`](index.html#O) |
| [p](p.html) | `val p: `[`P`](index.html#P) |
| [q](q.html) | `val q: `[`Q`](index.html#Q) |
| [r](r.html) | `val r: `[`R`](index.html#R) |
| [s](s.html) | `val s: `[`S`](index.html#S) |
| [t](t.html) | `val t: `[`T`](index.html#T) |
| [u](u.html) | `val u: `[`U`](index.html#U) |
| [v](v.html) | `val v: `[`V`](index.html#V) |

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

