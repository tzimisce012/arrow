---
title: Select.select - arrow-query-language
---

[arrow-query-language](../../index.html) / [arrow.aql](../index.html) / [Select](index.html) / [select](./select.html)

# select

`open infix fun <A, Z> `[`Source`](../-source.html)`<`[`F`](index.html#F)`, `[`A`](select.html#A)`>.select(f: `[`Selection`](../-selection.html)`<`[`A`](select.html#A)`, `[`Z`](select.html#Z)`>): `[`Query`](../-query/index.html)`<`[`F`](index.html#F)`, `[`A`](select.html#A)`, `[`Z`](select.html#Z)`>`

Commented method or class

{: data-executable='true'}

``` kotlin
import arrow.aql.instances.list.select.*
import arrow.aql.instances.listk.select.select

fun main(args: Array<String>) {
  //sampleStart
  val result: List<Int> =
    listOf(1, 2, 3).query {
      select { this + 1 }
    }.value()
 //sampleEnd
 println(result)
 }
```

