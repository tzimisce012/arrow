---
title: Bifunctor.mapLeft - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Bifunctor](index.html) / [mapLeft](./map-left.html)

# mapLeft

`open fun <A, B, C> Kind2<`[`F`](index.html#F)`, `[`A`](map-left.html#A)`, `[`B`](map-left.html#B)`>.mapLeft(f: (`[`A`](map-left.html#A)`) -> `[`C`](map-left.html#C)`): Kind2<`[`F`](index.html#F)`, `[`C`](map-left.html#C)`, `[`B`](map-left.html#B)`>`

Map the left side type of Kind2

{: data-executable='true'}

``` kotlin
import arrow.core.Tuple2
import arrow.instances.tuple2.bifunctor.mapLeft

fun main(args: Array<String>) {
  //sampleStart
  val tuple = Tuple2(2, 2).mapLeft { num -> num * 2 }
  //sampleEnd
  println("First value: ${tuple.a}")
  println("Second value: ${tuple.b}")
}
```

