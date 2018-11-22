---
title: Option.just - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [Option](index.html) / [just](./just.html)

# just

`fun <A> just(a: `[`A`](just.html#A)`): `[`Option`](index.html)`<`[`A`](just.html#A)`>`

Lifts a pure [A](just.html#A) value to [Option](index.html)

{: data-executable='true'}

``` kotlin
import arrow.core.Option
fun main(args: Array<String>) {
//sampleStart
val result: Option<Int> = Option.just(1)
//sampleEnd
println(result)
}
```

