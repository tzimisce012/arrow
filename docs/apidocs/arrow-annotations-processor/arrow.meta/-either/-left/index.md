---
title: Either.Left - arrow-annotations-processor
---

[arrow-annotations-processor](../../../index.html) / [arrow.meta](../../index.html) / [Either](../index.html) / [Left](./index.html)

# Left

`data class Left<out A> : `[`Either`](../index.html)`<`[`A`](index.html#A)`, `[`Nothing`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `Left(a: `[`A`](index.html#A)`)` |

### Properties

| [a](a.html) | `val a: `[`A`](index.html#A) |

### Inherited Functions

| [fold](../fold.html) | `fun <C> fold(ifLeft: (`[`A`](../index.html#A)`) -> `[`C`](../fold.html#C)`, ifRight: (`[`B`](../index.html#B)`) -> `[`C`](../fold.html#C)`): `[`C`](../fold.html#C) |
| [map](../map.html) | `fun <C> map(f: (`[`B`](../index.html#B)`) -> `[`C`](../map.html#C)`): `[`Either`](../index.html)`<`[`A`](../index.html#A)`, `[`C`](../map.html#C)`>` |

