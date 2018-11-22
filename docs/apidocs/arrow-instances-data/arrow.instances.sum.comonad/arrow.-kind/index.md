---
title: arrow.instances.sum.comonad.arrow.Kind - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.sum.comonad](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [coflatMap](coflat-map.html) | `fun <F, G, A, B> Kind<Kind<Kind<ForSum, `[`F`](coflat-map.html#F)`>, `[`G`](coflat-map.html#G)`>, `[`A`](coflat-map.html#A)`>.coflatMap(arg1: (Kind<Kind<Kind<ForSum, `[`F`](coflat-map.html#F)`>, `[`G`](coflat-map.html#G)`>, `[`A`](coflat-map.html#A)`>) -> `[`B`](coflat-map.html#B)`, CF: Comonad<`[`F`](coflat-map.html#F)`>, CG: Comonad<`[`G`](coflat-map.html#G)`>): Kind<`[`G`](coflat-map.html#G)`, `[`B`](coflat-map.html#B)`>` |
| [duplicate](duplicate.html) | `fun <F, G, A> Kind<Kind<Kind<ForSum, `[`F`](duplicate.html#F)`>, `[`G`](duplicate.html#G)`>, `[`A`](duplicate.html#A)`>.duplicate(CF: Comonad<`[`F`](duplicate.html#F)`>, CG: Comonad<`[`G`](duplicate.html#G)`>): Kind<`[`G`](duplicate.html#G)`, Kind<`[`G`](duplicate.html#G)`, `[`A`](duplicate.html#A)`>>` |
| [extract](extract.html) | `fun <F, G, A> Kind<Kind<Kind<ForSum, `[`F`](extract.html#F)`>, `[`G`](extract.html#G)`>, `[`A`](extract.html#A)`>.extract(CF: Comonad<`[`F`](extract.html#F)`>, CG: Comonad<`[`G`](extract.html#G)`>): `[`A`](extract.html#A) |

