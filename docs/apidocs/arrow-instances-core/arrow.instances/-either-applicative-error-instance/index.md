---
title: EitherApplicativeErrorInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [EitherApplicativeErrorInstance](./index.html)

# EitherApplicativeErrorInstance

`@extension interface EitherApplicativeErrorInstance<L> : ApplicativeError<EitherPartialOf<`[`L`](index.html#L)`>, `[`L`](index.html#L)`>, `[`EitherApplicativeInstance`](../-either-applicative-instance/index.html)`<`[`L`](index.html#L)`>`

### Functions

| [handleErrorWith](handle-error-with.html) | `open fun <A> Kind<EitherPartialOf<`[`L`](index.html#L)`>, `[`A`](handle-error-with.html#A)`>.handleErrorWith(f: (`[`L`](index.html#L)`) -> Kind<EitherPartialOf<`[`L`](index.html#L)`>, `[`A`](handle-error-with.html#A)`>): Either<`[`L`](index.html#L)`, `[`A`](handle-error-with.html#A)`>` |
| [raiseError](raise-error.html) | `open fun <A> raiseError(e: `[`L`](index.html#L)`): Either<`[`L`](index.html#L)`, `[`A`](raise-error.html#A)`>` |

### Inheritors

| [EitherMonadErrorInstance](../-either-monad-error-instance.html) | `interface EitherMonadErrorInstance<L> : MonadError<EitherPartialOf<`[`L`](../-either-monad-error-instance.html#L)`>, `[`L`](../-either-monad-error-instance.html#L)`>, `[`EitherApplicativeErrorInstance`](./index.html)`<`[`L`](../-either-monad-error-instance.html#L)`>, `[`EitherMonadInstance`](../-either-monad-instance/index.html)`<`[`L`](../-either-monad-error-instance.html#L)`>` |

