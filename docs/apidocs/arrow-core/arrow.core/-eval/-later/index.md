---
title: Eval.Later - arrow-core
---

[arrow-core](../../../index.html) / [arrow.core](../../index.html) / [Eval](../index.html) / [Later](./index.html)

# Later

`data class Later<out A> : `[`Eval`](../index.html)`<`[`A`](index.html#A)`>`

Construct a lazy Eval instance.

This type should be used for most "lazy" values. In some sense it is equivalent to using a lazy val.

When caching is not required or desired (e.g. if the value produced may be large) prefer Always. When there
is no computation necessary, prefer Now.

Once Later has been evaluated, the closure (and any values captured by the closure) will not be retained, and
will be available for garbage collection.

### Constructors

| [&lt;init&gt;](-init-.html) | `Later(f: () -> `[`A`](index.html#A)`)`<br>Construct a lazy Eval instance. |

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

