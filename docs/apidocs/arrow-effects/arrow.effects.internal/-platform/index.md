---
title: Platform - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects.internal](../index.html) / [Platform](./index.html)

# Platform

`object Platform`

### Types

| [ArrayStack](-array-stack/index.html) | `class ArrayStack<A> : `[`ArrayDeque`](http://docs.oracle.com/javase/6/docs/api/java/util/ArrayDeque.html)`<`[`A`](-array-stack/index.html#A)`>` |

### Properties

| [maxStackDepthSize](max-stack-depth-size.html) | `const val maxStackDepthSize: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Establishes the maximum stack depth for `IO#map` operations. |

### Functions

| [onceOnly](once-only.html) | `fun <A> onceOnly(f: (`[`A`](once-only.html#A)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): (`[`A`](once-only.html#A)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun onceOnly(f: () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [unsafeResync](unsafe-resync.html) | `fun <A> unsafeResync(ioa: `[`IO`](../../arrow.effects/-i-o/index.html)`<`[`A`](unsafe-resync.html#A)`>, limit: `[`Duration`](../../arrow.effects.typeclasses/-duration/index.html)`): Option<`[`A`](unsafe-resync.html#A)`>` |

