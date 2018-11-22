---
title: arrow.effects - arrow-effects-kotlinx-coroutines-instances
---

[arrow-effects-kotlinx-coroutines-instances](../index.html) / [arrow.effects](./index.html)

## Package arrow.effects

### Types

| [DeferredKApplicativeErrorInstance](-deferred-k-applicative-error-instance/index.html) | `interface DeferredKApplicativeErrorInstance : ApplicativeError<ForDeferredK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`DeferredKApplicativeInstance`](-deferred-k-applicative-instance/index.html) |
| [DeferredKApplicativeInstance](-deferred-k-applicative-instance/index.html) | `interface DeferredKApplicativeInstance : Applicative<ForDeferredK>` |
| [DeferredKAsyncInstance](-deferred-k-async-instance/index.html) | `interface DeferredKAsyncInstance : Async<ForDeferredK>, `[`DeferredKMonadDeferInstance`](-deferred-k-monad-defer-instance/index.html) |
| [DeferredKBracketInstance](-deferred-k-bracket-instance/index.html) | `interface DeferredKBracketInstance : Bracket<ForDeferredK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`DeferredKMonadErrorInstance`](-deferred-k-monad-error-instance/index.html) |
| [DeferredKConcurrentEffectInstance](-deferred-k-concurrent-effect-instance/index.html) | `interface DeferredKConcurrentEffectInstance : ConcurrentEffect<ForDeferredK>, `[`DeferredKEffectInstance`](-deferred-k-effect-instance/index.html) |
| [DeferredKContext](-deferred-k-context.html) | `object DeferredKContext : `[`DeferredKConcurrentEffectInstance`](-deferred-k-concurrent-effect-instance/index.html) |
| [DeferredKEffectInstance](-deferred-k-effect-instance/index.html) | `interface DeferredKEffectInstance : Effect<ForDeferredK>, `[`DeferredKAsyncInstance`](-deferred-k-async-instance/index.html) |
| [DeferredKFunctorInstance](-deferred-k-functor-instance/index.html) | `interface DeferredKFunctorInstance : Functor<ForDeferredK>` |
| [DeferredKMonadDeferInstance](-deferred-k-monad-defer-instance/index.html) | `interface DeferredKMonadDeferInstance : MonadDefer<ForDeferredK>, `[`DeferredKBracketInstance`](-deferred-k-bracket-instance/index.html) |
| [DeferredKMonadErrorInstance](-deferred-k-monad-error-instance/index.html) | `interface DeferredKMonadErrorInstance : MonadError<ForDeferredK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`DeferredKMonadInstance`](-deferred-k-monad-instance/index.html) |
| [DeferredKMonadInstance](-deferred-k-monad-instance/index.html) | `interface DeferredKMonadInstance : Monad<ForDeferredK>` |

### Extensions for External Classes

| [arrow.Kind](arrow.-kind/index.html) |  |

### Companion Object Functions

| [extensions](extensions.html) | `infix fun <A> ForDeferredK.Companion.~~extensions~~(f: `[`DeferredKContext`](-deferred-k-context.html)`.() -> `[`A`](extensions.html#A)`): `[`A`](extensions.html#A) |

