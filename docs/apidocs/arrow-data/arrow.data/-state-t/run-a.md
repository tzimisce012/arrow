---
title: StateT.runA - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [StateT](index.html) / [runA](./run-a.html)

# runA

`fun runA(MF: Monad<`[`F`](index.html#F)`>, s: `[`S`](index.html#S)`): Kind<`[`F`](index.html#F)`, `[`A`](index.html#A)`>`

Run the stateful computation within the context `F` and get the value [A](index.html#A).

### Parameters

`s` - initial state to run stateful computation.

`MF` - [Monad](#) for the context [F](index.html#F).