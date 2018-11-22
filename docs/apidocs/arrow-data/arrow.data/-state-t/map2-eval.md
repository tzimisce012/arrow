---
title: StateT.map2Eval - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [StateT](index.html) / [map2Eval](./map2-eval.html)

# map2Eval

`fun <B, Z> map2Eval(MF: Monad<`[`F`](index.html#F)`>, sb: Eval<`[`StateT`](index.html)`<`[`F`](index.html#F)`, `[`S`](index.html#S)`, `[`B`](map2-eval.html#B)`>>, fn: (`[`A`](index.html#A)`, `[`B`](map2-eval.html#B)`) -> `[`Z`](map2-eval.html#Z)`): Eval<`[`StateT`](index.html)`<`[`F`](index.html#F)`, `[`S`](index.html#S)`, `[`Z`](map2-eval.html#Z)`>>`

Controlled combination of [StateT](index.html) that is of same context [F](index.html#F) and state [S](index.html#S) using [Eval](#).

### Parameters

`sb` - other state with value of type `B`.

`f` - the function to apply.

`MF` - [Monad](#) for the context [F](index.html#F).