---
title: WriterTFunctorInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [WriterTFunctorInstance](./index.html)

# WriterTFunctorInstance

`@extension interface WriterTFunctorInstance<F, W> : Functor<WriterTPartialOf<`[`F`](index.html#F)`, `[`W`](index.html#W)`>>`

### Functions

| [FF](-f-f.html) | `abstract fun FF(): Functor<`[`F`](index.html#F)`>` |
| [map](map.html) | `open fun <A, B> Kind<WriterTPartialOf<`[`F`](index.html#F)`, `[`W`](index.html#W)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): WriterT<`[`F`](index.html#F)`, `[`W`](index.html#W)`, `[`B`](map.html#B)`>` |

### Inheritors

| [WriterTApplicativeInstance](../-writer-t-applicative-instance/index.html) | `interface WriterTApplicativeInstance<F, W> : Applicative<WriterTPartialOf<`[`F`](../-writer-t-applicative-instance/index.html#F)`, `[`W`](../-writer-t-applicative-instance/index.html#W)`>>, `[`WriterTFunctorInstance`](./index.html)`<`[`F`](../-writer-t-applicative-instance/index.html#F)`, `[`W`](../-writer-t-applicative-instance/index.html#W)`>` |

