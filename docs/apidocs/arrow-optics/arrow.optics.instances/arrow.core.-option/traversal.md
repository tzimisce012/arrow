---
title: arrow.optics.instances.arrow.core.Option.traversal - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics.instances](../index.html) / [arrow.core.Option](index.html) / [traversal](./traversal.html)

# traversal

`fun <A> Option.Companion.traversal(): `[`Traversal`](../../arrow.optics/-traversal.html)`<Option<`[`A`](traversal.html#A)`>, `[`A`](traversal.html#A)`>`

[Traversal](../../arrow.optics/-traversal.html) for [Option](#) that has focus in each [arrow.core.Some](#).

**Receiver**
[Option.Companion](#) to make it statically available.

**Return**
[Traversal](../../arrow.optics/-traversal.html) with source [Option](#) and focus in every [arrow.core.Some](#) of the source.

