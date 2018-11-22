---
title: arrow.instances.ior.monad - arrow-instances-data
---

[arrow-instances-data](../index.html) / [arrow.instances.ior.monad](./index.html)

## Package arrow.instances.ior.monad

### Extensions for External Classes

| [arrow.Kind](arrow.-kind/index.html) |  |
| [arrow.data.Ior](arrow.data.-ior/index.html) |  |

### Functions

| [binding](binding.html) | `fun <L, B> binding(arg0: suspend MonadContinuation<Kind<ForIor, `[`L`](binding.html#L)`>, *>.() -> `[`B`](binding.html#B)`, SL: Semigroup<`[`L`](binding.html#L)`>): Ior<`[`L`](binding.html#L)`, `[`B`](binding.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `fun <L, A, B> tailRecM(arg0: `[`A`](tail-rec-m.html#A)`, arg1: (`[`A`](tail-rec-m.html#A)`) -> Kind<Kind<ForIor, `[`L`](tail-rec-m.html#L)`>, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>, SL: Semigroup<`[`L`](tail-rec-m.html#L)`>): Ior<`[`L`](tail-rec-m.html#L)`, `[`B`](tail-rec-m.html#B)`>` |

