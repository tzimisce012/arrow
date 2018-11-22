---
title: StateT.combineK - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [StateT](index.html) / [combineK](./combine-k.html)

# combineK

`fun combineK(MF: Monad<`[`F`](index.html#F)`>, SF: SemigroupK<`[`F`](index.html#F)`>, y: `[`StateTOf`](../-state-t-of.html)`<`[`F`](index.html#F)`, `[`S`](index.html#S)`, `[`A`](index.html#A)`>): `[`StateT`](index.html)`<`[`F`](index.html#F)`, `[`S`](index.html#S)`, `[`A`](index.html#A)`>`

Combine two [StateT](index.html) objects using an instance of [SemigroupK](#) for [F](index.html#F).

### Parameters

`y` - other [StateT](index.html) object to combine.

`MF` - [Monad](#) for the context [F](index.html#F).

`SF` - [SemigroupK](#) for [F](index.html#F).