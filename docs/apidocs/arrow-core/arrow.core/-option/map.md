---
title: Option.map - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [Option](index.html) / [map](./map.html)

# map

`inline fun <B> map(f: (`[`A`](index.html#A)`) -> `[`B`](map.html#B)`): `[`Option`](index.html)`<`[`B`](map.html#B)`>`

Returns a [Some$B](#) containing the result of applying $f to this $option's
value if this $option is nonempty. Otherwise return $none.

### Parameters

`f` - the function to apply

**Note**
This is similar to `flatMap` except here,
$f does not need to wrap its result in an $option.

**See Also**

[flatMap](flat-map.html)

