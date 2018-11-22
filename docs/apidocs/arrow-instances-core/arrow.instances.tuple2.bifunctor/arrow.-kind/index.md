---
title: arrow.instances.tuple2.bifunctor.arrow.Kind - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances.tuple2.bifunctor](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [bimap](bimap.html) | `fun <A, B, C, D> Kind<Kind<ForTuple2, `[`A`](bimap.html#A)`>, `[`B`](bimap.html#B)`>.bimap(arg1: (`[`A`](bimap.html#A)`) -> `[`C`](bimap.html#C)`, arg2: (`[`B`](bimap.html#B)`) -> `[`D`](bimap.html#D)`): Tuple2<`[`C`](bimap.html#C)`, `[`D`](bimap.html#D)`>` |
| [leftWiden](left-widen.html) | `fun <AA, B, A : `[`AA`](left-widen.html#AA)`> Kind<Kind<ForTuple2, `[`A`](left-widen.html#A)`>, `[`B`](left-widen.html#B)`>.leftWiden(): Tuple2<`[`AA`](left-widen.html#AA)`, `[`B`](left-widen.html#B)`>` |
| [mapLeft](map-left.html) | `fun <A, B, C> Kind<Kind<ForTuple2, `[`A`](map-left.html#A)`>, `[`B`](map-left.html#B)`>.mapLeft(arg1: (`[`A`](map-left.html#A)`) -> `[`C`](map-left.html#C)`): Tuple2<`[`C`](map-left.html#C)`, `[`B`](map-left.html#B)`>` |

