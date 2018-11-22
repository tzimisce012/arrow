---
title: Eval.Now - arrow-core
---

[arrow-core](../../../index.html) / [arrow.core](../../index.html) / [Eval](../index.html) / [Now](./index.html)

# Now

`data class Now<out A> : `[`Eval`](../index.html)`<`[`A`](index.html#A)`>`

Construct an eager Eval instance. In some sense it is equivalent to using a val.

This type should be used when an A value is already in hand, or when the computation to produce an A value is
pure and very fast.

### Constructors

| [&lt;init&gt;](-init-.html) | `Now(value: `[`A`](index.html#A)`)`<br>Construct an eager Eval instance. In some sense it is equivalent to using a val. |

### Properties

| [value](value.html) | `val value: `[`A`](index.html#A) |

### Functions

| [memoize](memoize.html) | `fun memoize(): `[`Eval`](../index.html)`<`[`A`](index.html#A)`>` |
| [value](value.html) | `fun value(): `[`A`](index.html#A) |

### Inherited Functions

| [ap](../ap.html) | `fun <B> ap(ff: `[`EvalOf`](../../-eval-of.html)`<(`[`A`](../index.html#A)`) -> `[`B`](../ap.html#B)`>): `[`Eval`](../index.html)`<`[`B`](../ap.html#B)`>` |
| [coflatMap](../coflat-map.html) | `fun <B> coflatMap(f: (`[`EvalOf`](../../-eval-of.html)`<`[`A`](../index.html#A)`>) -> `[`B`](../coflat-map.html#B)`): `[`Eval`](../index.html)`<`[`B`](../coflat-map.html#B)`>` |
| [extract](../extract.html) | `fun extract(): `[`A`](../index.html#A) |
| [flatMap](../flat-map.html) | `fun <B> flatMap(f: (`[`A`](../index.html#A)`) -> `[`EvalOf`](../../-eval-of.html)`<`[`B`](../flat-map.html#B)`>): `[`Eval`](../index.html)`<`[`B`](../flat-map.html#B)`>` |
| [map](../map.html) | `fun <B> map(f: (`[`A`](../index.html#A)`) -> `[`B`](../map.html#B)`): `[`Eval`](../index.html)`<`[`B`](../map.html#B)`>` |

