---
title: StateTFunctorInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [StateTFunctorInstance](./index.html)

# StateTFunctorInstance

`@extension interface StateTFunctorInstance<F, S> : Functor<StateTPartialOf<`[`F`](index.html#F)`, `[`S`](index.html#S)`>>`

### Functions

| [FF](-f-f.html) | `abstract fun FF(): Functor<`[`F`](index.html#F)`>` |
| [map](map.html) | `open fun <A, B> Kind<StateTPartialOf<`[`F`](index.html#F)`, `[`S`](index.html#S)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): StateT<`[`F`](index.html#F)`, `[`S`](index.html#S)`, `[`B`](map.html#B)`>` |

### Inheritors

| [StateTApplicativeInstance](../-state-t-applicative-instance/index.html) | `interface StateTApplicativeInstance<F, S> : Applicative<StateTPartialOf<`[`F`](../-state-t-applicative-instance/index.html#F)`, `[`S`](../-state-t-applicative-instance/index.html#S)`>>, `[`StateTFunctorInstance`](./index.html)`<`[`F`](../-state-t-applicative-instance/index.html#F)`, `[`S`](../-state-t-applicative-instance/index.html#S)`>` |

