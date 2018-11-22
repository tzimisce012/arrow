---
title: StateTInstances - arrow-dagger
---

[arrow-dagger](../../index.html) / [arrow.dagger.instances](../index.html) / [StateTInstances](./index.html)

# StateTInstances

`abstract class StateTInstances<F, S>`

### Constructors

| [&lt;init&gt;](-init-.html) | `StateTInstances()` |

### Functions

| [stateTApplicative](state-t-applicative.html) | `fun stateTApplicative(ev: `[`DaggerStateTApplicativeInstance`](../-dagger-state-t-applicative-instance/index.html)`<`[`F`](index.html#F)`, `[`S`](index.html#S)`>): Applicative<StateTPartialOf<`[`F`](index.html#F)`, `[`S`](index.html#S)`>>` |
| [stateTApplicativeError](state-t-applicative-error.html) | `fun stateTApplicativeError(ev: `[`DaggerStateTMonadErrorInstance`](../-dagger-state-t-monad-error-instance/index.html)`<`[`F`](index.html#F)`, `[`S`](index.html#S)`>): ApplicativeError<StateTPartialOf<`[`F`](index.html#F)`, `[`S`](index.html#S)`>, `[`S`](index.html#S)`>` |
| [stateTFunctor](state-t-functor.html) | `fun stateTFunctor(ev: `[`DaggerStateTFunctorInstance`](../-dagger-state-t-functor-instance/index.html)`<`[`F`](index.html#F)`, `[`S`](index.html#S)`>): Functor<StateTPartialOf<`[`F`](index.html#F)`, `[`S`](index.html#S)`>>` |
| [stateTMonad](state-t-monad.html) | `fun stateTMonad(ev: `[`DaggerStateTMonadInstance`](../-dagger-state-t-monad-instance/index.html)`<`[`F`](index.html#F)`, `[`S`](index.html#S)`>): Monad<StateTPartialOf<`[`F`](index.html#F)`, `[`S`](index.html#S)`>>` |
| [stateTMonadError](state-t-monad-error.html) | `fun stateTMonadError(ev: `[`DaggerStateTMonadErrorInstance`](../-dagger-state-t-monad-error-instance/index.html)`<`[`F`](index.html#F)`, `[`S`](index.html#S)`>): MonadError<StateTPartialOf<`[`F`](index.html#F)`, `[`S`](index.html#S)`>, `[`S`](index.html#S)`>` |

