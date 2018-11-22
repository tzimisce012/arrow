---
title: arrow.effects.flowablek.monad - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../index.html) / [arrow.effects.flowablek.monad](./index.html)

## Package arrow.effects.flowablek.monad

### Extensions for External Classes

| [arrow.Kind](arrow.-kind/index.html) |  |

### Functions

| [binding](binding.html) | `fun <B> binding(arg0: suspend MonadContinuation<ForFlowableK, *>.() -> `[`B`](binding.html#B)`): FlowableK<`[`B`](binding.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `fun <A, B> tailRecM(arg0: `[`A`](tail-rec-m.html#A)`, arg1: (`[`A`](tail-rec-m.html#A)`) -> Kind<ForFlowableK, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): FlowableK<`[`B`](tail-rec-m.html#B)`>` |

### Companion Object Functions

| [monad](monad.html) | `fun FlowableK.Companion.monad(): `[`FlowableKMonadInstance`](../arrow.effects/-flowable-k-monad-instance/index.html) |

