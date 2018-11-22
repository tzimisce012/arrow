---
title: StoreContext - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [StoreContext](./index.html)

# StoreContext

`class StoreContext<S> : `[`StoreComonadInstance`](../-store-comonad-instance/index.html)`<`[`S`](index.html#S)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `StoreContext()` |

### Inherited Functions

| [coflatMap](../-store-comonad-instance/coflat-map.html) | `open fun <A, B> Kind<StorePartialOf<`[`S`](../-store-comonad-instance/index.html#S)`>, `[`A`](../-store-comonad-instance/coflat-map.html#A)`>.coflatMap(f: (Kind<StorePartialOf<`[`S`](../-store-comonad-instance/index.html#S)`>, `[`A`](../-store-comonad-instance/coflat-map.html#A)`>) -> `[`B`](../-store-comonad-instance/coflat-map.html#B)`): Store<`[`S`](../-store-comonad-instance/index.html#S)`, `[`B`](../-store-comonad-instance/coflat-map.html#B)`>` |
| [extract](../-store-comonad-instance/extract.html) | `open fun <A> Kind<StorePartialOf<`[`S`](../-store-comonad-instance/index.html#S)`>, `[`A`](../-store-comonad-instance/extract.html#A)`>.extract(): `[`A`](../-store-comonad-instance/extract.html#A) |
| [map](../-store-comonad-instance/map.html) | `open fun <A, B> Kind<StorePartialOf<`[`S`](../-store-comonad-instance/index.html#S)`>, `[`A`](../-store-comonad-instance/map.html#A)`>.map(f: (`[`A`](../-store-comonad-instance/map.html#A)`) -> `[`B`](../-store-comonad-instance/map.html#B)`): Store<`[`S`](../-store-comonad-instance/index.html#S)`, `[`B`](../-store-comonad-instance/map.html#B)`>` |

