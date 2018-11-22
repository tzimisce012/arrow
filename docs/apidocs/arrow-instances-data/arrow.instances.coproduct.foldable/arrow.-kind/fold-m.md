---
title: foldM - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.coproduct.foldable](../index.html) / [arrow.Kind](index.html) / [foldM](./fold-m.html)

# foldM

`@JvmName("foldM") fun <F, G, A, B> Kind<Kind<Kind<ForCoproduct, `[`F`](fold-m.html#F)`>, `[`G`](fold-m.html#G)`>, `[`A`](fold-m.html#A)`>.foldM(arg1: Monad<`[`G`](fold-m.html#G)`>, arg2: `[`B`](fold-m.html#B)`, arg3: (`[`B`](fold-m.html#B)`, `[`A`](fold-m.html#A)`) -> Kind<`[`G`](fold-m.html#G)`, `[`B`](fold-m.html#B)`>, FF: Foldable<`[`F`](fold-m.html#F)`>, FG: Foldable<`[`G`](fold-m.html#G)`>): Kind<`[`G`](fold-m.html#G)`, `[`B`](fold-m.html#B)`>`