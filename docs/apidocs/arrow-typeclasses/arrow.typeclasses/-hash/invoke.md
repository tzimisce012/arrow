---
title: Hash.invoke - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Hash](index.html) / [invoke](./invoke.html)

# invoke

`inline operator fun <F> invoke(crossinline hashF: (`[`F`](invoke.html#F)`) -> `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Hash`](index.html)`<`[`F`](invoke.html#F)`>`

Construct an instance of [Hash](index.html) from a function `(F) -> Int`.

### Parameters

`hashF` - function that computes a hash for any object of type [F](invoke.html#F)

**Returns**

an instance of [Hash](index.html) that is defined by the hashF function



{: data-executable='true'}



``` kotlin
import arrow.typeclasses.Hash

fun main(args: Array<String>) {
  //sampleStart
  val result = Hash<String> { s: String -> s.hashCode() }.run { "MyString".hash() }
  //sampleEnd
  println(result)
}
```

