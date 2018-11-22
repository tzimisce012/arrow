---
title: assign_ - arrow-optics
---

[arrow-optics](../index.html) / [arrow.optics](index.html) / [assign_](./assign_.html)

# assign_

`fun <S, A> `[`Lens`](-lens.html)`<`[`S`](assign_.html#S)`, `[`A`](assign_.html#A)`>.assign_(a: `[`A`](assign_.html#A)`): State<`[`S`](assign_.html#S)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`

Assign the focus [A](assign_.html#A) viewed through the [Lens](-lens.html) and ignores both values.

`fun <S, A> `[`Optional`](-optional.html)`<`[`S`](assign_.html#S)`, `[`A`](assign_.html#A)`>.assign_(a: `[`A`](assign_.html#A)`): State<`[`S`](assign_.html#S)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`

Assign the focus [A](assign_.html#A) viewed through the [Optional](-optional.html) and ignores both values.

`fun <S, A> `[`Setter`](-setter.html)`<`[`S`](assign_.html#S)`, `[`A`](assign_.html#A)`>.assign_(a: `[`A`](assign_.html#A)`): State<`[`S`](assign_.html#S)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`

Set the focus [A](assign_.html#A) referenced through the [Setter](-setter.html).

`fun <S, A> `[`Traversal`](-traversal.html)`<`[`S`](assign_.html#S)`, `[`A`](assign_.html#A)`>.assign_(a: `[`A`](assign_.html#A)`): State<`[`S`](assign_.html#S)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`

Assign the focus [A](assign_.html#A) viewed through the [Traversal](-traversal.html) and ignores both values.

