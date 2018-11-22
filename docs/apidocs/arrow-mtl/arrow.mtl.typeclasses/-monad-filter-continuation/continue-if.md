---
title: MonadFilterContinuation.continueIf - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.typeclasses](../index.html) / [MonadFilterContinuation](index.html) / [continueIf](./continue-if.html)

# continueIf

`fun continueIf(predicate: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Short circuits monadic bind if `predicate == false` return the
monad `empty` value.

