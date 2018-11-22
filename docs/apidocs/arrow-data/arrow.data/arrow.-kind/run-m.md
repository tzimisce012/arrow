---
title: runM - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [arrow.Kind](index.html) / [runM](./run-m.html)

# runM

`fun <F, S, A> `[`StateTOf`](../-state-t-of.html)`<`[`F`](run-m.html#F)`, `[`S`](run-m.html#S)`, `[`A`](run-m.html#A)`>.runM(MF: Monad<`[`F`](run-m.html#F)`>, initial: `[`S`](run-m.html#S)`): Kind<`[`F`](run-m.html#F)`, Tuple2<`[`S`](run-m.html#S)`, `[`A`](run-m.html#A)`>>`

Run the stateful computation within the context `F`.

### Parameters

`MF` - [Monad](#) for the context [F](run-m.html#F)

`s` - initial state to run stateful computation