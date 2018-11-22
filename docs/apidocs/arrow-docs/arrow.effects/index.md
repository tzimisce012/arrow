---
title: arrow.effects - arrow-docs
---

[arrow-docs](../index.html) / [arrow.effects](./index.html)

## Package arrow.effects

### Extensions for External Classes

| [arrow.Kind](arrow.-kind/index.html) |  |

### Properties

| [UI](-u-i.html) | `val UI: CoroutineDispatcher` |
| [first](first.html) | `val first: DeferredK<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>` |
| [second](second.html) | `val second: DeferredK<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>` |

### Functions

| [parMap](par-map.html) | `fun <A, B, C> parMap(first: DeferredK<`[`A`](par-map.html#A)`>, second: DeferredK<`[`B`](par-map.html#B)`>, f: (`[`A`](par-map.html#A)`, `[`B`](par-map.html#B)`) -> `[`C`](par-map.html#C)`): DeferredK<`[`C`](par-map.html#C)`>` |

### Companion Object Functions

| [sleep](sleep.html) | `fun DeferredK.Companion.sleep(milis: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, scope: CoroutineScope = GlobalScope): DeferredK<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |

