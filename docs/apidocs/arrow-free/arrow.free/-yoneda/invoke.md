---
title: Yoneda.invoke - arrow-free
---

[arrow-free](../../index.html) / [arrow.free](../index.html) / [Yoneda](index.html) / [invoke](./invoke.html)

# invoke

`abstract operator fun <B> invoke(f: (`[`A`](index.html#A)`) -> `[`B`](invoke.html#B)`): Kind<`[`F`](index.html#F)`, `[`B`](invoke.html#B)`>`
`operator fun <U, A> invoke(fa: Kind<`[`U`](invoke.html#U)`, `[`A`](invoke.html#A)`>, FF: Functor<`[`U`](invoke.html#U)`>): `[`Yoneda`](index.html)`<`[`U`](invoke.html#U)`, `[`A`](invoke.html#A)`>`