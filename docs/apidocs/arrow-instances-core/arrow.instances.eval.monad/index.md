---
title: arrow.instances.eval.monad - arrow-instances-core
---

[arrow-instances-core](../index.html) / [arrow.instances.eval.monad](./index.html)

## Package arrow.instances.eval.monad

### Extensions for External Classes

| [arrow.Kind](arrow.-kind/index.html) |  |
| [arrow.core.Eval](arrow.core.-eval/index.html) |  |

### Functions

| [binding](binding.html) | `fun <B> binding(arg0: suspend MonadContinuation<ForEval, *>.() -> `[`B`](binding.html#B)`): Eval<`[`B`](binding.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `fun <A, B> tailRecM(arg0: `[`A`](tail-rec-m.html#A)`, arg1: (`[`A`](tail-rec-m.html#A)`) -> Kind<ForEval, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): Eval<`[`B`](tail-rec-m.html#B)`>` |

