---
title: PIso.plus - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics](../index.html) / [PIso](index.html) / [plus](./plus.html)

# plus

`open operator fun <C, D> plus(other: `[`PIso`](index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>): `[`PIso`](index.html)`<`[`S`](index.html#S)`, `[`T`](index.html#T)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>`

Plus operator overload to compose lenses

`open operator fun <C, D> plus(other: `[`PLens`](../-p-lens/index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>): `[`PLens`](../-p-lens/index.html)`<`[`S`](index.html#S)`, `[`T`](index.html#T)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>`
`open operator fun <C, D> plus(other: `[`PPrism`](../-p-prism/index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>): `[`PPrism`](../-p-prism/index.html)`<`[`S`](index.html#S)`, `[`T`](index.html#T)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>`
`open operator fun <C> plus(other: `[`Getter`](../-getter/index.html)`<`[`A`](index.html#A)`, `[`C`](plus.html#C)`>): `[`Getter`](../-getter/index.html)`<`[`S`](index.html#S)`, `[`C`](plus.html#C)`>`
`open operator fun <C, D> plus(other: `[`PSetter`](../-p-setter/index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>): `[`PSetter`](../-p-setter/index.html)`<`[`S`](index.html#S)`, `[`T`](index.html#T)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>`
`open operator fun <C, D> plus(other: `[`POptional`](../-p-optional/index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>): `[`POptional`](../-p-optional/index.html)`<`[`S`](index.html#S)`, `[`T`](index.html#T)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>`
`open operator fun <C> plus(other: `[`Fold`](../-fold/index.html)`<`[`A`](index.html#A)`, `[`C`](plus.html#C)`>): `[`Fold`](../-fold/index.html)`<`[`S`](index.html#S)`, `[`C`](plus.html#C)`>`
`open operator fun <C, D> plus(other: `[`PTraversal`](../-p-traversal/index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>): `[`PTraversal`](../-p-traversal/index.html)`<`[`S`](index.html#S)`, `[`T`](index.html#T)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>`