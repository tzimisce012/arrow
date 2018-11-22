---
title: TryHashInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [TryHashInstance](./index.html)

# TryHashInstance

`@extension interface TryHashInstance<A> : Hash<Try<`[`A`](index.html#A)`>>, `[`TryEqInstance`](../-try-eq-instance/index.html)`<`[`A`](index.html#A)`>`

### Functions

| [EQA](-e-q-a.html) | `open fun EQA(): Eq<`[`A`](index.html#A)`>` |
| [EQT](-e-q-t.html) | `open fun EQT(): Eq<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>` |
| [HA](-h-a.html) | `abstract fun HA(): Hash<`[`A`](index.html#A)`>` |
| [HT](-h-t.html) | `abstract fun HT(): Hash<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>` |
| [hash](hash.html) | `open fun Try<`[`A`](index.html#A)`>.hash(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

