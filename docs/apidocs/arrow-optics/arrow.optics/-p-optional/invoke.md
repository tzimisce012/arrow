---
title: POptional.invoke - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics](../index.html) / [POptional](index.html) / [invoke](./invoke.html)

# invoke

`operator fun <S, T, A, B> invoke(getOrModify: (`[`S`](invoke.html#S)`) -> Either<`[`T`](invoke.html#T)`, `[`A`](invoke.html#A)`>, set: (`[`S`](invoke.html#S)`, `[`B`](invoke.html#B)`) -> `[`T`](invoke.html#T)`): `[`POptional`](index.html)`<`[`S`](invoke.html#S)`, `[`T`](invoke.html#T)`, `[`A`](invoke.html#A)`, `[`B`](invoke.html#B)`>`
`operator fun <S, A> invoke(partialFunction: PartialFunction<`[`S`](invoke.html#S)`, `[`A`](invoke.html#A)`>, set: (`[`S`](invoke.html#S)`, `[`A`](invoke.html#A)`) -> `[`S`](invoke.html#S)`): `[`Optional`](../-optional.html)`<`[`S`](invoke.html#S)`, `[`A`](invoke.html#A)`>`

Invoke operator overload to create a [POptional](index.html) of type `S` with focus `A`.
Can also be used to construct [Optional](../-optional.html)

