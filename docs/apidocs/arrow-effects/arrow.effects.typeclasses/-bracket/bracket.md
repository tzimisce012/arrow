---
title: Bracket.bracket - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects.typeclasses](../index.html) / [Bracket](index.html) / [bracket](./bracket.html)

# bracket

`open fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](bracket.html#A)`>.bracket(release: (`[`A`](bracket.html#A)`) -> Kind<`[`F`](index.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, use: (`[`A`](bracket.html#A)`) -> Kind<`[`F`](index.html#F)`, `[`B`](bracket.html#B)`>): Kind<`[`F`](index.html#F)`, `[`B`](bracket.html#B)`>`

Meant for specifying tasks with safe resource acquisition and release in the face of errors and interruption.
It would be the the equivalent of `try/catch/finally` statements in mainstream imperative languages for resource
acquisition and release.

### Parameters

`release` -

is the action that's supposed to release the allocated resource after `use` is done, irregardless
of its exit condition.



{: data-executable='true'}



``` kotlin
import arrow.effects.IO

class File(url: String) {
  fun open(): File = this
  fun close(): Unit {}
  override fun toString(): String = "This file contains some interesting content!"
}

fun openFile(uri: String): IO<File> = IO { File(uri).open() }
fun closeFile(file: File): IO<Unit> = IO { file.close() }
fun fileToString(file: File): IO<String> = IO { file.toString() }

fun main(args: Array<String>) {
  //sampleStart
  val safeComputation = openFile("data.json").bracket(
    release = { file -> closeFile(file) },
    use = { file -> fileToString(file) }
  )
  //sampleEnd
  println(safeComputation)
}
```

