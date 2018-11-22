---
title: PLens.liftF - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics](../index.html) / [PLens](index.html) / [liftF](./lift-f.html)

# liftF

`open fun <F> liftF(FF: Functor<`[`F`](lift-f.html#F)`>, f: (`[`A`](index.html#A)`) -> Kind<`[`F`](lift-f.html#F)`, `[`B`](index.html#B)`>): (`[`S`](index.html#S)`) -> Kind<`[`F`](lift-f.html#F)`, `[`T`](index.html#T)`>`

Lift a function [f](lift-f.html#arrow.optics.PLens$liftF(arrow.typeclasses.Functor((arrow.optics.PLens.liftF.F)), kotlin.Function1((arrow.optics.PLens.A, arrow.Kind((arrow.optics.PLens.liftF.F, arrow.optics.PLens.B)))))/f): `(A) -> Kind<F, B> to the context of `S`: `(S) -&gt; Kind&lt;F, T&gt;`

