---
title: SingleKAsyncInstance - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects](../index.html) / [SingleKAsyncInstance](./index.html)

# SingleKAsyncInstance

`@extension interface SingleKAsyncInstance : Async<ForSingleK>, `[`SingleKMonadDeferInstance`](../-single-k-monad-defer-instance/index.html)

### Functions

| [async](async.html) | `open fun <A> async(fa: Proc<`[`A`](async.html#A)`>): SingleK<`[`A`](async.html#A)`>` |
| [continueOn](continue-on.html) | `open fun <A> SingleKOf<`[`A`](continue-on.html#A)`>.continueOn(ctx: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)`): SingleK<`[`A`](continue-on.html#A)`>` |

### Extension Functions

| [catch](../../arrow.effects.singlek.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForSingleK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.singlek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): SingleK<`[`A`](../../arrow.effects.singlek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [SingleKEffectInstance](../-single-k-effect-instance/index.html) | `interface SingleKEffectInstance : Effect<ForSingleK>, `[`SingleKAsyncInstance`](./index.html) |

