---
title: ForwardCancelable - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects.internal](../index.html) / [ForwardCancelable](./index.html)

# ForwardCancelable

`class ForwardCancelable`

A placeholder for a [CancelToken](#) that will be set at a later time, the equivalent of a
`Deferred[IO, CancelToken]`. Used in the implementation of `bracket`, see [IOBracket](#).

### Constructors

| [&lt;init&gt;](-init-.html) | `ForwardCancelable()`<br>A placeholder for a [CancelToken](#) that will be set at a later time, the equivalent of a `Deferred[IO, CancelToken]`. Used in the implementation of `bracket`, see [IOBracket](#). |

### Functions

| [cancel](cancel.html) | `fun cancel(): CancelToken<`[`ForIO`](../../arrow.effects/-for-i-o.html)`>` |
| [complete](complete.html) | `fun complete(value: CancelToken<`[`ForIO`](../../arrow.effects/-for-i-o.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

