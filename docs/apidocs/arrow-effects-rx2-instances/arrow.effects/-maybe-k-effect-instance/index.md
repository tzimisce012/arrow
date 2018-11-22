---
title: MaybeKEffectInstance - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects](../index.html) / [MaybeKEffectInstance](./index.html)

# MaybeKEffectInstance

`@extension interface MaybeKEffectInstance : Effect<ForMaybeK>, `[`MaybeKAsyncInstance`](../-maybe-k-async-instance/index.html)

### Functions

| [runAsync](run-async.html) | `open fun <A> MaybeKOf<`[`A`](run-async.html#A)`>.runAsync(cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](run-async.html#A)`>) -> MaybeKOf<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): MaybeK<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |

### Extension Functions

| [catch](../../arrow.effects.maybek.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForMaybeK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.maybek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): MaybeK<`[`A`](../../arrow.effects.maybek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [MaybeKContext](../-maybe-k-context.html) | `object MaybeKContext : `[`MaybeKEffectInstance`](./index.html) |

