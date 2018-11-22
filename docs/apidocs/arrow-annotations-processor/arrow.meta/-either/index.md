---
title: Either - arrow-annotations-processor
---

[arrow-annotations-processor](../../index.html) / [arrow.meta](../index.html) / [Either](./index.html)

# Either

`sealed class Either<out A, out B>`

### Types

| [Left](-left/index.html) | `data class Left<out A> : `[`Either`](./index.html)`<`[`A`](-left/index.html#A)`, `[`Nothing`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)`>` |
| [Right](-right/index.html) | `data class Right<out B> : `[`Either`](./index.html)`<`[`Nothing`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)`, `[`B`](-right/index.html#B)`>` |

### Functions

| [fold](fold.html) | `fun <C> fold(ifLeft: (`[`A`](index.html#A)`) -> `[`C`](fold.html#C)`, ifRight: (`[`B`](index.html#B)`) -> `[`C`](fold.html#C)`): `[`C`](fold.html#C) |
| [map](map.html) | `fun <C> map(f: (`[`B`](index.html#B)`) -> `[`C`](map.html#C)`): `[`Either`](./index.html)`<`[`A`](index.html#A)`, `[`C`](map.html#C)`>` |

### Extension Functions

| [flatMap](../flat-map.html) | `fun <A, B, C> `[`Either`](./index.html)`<`[`A`](../flat-map.html#A)`, `[`B`](../flat-map.html#B)`>.flatMap(f: (`[`B`](../flat-map.html#B)`) -> `[`Either`](./index.html)`<`[`A`](../flat-map.html#A)`, `[`C`](../flat-map.html#C)`>): `[`Either`](./index.html)`<`[`A`](../flat-map.html#A)`, `[`C`](../flat-map.html#C)`>` |

### Inheritors

| [Left](-left/index.html) | `data class Left<out A> : `[`Either`](./index.html)`<`[`A`](-left/index.html#A)`, `[`Nothing`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)`>` |
| [Right](-right/index.html) | `data class Right<out B> : `[`Either`](./index.html)`<`[`Nothing`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)`, `[`B`](-right/index.html#B)`>` |

