---
title: arrow.effects - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../index.html) / [arrow.effects](./index.html)

## Package arrow.effects

### Types

| [FlowableKApplicativeErrorInstance](-flowable-k-applicative-error-instance/index.html) | `interface FlowableKApplicativeErrorInstance : ApplicativeError<ForFlowableK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`FlowableKApplicativeInstance`](-flowable-k-applicative-instance/index.html) |
| [FlowableKApplicativeInstance](-flowable-k-applicative-instance/index.html) | `interface FlowableKApplicativeInstance : Applicative<ForFlowableK>` |
| [FlowableKAsyncInstance](-flowable-k-async-instance/index.html) | `interface FlowableKAsyncInstance : Async<ForFlowableK>, `[`FlowableKMonadDeferInstance`](-flowable-k-monad-defer-instance/index.html) |
| [FlowableKBracketInstance](-flowable-k-bracket-instance/index.html) | `interface FlowableKBracketInstance : Bracket<ForFlowableK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`FlowableKMonadThrowInstance`](-flowable-k-monad-throw-instance.html) |
| [FlowableKConcurrentEffectInstance](-flowable-k-concurrent-effect-instance/index.html) | `interface FlowableKConcurrentEffectInstance : ConcurrentEffect<ForFlowableK>, `[`FlowableKEffectInstance`](-flowable-k-effect-instance/index.html) |
| [FlowableKContext](-flowable-k-context/index.html) | `object FlowableKContext : `[`FlowableKConcurrentEffectInstance`](-flowable-k-concurrent-effect-instance/index.html)`, `[`FlowableKTraverseInstance`](-flowable-k-traverse-instance/index.html) |
| [FlowableKEffectInstance](-flowable-k-effect-instance/index.html) | `interface FlowableKEffectInstance : Effect<ForFlowableK>, `[`FlowableKAsyncInstance`](-flowable-k-async-instance/index.html) |
| [FlowableKFoldableInstance](-flowable-k-foldable-instance/index.html) | `interface FlowableKFoldableInstance : Foldable<ForFlowableK>` |
| [FlowableKFunctorInstance](-flowable-k-functor-instance/index.html) | `interface FlowableKFunctorInstance : Functor<ForFlowableK>` |
| [FlowableKMonadDeferInstance](-flowable-k-monad-defer-instance/index.html) | `interface FlowableKMonadDeferInstance : MonadDefer<ForFlowableK>, `[`FlowableKBracketInstance`](-flowable-k-bracket-instance/index.html) |
| [FlowableKMonadErrorInstance](-flowable-k-monad-error-instance/index.html) | `interface FlowableKMonadErrorInstance : MonadError<ForFlowableK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`FlowableKMonadInstance`](-flowable-k-monad-instance/index.html) |
| [FlowableKMonadInstance](-flowable-k-monad-instance/index.html) | `interface FlowableKMonadInstance : Monad<ForFlowableK>` |
| [FlowableKMonadThrowInstance](-flowable-k-monad-throw-instance.html) | `interface FlowableKMonadThrowInstance : MonadThrow<ForFlowableK>, `[`FlowableKMonadErrorInstance`](-flowable-k-monad-error-instance/index.html) |
| [FlowableKTraverseInstance](-flowable-k-traverse-instance/index.html) | `interface FlowableKTraverseInstance : Traverse<ForFlowableK>` |
| [MaybeKApplicativeErrorInstance](-maybe-k-applicative-error-instance/index.html) | `interface MaybeKApplicativeErrorInstance : ApplicativeError<ForMaybeK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`MaybeKApplicativeInstance`](-maybe-k-applicative-instance/index.html) |
| [MaybeKApplicativeInstance](-maybe-k-applicative-instance/index.html) | `interface MaybeKApplicativeInstance : Applicative<ForMaybeK>` |
| [MaybeKAsyncInstance](-maybe-k-async-instance/index.html) | `interface MaybeKAsyncInstance : Async<ForMaybeK>, `[`MaybeKMonadDeferInstance`](-maybe-k-monad-defer-instance/index.html) |
| [MaybeKBracketInstance](-maybe-k-bracket-instance/index.html) | `interface MaybeKBracketInstance : Bracket<ForMaybeK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`MaybeKMonadThrowInstance`](-maybe-k-monad-throw-instance.html) |
| [MaybeKContext](-maybe-k-context.html) | `object MaybeKContext : `[`MaybeKEffectInstance`](-maybe-k-effect-instance/index.html) |
| [MaybeKEffectInstance](-maybe-k-effect-instance/index.html) | `interface MaybeKEffectInstance : Effect<ForMaybeK>, `[`MaybeKAsyncInstance`](-maybe-k-async-instance/index.html) |
| [MaybeKFoldableInstance](-maybe-k-foldable-instance/index.html) | `interface MaybeKFoldableInstance : Foldable<ForMaybeK>` |
| [MaybeKFunctorInstance](-maybe-k-functor-instance/index.html) | `interface MaybeKFunctorInstance : Functor<ForMaybeK>` |
| [MaybeKMonadDeferInstance](-maybe-k-monad-defer-instance/index.html) | `interface MaybeKMonadDeferInstance : MonadDefer<ForMaybeK>, `[`MaybeKBracketInstance`](-maybe-k-bracket-instance/index.html) |
| [MaybeKMonadErrorInstance](-maybe-k-monad-error-instance/index.html) | `interface MaybeKMonadErrorInstance : MonadError<ForMaybeK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`MaybeKMonadInstance`](-maybe-k-monad-instance/index.html) |
| [MaybeKMonadInstance](-maybe-k-monad-instance/index.html) | `interface MaybeKMonadInstance : Monad<ForMaybeK>` |
| [MaybeKMonadThrowInstance](-maybe-k-monad-throw-instance.html) | `interface MaybeKMonadThrowInstance : MonadThrow<ForMaybeK>, `[`MaybeKMonadErrorInstance`](-maybe-k-monad-error-instance/index.html) |
| [ObservableKApplicativeErrorInstance](-observable-k-applicative-error-instance/index.html) | `interface ObservableKApplicativeErrorInstance : ApplicativeError<ForObservableK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`ObservableKApplicativeInstance`](-observable-k-applicative-instance/index.html) |
| [ObservableKApplicativeInstance](-observable-k-applicative-instance/index.html) | `interface ObservableKApplicativeInstance : Applicative<ForObservableK>` |
| [ObservableKAsyncInstance](-observable-k-async-instance/index.html) | `interface ObservableKAsyncInstance : Async<ForObservableK>, `[`ObservableKMonadDeferInstance`](-observable-k-monad-defer-instance/index.html) |
| [ObservableKBracketInstance](-observable-k-bracket-instance/index.html) | `interface ObservableKBracketInstance : Bracket<ForObservableK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`ObservableKMonadThrowInstance`](-observable-k-monad-throw-instance.html) |
| [ObservableKConcurrentEffectInstance](-observable-k-concurrent-effect-instance/index.html) | `interface ObservableKConcurrentEffectInstance : ConcurrentEffect<ForObservableK>, `[`ObservableKEffectInstance`](-observable-k-effect-instance/index.html) |
| [ObservableKContext](-observable-k-context/index.html) | `object ObservableKContext : `[`ObservableKConcurrentEffectInstance`](-observable-k-concurrent-effect-instance/index.html)`, `[`ObservableKTraverseInstance`](-observable-k-traverse-instance/index.html) |
| [ObservableKEffectInstance](-observable-k-effect-instance/index.html) | `interface ObservableKEffectInstance : Effect<ForObservableK>, `[`ObservableKAsyncInstance`](-observable-k-async-instance/index.html) |
| [ObservableKFoldableInstance](-observable-k-foldable-instance/index.html) | `interface ObservableKFoldableInstance : Foldable<ForObservableK>` |
| [ObservableKFunctorInstance](-observable-k-functor-instance/index.html) | `interface ObservableKFunctorInstance : Functor<ForObservableK>` |
| [ObservableKMonadDeferInstance](-observable-k-monad-defer-instance/index.html) | `interface ObservableKMonadDeferInstance : MonadDefer<ForObservableK>, `[`ObservableKBracketInstance`](-observable-k-bracket-instance/index.html) |
| [ObservableKMonadErrorInstance](-observable-k-monad-error-instance/index.html) | `interface ObservableKMonadErrorInstance : MonadError<ForObservableK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`ObservableKMonadInstance`](-observable-k-monad-instance/index.html) |
| [ObservableKMonadInstance](-observable-k-monad-instance/index.html) | `interface ObservableKMonadInstance : Monad<ForObservableK>` |
| [ObservableKMonadThrowInstance](-observable-k-monad-throw-instance.html) | `interface ObservableKMonadThrowInstance : MonadThrow<ForObservableK>, `[`ObservableKMonadErrorInstance`](-observable-k-monad-error-instance/index.html) |
| [ObservableKTraverseInstance](-observable-k-traverse-instance/index.html) | `interface ObservableKTraverseInstance : Traverse<ForObservableK>` |
| [SingleKApplicativeErrorInstance](-single-k-applicative-error-instance/index.html) | `interface SingleKApplicativeErrorInstance : ApplicativeError<ForSingleK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`SingleKApplicativeInstance`](-single-k-applicative-instance/index.html) |
| [SingleKApplicativeInstance](-single-k-applicative-instance/index.html) | `interface SingleKApplicativeInstance : Applicative<ForSingleK>` |
| [SingleKAsyncInstance](-single-k-async-instance/index.html) | `interface SingleKAsyncInstance : Async<ForSingleK>, `[`SingleKMonadDeferInstance`](-single-k-monad-defer-instance/index.html) |
| [SingleKBracketInstance](-single-k-bracket-instance/index.html) | `interface SingleKBracketInstance : Bracket<ForSingleK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`SingleKMonadThrowInstance`](-single-k-monad-throw-instance.html) |
| [SingleKConcurrentEffectInstance](-single-k-concurrent-effect-instance/index.html) | `interface SingleKConcurrentEffectInstance : ConcurrentEffect<ForSingleK>, `[`SingleKEffectInstance`](-single-k-effect-instance/index.html) |
| [SingleKContext](-single-k-context.html) | `object SingleKContext : `[`SingleKConcurrentEffectInstance`](-single-k-concurrent-effect-instance/index.html) |
| [SingleKEffectInstance](-single-k-effect-instance/index.html) | `interface SingleKEffectInstance : Effect<ForSingleK>, `[`SingleKAsyncInstance`](-single-k-async-instance/index.html) |
| [SingleKFunctorInstance](-single-k-functor-instance/index.html) | `interface SingleKFunctorInstance : Functor<ForSingleK>` |
| [SingleKMonadDeferInstance](-single-k-monad-defer-instance/index.html) | `interface SingleKMonadDeferInstance : MonadDefer<ForSingleK>, `[`SingleKBracketInstance`](-single-k-bracket-instance/index.html) |
| [SingleKMonadErrorInstance](-single-k-monad-error-instance/index.html) | `interface SingleKMonadErrorInstance : MonadError<ForSingleK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`SingleKMonadInstance`](-single-k-monad-instance/index.html) |
| [SingleKMonadInstance](-single-k-monad-instance/index.html) | `interface SingleKMonadInstance : Monad<ForSingleK>` |
| [SingleKMonadThrowInstance](-single-k-monad-throw-instance.html) | `interface SingleKMonadThrowInstance : MonadThrow<ForSingleK>, `[`SingleKMonadErrorInstance`](-single-k-monad-error-instance/index.html) |

