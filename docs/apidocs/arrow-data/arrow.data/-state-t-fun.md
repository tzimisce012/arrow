---
title: StateTFun - arrow-data
---

[arrow-data](../index.html) / [arrow.data](index.html) / [StateTFun](./-state-t-fun.html)

# StateTFun

`typealias StateTFun<F, S, A> = (`[`S`](-state-t-fun.html#S)`) -> Kind<`[`F`](-state-t-fun.html#F)`, Tuple2<`[`S`](-state-t-fun.html#S)`, `[`A`](-state-t-fun.html#A)`>>`

Alias that represent stateful computation of the form `(S) -> Tuple2<S, A>` with a result in certain context `F`.

