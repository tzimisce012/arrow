---
title: Continuation - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [Continuation](./index.html)

# Continuation

`interface Continuation<in T> : `[`Continuation`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-continuation/index.html)`<`[`T`](index.html#T)`>`

### Functions

| [resume](resume.html) | `abstract fun resume(value: `[`T`](index.html#T)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [resumeWith](resume-with.html) | `open fun resumeWith(result: <ERROR CLASS><`[`T`](index.html#T)`>): <ERROR CLASS>` |
| [resumeWithException](resume-with-exception.html) | `abstract fun resumeWithException(exception: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

