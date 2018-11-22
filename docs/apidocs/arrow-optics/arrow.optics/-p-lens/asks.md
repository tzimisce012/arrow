---
title: PLens.asks - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics](../index.html) / [PLens](index.html) / [asks](./asks.html)

# asks

`open fun <C> asks(f: (`[`A`](index.html#A)`) -> `[`C`](asks.html#C)`): Reader<`[`S`](index.html#S)`, `[`C`](asks.html#C)`>`

Extracts the value viewed through the [get](get.html) and applies [f](asks.html#arrow.optics.PLens$asks(kotlin.Function1((arrow.optics.PLens.A, arrow.optics.PLens.asks.C)))/f) to it.

### Parameters

`f` - function to apply to the focus.