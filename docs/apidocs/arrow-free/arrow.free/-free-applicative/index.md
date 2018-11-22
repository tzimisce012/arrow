---
title: FreeApplicative - arrow-free
---

[arrow-free](../../index.html) / [arrow.free](../index.html) / [FreeApplicative](./index.html)

# FreeApplicative

`@higherkind sealed class FreeApplicative<F, out A> : `[`FreeApplicativeOf`](../-free-applicative-of.html)`<`[`F`](index.html#F)`, `[`A`](index.html#A)`>`

See [https//github.com/edmundnoble/cats/blob/6454b4f8b7c5cefd15d8198fa7d52e46e2f45fea/docs/src/main/tut/datatypes/freeapplicative.md](https//github.com/edmundnoble/cats/blob/6454b4f8b7c5cefd15d8198fa7d52e46e2f45fea/docs/src/main/tut/datatypes/freeapplicative.md)

### Functions

| [analyze](analyze.html) | `fun <M> analyze(MM: Monoid<`[`M`](analyze.html#M)`>, f: FunctionK<`[`F`](index.html#F)`, ConstPartialOf<`[`M`](analyze.html#M)`>>): `[`M`](analyze.html#M) |
| [ap](ap.html) | `fun <B> ap(ap: `[`FreeApplicative`](./index.html)`<`[`F`](index.html#F)`, (`[`A`](index.html#A)`) -> `[`B`](ap.html#B)`>): `[`FreeApplicative`](./index.html)`<`[`F`](index.html#F)`, `[`B`](ap.html#B)`>` |
| [compile](compile.html) | `fun <G> compile(f: FunctionK<`[`F`](index.html#F)`, `[`G`](compile.html#G)`>): `[`FreeApplicative`](./index.html)`<`[`G`](compile.html#G)`, `[`A`](index.html#A)`>` |
| [flatCompile](flat-compile.html) | `fun <G> flatCompile(f: FunctionK<`[`F`](index.html#F)`, `[`FreeApplicativePartialOf`](../-free-applicative-partial-of.html)`<`[`G`](flat-compile.html#G)`>>, GFA: Applicative<`[`FreeApplicativePartialOf`](../-free-applicative-partial-of.html)`<`[`G`](flat-compile.html#G)`>>): `[`FreeApplicative`](./index.html)`<`[`G`](flat-compile.html#G)`, `[`A`](index.html#A)`>` |
| [fold](fold.html) | `fun fold(FA: Applicative<`[`F`](index.html#F)`>): Kind<`[`F`](index.html#F)`, `[`A`](index.html#A)`>` |
| [foldMap](fold-map.html) | `fun <G> foldMap(f: FunctionK<`[`F`](index.html#F)`, `[`G`](fold-map.html#G)`>, GA: Applicative<`[`G`](fold-map.html#G)`>): Kind<`[`G`](fold-map.html#G)`, `[`A`](index.html#A)`>` |
| [map](map.html) | `fun <C> map(f: (`[`A`](index.html#A)`) -> `[`C`](map.html#C)`): `[`FreeApplicative`](./index.html)`<`[`F`](index.html#F)`, `[`C`](map.html#C)`>` |
| [monad](monad.html) | `fun monad(ap: Applicative<`[`FreePartialOf`](../-free-partial-of.html)`<`[`F`](index.html#F)`>>): `[`Free`](../-free/index.html)`<`[`F`](index.html#F)`, `[`A`](index.html#A)`>` |
| [toString](to-string.html) | `open fun toString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Companion Object Functions

| [ap](ap.html) | `fun <F, P, A> ap(fp: `[`FreeApplicative`](./index.html)`<`[`F`](ap.html#F)`, `[`P`](ap.html#P)`>, fn: `[`FreeApplicative`](./index.html)`<`[`F`](ap.html#F)`, (`[`P`](ap.html#P)`) -> `[`A`](ap.html#A)`>): `[`FreeApplicative`](./index.html)`<`[`F`](ap.html#F)`, `[`A`](ap.html#A)`>` |
| [just](just.html) | `fun <F, A> just(a: `[`A`](just.html#A)`): `[`FreeApplicative`](./index.html)`<`[`F`](just.html#F)`, `[`A`](just.html#A)`>` |
| [liftF](lift-f.html) | `fun <F, A> liftF(fa: Kind<`[`F`](lift-f.html#F)`, `[`A`](lift-f.html#A)`>): `[`FreeApplicative`](./index.html)`<`[`F`](lift-f.html#F)`, `[`A`](lift-f.html#A)`>` |

### Extension Functions

| [ap](../arrow.-kind/ap.html) | `fun <S, A, B> `[`FreeOf`](../-free-of.html)`<`[`S`](../arrow.-kind/ap.html#S)`, `[`A`](../arrow.-kind/ap.html#A)`>.ap(ff: `[`FreeOf`](../-free-of.html)`<`[`S`](../arrow.-kind/ap.html#S)`, (`[`A`](../arrow.-kind/ap.html#A)`) -> `[`B`](../arrow.-kind/ap.html#B)`>): `[`Free`](../-free/index.html)`<`[`S`](../arrow.-kind/ap.html#S)`, `[`B`](../arrow.-kind/ap.html#B)`>` |
| [flatMap](../arrow.-kind/flat-map.html) | `fun <S, A, B> `[`FreeOf`](../-free-of.html)`<`[`S`](../arrow.-kind/flat-map.html#S)`, `[`A`](../arrow.-kind/flat-map.html#A)`>.flatMap(f: (`[`A`](../arrow.-kind/flat-map.html#A)`) -> `[`Free`](../-free/index.html)`<`[`S`](../arrow.-kind/flat-map.html#S)`, `[`B`](../arrow.-kind/flat-map.html#B)`>): `[`Free`](../-free/index.html)`<`[`S`](../arrow.-kind/flat-map.html#S)`, `[`B`](../arrow.-kind/flat-map.html#B)`>` |
| [foldK](../arrow.-kind/fold-k.html) | `fun <F, A> `[`FreeApplicativeOf`](../-free-applicative-of.html)`<`[`F`](../arrow.-kind/fold-k.html#F)`, `[`A`](../arrow.-kind/fold-k.html#A)`>.foldK(FA: Applicative<`[`F`](../arrow.-kind/fold-k.html#F)`>): Kind<`[`F`](../arrow.-kind/fold-k.html#F)`, `[`A`](../arrow.-kind/fold-k.html#A)`>` |
| [foldMapK](../arrow.-kind/fold-map-k.html) | `fun <M, S, A> `[`FreeOf`](../-free-of.html)`<`[`S`](../arrow.-kind/fold-map-k.html#S)`, `[`A`](../arrow.-kind/fold-map-k.html#A)`>.foldMapK(f: FunctionK<`[`S`](../arrow.-kind/fold-map-k.html#S)`, `[`M`](../arrow.-kind/fold-map-k.html#M)`>, MM: Monad<`[`M`](../arrow.-kind/fold-map-k.html#M)`>): Kind<`[`M`](../arrow.-kind/fold-map-k.html#M)`, `[`A`](../arrow.-kind/fold-map-k.html#A)`>`<br>`fun <F, G, A> `[`FreeApplicativeOf`](../-free-applicative-of.html)`<`[`F`](../arrow.-kind/fold-map-k.html#F)`, `[`A`](../arrow.-kind/fold-map-k.html#A)`>.foldMapK(f: FunctionK<`[`F`](../arrow.-kind/fold-map-k.html#F)`, `[`G`](../arrow.-kind/fold-map-k.html#G)`>, GA: Applicative<`[`G`](../arrow.-kind/fold-map-k.html#G)`>): Kind<`[`G`](../arrow.-kind/fold-map-k.html#G)`, `[`A`](../arrow.-kind/fold-map-k.html#A)`>` |
| [map](../arrow.-kind/map.html) | `fun <S, A, B> `[`FreeOf`](../-free-of.html)`<`[`S`](../arrow.-kind/map.html#S)`, `[`A`](../arrow.-kind/map.html#A)`>.map(f: (`[`A`](../arrow.-kind/map.html#A)`) -> `[`B`](../arrow.-kind/map.html#B)`): `[`Free`](../-free/index.html)`<`[`S`](../arrow.-kind/map.html#S)`, `[`B`](../arrow.-kind/map.html#B)`>` |
| [runK](../arrow.-kind/run-k.html) | `fun <F, A> `[`FreeOf`](../-free-of.html)`<`[`F`](../arrow.-kind/run-k.html#F)`, `[`A`](../arrow.-kind/run-k.html#A)`>.runK(M: Monad<`[`F`](../arrow.-kind/run-k.html#F)`>): Kind<`[`F`](../arrow.-kind/run-k.html#F)`, `[`A`](../arrow.-kind/run-k.html#A)`>` |

