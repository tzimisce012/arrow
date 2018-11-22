---
title: Free.FlatMapped - arrow-free
---

[arrow-free](../../../index.html) / [arrow.free](../../index.html) / [Free](../index.html) / [FlatMapped](./index.html)

# FlatMapped

`data class FlatMapped<S, out A, C> : `[`Free`](../index.html)`<`[`S`](index.html#S)`, `[`A`](index.html#A)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `FlatMapped(c: `[`Free`](../index.html)`<`[`S`](index.html#S)`, `[`C`](index.html#C)`>, fm: (`[`C`](index.html#C)`) -> `[`Free`](../index.html)`<`[`S`](index.html#S)`, `[`A`](index.html#A)`>)` |

### Properties

| [c](c.html) | `val c: `[`Free`](../index.html)`<`[`S`](index.html#S)`, `[`C`](index.html#C)`>` |
| [fm](fm.html) | `val fm: (`[`C`](index.html#C)`) -> `[`Free`](../index.html)`<`[`S`](index.html#S)`, `[`A`](index.html#A)`>` |

### Functions

| [transform](transform.html) | `fun <O, B> transform(f: (`[`A`](index.html#A)`) -> `[`B`](transform.html#B)`, fs: FunctionK<`[`S`](index.html#S)`, `[`O`](transform.html#O)`>): `[`Free`](../index.html)`<`[`O`](transform.html#O)`, `[`B`](transform.html#B)`>` |

