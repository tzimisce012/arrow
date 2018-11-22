---
title: ObservableKAsyncInstance - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects](../index.html) / [ObservableKAsyncInstance](./index.html)

# ObservableKAsyncInstance

`@extension interface ObservableKAsyncInstance : Async<ForObservableK>, `[`ObservableKMonadDeferInstance`](../-observable-k-monad-defer-instance/index.html)

### Functions

| [async](async.html) | `open fun <A> async(fa: Proc<`[`A`](async.html#A)`>): ObservableK<`[`A`](async.html#A)`>` |
| [continueOn](continue-on.html) | `open fun <A> ObservableKOf<`[`A`](continue-on.html#A)`>.continueOn(ctx: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)`): ObservableK<`[`A`](continue-on.html#A)`>` |

### Extension Functions

| [catch](../../arrow.effects.observablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForObservableK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.observablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): ObservableK<`[`A`](../../arrow.effects.observablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [ObservableKEffectInstance](../-observable-k-effect-instance/index.html) | `interface ObservableKEffectInstance : Effect<ForObservableK>, `[`ObservableKAsyncInstance`](./index.html) |

