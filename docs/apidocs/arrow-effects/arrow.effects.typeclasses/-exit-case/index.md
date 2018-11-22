---
title: ExitCase - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects.typeclasses](../index.html) / [ExitCase](./index.html)

# ExitCase

`sealed class ExitCase<out E>`

### Types

| [Cancelled](-cancelled.html) | `object Cancelled : `[`ExitCase`](./index.html)`<`[`Nothing`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)`>` |
| [Completed](-completed.html) | `object Completed : `[`ExitCase`](./index.html)`<`[`Nothing`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)`>` |
| [Error](-error/index.html) | `data class Error<out E> : `[`ExitCase`](./index.html)`<`[`E`](-error/index.html#E)`>` |

### Inheritors

| [Cancelled](-cancelled.html) | `object Cancelled : `[`ExitCase`](./index.html)`<`[`Nothing`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)`>` |
| [Completed](-completed.html) | `object Completed : `[`ExitCase`](./index.html)`<`[`Nothing`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)`>` |
| [Error](-error/index.html) | `data class Error<out E> : `[`ExitCase`](./index.html)`<`[`E`](-error/index.html#E)`>` |

