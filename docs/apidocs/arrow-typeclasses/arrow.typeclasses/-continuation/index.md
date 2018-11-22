---
title: Continuation - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Continuation](./index.html)

# Continuation

`interface Continuation<in T> : `[`Continuation`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-continuation/index.html)`<`[`T`](index.html#T)`>`

### Functions

| [resume](resume.html) | `abstract fun resume(value: `[`T`](index.html#T)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [resumeWith](resume-with.html) | `open fun resumeWith(result: <ERROR CLASS><`[`T`](index.html#T)`>): <ERROR CLASS>` |
| [resumeWithException](resume-with-exception.html) | `abstract fun resumeWithException(exception: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Extension Properties

| [stateStack](../kotlin.coroutines.-continuation/state-stack.html) | `var <T> `[`Continuation`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-continuation/index.html)`<`[`T`](../kotlin.coroutines.-continuation/state-stack.html#T)`>.stateStack: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, *>>` |

