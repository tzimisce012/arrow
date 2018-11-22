---
title: StateT.runS - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [StateT](index.html) / [runS](./run-s.html)

# runS

`fun runS(MF: Monad<`[`F`](index.html#F)`>, s: `[`S`](index.html#S)`): Kind<`[`F`](index.html#F)`, `[`S`](index.html#S)`>`

Run the stateful computation within the context `F` and get the state [S](index.html#S).

### Parameters

`s` - initial state to run stateful computation.

`MF` - [Monad](#) for the context [F](index.html#F).