---
title: Bracket.bracketCase - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects.typeclasses](../index.html) / [Bracket](index.html) / [bracketCase](./bracket-case.html)

# bracketCase

`abstract fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](bracket-case.html#A)`>.bracketCase(release: (`[`A`](bracket-case.html#A)`, `[`ExitCase`](../-exit-case/index.html)`<`[`E`](index.html#E)`>) -> Kind<`[`F`](index.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, use: (`[`A`](bracket-case.html#A)`) -> Kind<`[`F`](index.html#F)`, `[`B`](bracket-case.html#B)`>): Kind<`[`F`](index.html#F)`, `[`B`](bracket-case.html#B)`>`

A generalized version of [bracket](bracket.html) which uses [ExitCase](../-exit-case/index.html) to distinguish between different exit cases when
releasing the acquired resource.

### Parameters

`release` -

is the action supposed to release the allocated resource after `use` is done, by observing and
acting on its exit condition.



{: data-executable='true'}



``` kotlin
import arrow.effects.IO
import arrow.effects.typeclasses.ExitCase

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
  val safeComputation = openFile("data.json").bracketCase(
    release = { file, exitCase ->
      when (exitCase) {
        is ExitCase.Completed -> { /* do something */}
        is ExitCase.Cancelled -> { /* do something */}
        is ExitCase.Error -> { /* do something */}
      }
      closeFile(file)
   },
   use = { file -> fileToString(file) }
 )
 //sampleEnd
 println(safeComputation)
 }
```

