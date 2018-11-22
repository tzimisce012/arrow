---
title: arrow.free.arrow.Kind - arrow-free
---

[arrow-free](../../index.html) / [arrow.free](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [ap](ap.html) | `fun <S, A, B> `[`FreeOf`](../-free-of.html)`<`[`S`](ap.html#S)`, `[`A`](ap.html#A)`>.ap(ff: `[`FreeOf`](../-free-of.html)`<`[`S`](ap.html#S)`, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): `[`Free`](../-free/index.html)`<`[`S`](ap.html#S)`, `[`B`](ap.html#B)`>` |
| [fix](fix.html) | `fun <S, A> `[`CofreeOf`](../-cofree-of.html)`<`[`S`](fix.html#S)`, `[`A`](fix.html#A)`>.fix(): `[`Cofree`](../-cofree/index.html)`<`[`S`](fix.html#S)`, `[`A`](fix.html#A)`>`<br>`fun <F, P, A> `[`CoyonedaOf`](../-coyoneda-of.html)`<`[`F`](fix.html#F)`, `[`P`](fix.html#P)`, `[`A`](fix.html#A)`>.fix(): `[`Coyoneda`](../-coyoneda/index.html)`<`[`F`](fix.html#F)`, `[`P`](fix.html#P)`, `[`A`](fix.html#A)`>`<br>`fun <S, A> `[`FreeOf`](../-free-of.html)`<`[`S`](fix.html#S)`, `[`A`](fix.html#A)`>.fix(): `[`Free`](../-free/index.html)`<`[`S`](fix.html#S)`, `[`A`](fix.html#A)`>`<br>`fun <F, A> `[`FreeApplicativeOf`](../-free-applicative-of.html)`<`[`F`](fix.html#F)`, `[`A`](fix.html#A)`>.fix(): `[`FreeApplicative`](../-free-applicative/index.html)`<`[`F`](fix.html#F)`, `[`A`](fix.html#A)`>`<br>`fun <F, A> `[`YonedaOf`](../-yoneda-of.html)`<`[`F`](fix.html#F)`, `[`A`](fix.html#A)`>.fix(): `[`Yoneda`](../-yoneda/index.html)`<`[`F`](fix.html#F)`, `[`A`](fix.html#A)`>` |
| [flatMap](flat-map.html) | `fun <S, A, B> `[`FreeOf`](../-free-of.html)`<`[`S`](flat-map.html#S)`, `[`A`](flat-map.html#A)`>.flatMap(f: (`[`A`](flat-map.html#A)`) -> `[`Free`](../-free/index.html)`<`[`S`](flat-map.html#S)`, `[`B`](flat-map.html#B)`>): `[`Free`](../-free/index.html)`<`[`S`](flat-map.html#S)`, `[`B`](flat-map.html#B)`>` |
| [foldK](fold-k.html) | `fun <F, A> `[`FreeApplicativeOf`](../-free-applicative-of.html)`<`[`F`](fold-k.html#F)`, `[`A`](fold-k.html#A)`>.foldK(FA: Applicative<`[`F`](fold-k.html#F)`>): Kind<`[`F`](fold-k.html#F)`, `[`A`](fold-k.html#A)`>` |
| [foldMapK](fold-map-k.html) | `fun <M, S, A> `[`FreeOf`](../-free-of.html)`<`[`S`](fold-map-k.html#S)`, `[`A`](fold-map-k.html#A)`>.foldMapK(f: FunctionK<`[`S`](fold-map-k.html#S)`, `[`M`](fold-map-k.html#M)`>, MM: Monad<`[`M`](fold-map-k.html#M)`>): Kind<`[`M`](fold-map-k.html#M)`, `[`A`](fold-map-k.html#A)`>`<br>`fun <F, G, A> `[`FreeApplicativeOf`](../-free-applicative-of.html)`<`[`F`](fold-map-k.html#F)`, `[`A`](fold-map-k.html#A)`>.foldMapK(f: FunctionK<`[`F`](fold-map-k.html#F)`, `[`G`](fold-map-k.html#G)`>, GA: Applicative<`[`G`](fold-map-k.html#G)`>): Kind<`[`G`](fold-map-k.html#G)`, `[`A`](fold-map-k.html#A)`>` |
| [map](map.html) | `fun <S, A, B> `[`FreeOf`](../-free-of.html)`<`[`S`](map.html#S)`, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): `[`Free`](../-free/index.html)`<`[`S`](map.html#S)`, `[`B`](map.html#B)`>` |
| [runK](run-k.html) | `fun <F, A> `[`FreeOf`](../-free-of.html)`<`[`F`](run-k.html#F)`, `[`A`](run-k.html#A)`>.runK(M: Monad<`[`F`](run-k.html#F)`>): Kind<`[`F`](run-k.html#F)`, `[`A`](run-k.html#A)`>` |

