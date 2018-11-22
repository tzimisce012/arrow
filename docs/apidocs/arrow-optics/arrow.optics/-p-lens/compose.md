---
title: PLens.compose - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics](../index.html) / [PLens](index.html) / [compose](./compose.html)

# compose

`open infix fun <C, D> compose(l: `[`PLens`](index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](compose.html#C)`, `[`D`](compose.html#D)`>): `[`PLens`](index.html)`<`[`S`](index.html#S)`, `[`T`](index.html#T)`, `[`C`](compose.html#C)`, `[`D`](compose.html#D)`>`

Compose a [PLens](index.html) with another [PLens](index.html)

`open infix fun <C, D> compose(other: `[`POptional`](../-p-optional/index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](compose.html#C)`, `[`D`](compose.html#D)`>): `[`POptional`](../-p-optional/index.html)`<`[`S`](index.html#S)`, `[`T`](index.html#T)`, `[`C`](compose.html#C)`, `[`D`](compose.html#D)`>`

Compose a [PLens](index.html) with a [POptional](../-p-optional/index.html)

`open infix fun <C, D> compose(other: `[`PIso`](../-p-iso/index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](compose.html#C)`, `[`D`](compose.html#D)`>): `[`PLens`](index.html)`<`[`S`](index.html#S)`, `[`T`](index.html#T)`, `[`C`](compose.html#C)`, `[`D`](compose.html#D)`>`

Compose an [PLens](index.html) with a [PIso](../-p-iso/index.html)

`open infix fun <C> compose(other: `[`Getter`](../-getter/index.html)`<`[`A`](index.html#A)`, `[`C`](compose.html#C)`>): `[`Getter`](../-getter/index.html)`<`[`S`](index.html#S)`, `[`C`](compose.html#C)`>`

Compose an [PLens](index.html) with a [Getter](../-getter/index.html)

`open infix fun <C, D> compose(other: `[`PSetter`](../-p-setter/index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](compose.html#C)`, `[`D`](compose.html#D)`>): `[`PSetter`](../-p-setter/index.html)`<`[`S`](index.html#S)`, `[`T`](index.html#T)`, `[`C`](compose.html#C)`, `[`D`](compose.html#D)`>`

Compose an [PLens](index.html) with a [PSetter](../-p-setter/index.html)

`open infix fun <C, D> compose(other: `[`PPrism`](../-p-prism/index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](compose.html#C)`, `[`D`](compose.html#D)`>): `[`POptional`](../-p-optional/index.html)`<`[`S`](index.html#S)`, `[`T`](index.html#T)`, `[`C`](compose.html#C)`, `[`D`](compose.html#D)`>`

Compose an [PLens](index.html) with a [PPrism](../-p-prism/index.html)

`open infix fun <C> compose(other: `[`Fold`](../-fold/index.html)`<`[`A`](index.html#A)`, `[`C`](compose.html#C)`>): `[`Fold`](../-fold/index.html)`<`[`S`](index.html#S)`, `[`C`](compose.html#C)`>`

Compose an [PLens](index.html) with a [Fold](../-fold/index.html)

`open infix fun <C, D> compose(other: `[`PTraversal`](../-p-traversal/index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](compose.html#C)`, `[`D`](compose.html#D)`>): `[`PTraversal`](../-p-traversal/index.html)`<`[`S`](index.html#S)`, `[`T`](index.html#T)`, `[`C`](compose.html#C)`, `[`D`](compose.html#D)`>`

Compose an [PLens](index.html) with a [PTraversal](../-p-traversal/index.html)

