---
title: FreeApplicative.ap - arrow-free
---

[arrow-free](../../index.html) / [arrow.free](../index.html) / [FreeApplicative](index.html) / [ap](./ap.html)

# ap

`fun <B> ap(ap: `[`FreeApplicative`](index.html)`<`[`F`](index.html#F)`, (`[`A`](index.html#A)`) -> `[`B`](ap.html#B)`>): `[`FreeApplicative`](index.html)`<`[`F`](index.html#F)`, `[`B`](ap.html#B)`>`
`fun <F, P, A> ap(fp: `[`FreeApplicative`](index.html)`<`[`F`](ap.html#F)`, `[`P`](ap.html#P)`>, fn: `[`FreeApplicative`](index.html)`<`[`F`](ap.html#F)`, (`[`P`](ap.html#P)`) -> `[`A`](ap.html#A)`>): `[`FreeApplicative`](index.html)`<`[`F`](ap.html#F)`, `[`A`](ap.html#A)`>`