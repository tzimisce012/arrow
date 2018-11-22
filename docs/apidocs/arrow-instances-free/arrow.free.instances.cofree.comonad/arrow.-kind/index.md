---
title: arrow.free.instances.cofree.comonad.arrow.Kind - arrow-instances-free
---

[arrow-instances-free](../../index.html) / [arrow.free.instances.cofree.comonad](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [coflatMap](coflat-map.html) | `fun <S, A, B> Kind<Kind<ForCofree, `[`S`](coflat-map.html#S)`>, `[`A`](coflat-map.html#A)`>.coflatMap(arg1: (Kind<Kind<ForCofree, `[`S`](coflat-map.html#S)`>, `[`A`](coflat-map.html#A)`>) -> `[`B`](coflat-map.html#B)`): Cofree<`[`S`](coflat-map.html#S)`, `[`B`](coflat-map.html#B)`>` |
| [duplicate](duplicate.html) | `fun <S, A> Kind<Kind<ForCofree, `[`S`](duplicate.html#S)`>, `[`A`](duplicate.html#A)`>.duplicate(): Cofree<`[`S`](duplicate.html#S)`, Cofree<`[`S`](duplicate.html#S)`, `[`A`](duplicate.html#A)`>>` |
| [extract](extract.html) | `fun <S, A> Kind<Kind<ForCofree, `[`S`](extract.html#S)`>, `[`A`](extract.html#A)`>.extract(): `[`A`](extract.html#A) |

