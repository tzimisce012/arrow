---
title: ReaderT - arrow-data
---

[arrow-data](../index.html) / [arrow.data](index.html) / [ReaderT](./-reader-t.html)

# ReaderT

`typealias ReaderT<F, D, A> = `[`Kleisli`](-kleisli/index.html)`<`[`F`](-reader-t.html#F)`, `[`D`](-reader-t.html#D)`, `[`A`](-reader-t.html#A)`>`

[Reader](-reader.html) represents a computation that has a dependency on [D](#) with a result within context [F](#).
`ReaderT<F, D, A>` is the monad transfomer variant of [Reader](-reader.html) and an alias for `Kleisli<F, D, A>`.

### Parameters

`F` - the context of the result.

`D` - the dependency or environment we depend on.

`A` - resulting type of the computation.

**See Also**

[Kleisli](-kleisli/index.html)

