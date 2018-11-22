---
title: Tuple2MonadInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [Tuple2MonadInstance](./index.html)

# Tuple2MonadInstance

`@extension interface Tuple2MonadInstance<F> : Monad<Tuple2PartialOf<`[`F`](index.html#F)`>>, `[`Tuple2ApplicativeInstance`](../-tuple2-applicative-instance/index.html)`<`[`F`](index.html#F)`>`

### Functions

| [MF](-m-f.html) | `abstract fun MF(): Monoid<`[`F`](index.html#F)`>` |
| [ap](ap.html) | `open fun <A, B> Kind<Tuple2PartialOf<`[`F`](index.html#F)`>, `[`A`](ap.html#A)`>.ap(ff: Kind<Tuple2PartialOf<`[`F`](index.html#F)`>, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): Tuple2<`[`F`](index.html#F)`, `[`B`](ap.html#B)`>` |
| [flatMap](flat-map.html) | `open fun <A, B> Kind<Tuple2PartialOf<`[`F`](index.html#F)`>, `[`A`](flat-map.html#A)`>.flatMap(f: (`[`A`](flat-map.html#A)`) -> Kind<Tuple2PartialOf<`[`F`](index.html#F)`>, `[`B`](flat-map.html#B)`>): Tuple2<`[`F`](index.html#F)`, `[`B`](flat-map.html#B)`>` |
| [map](map.html) | `open fun <A, B> Kind<Tuple2PartialOf<`[`F`](index.html#F)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Tuple2<`[`F`](index.html#F)`, `[`B`](map.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `open tailrec fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> Tuple2Of<`[`F`](index.html#F)`, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): Tuple2<`[`F`](index.html#F)`, `[`B`](tail-rec-m.html#B)`>` |

