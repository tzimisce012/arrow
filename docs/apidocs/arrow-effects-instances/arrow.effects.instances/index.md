---
title: arrow.effects.instances - arrow-effects-instances
---

[arrow-effects-instances](../index.html) / [arrow.effects.instances](./index.html)

## Package arrow.effects.instances

### Types

| [IOApplicativeErrorInstance](-i-o-applicative-error-instance/index.html) | `interface IOApplicativeErrorInstance : ApplicativeError<ForIO, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`IOApplicativeInstance`](-i-o-applicative-instance/index.html) |
| [IOApplicativeInstance](-i-o-applicative-instance/index.html) | `interface IOApplicativeInstance : Applicative<ForIO>` |
| [IOAsyncInstance](-i-o-async-instance/index.html) | `interface IOAsyncInstance : Async<ForIO>, `[`IOMonadDeferInstance`](-i-o-monad-defer-instance/index.html) |
| [IOBracketInstance](-i-o-bracket-instance/index.html) | `interface IOBracketInstance : Bracket<ForIO, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`IOMonadThrowInstance`](-i-o-monad-throw-instance.html) |
| [IOConcurrentEffectInstance](-i-o-concurrent-effect-instance/index.html) | `interface IOConcurrentEffectInstance : ConcurrentEffect<ForIO>, `[`IOEffectInstance`](-i-o-effect-instance/index.html) |
| [IOContext](-i-o-context.html) | `object IOContext : `[`IOConcurrentEffectInstance`](-i-o-concurrent-effect-instance/index.html) |
| [IOEffectInstance](-i-o-effect-instance/index.html) | `interface IOEffectInstance : Effect<ForIO>, `[`IOAsyncInstance`](-i-o-async-instance/index.html) |
| [IOFunctorInstance](-i-o-functor-instance/index.html) | `interface IOFunctorInstance : Functor<ForIO>` |
| [IOMonadDeferInstance](-i-o-monad-defer-instance/index.html) | `interface IOMonadDeferInstance : MonadDefer<ForIO>, `[`IOBracketInstance`](-i-o-bracket-instance/index.html) |
| [IOMonadErrorInstance](-i-o-monad-error-instance/index.html) | `interface IOMonadErrorInstance : MonadError<ForIO, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`IOMonadInstance`](-i-o-monad-instance/index.html) |
| [IOMonadInstance](-i-o-monad-instance/index.html) | `interface IOMonadInstance : Monad<ForIO>` |
| [IOMonadThrowInstance](-i-o-monad-throw-instance.html) | `interface IOMonadThrowInstance : MonadThrow<ForIO>, `[`IOMonadErrorInstance`](-i-o-monad-error-instance/index.html) |
| [IOMonoidInstance](-i-o-monoid-instance/index.html) | `interface IOMonoidInstance<A> : Monoid<IO<`[`A`](-i-o-monoid-instance/index.html#A)`>>, `[`IOSemigroupInstance`](-i-o-semigroup-instance/index.html)`<`[`A`](-i-o-monoid-instance/index.html#A)`>` |
| [IOSemigroupInstance](-i-o-semigroup-instance/index.html) | `interface IOSemigroupInstance<A> : Semigroup<IO<`[`A`](-i-o-semigroup-instance/index.html#A)`>>` |

### Companion Object Functions

| [extensions](extensions.html) | `infix fun <A> ForIO.Companion.~~extensions~~(f: `[`IOContext`](-i-o-context.html)`.() -> `[`A`](extensions.html#A)`): `[`A`](extensions.html#A) |

