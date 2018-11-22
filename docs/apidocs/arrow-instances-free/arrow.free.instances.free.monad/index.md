---
title: arrow.free.instances.free.monad - arrow-instances-free
---

[arrow-instances-free](../index.html) / [arrow.free.instances.free.monad](./index.html)

## Package arrow.free.instances.free.monad

### Extensions for External Classes

| [arrow.Kind](arrow.-kind/index.html) |  |
| [arrow.free.Free](arrow.free.-free/index.html) |  |

### Functions

| [binding](binding.html) | `fun <S, B> binding(arg0: suspend MonadContinuation<Kind<ForFree, `[`S`](binding.html#S)`>, *>.() -> `[`B`](binding.html#B)`): Free<`[`S`](binding.html#S)`, `[`B`](binding.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `fun <S, A, B> tailRecM(arg0: `[`A`](tail-rec-m.html#A)`, arg1: (`[`A`](tail-rec-m.html#A)`) -> Kind<Kind<ForFree, `[`S`](tail-rec-m.html#S)`>, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): Free<`[`S`](tail-rec-m.html#S)`, `[`B`](tail-rec-m.html#B)`>` |

