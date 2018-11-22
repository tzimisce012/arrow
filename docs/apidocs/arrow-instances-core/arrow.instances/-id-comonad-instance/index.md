---
title: IdComonadInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [IdComonadInstance](./index.html)

# IdComonadInstance

`@extension interface IdComonadInstance : Comonad<ForId>`

### Functions

| [coflatMap](coflat-map.html) | `open fun <A, B> Kind<ForId, `[`A`](coflat-map.html#A)`>.coflatMap(f: (Kind<ForId, `[`A`](coflat-map.html#A)`>) -> `[`B`](coflat-map.html#B)`): Id<`[`B`](coflat-map.html#B)`>` |
| [extract](extract.html) | `open fun <A> Kind<ForId, `[`A`](extract.html#A)`>.extract(): `[`A`](extract.html#A) |
| [map](map.html) | `open fun <A, B> Kind<ForId, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Id<`[`B`](map.html#B)`>` |

