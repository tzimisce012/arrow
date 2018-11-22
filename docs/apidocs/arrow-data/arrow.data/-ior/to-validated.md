---
title: Ior.toValidated - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [Ior](index.html) / [toValidated](./to-validated.html)

# toValidated

`fun toValidated(): `[`Validated`](../-validated/index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`>`

Returns a [Validated.Valid](../-validated/-valid/index.html) containing the [Right](-right/index.html) value or `B` if this is [Right](-right/index.html) or [Both](-both/index.html)
and [Validated.Invalid](../-validated/-invalid/index.html) if this is a [Left](-left/index.html).

Example:

```
Right(12).toValidated() // Result: Valid(12)
Left(12).toValidated()  // Result: Invalid(12)
Both(12, "power").toValidated()  // Result: Valid("power")
```

