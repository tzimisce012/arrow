---
title: Option.flatMap - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [Option](index.html) / [flatMap](./flat-map.html)

# flatMap

`inline fun <B> flatMap(f: (`[`A`](index.html#A)`) -> `[`OptionOf`](../-option-of.html)`<`[`B`](flat-map.html#B)`>): `[`Option`](index.html)`<`[`B`](flat-map.html#B)`>`

Returns the result of applying $f to this $option's value if
this $option is nonempty.
Returns $none if this $option is empty.
Slightly different from `map` in that $f is expected to
return an $option (which could be $none).

### Parameters

`f` - the function to apply

**See Also**

[map](map.html)

