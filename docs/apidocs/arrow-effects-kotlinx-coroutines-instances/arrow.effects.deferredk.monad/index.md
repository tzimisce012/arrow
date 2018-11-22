---
title: arrow.effects.deferredk.monad - arrow-effects-kotlinx-coroutines-instances
---

[arrow-effects-kotlinx-coroutines-instances](../index.html) / [arrow.effects.deferredk.monad](./index.html)

## Package arrow.effects.deferredk.monad

### Extensions for External Classes

| [arrow.Kind](arrow.-kind/index.html) |  |

### Functions

| [binding](binding.html) | `fun <B> binding(arg0: suspend MonadContinuation<ForDeferredK, *>.() -> `[`B`](binding.html#B)`): DeferredK<`[`B`](binding.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `fun <A, B> tailRecM(arg0: `[`A`](tail-rec-m.html#A)`, arg1: (`[`A`](tail-rec-m.html#A)`) -> Kind<ForDeferredK, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): DeferredK<`[`B`](tail-rec-m.html#B)`>` |

### Companion Object Functions

| [monad](monad.html) | `fun DeferredK.Companion.monad(): `[`DeferredKMonadInstance`](../arrow.effects/-deferred-k-monad-instance/index.html) |

