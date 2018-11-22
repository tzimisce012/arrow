---
title: arrow.instances.optiont.monad - arrow-instances-data
---

[arrow-instances-data](../index.html) / [arrow.instances.optiont.monad](./index.html)

## Package arrow.instances.optiont.monad

### Extensions for External Classes

| [arrow.Kind](arrow.-kind/index.html) |  |
| [arrow.data.OptionT](arrow.data.-option-t/index.html) |  |

### Functions

| [binding](binding.html) | `fun <F, B> binding(arg0: suspend MonadContinuation<Kind<ForOptionT, `[`F`](binding.html#F)`>, *>.() -> `[`B`](binding.html#B)`, MF: Monad<`[`F`](binding.html#F)`>): OptionT<`[`F`](binding.html#F)`, `[`B`](binding.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `fun <F, A, B> tailRecM(arg0: `[`A`](tail-rec-m.html#A)`, arg1: (`[`A`](tail-rec-m.html#A)`) -> Kind<Kind<ForOptionT, `[`F`](tail-rec-m.html#F)`>, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>, MF: Monad<`[`F`](tail-rec-m.html#F)`>): OptionT<`[`F`](tail-rec-m.html#F)`, `[`B`](tail-rec-m.html#B)`>` |

