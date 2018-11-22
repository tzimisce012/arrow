---
title: Ior.tailRecM - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [Ior](index.html) / [tailRecM](./tail-rec-m.html)

# tailRecM

`fun <L, A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> `[`IorOf`](../-ior-of.html)`<`[`L`](tail-rec-m.html#L)`, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>, SL: Semigroup<`[`L`](tail-rec-m.html#L)`>): `[`Ior`](index.html)`<`[`L`](tail-rec-m.html#L)`, `[`B`](tail-rec-m.html#B)`>`