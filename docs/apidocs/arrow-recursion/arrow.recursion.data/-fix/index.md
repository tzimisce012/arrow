---
title: Fix - arrow-recursion
---

[arrow-recursion](../../index.html) / [arrow.recursion.data](../index.html) / [Fix](./index.html)

# Fix

`@higherkind data class Fix<out A> : `[`FixOf`](../-fix-of.html)`<`[`A`](index.html#A)`>`

Type level combinator for obtaining the fixed point of a type.
This type is the type level encoding of primitive recursion.

### Constructors

| [&lt;init&gt;](-init-.html) | `Fix(unfix: Kind<`[`A`](index.html#A)`, Eval<`[`FixOf`](../-fix-of.html)`<`[`A`](index.html#A)`>>>)`<br>Type level combinator for obtaining the fixed point of a type. This type is the type level encoding of primitive recursion. |

### Properties

| [unfix](unfix.html) | `val unfix: Kind<`[`A`](index.html#A)`, Eval<`[`FixOf`](../-fix-of.html)`<`[`A`](index.html#A)`>>>` |

