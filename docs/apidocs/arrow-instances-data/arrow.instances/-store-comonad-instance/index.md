---
title: StoreComonadInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [StoreComonadInstance](./index.html)

# StoreComonadInstance

`@extension interface StoreComonadInstance<S> : Comonad<StorePartialOf<`[`S`](index.html#S)`>>`

### Functions

| [coflatMap](coflat-map.html) | `open fun <A, B> Kind<StorePartialOf<`[`S`](index.html#S)`>, `[`A`](coflat-map.html#A)`>.coflatMap(f: (Kind<StorePartialOf<`[`S`](index.html#S)`>, `[`A`](coflat-map.html#A)`>) -> `[`B`](coflat-map.html#B)`): Store<`[`S`](index.html#S)`, `[`B`](coflat-map.html#B)`>` |
| [extract](extract.html) | `open fun <A> Kind<StorePartialOf<`[`S`](index.html#S)`>, `[`A`](extract.html#A)`>.extract(): `[`A`](extract.html#A) |
| [map](map.html) | `open fun <A, B> Kind<StorePartialOf<`[`S`](index.html#S)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Store<`[`S`](index.html#S)`, `[`B`](map.html#B)`>` |

### Inheritors

| [StoreContext](../-store-context/index.html) | `class StoreContext<S> : `[`StoreComonadInstance`](./index.html)`<`[`S`](../-store-context/index.html#S)`>` |

