---
title: update_ - arrow-optics
---

[arrow-optics](../index.html) / [arrow.optics](index.html) / [update_](./update_.html)

# update_

`fun <S, A> `[`Lens`](-lens.html)`<`[`S`](update_.html#S)`, `[`A`](update_.html#A)`>.update_(f: (`[`A`](update_.html#A)`) -> `[`A`](update_.html#A)`): State<`[`S`](update_.html#S)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`

Modify the focus [A](update_.html#A) viewed through the [Lens](-lens.html) and ignores both values.

`fun <S, A> `[`Optional`](-optional.html)`<`[`S`](update_.html#S)`, `[`A`](update_.html#A)`>.update_(f: (`[`A`](update_.html#A)`) -> `[`A`](update_.html#A)`): State<`[`S`](update_.html#S)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`

Update the focus [A](update_.html#A) viewed through the [Optional](-optional.html) and ignores both values.

`fun <S, A> `[`Setter`](-setter.html)`<`[`S`](update_.html#S)`, `[`A`](update_.html#A)`>.update_(f: (`[`A`](update_.html#A)`) -> `[`A`](update_.html#A)`): State<`[`S`](update_.html#S)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`

Update the focus [A](update_.html#A) referenced through the [Setter](-setter.html).

`fun <S, A> `[`Traversal`](-traversal.html)`<`[`S`](update_.html#S)`, `[`A`](update_.html#A)`>.update_(f: (`[`A`](update_.html#A)`) -> `[`A`](update_.html#A)`): State<`[`S`](update_.html#S)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`

Update the focus [A](update_.html#A) viewed through the [Traversal](-traversal.html) and ignores both values

