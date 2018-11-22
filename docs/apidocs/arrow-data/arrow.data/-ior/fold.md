---
title: Ior.fold - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [Ior](index.html) / [fold](./fold.html)

# fold

`inline fun <C> fold(fa: (`[`A`](index.html#A)`) -> `[`C`](fold.html#C)`, fb: (`[`B`](index.html#B)`) -> `[`C`](fold.html#C)`, fab: (`[`A`](index.html#A)`, `[`B`](index.html#B)`) -> `[`C`](fold.html#C)`): `[`C`](fold.html#C)

Applies `fa` if this is a [Left](-left/index.html), `fb` if this is a [Right](-right/index.html) or `fab` if this is a [Both](-both/index.html)

Example:

```
val result: Ior<EmailContactInfo, PostalContactInfo> = obtainContactInfo()
result.fold(
     { log("only have this email info: $it") },
     { log("only have this postal info: $it") },
     { email, postal -> log("have this postal info: $postal and this email info: $email") }
)
```

### Parameters

`fa` - the function to apply if this is a [Left](-left/index.html)

`fb` - the function to apply if this is a [Right](-right/index.html)

`fab` - the function to apply if this is a [Both](-both/index.html)

**Return**
the results of applying the function

