---
title: WriterTMonadInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [WriterTMonadInstance](./index.html)

# WriterTMonadInstance

`@extension interface WriterTMonadInstance<F, W> : Monad<WriterTPartialOf<`[`F`](index.html#F)`, `[`W`](index.html#W)`>>, `[`WriterTApplicativeInstance`](../-writer-t-applicative-instance/index.html)`<`[`F`](index.html#F)`, `[`W`](index.html#W)`>`

### Functions

| [MF](-m-f.html) | `abstract fun MF(): Monad<`[`F`](index.html#F)`>` |
| [MM](-m-m.html) | `abstract fun MM(): Monoid<`[`W`](index.html#W)`>` |
| [ap](ap.html) | `open fun <A, B> Kind<WriterTPartialOf<`[`F`](index.html#F)`, `[`W`](index.html#W)`>, `[`A`](ap.html#A)`>.ap(ff: Kind<WriterTPartialOf<`[`F`](index.html#F)`, `[`W`](index.html#W)`>, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): WriterT<`[`F`](index.html#F)`, `[`W`](index.html#W)`, `[`B`](ap.html#B)`>` |
| [flatMap](flat-map.html) | `open fun <A, B> Kind<WriterTPartialOf<`[`F`](index.html#F)`, `[`W`](index.html#W)`>, `[`A`](flat-map.html#A)`>.flatMap(f: (`[`A`](flat-map.html#A)`) -> Kind<WriterTPartialOf<`[`F`](index.html#F)`, `[`W`](index.html#W)`>, `[`B`](flat-map.html#B)`>): WriterT<`[`F`](index.html#F)`, `[`W`](index.html#W)`, `[`B`](flat-map.html#B)`>` |
| [map](map.html) | `open fun <A, B> Kind<WriterTPartialOf<`[`F`](index.html#F)`, `[`W`](index.html#W)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): WriterT<`[`F`](index.html#F)`, `[`W`](index.html#W)`, `[`B`](map.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> Kind<WriterTPartialOf<`[`F`](index.html#F)`, `[`W`](index.html#W)`>, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): WriterT<`[`F`](index.html#F)`, `[`W`](index.html#W)`, `[`B`](tail-rec-m.html#B)`>` |

### Inherited Functions

| [FF](../-writer-t-applicative-instance/-f-f.html) | `open fun FF(): Functor<`[`F`](../-writer-t-applicative-instance/index.html#F)`>` |

### Inheritors

| [WriterTContext](../-writer-t-context/index.html) | `class WriterTContext<F, W> : `[`WriterTMonadInstance`](./index.html)`<`[`F`](../-writer-t-context/index.html#F)`, `[`W`](../-writer-t-context/index.html#W)`>` |

