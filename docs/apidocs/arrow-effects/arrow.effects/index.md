---
title: arrow.effects - arrow-effects
---

[arrow-effects](../index.html) / [arrow.effects](./index.html)

## Package arrow.effects

### Types

| [ForIO](-for-i-o.html) | `class ForIO` |
| [IO](-i-o/index.html) | `sealed class IO<out A> : `[`IOOf`](-i-o-of.html)`<`[`A`](-i-o/index.html#A)`>` |
| [OnCancel](-on-cancel/index.html) | `enum class OnCancel` |
| [PartiallyAppliedRef](-partially-applied-ref/index.html) | `interface PartiallyAppliedRef<F>`<br>Intermediate interface to partially apply [F](-partially-applied-ref/index.html#F) to [Ref](-ref/index.html). |
| [Promise](-promise/index.html) | `interface Promise<F, A>`<br>When made, a [Promise](-promise/index.html) is empty. Until it is fulfilled, which can only happen once. |
| [Ref](-ref/index.html) | `interface Ref<F, A>`<br>An asynchronous, concurrent mutable reference. |

### Type Aliases

| [IOOf](-i-o-of.html) | `typealias IOOf<A> = Kind<`[`ForIO`](-for-i-o.html)`, `[`A`](-i-o-of.html#A)`>` |
| [IOProc](-i-o-proc.html) | `typealias IOProc<A> = (`[`IOConnection`](../arrow.effects.internal/-i-o-connection/index.html)`, (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](-i-o-proc.html#A)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Extensions for External Classes

| [arrow.Kind](arrow.-kind/index.html) |  |
| [kotlin.Function1](kotlin.-function1/index.html) |  |

### Functions

| [liftIO](lift-i-o.html) | `fun <A> `[`A`](lift-i-o.html#A)`.liftIO(): `[`IO`](-i-o/index.html)`<`[`A`](lift-i-o.html#A)`>` |

