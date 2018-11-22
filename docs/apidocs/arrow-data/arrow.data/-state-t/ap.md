---
title: StateT.ap - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [StateT](index.html) / [ap](./ap.html)

# ap

`fun <B> ap(MF: Monad<`[`F`](index.html#F)`>, ff: `[`StateTOf`](../-state-t-of.html)`<`[`F`](index.html#F)`, `[`S`](index.html#S)`, (`[`A`](index.html#A)`) -> `[`B`](ap.html#B)`>): `[`StateT`](index.html)`<`[`F`](index.html#F)`, `[`S`](index.html#S)`, `[`B`](ap.html#B)`>`

Apply a function `(S) -> B` that operates within the [StateT](index.html) context.

### Parameters

`ff` - function with the [StateT](index.html) context.

`MF` - [Monad](#) for the context [F](index.html#F).