---
title: arrow.streams.internal.freec.monad - arrow-streams
---

[arrow-streams](../index.html) / [arrow.streams.internal.freec.monad](./index.html)

## Package arrow.streams.internal.freec.monad

### Extensions for External Classes

| [arrow.Kind](arrow.-kind/index.html) |  |

### Functions

| [binding](binding.html) | `fun <F, B> binding(arg0: suspend MonadContinuation<Kind<`[`ForFreeC`](../arrow.streams.internal/-for-free-c.html)`, `[`F`](binding.html#F)`>, *>.() -> `[`B`](binding.html#B)`): `[`FreeC`](../arrow.streams.internal/-free-c/index.html)`<`[`F`](binding.html#F)`, `[`B`](binding.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `fun <F, A, B> tailRecM(arg0: `[`A`](tail-rec-m.html#A)`, arg1: (`[`A`](tail-rec-m.html#A)`) -> Kind<Kind<`[`ForFreeC`](../arrow.streams.internal/-for-free-c.html)`, `[`F`](tail-rec-m.html#F)`>, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): `[`FreeC`](../arrow.streams.internal/-free-c/index.html)`<`[`F`](tail-rec-m.html#F)`, `[`B`](tail-rec-m.html#B)`>` |

### Companion Object Functions

| [monad](monad.html) | `fun <F> FreeC.Companion.monad(): `[`FreeCMonad`](../arrow.streams.internal/-free-c-monad/index.html)`<`[`F`](monad.html#F)`>` |

