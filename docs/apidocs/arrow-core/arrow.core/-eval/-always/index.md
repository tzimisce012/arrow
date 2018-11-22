---
title: Eval.Always - arrow-core
---

[arrow-core](../../../index.html) / [arrow.core](../../index.html) / [Eval](../index.html) / [Always](./index.html)

# Always

`data class Always<out A> : `[`Eval`](../index.html)`<`[`A`](index.html#A)`>`

Construct a lazy Eval instance.

This type can be used for "lazy" values. In some sense it is equivalent to using a Function0 value.

This type will evaluate the computation every time the value is required. It should be avoided except when
laziness is required and caching must be avoided. Generally, prefer Later.

### Constructors

| [&lt;init&gt;](-init-.html) | `Always(f: () -> `[`A`](index.html#A)`)`<br>Construct a lazy Eval instance. |

### Functions

| [memoize](memoize.html) | `fun memoize(): `[`Eval`](../index.html)`<`[`A`](index.html#A)`>` |
| [value](value.html) | `fun value(): `[`A`](index.html#A) |

### Inherited Functions

| [ap](../ap.html) | `fun <B> ap(ff: `[`EvalOf`](../../-eval-of.html)`<(`[`A`](../index.html#A)`) -> `[`B`](../ap.html#B)`>): `[`Eval`](../index.html)`<`[`B`](../ap.html#B)`>` |
| [coflatMap](../coflat-map.html) | `fun <B> coflatMap(f: (`[`EvalOf`](../../-eval-of.html)`<`[`A`](../index.html#A)`>) -> `[`B`](../coflat-map.html#B)`): `[`Eval`](../index.html)`<`[`B`](../coflat-map.html#B)`>` |
| [extract](../extract.html) | `fun extract(): `[`A`](../index.html#A) |
| [flatMap](../flat-map.html) | `fun <B> flatMap(f: (`[`A`](../index.html#A)`) -> `[`EvalOf`](../../-eval-of.html)`<`[`B`](../flat-map.html#B)`>): `[`Eval`](../index.html)`<`[`B`](../flat-map.html#B)`>` |
| [map](../map.html) | `fun <B> map(f: (`[`A`](../index.html#A)`) -> `[`B`](../map.html#B)`): `[`Eval`](../index.html)`<`[`B`](../map.html#B)`>` |

