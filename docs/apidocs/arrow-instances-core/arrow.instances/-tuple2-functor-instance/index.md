---
title: Tuple2FunctorInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [Tuple2FunctorInstance](./index.html)

# Tuple2FunctorInstance

`@extension interface Tuple2FunctorInstance<F> : Functor<Tuple2PartialOf<`[`F`](index.html#F)`>>`

### Functions

| [map](map.html) | `open fun <A, B> Kind<Tuple2PartialOf<`[`F`](index.html#F)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Tuple2<`[`F`](index.html#F)`, `[`B`](map.html#B)`>` |

### Inheritors

| [Tuple2ApplicativeInstance](../-tuple2-applicative-instance/index.html) | `interface Tuple2ApplicativeInstance<F> : Applicative<Tuple2PartialOf<`[`F`](../-tuple2-applicative-instance/index.html#F)`>>, `[`Tuple2FunctorInstance`](./index.html)`<`[`F`](../-tuple2-applicative-instance/index.html#F)`>` |
| [Tuple2ComonadInstance](../-tuple2-comonad-instance/index.html) | `interface Tuple2ComonadInstance<F> : Comonad<Tuple2PartialOf<`[`F`](../-tuple2-comonad-instance/index.html#F)`>>, `[`Tuple2FunctorInstance`](./index.html)`<`[`F`](../-tuple2-comonad-instance/index.html#F)`>` |

