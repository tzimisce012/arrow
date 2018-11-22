---
title: foldMapK - arrow-free
---

[arrow-free](../../index.html) / [arrow.free](../index.html) / [arrow.Kind](index.html) / [foldMapK](./fold-map-k.html)

# foldMapK

`fun <M, S, A> `[`FreeOf`](../-free-of.html)`<`[`S`](fold-map-k.html#S)`, `[`A`](fold-map-k.html#A)`>.foldMapK(f: FunctionK<`[`S`](fold-map-k.html#S)`, `[`M`](fold-map-k.html#M)`>, MM: Monad<`[`M`](fold-map-k.html#M)`>): Kind<`[`M`](fold-map-k.html#M)`, `[`A`](fold-map-k.html#A)`>`
`fun <F, G, A> `[`FreeApplicativeOf`](../-free-applicative-of.html)`<`[`F`](fold-map-k.html#F)`, `[`A`](fold-map-k.html#A)`>.foldMapK(f: FunctionK<`[`F`](fold-map-k.html#F)`, `[`G`](fold-map-k.html#G)`>, GA: Applicative<`[`G`](fold-map-k.html#G)`>): Kind<`[`G`](fold-map-k.html#G)`, `[`A`](fold-map-k.html#A)`>`