---
title: IdHashInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [IdHashInstance](./index.html)

# IdHashInstance

`@extension interface IdHashInstance<A> : Hash<Id<`[`A`](index.html#A)`>>, `[`IdEqInstance`](../-id-eq-instance/index.html)`<`[`A`](index.html#A)`>`

### Functions

| [EQ](-e-q.html) | `open fun EQ(): Eq<`[`A`](index.html#A)`>` |
| [HA](-h-a.html) | `abstract fun HA(): Hash<`[`A`](index.html#A)`>` |
| [hash](hash.html) | `open fun Id<`[`A`](index.html#A)`>.hash(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

