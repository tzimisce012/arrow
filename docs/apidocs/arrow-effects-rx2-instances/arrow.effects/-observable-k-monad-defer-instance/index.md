---
title: ObservableKMonadDeferInstance - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects](../index.html) / [ObservableKMonadDeferInstance](./index.html)

# ObservableKMonadDeferInstance

`@extension interface ObservableKMonadDeferInstance : MonadDefer<ForObservableK>, `[`ObservableKBracketInstance`](../-observable-k-bracket-instance/index.html)

### Functions

| [defer](defer.html) | `open fun <A> defer(fa: () -> ObservableKOf<`[`A`](defer.html#A)`>): ObservableK<`[`A`](defer.html#A)`>` |

### Extension Functions

| [catch](../../arrow.effects.observablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForObservableK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.observablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): ObservableK<`[`A`](../../arrow.effects.observablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [ObservableKAsyncInstance](../-observable-k-async-instance/index.html) | `interface ObservableKAsyncInstance : Async<ForObservableK>, `[`ObservableKMonadDeferInstance`](./index.html) |

