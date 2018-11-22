---
title: WriterTApplicativeInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [WriterTApplicativeInstance](./index.html)

# WriterTApplicativeInstance

`@extension interface WriterTApplicativeInstance<F, W> : Applicative<WriterTPartialOf<`[`F`](index.html#F)`, `[`W`](index.html#W)`>>, `[`WriterTFunctorInstance`](../-writer-t-functor-instance/index.html)`<`[`F`](index.html#F)`, `[`W`](index.html#W)`>`

### Functions

| [FF](-f-f.html) | `open fun FF(): Functor<`[`F`](index.html#F)`>` |
| [MF](-m-f.html) | `abstract fun MF(): Monad<`[`F`](index.html#F)`>` |
| [MM](-m-m.html) | `abstract fun MM(): Monoid<`[`W`](index.html#W)`>` |
| [ap](ap.html) | `open fun <A, B> Kind<WriterTPartialOf<`[`F`](index.html#F)`, `[`W`](index.html#W)`>, `[`A`](ap.html#A)`>.ap(ff: Kind<WriterTPartialOf<`[`F`](index.html#F)`, `[`W`](index.html#W)`>, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): WriterT<`[`F`](index.html#F)`, `[`W`](index.html#W)`, `[`B`](ap.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): WriterTOf<`[`F`](index.html#F)`, `[`W`](index.html#W)`, `[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<WriterTPartialOf<`[`F`](index.html#F)`, `[`W`](index.html#W)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): WriterT<`[`F`](index.html#F)`, `[`W`](index.html#W)`, `[`B`](map.html#B)`>` |

### Inheritors

| [WriterTMonadInstance](../-writer-t-monad-instance/index.html) | `interface WriterTMonadInstance<F, W> : Monad<WriterTPartialOf<`[`F`](../-writer-t-monad-instance/index.html#F)`, `[`W`](../-writer-t-monad-instance/index.html#W)`>>, `[`WriterTApplicativeInstance`](./index.html)`<`[`F`](../-writer-t-monad-instance/index.html#F)`, `[`W`](../-writer-t-monad-instance/index.html#W)`>` |

