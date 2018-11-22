---
title: arrow.mtl.instances.writert.monadFilter - arrow-mtl
---

[arrow-mtl](../index.html) / [arrow.mtl.instances.writert.monadFilter](./index.html)

## Package arrow.mtl.instances.writert.monadFilter

### Extensions for External Classes

| [arrow.Kind](arrow.-kind/index.html) |  |
| [arrow.data.WriterT](arrow.data.-writer-t/index.html) |  |

### Functions

| [bindingFilter](binding-filter.html) | `fun <F, W, B> bindingFilter(c: suspend `[`MonadFilterContinuation`](../arrow.mtl.typeclasses/-monad-filter-continuation/index.html)`<Kind<Kind<ForWriterT, `[`F`](binding-filter.html#F)`>, `[`W`](binding-filter.html#W)`>, *>.() -> `[`B`](binding-filter.html#B)`, FF: `[`MonadFilter`](../arrow.mtl.typeclasses/-monad-filter/index.html)`<`[`F`](binding-filter.html#F)`>, MM: Monoid<`[`W`](binding-filter.html#W)`>): Kind<`[`W`](binding-filter.html#W)`, `[`B`](binding-filter.html#B)`>` |
| [empty](empty.html) | `fun <F, W, A> empty(FF: `[`MonadFilter`](../arrow.mtl.typeclasses/-monad-filter/index.html)`<`[`F`](empty.html#F)`>, MM: Monoid<`[`W`](empty.html#W)`>): WriterT<`[`F`](empty.html#F)`, `[`W`](empty.html#W)`, `[`A`](empty.html#A)`>` |

