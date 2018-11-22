---
title: Promise.unsafeCancellable - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects](../index.html) / [Promise](index.html) / [unsafeCancellable](./unsafe-cancellable.html)

# unsafeCancellable

`fun <F, A> unsafeCancellable(AS: `[`Async`](../../arrow.effects.typeclasses/-async/index.html)`<`[`F`](unsafe-cancellable.html#F)`>): `[`Promise`](index.html)`<`[`F`](unsafe-cancellable.html#F)`, `[`A`](unsafe-cancellable.html#A)`>`

Creates an empty `Promise` from on [Async](../../arrow.effects.typeclasses/-async/index.html) instance for [F](unsafe-cancellable.html#F).
Does not support cancellation of [get](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/get.html) operation.
This method is considered unsafe because it is not referentially transparent -- it allocates mutable state.

{: data-executable='true'}

``` kotlin
import arrow.effects.*
import arrow.effects.instances.io.async.async

fun main(args: Array<String>) {
  //sampleStart
  val unsafePromise: Promise<ForIO, Int> = Promise.unsafeCancellable(IO.async())
  //sampleEnd
}
```

