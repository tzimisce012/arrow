---
title: EitherTApplicativeErrorInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [EitherTApplicativeErrorInstance](./index.html)

# EitherTApplicativeErrorInstance

`interface EitherTApplicativeErrorInstance<F, L> : ApplicativeError<EitherTPartialOf<`[`F`](index.html#F)`, `[`L`](index.html#L)`>, `[`L`](index.html#L)`>, `[`EitherTApplicativeInstance`](../-either-t-applicative-instance/index.html)`<`[`F`](index.html#F)`, `[`L`](index.html#L)`>`

### Functions

| [handleErrorWith](handle-error-with.html) | `open fun <A> Kind<EitherTPartialOf<`[`F`](index.html#F)`, `[`L`](index.html#L)`>, `[`A`](handle-error-with.html#A)`>.handleErrorWith(f: (`[`L`](index.html#L)`) -> Kind<EitherTPartialOf<`[`F`](index.html#F)`, `[`L`](index.html#L)`>, `[`A`](handle-error-with.html#A)`>): EitherT<`[`F`](index.html#F)`, `[`L`](index.html#L)`, `[`A`](handle-error-with.html#A)`>` |
| [raiseError](raise-error.html) | `open fun <A> raiseError(e: `[`L`](index.html#L)`): EitherT<`[`F`](index.html#F)`, `[`L`](index.html#L)`, `[`A`](raise-error.html#A)`>` |

### Inherited Functions

| [MF](../-either-t-applicative-instance/-m-f.html) | `abstract fun MF(): Monad<`[`F`](../-either-t-applicative-instance/index.html#F)`>` |

### Inheritors

| [EitherTMonadErrorInstance](../-either-t-monad-error-instance.html) | `interface EitherTMonadErrorInstance<F, L> : MonadError<EitherTPartialOf<`[`F`](../-either-t-monad-error-instance.html#F)`, `[`L`](../-either-t-monad-error-instance.html#L)`>, `[`L`](../-either-t-monad-error-instance.html#L)`>, `[`EitherTApplicativeErrorInstance`](./index.html)`<`[`F`](../-either-t-monad-error-instance.html#F)`, `[`L`](../-either-t-monad-error-instance.html#L)`>, `[`EitherTMonadInstance`](../-either-t-monad-instance/index.html)`<`[`F`](../-either-t-monad-error-instance.html#F)`, `[`L`](../-either-t-monad-error-instance.html#L)`>` |

