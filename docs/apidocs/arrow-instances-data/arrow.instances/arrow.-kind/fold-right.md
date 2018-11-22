---
title: foldRight - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [arrow.Kind](index.html) / [foldRight](./fold-right.html)

# foldRight

`fun <F, A, B, C> EitherTOf<`[`F`](fold-right.html#F)`, `[`A`](fold-right.html#A)`, `[`B`](fold-right.html#B)`>.foldRight(FF: Foldable<`[`F`](fold-right.html#F)`>, lb: Eval<`[`C`](fold-right.html#C)`>, f: (`[`B`](fold-right.html#B)`, Eval<`[`C`](fold-right.html#C)`>) -> Eval<`[`C`](fold-right.html#C)`>): Eval<`[`C`](fold-right.html#C)`>`
`fun <F, A, B> OptionTOf<`[`F`](fold-right.html#F)`, `[`A`](fold-right.html#A)`>.foldRight(FF: Foldable<`[`F`](fold-right.html#F)`>, lb: Eval<`[`B`](fold-right.html#B)`>, f: (`[`A`](fold-right.html#A)`, Eval<`[`B`](fold-right.html#B)`>) -> Eval<`[`B`](fold-right.html#B)`>): Eval<`[`B`](fold-right.html#B)`>`