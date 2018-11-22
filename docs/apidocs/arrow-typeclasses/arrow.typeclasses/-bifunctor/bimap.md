---
title: Bifunctor.bimap - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Bifunctor](index.html) / [bimap](./bimap.html)

# bimap

`abstract fun <A, B, C, D> Kind2<`[`F`](index.html#F)`, `[`A`](bimap.html#A)`, `[`B`](bimap.html#B)`>.bimap(fl: (`[`A`](bimap.html#A)`) -> `[`C`](bimap.html#C)`, fr: (`[`B`](bimap.html#B)`) -> `[`D`](bimap.html#D)`): Kind2<`[`F`](index.html#F)`, `[`C`](bimap.html#C)`, `[`D`](bimap.html#D)`>`

Maps both types of Kind2.

{: data-executable='true'}

``` kotlin
import arrow.core.Tuple2

fun main(args: Array<String>) {
  //sampleStart
  val tuple = Tuple2(2, 2).bimap({ num -> num * 2 }, { num -> num + 5})
  //sampleEnd
  println("First value: ${tuple.a}")
  println("Second value: ${tuple.b}")
}
```

