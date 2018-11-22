---
title: PTraversal.foldMap - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics](../index.html) / [PTraversal](index.html) / [foldMap](./fold-map.html)

# foldMap

`open fun <R> foldMap(M: Monoid<`[`R`](fold-map.html#R)`>, s: `[`S`](index.html#S)`, f: (`[`A`](index.html#A)`) -> `[`R`](fold-map.html#R)`): `[`R`](fold-map.html#R)
`open fun <R> foldMap(s: `[`S`](index.html#S)`, f: (`[`A`](index.html#A)`) -> `[`R`](fold-map.html#R)`, M: Monoid<`[`R`](fold-map.html#R)`>): `[`R`](fold-map.html#R)

Map each target to a Monoid and combine the results

