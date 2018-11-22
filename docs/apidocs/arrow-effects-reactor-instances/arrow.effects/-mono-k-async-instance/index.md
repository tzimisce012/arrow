---
title: MonoKAsyncInstance - arrow-effects-reactor-instances
---

[arrow-effects-reactor-instances](../../index.html) / [arrow.effects](../index.html) / [MonoKAsyncInstance](./index.html)

# MonoKAsyncInstance

`@extension interface MonoKAsyncInstance : Async<ForMonoK>, `[`MonoKMonadDeferInstance`](../-mono-k-monad-defer-instance/index.html)

### Functions

| [async](async.html) | `open fun <A> async(fa: Proc<`[`A`](async.html#A)`>): MonoK<`[`A`](async.html#A)`>` |
| [continueOn](continue-on.html) | `open fun <A> MonoKOf<`[`A`](continue-on.html#A)`>.continueOn(ctx: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)`): MonoK<`[`A`](continue-on.html#A)`>` |

### Extension Functions

| [catch](../../arrow.effects.monok.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForMonoK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.monok.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): MonoK<`[`A`](../../arrow.effects.monok.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [MonoKEffectInstance](../-mono-k-effect-instance/index.html) | `interface MonoKEffectInstance : Effect<ForMonoK>, `[`MonoKAsyncInstance`](./index.html) |

