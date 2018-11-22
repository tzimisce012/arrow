---
title: arrow.optics.instances.arrow.core.Try.traversal - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics.instances](../index.html) / [arrow.core.Try](index.html) / [traversal](./traversal.html)

# traversal

`fun <A> Try.Companion.traversal(): `[`Traversal`](../../arrow.optics/-traversal.html)`<Try<`[`A`](traversal.html#A)`>, `[`A`](traversal.html#A)`>`

[Traversal](../../arrow.optics/-traversal.html) for [Try](#) that has focus in each [Try.Success](#).

**Receiver**
[Try.Companion](#) to make it statically available.

**Return**
[Traversal](../../arrow.optics/-traversal.html) with source [Try](#) and focus in every [Try.Success](#) of the source.

