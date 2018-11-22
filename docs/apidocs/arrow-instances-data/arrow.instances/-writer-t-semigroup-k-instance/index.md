---
title: WriterTSemigroupKInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [WriterTSemigroupKInstance](./index.html)

# WriterTSemigroupKInstance

`@extension interface WriterTSemigroupKInstance<F, W> : SemigroupK<WriterTPartialOf<`[`F`](index.html#F)`, `[`W`](index.html#W)`>>`

### Functions

| [SS](-s-s.html) | `abstract fun SS(): SemigroupK<`[`F`](index.html#F)`>` |
| [combineK](combine-k.html) | `open fun <A> Kind<WriterTPartialOf<`[`F`](index.html#F)`, `[`W`](index.html#W)`>, `[`A`](combine-k.html#A)`>.combineK(y: Kind<WriterTPartialOf<`[`F`](index.html#F)`, `[`W`](index.html#W)`>, `[`A`](combine-k.html#A)`>): WriterT<`[`F`](index.html#F)`, `[`W`](index.html#W)`, `[`A`](combine-k.html#A)`>` |

### Inheritors

| [WriterTMonoidKInstance](../-writer-t-monoid-k-instance/index.html) | `interface WriterTMonoidKInstance<F, W> : MonoidK<WriterTPartialOf<`[`F`](../-writer-t-monoid-k-instance/index.html#F)`, `[`W`](../-writer-t-monoid-k-instance/index.html#W)`>>, `[`WriterTSemigroupKInstance`](./index.html)`<`[`F`](../-writer-t-monoid-k-instance/index.html#F)`, `[`W`](../-writer-t-monoid-k-instance/index.html#W)`>` |