### Companion Object Functions

| [asyncBuffer](async-buffer.html) | `fun FlowableK.Companion.asyncBuffer(): `[`FlowableKAsyncInstance`](-flowable-k-async-instance/index.html) |
| [asyncDrop](async-drop.html) | `fun FlowableK.Companion.asyncDrop(): `[`FlowableKAsyncInstance`](-flowable-k-async-instance/index.html) |
| [asyncError](async-error.html) | `fun FlowableK.Companion.asyncError(): `[`FlowableKAsyncInstance`](-flowable-k-async-instance/index.html) |
| [asyncLatest](async-latest.html) | `fun FlowableK.Companion.asyncLatest(): `[`FlowableKAsyncInstance`](-flowable-k-async-instance/index.html) |
| [asyncMissing](async-missing.html) | `fun FlowableK.Companion.asyncMissing(): `[`FlowableKAsyncInstance`](-flowable-k-async-instance/index.html) |
| [effectBuffer](effect-buffer.html) | `fun FlowableK.Companion.effectBuffer(): `[`FlowableKEffectInstance`](-flowable-k-effect-instance/index.html) |
| [effectDrop](effect-drop.html) | `fun FlowableK.Companion.effectDrop(): `[`FlowableKEffectInstance`](-flowable-k-effect-instance/index.html) |
| [effectError](effect-error.html) | `fun FlowableK.Companion.effectError(): `[`FlowableKEffectInstance`](-flowable-k-effect-instance/index.html) |
| [effectLatest](effect-latest.html) | `fun FlowableK.Companion.effectLatest(): `[`FlowableKEffectInstance`](-flowable-k-effect-instance/index.html) |
| [effectMissing](effect-missing.html) | `fun FlowableK.Companion.effectMissing(): `[`FlowableKEffectInstance`](-flowable-k-effect-instance/index.html) |
| [extensions](extensions.html) | `infix fun <A> ForFlowableK.Companion.~~extensions~~(f: `[`FlowableKContext`](-flowable-k-context/index.html)`.() -> `[`A`](extensions.html#A)`): `[`A`](extensions.html#A)<br>`infix fun <A> ForMaybeK.Companion.~~extensions~~(f: `[`MaybeKContext`](-maybe-k-context.html)`.() -> `[`A`](extensions.html#A)`): `[`A`](extensions.html#A)<br>`infix fun <A> ForObservableK.Companion.~~extensions~~(f: `[`ObservableKContext`](-observable-k-context/index.html)`.() -> `[`A`](extensions.html#A)`): `[`A`](extensions.html#A)<br>`infix fun <A> ForSingleK.Companion.~~extensions~~(f: `[`SingleKContext`](-single-k-context.html)`.() -> `[`A`](extensions.html#A)`): `[`A`](extensions.html#A) |
| [monadConcat](monad-concat.html) | `fun FlowableK.Companion.monadConcat(): `[`FlowableKMonadInstance`](-flowable-k-monad-instance/index.html)<br>`fun ObservableK.Companion.monadConcat(): `[`ObservableKMonadInstance`](-observable-k-monad-instance/index.html) |
| [monadErrorConcat](monad-error-concat.html) | `fun FlowableK.Companion.monadErrorConcat(): `[`FlowableKMonadErrorInstance`](-flowable-k-monad-error-instance/index.html)<br>`fun ObservableK.Companion.monadErrorConcat(): `[`ObservableKMonadErrorInstance`](-observable-k-monad-error-instance/index.html) |
| [monadErrorFlat](monad-error-flat.html) | `fun FlowableK.Companion.monadErrorFlat(): `[`FlowableKMonadErrorInstance`](-flowable-k-monad-error-instance/index.html)<br>`fun ObservableK.Companion.monadErrorFlat(): `[`ObservableKMonadErrorInstance`](-observable-k-monad-error-instance/index.html) |
| [monadErrorSwitch](monad-error-switch.html) | `fun FlowableK.Companion.monadErrorSwitch(): `[`FlowableKMonadErrorInstance`](-flowable-k-monad-error-instance/index.html)<br>`fun ObservableK.Companion.monadErrorSwitch(): `[`ObservableKMonadErrorInstance`](-observable-k-monad-error-instance/index.html) |
| [monadFlat](monad-flat.html) | `fun FlowableK.Companion.monadFlat(): `[`FlowableKMonadInstance`](-flowable-k-monad-instance/index.html)<br>`fun ObservableK.Companion.monadFlat(): `[`ObservableKMonadInstance`](-observable-k-monad-instance/index.html) |
| [monadSuspendBuffer](monad-suspend-buffer.html) | `fun FlowableK.Companion.monadSuspendBuffer(): `[`FlowableKMonadDeferInstance`](-flowable-k-monad-defer-instance/index.html) |
| [monadSuspendDrop](monad-suspend-drop.html) | `fun FlowableK.Companion.monadSuspendDrop(): `[`FlowableKMonadDeferInstance`](-flowable-k-monad-defer-instance/index.html) |
| [monadSuspendError](monad-suspend-error.html) | `fun FlowableK.Companion.monadSuspendError(): `[`FlowableKMonadDeferInstance`](-flowable-k-monad-defer-instance/index.html) |
| [monadSuspendLatest](monad-suspend-latest.html) | `fun FlowableK.Companion.monadSuspendLatest(): `[`FlowableKMonadDeferInstance`](-flowable-k-monad-defer-instance/index.html) |
| [monadSuspendMissing](monad-suspend-missing.html) | `fun FlowableK.Companion.monadSuspendMissing(): `[`FlowableKMonadDeferInstance`](-flowable-k-monad-defer-instance/index.html) |
| [monadSwitch](monad-switch.html) | `fun FlowableK.Companion.monadSwitch(): `[`FlowableKMonadInstance`](-flowable-k-monad-instance/index.html)<br>`fun ObservableK.Companion.monadSwitch(): `[`ObservableKMonadInstance`](-observable-k-monad-instance/index.html) |

