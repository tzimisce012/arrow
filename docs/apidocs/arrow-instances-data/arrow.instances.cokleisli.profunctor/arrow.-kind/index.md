---
title: arrow.instances.cokleisli.profunctor.arrow.Kind - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.cokleisli.profunctor](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [dimap](dimap.html) | `fun <F, A, B, C, D> Kind<Kind<Kind<ForCokleisli, `[`F`](dimap.html#F)`>, `[`A`](dimap.html#A)`>, `[`B`](dimap.html#B)`>.dimap(arg1: (`[`C`](dimap.html#C)`) -> `[`A`](dimap.html#A)`, arg2: (`[`B`](dimap.html#B)`) -> `[`D`](dimap.html#D)`): Cokleisli<`[`F`](dimap.html#F)`, `[`C`](dimap.html#C)`, `[`D`](dimap.html#D)`>` |
| [lmap](lmap.html) | `fun <F, A, B, C> Kind<Kind<Kind<ForCokleisli, `[`F`](lmap.html#F)`>, `[`A`](lmap.html#A)`>, `[`B`](lmap.html#B)`>.lmap(arg1: (`[`C`](lmap.html#C)`) -> `[`A`](lmap.html#A)`): Cokleisli<`[`F`](lmap.html#F)`, `[`C`](lmap.html#C)`, `[`B`](lmap.html#B)`>` |
| [rmap](rmap.html) | `fun <F, A, B, D> Kind<Kind<Kind<ForCokleisli, `[`F`](rmap.html#F)`>, `[`A`](rmap.html#A)`>, `[`B`](rmap.html#B)`>.rmap(arg1: (`[`B`](rmap.html#B)`) -> `[`D`](rmap.html#D)`): Cokleisli<`[`F`](rmap.html#F)`, `[`A`](rmap.html#A)`, `[`D`](rmap.html#D)`>` |

