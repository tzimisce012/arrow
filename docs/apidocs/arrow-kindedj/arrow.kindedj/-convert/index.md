---
title: Convert - arrow-kindedj
---

[arrow-kindedj](../../index.html) / [arrow.kindedj](../index.html) / [Convert](./index.html)

# Convert

`open class Convert`

### Types

| [FromArrowToKindedJ](-from-arrow-to-kinded-j/index.html) | `open class FromArrowToKindedJ<F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, A : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Hk<Hk<`[`ForConvert`](../-for-convert.html)`, `[`F`](-from-arrow-to-kinded-j/index.html#F)`>, `[`A`](-from-arrow-to-kinded-j/index.html#A)`>` |
| [FromKindedJToArrow](-from-kinded-j-to-arrow/index.html) | `open class FromKindedJToArrow<F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, A : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Kind<Kind<`[`ForConvert`](../-for-convert.html)`, `[`F`](-from-kinded-j-to-arrow/index.html#F)`>, `[`A`](-from-kinded-j-to-arrow/index.html#A)`>` |

### Constructors

| [&lt;init&gt;](-init-.html) | `Convert()` |

### Functions

| [fromKindedJ](from-kinded-j.html) | `open static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, A : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> fromKindedJ(hk: Hk<`[`F`](from-kinded-j.html#F)`, `[`A`](from-kinded-j.html#A)`>): `[`FromKindedJToArrow`](-from-kinded-j-to-arrow/index.html)`<`[`F`](from-kinded-j.html#F)`, `[`A`](from-kinded-j.html#A)`>` |
| [toKindedJ](to-kinded-j.html) | `open static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, A : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> toKindedJ(hk: Kind<`[`F`](to-kinded-j.html#F)`, `[`A`](to-kinded-j.html#A)`>): `[`FromArrowToKindedJ`](-from-arrow-to-kinded-j/index.html)`<`[`F`](to-kinded-j.html#F)`, `[`A`](to-kinded-j.html#A)`>` |

