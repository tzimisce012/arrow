---
title: Promise.error - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects](../index.html) / [Promise](index.html) / [error](./error.html)

# error

`abstract fun error(throwable: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): Kind<`[`F`](index.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`

Errors the promise with the specified [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html).

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
    p.error(RuntimeException("Boom"))
  }.attempt().unsafeRunSync() ==
    IO.raiseError<Int>(RuntimeException("Boom")).attempt().unsafeRunSync()

  promise.flatMap { p ->
    p.complete(1).flatMap {
      p.error(RuntimeException("Boom"))
    }
  }.attempt().unsafeRunSync() ==
    IO.raiseError<Int>(Promise.AlreadyFulfilled).attempt().unsafeRunSync()
  //sampleEnd
}
```

