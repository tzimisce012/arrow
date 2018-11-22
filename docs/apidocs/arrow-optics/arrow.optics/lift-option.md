---
title: liftOption - arrow-optics
---

[arrow-optics](../index.html) / [arrow.optics](index.html) / [liftOption](./lift-option.html)

# liftOption

`inline fun <S, T, A, B> `[`PPrism`](-p-prism/index.html)`<`[`S`](lift-option.html#S)`, `[`T`](lift-option.html#T)`, `[`A`](lift-option.html#A)`, `[`B`](lift-option.html#B)`>.liftOption(crossinline f: (`[`A`](lift-option.html#A)`) -> `[`B`](lift-option.html#B)`): (`[`S`](lift-option.html#S)`) -> Option<`[`T`](lift-option.html#T)`>`

Lift a function [f](lift-option.html#arrow.optics$liftOption(arrow.optics.PPrism((arrow.optics.liftOption.S, arrow.optics.liftOption.T, arrow.optics.liftOption.A, arrow.optics.liftOption.B)), kotlin.Function1((arrow.optics.liftOption.A, arrow.optics.liftOption.B)))/f): `(A) -> B to the context of `S`: `(S) -&gt; Option`

