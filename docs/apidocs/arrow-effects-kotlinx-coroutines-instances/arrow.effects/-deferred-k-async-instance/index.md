---
title: DeferredKAsyncInstance - arrow-effects-kotlinx-coroutines-instances
---

[arrow-effects-kotlinx-coroutines-instances](../../index.html) / [arrow.effects](../index.html) / [DeferredKAsyncInstance](./index.html)

# DeferredKAsyncInstance

`@extension interface DeferredKAsyncInstance : Async<ForDeferredK>, `[`DeferredKMonadDeferInstance`](../-deferred-k-monad-defer-instance/index.html)

### Functions

| [async](async.html) | `open fun <A> async(fa: Proc<`[`A`](async.html#A)`>): DeferredK<`[`A`](async.html#A)`>` |
| [continueOn](continue-on.html) | `open fun <A> DeferredKOf<`[`A`](continue-on.html#A)`>.continueOn(ctx: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)`): DeferredK<`[`A`](continue-on.html#A)`>` |
| [delay](delay.html) | `open fun <A> delay(f: () -> `[`A`](delay.html#A)`): DeferredK<`[`A`](delay.html#A)`>` |
| [invoke](invoke.html) | `open fun <A> invoke(ctx: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)`, f: () -> `[`A`](invoke.html#A)`): Kind<ForDeferredK, `[`A`](invoke.html#A)`>` |

### Extension Functions

| [catch](../../arrow.effects.deferredk.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForDeferredK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.deferredk.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): DeferredK<`[`A`](../../arrow.effects.deferredk.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [DeferredKEffectInstance](../-deferred-k-effect-instance/index.html) | `interface DeferredKEffectInstance : Effect<ForDeferredK>, `[`DeferredKAsyncInstance`](./index.html) |

