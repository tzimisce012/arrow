---
title: MaybeKAsyncInstance - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects](../index.html) / [MaybeKAsyncInstance](./index.html)

# MaybeKAsyncInstance

`@extension interface MaybeKAsyncInstance : Async<ForMaybeK>, `[`MaybeKMonadDeferInstance`](../-maybe-k-monad-defer-instance/index.html)

### Functions

| [async](async.html) | `open fun <A> async(fa: Proc<`[`A`](async.html#A)`>): MaybeK<`[`A`](async.html#A)`>` |
| [continueOn](continue-on.html) | `open fun <A> MaybeKOf<`[`A`](continue-on.html#A)`>.continueOn(ctx: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)`): MaybeK<`[`A`](continue-on.html#A)`>` |

### Extension Functions

| [catch](../../arrow.effects.maybek.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForMaybeK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.maybek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): MaybeK<`[`A`](../../arrow.effects.maybek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [MaybeKEffectInstance](../-maybe-k-effect-instance/index.html) | `interface MaybeKEffectInstance : Effect<ForMaybeK>, `[`MaybeKAsyncInstance`](./index.html) |

