---
title: ComposedBifunctor.bimap - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [ComposedBifunctor](index.html) / [bimap](./bimap.html)

# bimap

`open fun <A, B, C, D> `[`BinestedType`](../-binested-type.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](bimap.html#A)`, `[`B`](bimap.html#B)`>.bimap(fl: (`[`A`](bimap.html#A)`) -> `[`C`](bimap.html#C)`, fr: (`[`B`](bimap.html#B)`) -> `[`D`](bimap.html#D)`): `[`BinestedType`](../-binested-type.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`C`](bimap.html#C)`, `[`D`](bimap.html#D)`>`

Overrides [Bifunctor.bimap](../-bifunctor/bimap.html)

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

