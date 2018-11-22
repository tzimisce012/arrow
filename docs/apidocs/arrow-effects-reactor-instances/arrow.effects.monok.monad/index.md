---
title: arrow.effects.monok.monad - arrow-effects-reactor-instances
---

[arrow-effects-reactor-instances](../index.html) / [arrow.effects.monok.monad](./index.html)

## Package arrow.effects.monok.monad

### Extensions for External Classes

| [arrow.Kind](arrow.-kind/index.html) |  |

### Functions

| [binding](binding.html) | `fun <B> binding(arg0: suspend MonadContinuation<ForMonoK, *>.() -> `[`B`](binding.html#B)`): MonoK<`[`B`](binding.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `fun <A, B> tailRecM(arg0: `[`A`](tail-rec-m.html#A)`, arg1: (`[`A`](tail-rec-m.html#A)`) -> Kind<ForMonoK, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): MonoK<`[`B`](tail-rec-m.html#B)`>` |

### Companion Object Functions

| [monad](monad.html) | `fun MonoK.Companion.monad(): `[`MonoKMonadInstance`](../arrow.effects/-mono-k-monad-instance/index.html) |

