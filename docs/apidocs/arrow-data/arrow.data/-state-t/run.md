---
title: StateT.run - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [StateT](index.html) / [run](./run.html)

# run

`fun run(MF: Monad<`[`F`](index.html#F)`>, initial: `[`S`](index.html#S)`): Kind<`[`F`](index.html#F)`, Tuple2<`[`S`](index.html#S)`, `[`A`](index.html#A)`>>`

Run the stateful computation within the context `F`.

### Parameters

`s` - initial state to run stateful computation.

`MF` - [Monad](#) for the context [F](index.html#F).