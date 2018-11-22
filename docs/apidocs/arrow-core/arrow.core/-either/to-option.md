---
title: Either.toOption - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [Either](index.html) / [toOption](./to-option.html)

# toOption

`fun toOption(): `[`Option`](../-option/index.html)`<`[`B`](index.html#B)`>`

Returns a [Some](../-some/index.html) containing the [Right](-right/index.html) value
if it exists or a [None](../-none/index.html) if this is a [Left](-left/index.html).

Example:

```
Right(12).toOption() // Result: Some(12)
Left(12).toOption()  // Result: None
```

