---
title: arrow.instances.writert.monad - arrow-instances-data
---

[arrow-instances-data](../index.html) / [arrow.instances.writert.monad](./index.html)

## Package arrow.instances.writert.monad

### Extensions for External Classes

| [arrow.Kind](arrow.-kind/index.html) |  |
| [arrow.data.WriterT](arrow.data.-writer-t/index.html) |  |

### Functions

| [binding](binding.html) | `fun <F, W, B> binding(arg0: suspend MonadContinuation<Kind<Kind<ForWriterT, `[`F`](binding.html#F)`>, `[`W`](binding.html#W)`>, *>.() -> `[`B`](binding.html#B)`, MF: Monad<`[`F`](binding.html#F)`>, MM: Monoid<`[`W`](binding.html#W)`>): Kind<`[`W`](binding.html#W)`, `[`B`](binding.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `fun <F, W, A, B> tailRecM(arg0: `[`A`](tail-rec-m.html#A)`, arg1: (`[`A`](tail-rec-m.html#A)`) -> Kind<Kind<Kind<ForWriterT, `[`F`](tail-rec-m.html#F)`>, `[`W`](tail-rec-m.html#W)`>, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>, MF: Monad<`[`F`](tail-rec-m.html#F)`>, MM: Monoid<`[`W`](tail-rec-m.html#W)`>): Kind<`[`W`](tail-rec-m.html#W)`, `[`B`](tail-rec-m.html#B)`>` |

