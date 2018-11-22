---
title: Promise.complete - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects](../index.html) / [Promise](index.html) / [complete](./complete.html)

# complete

`abstract fun complete(a: `[`A`](index.html#A)`): Kind<`[`F`](index.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`

Completes the promise with the specified value [A](index.html#A).

Results in an [Promise.AlreadyFulfilled](-already-fulfilled.html) within [F](index.html#F) if the promise is already fulfilled.

{: data-executable='true'}

``` kotlin
import arrow.effects.*
import arrow.effects.instances.io.async.async
import arrow.effects.instances.io.monad.flatMap

fun main(args: Array<String>) {
  //sampleStart
  val promise = Promise.uncancelable<ForIO, Int>(IO.async())

  promise.flatMap { p ->
    p.complete(1).flatMap {
      p.get
    }
  }.unsafeRunSync() == IO.just(1).unsafeRunSync()

  promise.flatMap { p ->
    p.complete(1).flatMap {
      p.complete(2)
    }
  }.attempt().unsafeRunSync() ==
    IO.raiseError<Int>(Promise.AlreadyFulfilled).attempt().unsafeRunSync()
  //sampleEnd
}
```

