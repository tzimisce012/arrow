---
title: TryMonadErrorInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [TryMonadErrorInstance](./index.html)

# TryMonadErrorInstance

`@extension interface TryMonadErrorInstance : MonadError<ForTry, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`TryMonadInstance`](../-try-monad-instance/index.html)

### Functions

| [handleErrorWith](handle-error-with.html) | `open fun <A> Kind<ForTry, `[`A`](handle-error-with.html#A)`>.handleErrorWith(f: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> Kind<ForTry, `[`A`](handle-error-with.html#A)`>): Try<`[`A`](handle-error-with.html#A)`>` |
| [raiseError](raise-error.html) | `open fun <A> raiseError(e: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): Try<`[`A`](raise-error.html#A)`>` |

### Extension Functions

| [catch](../../arrow.instances.try.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForTry, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.instances.try.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): Try<`[`A`](../../arrow.instances.try.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [TryContext](../-try-context/index.html) | `object TryContext : `[`TryMonadErrorInstance`](./index.html)`, `[`TryTraverseInstance`](../-try-traverse-instance/index.html) |
| [TryMonadThrowInstance](../-try-monad-throw-instance.html) | `interface TryMonadThrowInstance : MonadThrow<ForTry>, `[`TryMonadErrorInstance`](./index.html) |

