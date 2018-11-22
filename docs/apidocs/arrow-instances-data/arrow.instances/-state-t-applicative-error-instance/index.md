---
title: StateTApplicativeErrorInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [StateTApplicativeErrorInstance](./index.html)

# StateTApplicativeErrorInstance

`@extension interface StateTApplicativeErrorInstance<F, S, E> : ApplicativeError<StateTPartialOf<`[`F`](index.html#F)`, `[`S`](index.html#S)`>, `[`E`](index.html#E)`>, `[`StateTApplicativeInstance`](../-state-t-applicative-instance/index.html)`<`[`F`](index.html#F)`, `[`S`](index.html#S)`>`

### Functions

| [FF](-f-f.html) | `open fun FF(): Functor<`[`F`](index.html#F)`>` |
| [ME](-m-e.html) | `abstract fun ME(): MonadError<`[`F`](index.html#F)`, `[`E`](index.html#E)`>` |
| [MF](-m-f.html) | `open fun MF(): Monad<`[`F`](index.html#F)`>` |
| [handleErrorWith](handle-error-with.html) | `open fun <A> Kind<StateTPartialOf<`[`F`](index.html#F)`, `[`S`](index.html#S)`>, `[`A`](handle-error-with.html#A)`>.handleErrorWith(f: (`[`E`](index.html#E)`) -> Kind<StateTPartialOf<`[`F`](index.html#F)`, `[`S`](index.html#S)`>, `[`A`](handle-error-with.html#A)`>): StateT<`[`F`](index.html#F)`, `[`S`](index.html#S)`, `[`A`](handle-error-with.html#A)`>` |
| [raiseError](raise-error.html) | `open fun <A> raiseError(e: `[`E`](index.html#E)`): Kind<StateTPartialOf<`[`F`](index.html#F)`, `[`S`](index.html#S)`>, `[`A`](raise-error.html#A)`>` |

### Inheritors

| [StateTMonadErrorInstance](../-state-t-monad-error-instance/index.html) | `interface StateTMonadErrorInstance<F, S, E> : MonadError<StateTPartialOf<`[`F`](../-state-t-monad-error-instance/index.html#F)`, `[`S`](../-state-t-monad-error-instance/index.html#S)`>, `[`E`](../-state-t-monad-error-instance/index.html#E)`>, `[`StateTApplicativeErrorInstance`](./index.html)`<`[`F`](../-state-t-monad-error-instance/index.html#F)`, `[`S`](../-state-t-monad-error-instance/index.html#S)`, `[`E`](../-state-t-monad-error-instance/index.html#E)`>, `[`StateTMonadInstance`](../-state-t-monad-instance/index.html)`<`[`F`](../-state-t-monad-error-instance/index.html#F)`, `[`S`](../-state-t-monad-error-instance/index.html#S)`>` |

