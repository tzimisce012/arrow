---
title: arrow.optics.invoke - arrow-optics
---

[arrow-optics](../index.html) / [arrow.optics](index.html) / [invoke](./invoke.html)

# invoke

`operator fun <S, A> PPrism.Companion.invoke(getOption: (`[`S`](invoke.html#S)`) -> Option<`[`A`](invoke.html#A)`>, reverseGet: (`[`A`](invoke.html#A)`) -> `[`S`](invoke.html#S)`): `[`Prism`](-prism.html)`<`[`S`](invoke.html#S)`, `[`A`](invoke.html#A)`>`

Invoke operator overload to create a [PPrism](-p-prism/index.html) of type `S` with a focus `A` where `A` is a subtype of `S`
Can also be used to construct [Prism](-prism.html)

