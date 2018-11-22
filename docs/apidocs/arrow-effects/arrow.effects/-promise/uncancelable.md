---
title: Promise.uncancelable - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects](../index.html) / [Promise](index.html) / [uncancelable](./uncancelable.html)

# uncancelable

`fun <F, A> uncancelable(AS: `[`Async`](../../arrow.effects.typeclasses/-async/index.html)`<`[`F`](uncancelable.html#F)`>): Kind<`[`F`](uncancelable.html#F)`, `[`Promise`](index.html)`<`[`F`](uncancelable.html#F)`, `[`A`](uncancelable.html#A)`>>`

Creates an empty `Promise` from on [Async](../../arrow.effects.typeclasses/-async/index.html) instance for [F](uncancelable.html#F).
Does not support cancellation of [get](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/get.html) operation.

{: data-executable='true'}

``` kotlin
import arrow.effects.*
import arrow.effects.instances.io.async.async

fun main(args: Array<String>) {
  //sampleStart
  val promise: IOOf<Promise<ForIO, Int>> = Promise.uncancelable(IO.async())
  //sampleEnd
}
```

