---
title: arrow.instances.store.comonad.arrow.Kind - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.store.comonad](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [coflatMap](coflat-map.html) | `fun <S, A, B> Kind<Kind<ForStore, `[`S`](coflat-map.html#S)`>, `[`A`](coflat-map.html#A)`>.coflatMap(arg1: (Kind<Kind<ForStore, `[`S`](coflat-map.html#S)`>, `[`A`](coflat-map.html#A)`>) -> `[`B`](coflat-map.html#B)`): Store<`[`S`](coflat-map.html#S)`, `[`B`](coflat-map.html#B)`>` |
| [duplicate](duplicate.html) | `fun <S, A> Kind<Kind<ForStore, `[`S`](duplicate.html#S)`>, `[`A`](duplicate.html#A)`>.duplicate(): Store<`[`S`](duplicate.html#S)`, Store<`[`S`](duplicate.html#S)`, `[`A`](duplicate.html#A)`>>` |
| [extract](extract.html) | `fun <S, A> Kind<Kind<ForStore, `[`S`](extract.html#S)`>, `[`A`](extract.html#A)`>.extract(): `[`A`](extract.html#A) |

