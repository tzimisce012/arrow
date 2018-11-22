---
title: Either.Right - arrow-annotations-processor
---

[arrow-annotations-processor](../../../index.html) / [arrow.meta](../../index.html) / [Either](../index.html) / [Right](./index.html)

# Right

`data class Right<out B> : `[`Either`](../index.html)`<`[`Nothing`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)`, `[`B`](index.html#B)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `Right(b: `[`B`](index.html#B)`)` |

### Properties

| [b](b.html) | `val b: `[`B`](index.html#B) |

### Inherited Functions

| [fold](../fold.html) | `fun <C> fold(ifLeft: (`[`A`](../index.html#A)`) -> `[`C`](../fold.html#C)`, ifRight: (`[`B`](../index.html#B)`) -> `[`C`](../fold.html#C)`): `[`C`](../fold.html#C) |
| [map](../map.html) | `fun <C> map(f: (`[`B`](../index.html#B)`) -> `[`C`](../map.html#C)`): `[`Either`](../index.html)`<`[`A`](../index.html#A)`, `[`C`](../map.html#C)`>` |

