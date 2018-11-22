---
title: POptional.liftF - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics](../index.html) / [POptional](index.html) / [liftF](./lift-f.html)

# liftF

`open fun <F> liftF(FA: Applicative<`[`F`](lift-f.html#F)`>, f: (`[`A`](index.html#A)`) -> Kind<`[`F`](lift-f.html#F)`, `[`B`](index.html#B)`>): (`[`S`](index.html#S)`) -> Kind<`[`F`](lift-f.html#F)`, `[`T`](index.html#T)`>`

Lift a function [f](lift-f.html#arrow.optics.POptional$liftF(arrow.typeclasses.Applicative((arrow.optics.POptional.liftF.F)), kotlin.Function1((arrow.optics.POptional.A, arrow.Kind((arrow.optics.POptional.liftF.F, arrow.optics.POptional.B)))))/f): `(A) -> Kind<F, B> to the context of `S`: `(S) -&gt; Kind&lt;F, T&gt;`

