---
title: ap - arrow-streams
---

[arrow-streams](../../index.html) / [arrow.streams.internal](../index.html) / [arrow.Kind](index.html) / [ap](./ap.html)

# ap

`fun <F, A, B> `[`FreeCOf`](../-free-c-of.html)`<`[`F`](ap.html#F)`, `[`A`](ap.html#A)`>.ap(ff: Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](ap.html#F)`>, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](ap.html#F)`>, `[`B`](ap.html#B)`>`

Given a function [ff](ap.html#arrow.streams.internal$ap(arrow.Kind((arrow.Kind((arrow.streams.internal.ForFreeC, arrow.streams.internal.ap.F)), arrow.streams.internal.ap.A)), arrow.Kind((arrow.Kind((arrow.streams.internal.ForFreeC, arrow.streams.internal.ap.F)), kotlin.Function1((arrow.streams.internal.ap.A, arrow.streams.internal.ap.B)))))/ff) in the context of [FreeC](../-free-c/index.html), applies the function.

