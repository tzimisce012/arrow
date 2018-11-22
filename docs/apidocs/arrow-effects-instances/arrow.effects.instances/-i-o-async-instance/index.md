---
title: IOAsyncInstance - arrow-effects-instances
---

[arrow-effects-instances](../../index.html) / [arrow.effects.instances](../index.html) / [IOAsyncInstance](./index.html)

# IOAsyncInstance

`@extension interface IOAsyncInstance : Async<ForIO>, `[`IOMonadDeferInstance`](../-i-o-monad-defer-instance/index.html)

### Functions

| [async](async.html) | `open fun <A> async(fa: Proc<`[`A`](async.html#A)`>): IO<`[`A`](async.html#A)`>` |
| [continueOn](continue-on.html) | `open fun <A> IOOf<`[`A`](continue-on.html#A)`>.continueOn(ctx: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)`): IO<`[`A`](continue-on.html#A)`>` |
| [delay](delay.html) | `open fun <A> delay(f: () -> `[`A`](delay.html#A)`): IO<`[`A`](delay.html#A)`>` |

### Extension Functions

| [catch](../../arrow.effects.instances.io.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForIO, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.instances.io.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): IO<`[`A`](../../arrow.effects.instances.io.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [IOEffectInstance](../-i-o-effect-instance/index.html) | `interface IOEffectInstance : Effect<ForIO>, `[`IOAsyncInstance`](./index.html) |

