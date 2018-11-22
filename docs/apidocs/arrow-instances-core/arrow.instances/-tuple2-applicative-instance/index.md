---
title: Tuple2ApplicativeInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [Tuple2ApplicativeInstance](./index.html)

# Tuple2ApplicativeInstance

`@extension interface Tuple2ApplicativeInstance<F> : Applicative<Tuple2PartialOf<`[`F`](index.html#F)`>>, `[`Tuple2FunctorInstance`](../-tuple2-functor-instance/index.html)`<`[`F`](index.html#F)`>`

### Functions

| [MF](-m-f.html) | `abstract fun MF(): Monoid<`[`F`](index.html#F)`>` |
| [ap](ap.html) | `open fun <A, B> Kind<Tuple2PartialOf<`[`F`](index.html#F)`>, `[`A`](ap.html#A)`>.ap(ff: Kind<Tuple2PartialOf<`[`F`](index.html#F)`>, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): Tuple2<`[`F`](index.html#F)`, `[`B`](ap.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): Tuple2<`[`F`](index.html#F)`, `[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<Tuple2PartialOf<`[`F`](index.html#F)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Tuple2<`[`F`](index.html#F)`, `[`B`](map.html#B)`>` |

### Inheritors

| [Tuple2MonadInstance](../-tuple2-monad-instance/index.html) | `interface Tuple2MonadInstance<F> : Monad<Tuple2PartialOf<`[`F`](../-tuple2-monad-instance/index.html#F)`>>, `[`Tuple2ApplicativeInstance`](./index.html)`<`[`F`](../-tuple2-monad-instance/index.html#F)`>` |

