---
title: Getter.asks - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics](../index.html) / [Getter](index.html) / [asks](./asks.html)

# asks

`open fun <B> asks(f: (`[`A`](index.html#A)`) -> `[`B`](asks.html#B)`): Reader<`[`S`](index.html#S)`, `[`B`](asks.html#B)`>`

Extracts the value viewed through the [get](get.html) and applies [f](asks.html#arrow.optics.Getter$asks(kotlin.Function1((arrow.optics.Getter.A, arrow.optics.Getter.asks.B)))/f) to it.

### Parameters

`f` - function to apply to the focus.