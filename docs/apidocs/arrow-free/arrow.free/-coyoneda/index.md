---
title: Coyoneda - arrow-free
---

[arrow-free](../../index.html) / [arrow.free](../index.html) / [Coyoneda](./index.html)

# Coyoneda

`@higherkind data class Coyoneda<F, P, A> : `[`CoyonedaOf`](../-coyoneda-of.html)`<`[`F`](index.html#F)`, `[`P`](index.html#P)`, `[`A`](index.html#A)`>, `[`CoyonedaKindedJ`](../-coyoneda-kinded-j.html)`<`[`F`](index.html#F)`, `[`P`](index.html#P)`, `[`A`](index.html#A)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `Coyoneda(pivot: Kind<`[`F`](index.html#F)`, `[`P`](index.html#P)`>, ks: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<AnyFunc>)` |

### Properties

| [pivot](pivot.html) | `val pivot: Kind<`[`F`](index.html#F)`, `[`P`](index.html#P)`>` |

### Functions

| [lower](lower.html) | `fun lower(FF: Functor<`[`F`](index.html#F)`>): Kind<`[`F`](index.html#F)`, `[`A`](index.html#A)`>` |
| [map](map.html) | `fun <B> map(f: (`[`A`](index.html#A)`) -> `[`B`](map.html#B)`): `[`Coyoneda`](./index.html)`<`[`F`](index.html#F)`, `[`P`](index.html#P)`, `[`B`](map.html#B)`>` |
| [toYoneda](to-yoneda.html) | `fun toYoneda(FF: Functor<`[`F`](index.html#F)`>): `[`Yoneda`](../-yoneda/index.html)`<`[`F`](index.html#F)`, `[`A`](index.html#A)`>` |

### Companion Object Functions

| [invoke](invoke.html) | `operator fun <U, A, B> invoke(fa: Kind<`[`U`](invoke.html#U)`, `[`A`](invoke.html#A)`>, f: (`[`A`](invoke.html#A)`) -> `[`B`](invoke.html#B)`): `[`Coyoneda`](./index.html)`<`[`U`](invoke.html#U)`, `[`A`](invoke.html#A)`, `[`B`](invoke.html#B)`>` |
| [unsafeApply](unsafe-apply.html) | `fun <U, A, B> unsafeApply(fa: Kind<`[`U`](unsafe-apply.html#U)`, `[`A`](unsafe-apply.html#A)`>, f: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<AnyFunc>): `[`Coyoneda`](./index.html)`<`[`U`](unsafe-apply.html#U)`, `[`A`](unsafe-apply.html#A)`, `[`B`](unsafe-apply.html#B)`>` |

### Extension Functions

| [ap](../arrow.-kind/ap.html) | `fun <S, A, B> `[`FreeOf`](../-free-of.html)`<`[`S`](../arrow.-kind/ap.html#S)`, `[`A`](../arrow.-kind/ap.html#A)`>.ap(ff: `[`FreeOf`](../-free-of.html)`<`[`S`](../arrow.-kind/ap.html#S)`, (`[`A`](../arrow.-kind/ap.html#A)`) -> `[`B`](../arrow.-kind/ap.html#B)`>): `[`Free`](../-free/index.html)`<`[`S`](../arrow.-kind/ap.html#S)`, `[`B`](../arrow.-kind/ap.html#B)`>` |
| [flatMap](../arrow.-kind/flat-map.html) | `fun <S, A, B> `[`FreeOf`](../-free-of.html)`<`[`S`](../arrow.-kind/flat-map.html#S)`, `[`A`](../arrow.-kind/flat-map.html#A)`>.flatMap(f: (`[`A`](../arrow.-kind/flat-map.html#A)`) -> `[`Free`](../-free/index.html)`<`[`S`](../arrow.-kind/flat-map.html#S)`, `[`B`](../arrow.-kind/flat-map.html#B)`>): `[`Free`](../-free/index.html)`<`[`S`](../arrow.-kind/flat-map.html#S)`, `[`B`](../arrow.-kind/flat-map.html#B)`>` |
| [foldK](../arrow.-kind/fold-k.html) | `fun <F, A> `[`FreeApplicativeOf`](../-free-applicative-of.html)`<`[`F`](../arrow.-kind/fold-k.html#F)`, `[`A`](../arrow.-kind/fold-k.html#A)`>.foldK(FA: Applicative<`[`F`](../arrow.-kind/fold-k.html#F)`>): Kind<`[`F`](../arrow.-kind/fold-k.html#F)`, `[`A`](../arrow.-kind/fold-k.html#A)`>` |
| [foldMapK](../arrow.-kind/fold-map-k.html) | `fun <M, S, A> `[`FreeOf`](../-free-of.html)`<`[`S`](../arrow.-kind/fold-map-k.html#S)`, `[`A`](../arrow.-kind/fold-map-k.html#A)`>.foldMapK(f: FunctionK<`[`S`](../arrow.-kind/fold-map-k.html#S)`, `[`M`](../arrow.-kind/fold-map-k.html#M)`>, MM: Monad<`[`M`](../arrow.-kind/fold-map-k.html#M)`>): Kind<`[`M`](../arrow.-kind/fold-map-k.html#M)`, `[`A`](../arrow.-kind/fold-map-k.html#A)`>`<br>`fun <F, G, A> `[`FreeApplicativeOf`](../-free-applicative-of.html)`<`[`F`](../arrow.-kind/fold-map-k.html#F)`, `[`A`](../arrow.-kind/fold-map-k.html#A)`>.foldMapK(f: FunctionK<`[`F`](../arrow.-kind/fold-map-k.html#F)`, `[`G`](../arrow.-kind/fold-map-k.html#G)`>, GA: Applicative<`[`G`](../arrow.-kind/fold-map-k.html#G)`>): Kind<`[`G`](../arrow.-kind/fold-map-k.html#G)`, `[`A`](../arrow.-kind/fold-map-k.html#A)`>` |
| [map](../arrow.-kind/map.html) | `fun <S, A, B> `[`FreeOf`](../-free-of.html)`<`[`S`](../arrow.-kind/map.html#S)`, `[`A`](../arrow.-kind/map.html#A)`>.map(f: (`[`A`](../arrow.-kind/map.html#A)`) -> `[`B`](../arrow.-kind/map.html#B)`): `[`Free`](../-free/index.html)`<`[`S`](../arrow.-kind/map.html#S)`, `[`B`](../arrow.-kind/map.html#B)`>` |
| [runK](../arrow.-kind/run-k.html) | `fun <F, A> `[`FreeOf`](../-free-of.html)`<`[`F`](../arrow.-kind/run-k.html#F)`, `[`A`](../arrow.-kind/run-k.html#A)`>.runK(M: Monad<`[`F`](../arrow.-kind/run-k.html#F)`>): Kind<`[`F`](../arrow.-kind/run-k.html#F)`, `[`A`](../arrow.-kind/run-k.html#A)`>` |

