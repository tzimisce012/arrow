---
title: DeferredKMonadDeferInstance - arrow-effects-kotlinx-coroutines-instances
---

[arrow-effects-kotlinx-coroutines-instances](../../index.html) / [arrow.effects](../index.html) / [DeferredKMonadDeferInstance](./index.html)

# DeferredKMonadDeferInstance

`@extension interface DeferredKMonadDeferInstance : MonadDefer<ForDeferredK>, `[`DeferredKBracketInstance`](../-deferred-k-bracket-instance/index.html)

### Functions

| [defer](defer.html) | `open fun <A> defer(fa: () -> DeferredKOf<`[`A`](defer.html#A)`>): DeferredK<`[`A`](defer.html#A)`>` |

### Extension Functions

| [catch](../../arrow.effects.deferredk.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForDeferredK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.deferredk.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): DeferredK<`[`A`](../../arrow.effects.deferredk.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [DeferredKAsyncInstance](../-deferred-k-async-instance/index.html) | `interface DeferredKAsyncInstance : Async<ForDeferredK>, `[`DeferredKMonadDeferInstance`](./index.html) |

