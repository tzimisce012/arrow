---
title: arrow.effects.maybek.monad - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../index.html) / [arrow.effects.maybek.monad](./index.html)

## Package arrow.effects.maybek.monad

### Extensions for External Classes

| [arrow.Kind](arrow.-kind/index.html) |  |

### Functions

| [binding](binding.html) | `fun <B> binding(arg0: suspend MonadContinuation<ForMaybeK, *>.() -> `[`B`](binding.html#B)`): MaybeK<`[`B`](binding.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `fun <A, B> tailRecM(arg0: `[`A`](tail-rec-m.html#A)`, arg1: (`[`A`](tail-rec-m.html#A)`) -> Kind<ForMaybeK, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): MaybeK<`[`B`](tail-rec-m.html#B)`>` |

### Companion Object Functions

| [monad](monad.html) | `fun MaybeK.Companion.monad(): `[`MaybeKMonadInstance`](../arrow.effects/-maybe-k-monad-instance/index.html) |

