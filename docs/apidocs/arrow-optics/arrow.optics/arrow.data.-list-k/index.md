---
title: arrow.optics.arrow.data.ListK - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics](../index.html) / [arrow.data.ListK](./index.html)

### Extensions for arrow.data.ListK

| [head](head.html) | `fun <A> ListK.Companion.head(): `[`Optional`](../-optional.html)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`A`](head.html#A)`>, `[`A`](head.html#A)`>`<br>[Optional](../-optional.html) to safely operate on the head of a list |
| [tail](tail.html) | `fun <A> ListK.Companion.tail(): `[`Optional`](../-optional.html)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`A`](tail.html#A)`>, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`A`](tail.html#A)`>>`<br>[Optional](../-optional.html) to safely operate on the tail of a list |
| [toOptionNel](to-option-nel.html) | `fun <A> ListK.Companion.toOptionNel(): `[`Iso`](../-iso.html)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`A`](to-option-nel.html#A)`>, Option<NonEmptyList<`[`A`](to-option-nel.html#A)`>>>`<br>[Iso](../-iso.html) that defines equality between a [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) and [Option](#) |
| [toPOptionNel](to-p-option-nel.html) | `fun <A, B> ListK.Companion.toPOptionNel(): `[`PIso`](../-p-iso/index.html)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`A`](to-p-option-nel.html#A)`>, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`B`](to-p-option-nel.html#B)`>, Option<NonEmptyList<`[`A`](to-p-option-nel.html#A)`>>, Option<NonEmptyList<`[`B`](to-p-option-nel.html#B)`>>>`<br>[PIso](../-p-iso/index.html) that defines equality between a [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) and [Option](#) |

