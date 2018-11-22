---
title: Free - arrow-free
---

[arrow-free](../../index.html) / [arrow.free](../index.html) / [Free](./index.html)

# Free

`@higherkind sealed class Free<S, out A> : `[`FreeOf`](../-free-of.html)`<`[`S`](index.html#S)`, `[`A`](index.html#A)`>`

### Types

| [FlatMapped](-flat-mapped/index.html) | `data class FlatMapped<S, out A, C> : `[`Free`](./index.html)`<`[`S`](-flat-mapped/index.html#S)`, `[`A`](-flat-mapped/index.html#A)`>` |
| [Pure](-pure/index.html) | `data class Pure<S, out A> : `[`Free`](./index.html)`<`[`S`](-pure/index.html#S)`, `[`A`](-pure/index.html#A)`>` |
| [Suspend](-suspend/index.html) | `data class Suspend<S, out A> : `[`Free`](./index.html)`<`[`S`](-suspend/index.html#S)`, `[`A`](-suspend/index.html#A)`>` |

### Functions

| [toString](to-string.html) | `open fun toString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [transform](transform.html) | `abstract fun <O, B> transform(f: (`[`A`](index.html#A)`) -> `[`B`](transform.html#B)`, fs: FunctionK<`[`S`](index.html#S)`, `[`O`](transform.html#O)`>): `[`Free`](./index.html)`<`[`O`](transform.html#O)`, `[`B`](transform.html#B)`>` |

### Companion Object Functions

| [defer](defer.html) | `fun <S, A> defer(value: () -> `[`Free`](./index.html)`<`[`S`](defer.html#S)`, `[`A`](defer.html#A)`>): `[`Free`](./index.html)`<`[`S`](defer.html#S)`, `[`A`](defer.html#A)`>` |
| [just](just.html) | `fun <S, A> just(a: `[`A`](just.html#A)`): `[`Free`](./index.html)`<`[`S`](just.html#S)`, `[`A`](just.html#A)`>` |
| [liftF](lift-f.html) | `fun <S, A> liftF(fa: Kind<`[`S`](lift-f.html#S)`, `[`A`](lift-f.html#A)`>): `[`Free`](./index.html)`<`[`S`](lift-f.html#S)`, `[`A`](lift-f.html#A)`>` |

### Extension Functions

| [ap](../arrow.-kind/ap.html) | `fun <S, A, B> `[`FreeOf`](../-free-of.html)`<`[`S`](../arrow.-kind/ap.html#S)`, `[`A`](../arrow.-kind/ap.html#A)`>.ap(ff: `[`FreeOf`](../-free-of.html)`<`[`S`](../arrow.-kind/ap.html#S)`, (`[`A`](../arrow.-kind/ap.html#A)`) -> `[`B`](../arrow.-kind/ap.html#B)`>): `[`Free`](./index.html)`<`[`S`](../arrow.-kind/ap.html#S)`, `[`B`](../arrow.-kind/ap.html#B)`>` |
| [flatMap](../arrow.-kind/flat-map.html) | `fun <S, A, B> `[`FreeOf`](../-free-of.html)`<`[`S`](../arrow.-kind/flat-map.html#S)`, `[`A`](../arrow.-kind/flat-map.html#A)`>.flatMap(f: (`[`A`](../arrow.-kind/flat-map.html#A)`) -> `[`Free`](./index.html)`<`[`S`](../arrow.-kind/flat-map.html#S)`, `[`B`](../arrow.-kind/flat-map.html#B)`>): `[`Free`](./index.html)`<`[`S`](../arrow.-kind/flat-map.html#S)`, `[`B`](../arrow.-kind/flat-map.html#B)`>` |
| [foldK](../arrow.-kind/fold-k.html) | `fun <F, A> `[`FreeApplicativeOf`](../-free-applicative-of.html)`<`[`F`](../arrow.-kind/fold-k.html#F)`, `[`A`](../arrow.-kind/fold-k.html#A)`>.foldK(FA: Applicative<`[`F`](../arrow.-kind/fold-k.html#F)`>): Kind<`[`F`](../arrow.-kind/fold-k.html#F)`, `[`A`](../arrow.-kind/fold-k.html#A)`>` |
| [foldMap](../fold-map.html) | `fun <M, S, A> `[`Free`](./index.html)`<`[`S`](../fold-map.html#S)`, `[`A`](../fold-map.html#A)`>.foldMap(f: FunctionK<`[`S`](../fold-map.html#S)`, `[`M`](../fold-map.html#M)`>, MM: Monad<`[`M`](../fold-map.html#M)`>): Kind<`[`M`](../fold-map.html#M)`, `[`A`](../fold-map.html#A)`>` |
| [foldMapK](../arrow.-kind/fold-map-k.html) | `fun <M, S, A> `[`FreeOf`](../-free-of.html)`<`[`S`](../arrow.-kind/fold-map-k.html#S)`, `[`A`](../arrow.-kind/fold-map-k.html#A)`>.foldMapK(f: FunctionK<`[`S`](../arrow.-kind/fold-map-k.html#S)`, `[`M`](../arrow.-kind/fold-map-k.html#M)`>, MM: Monad<`[`M`](../arrow.-kind/fold-map-k.html#M)`>): Kind<`[`M`](../arrow.-kind/fold-map-k.html#M)`, `[`A`](../arrow.-kind/fold-map-k.html#A)`>`<br>`fun <F, G, A> `[`FreeApplicativeOf`](../-free-applicative-of.html)`<`[`F`](../arrow.-kind/fold-map-k.html#F)`, `[`A`](../arrow.-kind/fold-map-k.html#A)`>.foldMapK(f: FunctionK<`[`F`](../arrow.-kind/fold-map-k.html#F)`, `[`G`](../arrow.-kind/fold-map-k.html#G)`>, GA: Applicative<`[`G`](../arrow.-kind/fold-map-k.html#G)`>): Kind<`[`G`](../arrow.-kind/fold-map-k.html#G)`, `[`A`](../arrow.-kind/fold-map-k.html#A)`>` |
| [map](../arrow.-kind/map.html) | `fun <S, A, B> `[`FreeOf`](../-free-of.html)`<`[`S`](../arrow.-kind/map.html#S)`, `[`A`](../arrow.-kind/map.html#A)`>.map(f: (`[`A`](../arrow.-kind/map.html#A)`) -> `[`B`](../arrow.-kind/map.html#B)`): `[`Free`](./index.html)`<`[`S`](../arrow.-kind/map.html#S)`, `[`B`](../arrow.-kind/map.html#B)`>` |
| [run](../run.html) | `fun <F, A> `[`Free`](./index.html)`<`[`F`](../run.html#F)`, `[`A`](../run.html#A)`>.run(M: Monad<`[`F`](../run.html#F)`>): Kind<`[`F`](../run.html#F)`, `[`A`](../run.html#A)`>` |
| [runK](../arrow.-kind/run-k.html) | `fun <F, A> `[`FreeOf`](../-free-of.html)`<`[`F`](../arrow.-kind/run-k.html#F)`, `[`A`](../arrow.-kind/run-k.html#A)`>.runK(M: Monad<`[`F`](../arrow.-kind/run-k.html#F)`>): Kind<`[`F`](../arrow.-kind/run-k.html#F)`, `[`A`](../arrow.-kind/run-k.html#A)`>` |
| [runT](../run-t.html) | `fun <A> `[`TrampolineF`](../-trampoline-f.html)`<`[`A`](../run-t.html#A)`>.runT(): `[`A`](../run-t.html#A) |
| [step](../step.html) | `tailrec fun <S, A> `[`Free`](./index.html)`<`[`S`](../step.html#S)`, `[`A`](../step.html#A)`>.step(): `[`Free`](./index.html)`<`[`S`](../step.html#S)`, `[`A`](../step.html#A)`>`<br>Takes one evaluation step in the Free monad, re-associating left-nested binds in the process. |

### Inheritors

| [FlatMapped](-flat-mapped/index.html) | `data class FlatMapped<S, out A, C> : `[`Free`](./index.html)`<`[`S`](-flat-mapped/index.html#S)`, `[`A`](-flat-mapped/index.html#A)`>` |
| [Pure](-pure/index.html) | `data class Pure<S, out A> : `[`Free`](./index.html)`<`[`S`](-pure/index.html#S)`, `[`A`](-pure/index.html#A)`>` |
| [Suspend](-suspend/index.html) | `data class Suspend<S, out A> : `[`Free`](./index.html)`<`[`S`](-suspend/index.html#S)`, `[`A`](-suspend/index.html#A)`>` |

