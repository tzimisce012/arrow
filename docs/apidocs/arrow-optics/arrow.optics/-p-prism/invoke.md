---
title: PPrism.invoke - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics](../index.html) / [PPrism](index.html) / [invoke](./invoke.html)

# invoke

`operator fun <S, T, A, B> invoke(getOrModify: (`[`S`](invoke.html#S)`) -> Either<`[`T`](invoke.html#T)`, `[`A`](invoke.html#A)`>, reverseGet: (`[`B`](invoke.html#B)`) -> `[`T`](invoke.html#T)`): `[`PPrism`](index.html)`<`[`S`](invoke.html#S)`, `[`T`](invoke.html#T)`, `[`A`](invoke.html#A)`, `[`B`](invoke.html#B)`>`

Invoke operator overload to create a [PPrism](index.html) of type `S` with focus `A`.
Can also be used to construct [Prism](../-prism.html)

`operator fun <S, A> invoke(partialFunction: PartialFunction<`[`S`](invoke.html#S)`, `[`A`](invoke.html#A)`>, reverseGet: (`[`A`](invoke.html#A)`) -> `[`S`](invoke.html#S)`): `[`Prism`](../-prism.html)`<`[`S`](invoke.html#S)`, `[`A`](invoke.html#A)`>`

Invoke operator overload to create a [PPrism](index.html) of type `S` with focus `A` with a [PartialFunction](#)
Can also be used to construct [Prism](../-prism.html)

