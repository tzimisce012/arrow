---
title: Ior.toOption - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [Ior](index.html) / [toOption](./to-option.html)

# toOption

`fun toOption(): Option<`[`B`](index.html#B)`>`

Returns a [Some](#) containing the [Right](-right/index.html) value or `B` if this is [Right](-right/index.html) or [Both](-both/index.html)
and [None](#) if this is a [Left](-left/index.html).

Example:

```
Right(12).toOption() // Result: Some(12)
Left(12).toOption()  // Result: None
Both(12, "power").toOption()  // Result: Some("power")
```

