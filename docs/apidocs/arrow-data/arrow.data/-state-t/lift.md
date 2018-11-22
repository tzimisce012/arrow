---
title: StateT.lift - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [StateT](index.html) / [lift](./lift.html)

# lift

`fun <F, S, A> lift(MF: Monad<`[`F`](lift.html#F)`>, fa: Kind<`[`F`](lift.html#F)`, `[`A`](lift.html#A)`>): `[`StateT`](index.html)`<`[`F`](lift.html#F)`, `[`S`](lift.html#S)`, `[`A`](lift.html#A)`>`

Lift a value of type `A` into `StateT<F, S, A>`.

### Parameters

`MF` - [Monad](#) for the context [F](lift.html#F).

`fa` - the value to lift.