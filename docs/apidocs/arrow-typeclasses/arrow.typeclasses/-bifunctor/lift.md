---
title: Bifunctor.lift - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Bifunctor](index.html) / [lift](./lift.html)

# lift

`open fun <A, B, C, D> lift(fl: (`[`A`](lift.html#A)`) -> `[`C`](lift.html#C)`, fr: (`[`B`](lift.html#B)`) -> `[`D`](lift.html#D)`): (Kind2<`[`F`](index.html#F)`, `[`A`](lift.html#A)`, `[`B`](lift.html#B)`>) -> Kind2<`[`F`](index.html#F)`, `[`C`](lift.html#C)`, `[`D`](lift.html#D)`>`

Lifts two functions to the Bifunctor type.

{: data-executable='true'}

``` kotlin
import arrow.core.*
import arrow.instances.tuple2.bifunctor.lift

val sumFive : (Int) -> Int = { it + 5 }
val sumTwo : (Int) -> Int = { it + 2 }

fun main(args: Array<String>) {
  //sampleStart
  val tuple : Tuple2<Int, Int> = lift(sumFive, sumTwo)(Tuple2(2, 2)).fix()
  //sampleEnd
  println("First value: ${tuple.a}")
  println("Second value: ${tuple.b}")
}

```

