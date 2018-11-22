---
title: lift - arrow-optics
---

[arrow-optics](../index.html) / [arrow.optics](index.html) / [lift](./lift.html)

# lift

`inline fun <S, T, A, B> `[`PPrism`](-p-prism/index.html)`<`[`S`](lift.html#S)`, `[`T`](lift.html#T)`, `[`A`](lift.html#A)`, `[`B`](lift.html#B)`>.lift(crossinline f: (`[`A`](lift.html#A)`) -> `[`B`](lift.html#B)`): (`[`S`](lift.html#S)`) -> `[`T`](lift.html#T)

Lift a function [f](lift.html#arrow.optics$lift(arrow.optics.PPrism((arrow.optics.lift.S, arrow.optics.lift.T, arrow.optics.lift.A, arrow.optics.lift.B)), kotlin.Function1((arrow.optics.lift.A, arrow.optics.lift.B)))/f): `(A) -> B to the context of `S`: `(S) -&gt; T`

