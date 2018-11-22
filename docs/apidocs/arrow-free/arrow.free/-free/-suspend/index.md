---
title: Free.Suspend - arrow-free
---

[arrow-free](../../../index.html) / [arrow.free](../../index.html) / [Free](../index.html) / [Suspend](./index.html)

# Suspend

`data class Suspend<S, out A> : `[`Free`](../index.html)`<`[`S`](index.html#S)`, `[`A`](index.html#A)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `Suspend(a: Kind<`[`S`](index.html#S)`, `[`A`](index.html#A)`>)` |

### Properties

| [a](a.html) | `val a: Kind<`[`S`](index.html#S)`, `[`A`](index.html#A)`>` |

### Functions

| [transform](transform.html) | `fun <O, B> transform(f: (`[`A`](index.html#A)`) -> `[`B`](transform.html#B)`, fs: FunctionK<`[`S`](index.html#S)`, `[`O`](transform.html#O)`>): `[`Free`](../index.html)`<`[`O`](transform.html#O)`, `[`B`](transform.html#B)`>` |

