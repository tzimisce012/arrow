---
title: SingleKMonadDeferInstance - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects](../index.html) / [SingleKMonadDeferInstance](./index.html)

# SingleKMonadDeferInstance

`@extension interface SingleKMonadDeferInstance : MonadDefer<ForSingleK>, `[`SingleKBracketInstance`](../-single-k-bracket-instance/index.html)

### Functions

| [defer](defer.html) | `open fun <A> defer(fa: () -> SingleKOf<`[`A`](defer.html#A)`>): SingleK<`[`A`](defer.html#A)`>` |

### Extension Functions

| [catch](../../arrow.effects.singlek.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForSingleK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.singlek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): SingleK<`[`A`](../../arrow.effects.singlek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [SingleKAsyncInstance](../-single-k-async-instance/index.html) | `interface SingleKAsyncInstance : Async<ForSingleK>, `[`SingleKMonadDeferInstance`](./index.html) |

