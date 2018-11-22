---
title: MaybeKMonadDeferInstance - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects](../index.html) / [MaybeKMonadDeferInstance](./index.html)

# MaybeKMonadDeferInstance

`@extension interface MaybeKMonadDeferInstance : MonadDefer<ForMaybeK>, `[`MaybeKBracketInstance`](../-maybe-k-bracket-instance/index.html)

### Functions

| [defer](defer.html) | `open fun <A> defer(fa: () -> MaybeKOf<`[`A`](defer.html#A)`>): MaybeK<`[`A`](defer.html#A)`>` |

### Extension Functions

| [catch](../../arrow.effects.maybek.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForMaybeK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.maybek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): MaybeK<`[`A`](../../arrow.effects.maybek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [MaybeKAsyncInstance](../-maybe-k-async-instance/index.html) | `interface MaybeKAsyncInstance : Async<ForMaybeK>, `[`MaybeKMonadDeferInstance`](./index.html) |

