---
title: orElse - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [arrow.Kind](index.html) / [orElse](./or-else.html)

# orElse

`inline fun <A> `[`OptionOf`](../-option-of.html)`<`[`A`](or-else.html#A)`>.orElse(alternative: () -> `[`Option`](../-option/index.html)`<`[`A`](or-else.html#A)`>): `[`Option`](../-option/index.html)`<`[`A`](or-else.html#A)`>`

Returns this option's if the option is nonempty, otherwise
returns another option provided lazily by `default`.

### Parameters

`alternative` - the default option if this is empty.`inline fun <B, A : `[`B`](or-else.html#B)`> `[`TryOf`](../-try-of.html)`<`[`A`](or-else.html#A)`>.orElse(f: () -> `[`TryOf`](../-try-of.html)`<`[`B`](or-else.html#B)`>): `[`Try`](../-try/index.html)`<`[`B`](or-else.html#B)`>`