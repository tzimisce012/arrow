---
title: DeferredKApplicativeErrorInstance - arrow-effects-kotlinx-coroutines-instances
---

[arrow-effects-kotlinx-coroutines-instances](../../index.html) / [arrow.effects](../index.html) / [DeferredKApplicativeErrorInstance](./index.html)

# DeferredKApplicativeErrorInstance

`@extension interface DeferredKApplicativeErrorInstance : ApplicativeError<ForDeferredK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`DeferredKApplicativeInstance`](../-deferred-k-applicative-instance/index.html)

### Functions

| [handleErrorWith](handle-error-with.html) | `open fun <A> DeferredKOf<`[`A`](handle-error-with.html#A)`>.handleErrorWith(f: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> DeferredKOf<`[`A`](handle-error-with.html#A)`>): DeferredK<`[`A`](handle-error-with.html#A)`>` |
| [raiseError](raise-error.html) | `open fun <A> raiseError(e: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): DeferredK<`[`A`](raise-error.html#A)`>` |

### Extension Functions

| [catch](../../arrow.effects.deferredk.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForDeferredK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.deferredk.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): DeferredK<`[`A`](../../arrow.effects.deferredk.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

