---
title: arrow.effects - arrow-effects-reactor-instances
---

[arrow-effects-reactor-instances](../index.html) / [arrow.effects](./index.html)

## Package arrow.effects

### Types

| [FluxKApplicativeErrorInstance](-flux-k-applicative-error-instance/index.html) | `interface FluxKApplicativeErrorInstance : ApplicativeError<ForFluxK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`FluxKApplicativeInstance`](-flux-k-applicative-instance/index.html) |
| [FluxKApplicativeInstance](-flux-k-applicative-instance/index.html) | `interface FluxKApplicativeInstance : Applicative<ForFluxK>` |
| [FluxKAsyncInstance](-flux-k-async-instance/index.html) | `interface FluxKAsyncInstance : Async<ForFluxK>, `[`FluxKMonadDeferInstance`](-flux-k-monad-defer-instance/index.html) |
| [FluxKBracketInstance](-flux-k-bracket-instance/index.html) | `interface FluxKBracketInstance : Bracket<ForFluxK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`FluxKMonadThrowInstance`](-flux-k-monad-throw-instance.html) |
| [FluxKConcurrentEffectInstance](-flux-k-concurrent-effect-instance/index.html) | `interface FluxKConcurrentEffectInstance : ConcurrentEffect<ForFluxK>, `[`FluxKEffectInstance`](-flux-k-effect-instance/index.html) |
| [FluxKContext](-flux-k-context/index.html) | `object FluxKContext : `[`FluxKConcurrentEffectInstance`](-flux-k-concurrent-effect-instance/index.html)`, `[`FluxKTraverseInstance`](-flux-k-traverse-instance/index.html) |
| [FluxKEffectInstance](-flux-k-effect-instance/index.html) | `interface FluxKEffectInstance : Effect<ForFluxK>, `[`FluxKAsyncInstance`](-flux-k-async-instance/index.html) |
| [FluxKFoldableInstance](-flux-k-foldable-instance/index.html) | `interface FluxKFoldableInstance : Foldable<ForFluxK>` |
| [FluxKFunctorInstance](-flux-k-functor-instance/index.html) | `interface FluxKFunctorInstance : Functor<ForFluxK>` |
| [FluxKMonadDeferInstance](-flux-k-monad-defer-instance/index.html) | `interface FluxKMonadDeferInstance : MonadDefer<ForFluxK>, `[`FluxKBracketInstance`](-flux-k-bracket-instance/index.html) |
| [FluxKMonadErrorInstance](-flux-k-monad-error-instance/index.html) | `interface FluxKMonadErrorInstance : MonadError<ForFluxK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`FluxKMonadInstance`](-flux-k-monad-instance/index.html) |
| [FluxKMonadInstance](-flux-k-monad-instance/index.html) | `interface FluxKMonadInstance : Monad<ForFluxK>` |
| [FluxKMonadThrowInstance](-flux-k-monad-throw-instance.html) | `interface FluxKMonadThrowInstance : MonadThrow<ForFluxK>, `[`FluxKMonadErrorInstance`](-flux-k-monad-error-instance/index.html) |
| [FluxKTraverseInstance](-flux-k-traverse-instance/index.html) | `interface FluxKTraverseInstance : Traverse<ForFluxK>` |
| [MonoKApplicativeErrorInstance](-mono-k-applicative-error-instance/index.html) | `interface MonoKApplicativeErrorInstance : ApplicativeError<ForMonoK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`MonoKApplicativeInstance`](-mono-k-applicative-instance/index.html) |
| [MonoKApplicativeInstance](-mono-k-applicative-instance/index.html) | `interface MonoKApplicativeInstance : Applicative<ForMonoK>` |
| [MonoKAsyncInstance](-mono-k-async-instance/index.html) | `interface MonoKAsyncInstance : Async<ForMonoK>, `[`MonoKMonadDeferInstance`](-mono-k-monad-defer-instance/index.html) |
| [MonoKBracketInstance](-mono-k-bracket-instance/index.html) | `interface MonoKBracketInstance : Bracket<ForMonoK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`MonoKMonadThrowInstance`](-mono-k-monad-throw-instance.html) |
| [MonoKConcurrentEffectInstance](-mono-k-concurrent-effect-instance/index.html) | `interface MonoKConcurrentEffectInstance : ConcurrentEffect<ForMonoK>, `[`MonoKEffectInstance`](-mono-k-effect-instance/index.html) |
| [MonoKContext](-mono-k-context.html) | `object MonoKContext : `[`MonoKConcurrentEffectInstance`](-mono-k-concurrent-effect-instance/index.html) |
| [MonoKEffectInstance](-mono-k-effect-instance/index.html) | `interface MonoKEffectInstance : Effect<ForMonoK>, `[`MonoKAsyncInstance`](-mono-k-async-instance/index.html) |
| [MonoKFunctorInstance](-mono-k-functor-instance/index.html) | `interface MonoKFunctorInstance : Functor<ForMonoK>` |
| [MonoKMonadDeferInstance](-mono-k-monad-defer-instance/index.html) | `interface MonoKMonadDeferInstance : `[`MonoKBracketInstance`](-mono-k-bracket-instance/index.html)`, MonadDefer<ForMonoK>` |
| [MonoKMonadErrorInstance](-mono-k-monad-error-instance/index.html) | `interface MonoKMonadErrorInstance : MonadError<ForMonoK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`MonoKMonadInstance`](-mono-k-monad-instance/index.html) |
| [MonoKMonadInstance](-mono-k-monad-instance/index.html) | `interface MonoKMonadInstance : Monad<ForMonoK>` |
| [MonoKMonadThrowInstance](-mono-k-monad-throw-instance.html) | `interface MonoKMonadThrowInstance : MonadThrow<ForMonoK>, `[`MonoKMonadErrorInstance`](-mono-k-monad-error-instance/index.html) |

### Companion Object Functions

| [extensions](extensions.html) | `infix fun <A> ForFluxK.Companion.~~extensions~~(f: `[`FluxKContext`](-flux-k-context/index.html)`.() -> `[`A`](extensions.html#A)`): `[`A`](extensions.html#A)<br>`infix fun <A> ForMonoK.Companion.~~extensions~~(f: `[`MonoKContext`](-mono-k-context.html)`.() -> `[`A`](extensions.html#A)`): `[`A`](extensions.html#A) |
| [monadConcat](monad-concat.html) | `fun FluxK.Companion.monadConcat(): `[`FluxKMonadInstance`](-flux-k-monad-instance/index.html) |
| [monadErrorConcat](monad-error-concat.html) | `fun FluxK.Companion.monadErrorConcat(): `[`FluxKMonadErrorInstance`](-flux-k-monad-error-instance/index.html) |
| [monadErrorFlat](monad-error-flat.html) | `fun FluxK.Companion.monadErrorFlat(): `[`FluxKMonadErrorInstance`](-flux-k-monad-error-instance/index.html) |
| [monadErrorSwitch](monad-error-switch.html) | `fun FluxK.Companion.monadErrorSwitch(): `[`FluxKMonadErrorInstance`](-flux-k-monad-error-instance/index.html) |
| [monadFlat](monad-flat.html) | `fun FluxK.Companion.monadFlat(): `[`FluxKMonadInstance`](-flux-k-monad-instance/index.html) |
| [monadSwitch](monad-switch.html) | `fun FluxK.Companion.monadSwitch(): `[`FluxKMonadInstance`](-flux-k-monad-instance/index.html) |

