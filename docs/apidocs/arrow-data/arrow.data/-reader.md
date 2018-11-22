---
title: Reader - arrow-data
---

[arrow-data](../index.html) / [arrow.data](index.html) / [Reader](./-reader.html)

# Reader

`typealias Reader<D, A> = `[`ReaderT`](-reader-t.html)`<ForId, `[`D`](-reader.html#D)`, `[`A`](-reader.html#A)`>`

[Reader](./-reader.html) represents a computation that has a dependency on [D](#).
`Reader<D, A>` is an alias for `ReaderT<ForId, D, A>` and `Kleisli<ForId, D, A>`.

### Parameters

`D` - the dependency or environment we depend on.

`A` - resulting type of the computation.

**See Also**

[ReaderT](-reader-t.html)

