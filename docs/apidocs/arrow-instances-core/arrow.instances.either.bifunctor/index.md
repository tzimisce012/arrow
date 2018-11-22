---
title: arrow.instances.either.bifunctor - arrow-instances-core
---

[arrow-instances-core](../index.html) / [arrow.instances.either.bifunctor](./index.html)

## Package arrow.instances.either.bifunctor

### Extensions for External Classes

| [arrow.Kind](arrow.-kind/index.html) |  |
| [arrow.core.Either](arrow.core.-either/index.html) |  |

### Functions

| [leftFunctor](left-functor.html) | `fun <X> leftFunctor(): Functor<Conested<ForEither, `[`X`](left-functor.html#X)`>>` |
| [lift](lift.html) | `fun <A, B, C, D> lift(arg0: (`[`A`](lift.html#A)`) -> `[`C`](lift.html#C)`, arg1: (`[`B`](lift.html#B)`) -> `[`D`](lift.html#D)`): (Kind<Kind<ForEither, `[`A`](lift.html#A)`>, `[`B`](lift.html#B)`>) -> Kind<Kind<ForEither, `[`C`](lift.html#C)`>, `[`D`](lift.html#D)`>` |
| [rightFunctor](right-functor.html) | `fun <X> rightFunctor(): Functor<Kind<ForEither, `[`X`](right-functor.html#X)`>>` |

