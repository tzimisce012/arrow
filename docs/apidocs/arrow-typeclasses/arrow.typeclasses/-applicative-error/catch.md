---
title: ApplicativeError.catch - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [ApplicativeError](index.html) / [catch](./catch.html)

# catch

`open fun <A> catch(recover: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`E`](index.html#E)`, f: () -> `[`A`](catch.html#A)`): Kind<`[`F`](index.html#F)`, `[`A`](catch.html#A)`>`
`open fun <A> `[`ApplicativeError`](index.html)`<`[`F`](index.html#F)`, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(f: () -> `[`A`](catch.html#A)`): Kind<`[`F`](index.html#F)`, `[`A`](catch.html#A)`>`