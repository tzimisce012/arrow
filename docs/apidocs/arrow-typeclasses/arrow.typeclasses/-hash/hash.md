---
title: Hash.hash - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Hash](index.html) / [hash](./hash.html)

# hash

`abstract fun `[`F`](index.html#F)`.hash(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)

Produces a hash for an object of type [F](index.html#F).

**Receiver**
The object to hash

**Returns**

an int representing the object hash



{: data-executable='true'}



``` kotlin
import arrow.instances.*

fun main(args: Array<String>) {
  //sampleStart
  val result = String.hash().run { "MyString".hash() }
  //sampleEnd
  println(result)
}
```

