---
title: Tuple2ComonadInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [Tuple2ComonadInstance](./index.html)

# Tuple2ComonadInstance

`@extension interface Tuple2ComonadInstance<F> : Comonad<Tuple2PartialOf<`[`F`](index.html#F)`>>, `[`Tuple2FunctorInstance`](../-tuple2-functor-instance/index.html)`<`[`F`](index.html#F)`>`

### Functions

| [coflatMap](coflat-map.html) | `open fun <A, B> Kind<Tuple2PartialOf<`[`F`](index.html#F)`>, `[`A`](coflat-map.html#A)`>.coflatMap(f: (Kind<Tuple2PartialOf<`[`F`](index.html#F)`>, `[`A`](coflat-map.html#A)`>) -> `[`B`](coflat-map.html#B)`): Tuple2<`[`F`](index.html#F)`, `[`B`](coflat-map.html#B)`>` |
| [extract](extract.html) | `open fun <A> Kind<Tuple2PartialOf<`[`F`](index.html#F)`>, `[`A`](extract.html#A)`>.extract(): `[`A`](extract.html#A) |

