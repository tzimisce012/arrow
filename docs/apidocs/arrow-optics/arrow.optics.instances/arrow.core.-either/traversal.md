---
title: arrow.optics.instances.arrow.core.Either.traversal - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics.instances](../index.html) / [arrow.core.Either](index.html) / [traversal](./traversal.html)

# traversal

`fun <L, R> Either.Companion.traversal(): `[`Traversal`](../../arrow.optics/-traversal.html)`<Either<`[`L`](traversal.html#L)`, `[`R`](traversal.html#R)`>, `[`R`](traversal.html#R)`>`

[Traversal](../../arrow.optics/-traversal.html) for [Either](#) that has focus in each [Either.Right](#).

**Receiver**
[Either.Companion](#) to make it statically available.

**Return**
[Traversal](../../arrow.optics/-traversal.html) with source [Either](#) and focus every [Either.Right](#) of the source.

