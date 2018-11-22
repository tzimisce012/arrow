---
title: IOMonadDeferInstance - arrow-effects-instances
---

[arrow-effects-instances](../../index.html) / [arrow.effects.instances](../index.html) / [IOMonadDeferInstance](./index.html)

# IOMonadDeferInstance

`@extension interface IOMonadDeferInstance : MonadDefer<ForIO>, `[`IOBracketInstance`](../-i-o-bracket-instance/index.html)

### Functions

| [defer](defer.html) | `open fun <A> defer(fa: () -> IOOf<`[`A`](defer.html#A)`>): IO<`[`A`](defer.html#A)`>` |
| [lazy](lazy.html) | `open fun lazy(): IO<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |

### Extension Functions

| [catch](../../arrow.effects.instances.io.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForIO, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.instances.io.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): IO<`[`A`](../../arrow.effects.instances.io.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [IOAsyncInstance](../-i-o-async-instance/index.html) | `interface IOAsyncInstance : Async<ForIO>, `[`IOMonadDeferInstance`](./index.html) |

