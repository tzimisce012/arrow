---
title: Foldable.foldMap - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Foldable](index.html) / [foldMap](./fold-map.html)

# foldMap

`open fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](fold-map.html#A)`>.foldMap(MN: `[`Monoid`](../-monoid/index.html)`<`[`B`](fold-map.html#B)`>, f: (`[`A`](fold-map.html#A)`) -> `[`B`](fold-map.html#B)`): `[`B`](fold-map.html#B)

Fold implemented by mapping A values into B and then combining them using the given Monoid instance.

