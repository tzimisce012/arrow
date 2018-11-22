---
title: assign - arrow-optics
---

[arrow-optics](../index.html) / [arrow.optics](index.html) / [assign](./assign.html)

# assign

`fun <S, A> `[`Lens`](-lens.html)`<`[`S`](assign.html#S)`, `[`A`](assign.html#A)`>.assign(a: `[`A`](assign.html#A)`): State<`[`S`](assign.html#S)`, `[`A`](assign.html#A)`>`

Assign the focus [A](assign.html#A) viewed through the [Lens](-lens.html) and returns its *new* value.

`fun <S, A> `[`Optional`](-optional.html)`<`[`S`](assign.html#S)`, `[`A`](assign.html#A)`>.assign(a: `[`A`](assign.html#A)`): State<`[`S`](assign.html#S)`, Option<`[`A`](assign.html#A)`>>`

Assign the focus [A](assign.html#A) viewed through the [Optional](-optional.html) and returns its *new* value.

`fun <S, A> `[`Traversal`](-traversal.html)`<`[`S`](assign.html#S)`, `[`A`](assign.html#A)`>.assign(a: `[`A`](assign.html#A)`): State<`[`S`](assign.html#S)`, ListK<`[`A`](assign.html#A)`>>`

Assign the focus [A](assign.html#A) viewed through the [Traversal](-traversal.html) and returns its *new* value.

