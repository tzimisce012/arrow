---
title: arrow.instances.kleisli.monad - arrow-instances-data
---

[arrow-instances-data](../index.html) / [arrow.instances.kleisli.monad](./index.html)

## Package arrow.instances.kleisli.monad

### Extensions for External Classes

| [arrow.Kind](arrow.-kind/index.html) |  |
| [arrow.data.Kleisli](arrow.data.-kleisli/index.html) |  |

### Functions

| [binding](binding.html) | `fun <F, D, B> binding(arg0: suspend MonadContinuation<Kind<Kind<ForKleisli, `[`F`](binding.html#F)`>, `[`D`](binding.html#D)`>, *>.() -> `[`B`](binding.html#B)`, MF: Monad<`[`F`](binding.html#F)`>): Kind<`[`D`](binding.html#D)`, `[`B`](binding.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `fun <F, D, A, B> tailRecM(arg0: `[`A`](tail-rec-m.html#A)`, arg1: (`[`A`](tail-rec-m.html#A)`) -> Kind<Kind<Kind<ForKleisli, `[`F`](tail-rec-m.html#F)`>, `[`D`](tail-rec-m.html#D)`>, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>, MF: Monad<`[`F`](tail-rec-m.html#F)`>): Kind<`[`D`](tail-rec-m.html#D)`, `[`B`](tail-rec-m.html#B)`>` |

