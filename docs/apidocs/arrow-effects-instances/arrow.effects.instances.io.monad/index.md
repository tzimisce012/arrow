---
title: arrow.effects.instances.io.monad - arrow-effects-instances
---

[arrow-effects-instances](../index.html) / [arrow.effects.instances.io.monad](./index.html)

## Package arrow.effects.instances.io.monad

### Extensions for External Classes

| [arrow.Kind](arrow.-kind/index.html) |  |

### Functions

| [binding](binding.html) | `fun <B> binding(arg0: suspend MonadContinuation<ForIO, *>.() -> `[`B`](binding.html#B)`): IO<`[`B`](binding.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `fun <A, B> tailRecM(arg0: `[`A`](tail-rec-m.html#A)`, arg1: (`[`A`](tail-rec-m.html#A)`) -> Kind<ForIO, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): IO<`[`B`](tail-rec-m.html#B)`>` |

### Companion Object Functions

| [monad](monad.html) | `fun IO.Companion.monad(): `[`IOMonadInstance`](../arrow.effects.instances/-i-o-monad-instance/index.html) |

