---
title: Yoneda - arrow-free
---

[arrow-free](../../index.html) / [arrow.free](../index.html) / [Yoneda](./index.html)

# Yoneda

`@higherkind abstract class Yoneda<F, A> : `[`YonedaOf`](../-yoneda-of.html)`<`[`F`](index.html#F)`, `[`A`](index.html#A)`>, `[`YonedaKindedJ`](../-yoneda-kinded-j.html)`<`[`F`](index.html#F)`, `[`A`](index.html#A)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `Yoneda()` |

### Functions

| [invoke](invoke.html) | `abstract operator fun <B> invoke(f: (`[`A`](index.html#A)`) -> `[`B`](invoke.html#B)`): Kind<`[`F`](index.html#F)`, `[`B`](invoke.html#B)`>` |
| [lower](lower.html) | `fun lower(): Kind<`[`F`](index.html#F)`, `[`A`](index.html#A)`>` |
| [map](map.html) | `fun <B> map(ff: (`[`A`](index.html#A)`) -> `[`B`](map.html#B)`): `[`Yoneda`](./index.html)`<`[`F`](index.html#F)`, `[`B`](map.html#B)`>` |
| [toCoyoneda](to-coyoneda.html) | `fun toCoyoneda(): `[`Coyoneda`](../-coyoneda/index.html)`<`[`F`](index.html#F)`, `[`A`](index.html#A)`, `[`A`](index.html#A)`>` |

### Companion Object Functions

| [invoke](invoke.html) | `operator fun <U, A> invoke(fa: Kind<`[`U`](invoke.html#U)`, `[`A`](invoke.html#A)`>, FF: Functor<`[`U`](invoke.html#U)`>): `[`Yoneda`](./index.html)`<`[`U`](invoke.html#U)`, `[`A`](invoke.html#A)`>` |

### Extension Functions

| [ap](../arrow.-kind/ap.html) | `fun <S, A, B> `[`FreeOf`](../-free-of.html)`<`[`S`](../arrow.-kind/ap.html#S)`, `[`A`](../arrow.-kind/ap.html#A)`>.ap(ff: `[`FreeOf`](../-free-of.html)`<`[`S`](../arrow.-kind/ap.html#S)`, (`[`A`](../arrow.-kind/ap.html#A)`) -> `[`B`](../arrow.-kind/ap.html#B)`>): `[`Free`](../-free/index.html)`<`[`S`](../arrow.-kind/ap.html#S)`, `[`B`](../arrow.-kind/ap.html#B)`>` |
| [flatMap](../arrow.-kind/flat-map.html) | `fun <S, A, B> `[`FreeOf`](../-free-of.html)`<`[`S`](../arrow.-kind/flat-map.html#S)`, `[`A`](../arrow.-kind/flat-map.html#A)`>.flatMap(f: (`[`A`](../arrow.-kind/flat-map.html#A)`) -> `[`Free`](../-free/index.html)`<`[`S`](../arrow.-kind/flat-map.html#S)`, `[`B`](../arrow.-kind/flat-map.html#B)`>): `[`Free`](../-free/index.html)`<`[`S`](../arrow.-kind/flat-map.html#S)`, `[`B`](../arrow.-kind/flat-map.html#B)`>` |
| [foldK](../arrow.-kind/fold-k.html) | `fun <F, A> `[`FreeApplicativeOf`](../-free-applicative-of.html)`<`[`F`](../arrow.-kind/fold-k.html#F)`, `[`A`](../arrow.-kind/fold-k.html#A)`>.foldK(FA: Applicative<`[`F`](../arrow.-kind/fold-k.html#F)`>): Kind<`[`F`](../arrow.-kind/fold-k.html#F)`, `[`A`](../arrow.-kind/fold-k.html#A)`>` |
| [foldMapK](../arrow.-kind/fold-map-k.html) | `fun <M, S, A> `[`FreeOf`](../-free-of.html)`<`[`S`](../arrow.-kind/fold-map-k.html#S)`, `[`A`](../arrow.-kind/fold-map-k.html#A)`>.foldMapK(f: FunctionK<`[`S`](../arrow.-kind/fold-map-k.html#S)`, `[`M`](../arrow.-kind/fold-map-k.html#M)`>, MM: Monad<`[`M`](../arrow.-kind/fold-map-k.html#M)`>): Kind<`[`M`](../arrow.-kind/fold-map-k.html#M)`, `[`A`](../arrow.-kind/fold-map-k.html#A)`>`<br>`fun <F, G, A> `[`FreeApplicativeOf`](../-free-applicative-of.html)`<`[`F`](../arrow.-kind/fold-map-k.html#F)`, `[`A`](../arrow.-kind/fold-map-k.html#A)`>.foldMapK(f: FunctionK<`[`F`](../arrow.-kind/fold-map-k.html#F)`, `[`G`](../arrow.-kind/fold-map-k.html#G)`>, GA: Applicative<`[`G`](../arrow.-kind/fold-map-k.html#G)`>): Kind<`[`G`](../arrow.-kind/fold-map-k.html#G)`, `[`A`](../arrow.-kind/fold-map-k.html#A)`>` |
| [map](../arrow.-kind/map.html) | `fun <S, A, B> `[`FreeOf`](../-free-of.html)`<`[`S`](../arrow.-kind/map.html#S)`, `[`A`](../arrow.-kind/map.html#A)`>.map(f: (`[`A`](../arrow.-kind/map.html#A)`) -> `[`B`](../arrow.-kind/map.html#B)`): `[`Free`](../-free/index.html)`<`[`S`](../arrow.-kind/map.html#S)`, `[`B`](../arrow.-kind/map.html#B)`>` |
| [runK](../arrow.-kind/run-k.html) | `fun <F, A> `[`FreeOf`](../-free-of.html)`<`[`F`](../arrow.-kind/run-k.html#F)`, `[`A`](../arrow.-kind/run-k.html#A)`>.runK(M: Monad<`[`F`](../arrow.-kind/run-k.html#F)`>): Kind<`[`F`](../arrow.-kind/run-k.html#F)`, `[`A`](../arrow.-kind/run-k.html#A)`>` |

