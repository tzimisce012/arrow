---
title: WriterTMonoidKInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [WriterTMonoidKInstance](./index.html)

# WriterTMonoidKInstance

`@extension interface WriterTMonoidKInstance<F, W> : MonoidK<WriterTPartialOf<`[`F`](index.html#F)`, `[`W`](index.html#W)`>>, `[`WriterTSemigroupKInstance`](../-writer-t-semigroup-k-instance/index.html)`<`[`F`](index.html#F)`, `[`W`](index.html#W)`>`

### Functions

| [MF](-m-f.html) | `abstract fun MF(): MonoidK<`[`F`](index.html#F)`>` |
| [SS](-s-s.html) | `open fun SS(): SemigroupK<`[`F`](index.html#F)`>` |
| [empty](empty.html) | `open fun <A> empty(): WriterT<`[`F`](index.html#F)`, `[`W`](index.html#W)`, `[`A`](empty.html#A)`>` |

