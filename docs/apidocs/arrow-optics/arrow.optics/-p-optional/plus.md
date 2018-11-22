---
title: POptional.plus - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics](../index.html) / [POptional](index.html) / [plus](./plus.html)

# plus

`open operator fun <C, D> plus(o: `[`POptional`](index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>): `[`POptional`](index.html)`<`[`S`](index.html#S)`, `[`T`](index.html#T)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>`

Plus operator overload to compose optionals

`open operator fun <C, D> plus(o: `[`PPrism`](../-p-prism/index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>): `[`POptional`](index.html)`<`[`S`](index.html#S)`, `[`T`](index.html#T)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>`
`open operator fun <C, D> plus(o: `[`PLens`](../-p-lens/index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>): `[`POptional`](index.html)`<`[`S`](index.html#S)`, `[`T`](index.html#T)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>`
`open operator fun <C, D> plus(o: `[`PIso`](../-p-iso/index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>): `[`POptional`](index.html)`<`[`S`](index.html#S)`, `[`T`](index.html#T)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>`
`open operator fun <C, D> plus(o: `[`PSetter`](../-p-setter/index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>): `[`PSetter`](../-p-setter/index.html)`<`[`S`](index.html#S)`, `[`T`](index.html#T)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>`
`open operator fun <C> plus(o: `[`Fold`](../-fold/index.html)`<`[`A`](index.html#A)`, `[`C`](plus.html#C)`>): `[`Fold`](../-fold/index.html)`<`[`S`](index.html#S)`, `[`C`](plus.html#C)`>`
`open operator fun <C> plus(o: `[`Getter`](../-getter/index.html)`<`[`A`](index.html#A)`, `[`C`](plus.html#C)`>): `[`Fold`](../-fold/index.html)`<`[`S`](index.html#S)`, `[`C`](plus.html#C)`>`
`open operator fun <C, D> plus(o: `[`PTraversal`](../-p-traversal/index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>): `[`PTraversal`](../-p-traversal/index.html)`<`[`S`](index.html#S)`, `[`T`](index.html#T)`, `[`C`](plus.html#C)`, `[`D`](plus.html#D)`>`