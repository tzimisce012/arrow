---
title: Eval.Defer - arrow-core
---

[arrow-core](../../../index.html) / [arrow.core](../../index.html) / [Eval](../index.html) / [Defer](./index.html)

# Defer

`data class Defer<out A> : `[`Eval`](../index.html)`<`[`A`](index.html#A)`>`

Defer is a type of Eval that is used to defer computations which produce Eval.

Users should not instantiate Defer instances themselves. Instead, they will be automatically created when needed.

### Constructors

| [&lt;init&gt;](-init-.html) | `Defer(thunk: () -> `[`Eval`](../index.html)`<`[`A`](index.html#A)`>)`<br>Defer is a type of Eval that is used to defer computations which produce Eval. |

### Properties

| [thunk](thunk.html) | `val thunk: () -> `[`Eval`](../index.html)`<`[`A`](index.html#A)`>` |

### Functions

| [memoize](memoize.html) | `fun memoize(): `[`Eval`](../index.html)`<`[`A`](index.html#A)`>` |
| [value](value.html) | `fun value(): `[`A`](index.html#A) |

### Inherited Functions

| [ap](../ap.html) | `fun <B> ap(ff: `[`EvalOf`](../../-eval-of.html)`<(`[`A`](../index.html#A)`) -> `[`B`](../ap.html#B)`>): `[`Eval`](../index.html)`<`[`B`](../ap.html#B)`>` |
| [coflatMap](../coflat-map.html) | `fun <B> coflatMap(f: (`[`EvalOf`](../../-eval-of.html)`<`[`A`](../index.html#A)`>) -> `[`B`](../coflat-map.html#B)`): `[`Eval`](../index.html)`<`[`B`](../coflat-map.html#B)`>` |
| [extract](../extract.html) | `fun extract(): `[`A`](../index.html#A) |
| [flatMap](../flat-map.html) | `fun <B> flatMap(f: (`[`A`](../index.html#A)`) -> `[`EvalOf`](../../-eval-of.html)`<`[`B`](../flat-map.html#B)`>): `[`Eval`](../index.html)`<`[`B`](../flat-map.html#B)`>` |
| [map](../map.html) | `fun <B> map(f: (`[`A`](../index.html#A)`) -> `[`B`](../map.html#B)`): `[`Eval`](../index.html)`<`[`B`](../map.html#B)`>` |

