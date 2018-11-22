---
title: PIso.liftF - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics](../index.html) / [PIso](index.html) / [liftF](./lift-f.html)

# liftF

`open fun <F> liftF(FF: Functor<`[`F`](lift-f.html#F)`>, f: (`[`A`](index.html#A)`) -> Kind<`[`F`](lift-f.html#F)`, `[`B`](index.html#B)`>): (`[`S`](index.html#S)`) -> Kind<`[`F`](lift-f.html#F)`, `[`T`](index.html#T)`>`
`open fun <F> liftF(FF: Functor<`[`F`](lift-f.html#F)`>, dummy: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit, f: (`[`A`](index.html#A)`) -> Kind<`[`F`](lift-f.html#F)`, `[`B`](index.html#B)`>): (`[`S`](index.html#S)`) -> Kind<`[`F`](lift-f.html#F)`, `[`T`](index.html#T)`>`

Lift a function [f](lift-f.html#arrow.optics.PIso$liftF(arrow.typeclasses.Functor((arrow.optics.PIso.liftF.F)), kotlin.Function1((arrow.optics.PIso.A, arrow.Kind((arrow.optics.PIso.liftF.F, arrow.optics.PIso.B)))))/f) with a functor: `(A) -> Kind<F, B> to the context of `S`: `(S) -&gt; Kind&lt;F, T&gt;`

