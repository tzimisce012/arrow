---
title: Ref.tryModify - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects](../index.html) / [Ref](index.html) / [tryModify](./try-modify.html)

# tryModify

`abstract fun <B> tryModify(f: (`[`A`](index.html#A)`) -> Tuple2<`[`A`](index.html#A)`, `[`B`](try-modify.html#B)`>): Kind<`[`F`](index.html#F)`, Option<`[`B`](try-modify.html#B)`>>`

Like [tryUpdate](try-update.html) but allows the update function to return an output value of type [B](try-modify.html#B).

**Returns**
[None](#) if the update fails and `Some(b)` otherwise.

