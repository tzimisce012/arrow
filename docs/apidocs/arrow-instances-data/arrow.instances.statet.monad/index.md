---
title: arrow.instances.statet.monad - arrow-instances-data
---

[arrow-instances-data](../index.html) / [arrow.instances.statet.monad](./index.html)

## Package arrow.instances.statet.monad

### Extensions for External Classes

| [arrow.Kind](arrow.-kind/index.html) |  |
| [arrow.data.StateT](arrow.data.-state-t/index.html) |  |

### Functions

| [binding](binding.html) | `fun <F, S, B> binding(arg0: suspend MonadContinuation<Kind<Kind<ForStateT, `[`F`](binding.html#F)`>, `[`S`](binding.html#S)`>, *>.() -> `[`B`](binding.html#B)`, MF: Monad<`[`F`](binding.html#F)`>): Kind<`[`S`](binding.html#S)`, `[`B`](binding.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `fun <F, S, A, B> tailRecM(arg0: `[`A`](tail-rec-m.html#A)`, arg1: (`[`A`](tail-rec-m.html#A)`) -> Kind<Kind<Kind<ForStateT, `[`F`](tail-rec-m.html#F)`>, `[`S`](tail-rec-m.html#S)`>, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>, MF: Monad<`[`F`](tail-rec-m.html#F)`>): Kind<`[`S`](tail-rec-m.html#S)`, `[`B`](tail-rec-m.html#B)`>` |

