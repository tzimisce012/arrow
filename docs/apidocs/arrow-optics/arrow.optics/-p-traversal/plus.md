---
title: PTraversal.plus - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics](../index.html) / [PTraversal](index.html) / [plus](./plus.html)

# plus

`open operator fun <C, D> plus(other: `[`PTraversal`](index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>): `[`PTraversal`](index.html)`<`[`S`](index.html#S)`, `[`T`](index.html#T)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>`

Plus operator overload to compose [PTraversal](index.html) with other optics

`open operator fun <C, D> plus(other: `[`PSetter`](../-p-setter/index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>): `[`PSetter`](../-p-setter/index.html)`<`[`S`](index.html#S)`, `[`T`](index.html#T)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>`
`open operator fun <C, D> plus(other: `[`POptional`](../-p-optional/index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>): `[`PTraversal`](index.html)`<`[`S`](index.html#S)`, `[`T`](index.html#T)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>`
`open operator fun <C, D> plus(other: `[`PLens`](../-p-lens/index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>): `[`PTraversal`](index.html)`<`[`S`](index.html#S)`, `[`T`](index.html#T)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>`
`open operator fun <C, D> plus(other: `[`PPrism`](../-p-prism/index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>): `[`PTraversal`](index.html)`<`[`S`](index.html#S)`, `[`T`](index.html#T)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>`
`open operator fun <C, D> plus(other: `[`PIso`](../-p-iso/index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>): `[`PTraversal`](index.html)`<`[`S`](index.html#S)`, `[`T`](index.html#T)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>`
`open operator fun <C> plus(other: `[`Fold`](../-fold/index.html)`<`[`A`](index.html#A)`, `[`C`](plus.html#C)`>): `[`Fold`](../-fold/index.html)`<`[`S`](index.html#S)`, `[`C`](plus.html#C)`>`