---
title: MooreComonadInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [MooreComonadInstance](./index.html)

# MooreComonadInstance

`@extension interface MooreComonadInstance<V> : Comonad<MoorePartialOf<`[`V`](index.html#V)`>>`

### Functions

| [coflatMap](coflat-map.html) | `open fun <A, B> Kind<MoorePartialOf<`[`V`](index.html#V)`>, `[`A`](coflat-map.html#A)`>.coflatMap(f: (Kind<MoorePartialOf<`[`V`](index.html#V)`>, `[`A`](coflat-map.html#A)`>) -> `[`B`](coflat-map.html#B)`): Moore<`[`V`](index.html#V)`, `[`B`](coflat-map.html#B)`>` |
| [extract](extract.html) | `open fun <A> Kind<MoorePartialOf<`[`V`](index.html#V)`>, `[`A`](extract.html#A)`>.extract(): `[`A`](extract.html#A) |
| [map](map.html) | `open fun <A, B> Kind<MoorePartialOf<`[`V`](index.html#V)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Moore<`[`V`](index.html#V)`, `[`B`](map.html#B)`>` |

### Inheritors

| [MooreContext](../-moore-context/index.html) | `class MooreContext<S> : `[`MooreComonadInstance`](./index.html)`<`[`S`](../-moore-context/index.html#S)`>` |

