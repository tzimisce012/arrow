---
title: StateTMonadErrorInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [StateTMonadErrorInstance](./index.html)

# StateTMonadErrorInstance

`@extension interface StateTMonadErrorInstance<F, S, E> : MonadError<StateTPartialOf<`[`F`](index.html#F)`, `[`S`](index.html#S)`>, `[`E`](index.html#E)`>, `[`StateTApplicativeErrorInstance`](../-state-t-applicative-error-instance/index.html)`<`[`F`](index.html#F)`, `[`S`](index.html#S)`, `[`E`](index.html#E)`>, `[`StateTMonadInstance`](../-state-t-monad-instance/index.html)`<`[`F`](index.html#F)`, `[`S`](index.html#S)`>`

### Functions

| [ME](-m-e.html) | `abstract fun ME(): MonadError<`[`F`](index.html#F)`, `[`E`](index.html#E)`>` |
| [MF](-m-f.html) | `open fun MF(): Monad<`[`F`](index.html#F)`>` |

### Inherited Functions

| [FF](../-state-t-applicative-error-instance/-f-f.html) | `open fun FF(): Functor<`[`F`](../-state-t-applicative-error-instance/index.html#F)`>` |

### Inheritors

| [StateTContext](../-state-t-context/index.html) | `class StateTContext<F, S, E> : `[`StateTMonadErrorInstance`](./index.html)`<`[`F`](../-state-t-context/index.html#F)`, `[`S`](../-state-t-context/index.html#S)`, `[`E`](../-state-t-context/index.html#E)`>` |

