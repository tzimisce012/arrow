---
title: StateT.invoke - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [StateT](index.html) / [invoke](./invoke.html)

# invoke

`operator fun <F, S, A> invoke(MF: Monad<`[`F`](invoke.html#F)`>, run: `[`StateTFun`](../-state-t-fun.html)`<`[`F`](invoke.html#F)`, `[`S`](invoke.html#S)`, `[`A`](invoke.html#A)`>): `[`StateT`](index.html)`<`[`F`](invoke.html#F)`, `[`S`](invoke.html#S)`, `[`A`](invoke.html#A)`>`

Constructor to create `StateT<F, S, A>` given a [StateTFun](../-state-t-fun.html).

### Parameters

`MF` - [Monad](#) for the context [F](invoke.html#F).

`run` - the stateful function to wrap with [StateT](index.html).