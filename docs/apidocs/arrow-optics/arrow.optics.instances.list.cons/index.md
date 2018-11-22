---
title: arrow.optics.instances.list.cons - arrow-optics
---

[arrow-optics](../index.html) / [arrow.optics.instances.list.cons](./index.html)

## Package arrow.optics.instances.list.cons

### Types

| [List](-list/index.html) | `object List` |

### Extensions for External Classes

| [kotlin.collections.List](kotlin.collections.-list/index.html) |  |

### Functions

| [cons](cons.html) | `infix fun <A> `[`A`](cons.html#A)`.cons(tail: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`A`](cons.html#A)`>): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`A`](cons.html#A)`>`<br>`fun <A> cons(): `[`PPrism`](../arrow.optics/-p-prism/index.html)`<ListK<`[`A`](cons.html#A)`>, ListK<`[`A`](cons.html#A)`>, Tuple2<`[`A`](cons.html#A)`, ListK<`[`A`](cons.html#A)`>>, Tuple2<`[`A`](cons.html#A)`, ListK<`[`A`](cons.html#A)`>>>` |
| [firstOption](first-option.html) | `fun <A> firstOption(): `[`POptional`](../arrow.optics/-p-optional/index.html)`<ListK<`[`A`](first-option.html#A)`>, ListK<`[`A`](first-option.html#A)`>, `[`A`](first-option.html#A)`, `[`A`](first-option.html#A)`>` |
| [tailOption](tail-option.html) | `fun <A> tailOption(): `[`POptional`](../arrow.optics/-p-optional/index.html)`<ListK<`[`A`](tail-option.html#A)`>, ListK<`[`A`](tail-option.html#A)`>, ListK<`[`A`](tail-option.html#A)`>, ListK<`[`A`](tail-option.html#A)`>>` |

