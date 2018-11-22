---
title: Promise.get - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects](../index.html) / [Promise](index.html) / [get](./get.html)

# get

`abstract val get: Kind<`[`F`](index.html#F)`, `[`A`](index.html#A)`>`

Get the promised value.
Suspending the fiber running the action until the result is available.

{: data-executable='true'}

``` kotlin
import arrow.effects.*
import arrow.effects.typeclasses.*
import arrow.effects.instances.io.async.async
import arrow.effects.instances.io.monad.flatMap

fun main(args: Array<String>) {
  //sampleStart
  val promise = Promise.uncancelable<ForIO, Int>(IO.async())

  promise.flatMap { p ->
    p.get
  }.unsafeRunTimed(3.seconds) == IO.never.unsafeRunTimed(3.seconds)

  promise.flatMap { p ->
    p.complete(1).flatMap {
      p.get
    }
  }.unsafeRunSync() == IO.just(1).unsafeRunSync()
  //sampleEnd
}
```

