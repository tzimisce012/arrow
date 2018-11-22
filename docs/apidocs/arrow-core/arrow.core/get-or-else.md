---
title: getOrElse - arrow-core
---

[arrow-core](../index.html) / [arrow.core](index.html) / [getOrElse](./get-or-else.html)

# getOrElse

`fun <T> `[`Option`](-option/index.html)`<`[`T`](get-or-else.html#T)`>.getOrElse(default: () -> `[`T`](get-or-else.html#T)`): `[`T`](get-or-else.html#T)

Returns the option's value if the option is nonempty, otherwise
return the result of evaluating `default`.

### Parameters

`default` - the default expression.