---
title: NonEmptyListComonadInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [NonEmptyListComonadInstance](./index.html)

# NonEmptyListComonadInstance

`@extension interface NonEmptyListComonadInstance : Comonad<ForNonEmptyList>`

### Functions

| [coflatMap](coflat-map.html) | `open fun <A, B> Kind<ForNonEmptyList, `[`A`](coflat-map.html#A)`>.coflatMap(f: (Kind<ForNonEmptyList, `[`A`](coflat-map.html#A)`>) -> `[`B`](coflat-map.html#B)`): NonEmptyList<`[`B`](coflat-map.html#B)`>` |
| [extract](extract.html) | `open fun <A> Kind<ForNonEmptyList, `[`A`](extract.html#A)`>.extract(): `[`A`](extract.html#A) |
| [map](map.html) | `open fun <A, B> Kind<ForNonEmptyList, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): NonEmptyList<`[`B`](map.html#B)`>` |

