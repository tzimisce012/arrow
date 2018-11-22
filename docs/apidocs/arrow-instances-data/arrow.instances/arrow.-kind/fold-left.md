---
title: foldLeft - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [arrow.Kind](index.html) / [foldLeft](./fold-left.html)

# foldLeft

`fun <F, A, B, C> EitherTOf<`[`F`](fold-left.html#F)`, `[`A`](fold-left.html#A)`, `[`B`](fold-left.html#B)`>.foldLeft(FF: Foldable<`[`F`](fold-left.html#F)`>, b: `[`C`](fold-left.html#C)`, f: (`[`C`](fold-left.html#C)`, `[`B`](fold-left.html#B)`) -> `[`C`](fold-left.html#C)`): `[`C`](fold-left.html#C)
`fun <F, A, B> OptionTOf<`[`F`](fold-left.html#F)`, `[`A`](fold-left.html#A)`>.foldLeft(FF: Foldable<`[`F`](fold-left.html#F)`>, b: `[`B`](fold-left.html#B)`, f: (`[`B`](fold-left.html#B)`, `[`A`](fold-left.html#A)`) -> `[`B`](fold-left.html#B)`): `[`B`](fold-left.html#B)