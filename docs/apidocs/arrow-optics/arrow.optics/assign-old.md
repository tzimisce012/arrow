---
title: assignOld - arrow-optics
---

[arrow-optics](../index.html) / [arrow.optics](index.html) / [assignOld](./assign-old.html)

# assignOld

`fun <S, A> `[`Lens`](-lens.html)`<`[`S`](assign-old.html#S)`, `[`A`](assign-old.html#A)`>.assignOld(a: `[`A`](assign-old.html#A)`): State<`[`S`](assign-old.html#S)`, `[`A`](assign-old.html#A)`>`

Assign the value focus [A](assign-old.html#A) through the [Lens](-lens.html) and returns its *old* value.

`fun <S, A> `[`Optional`](-optional.html)`<`[`S`](assign-old.html#S)`, `[`A`](assign-old.html#A)`>.assignOld(a: `[`A`](assign-old.html#A)`): State<`[`S`](assign-old.html#S)`, Option<`[`A`](assign-old.html#A)`>>`

Assign the value focus [A](assign-old.html#A) through the [Optional](-optional.html) and returns its *old* value.

`fun <S, A> `[`Traversal`](-traversal.html)`<`[`S`](assign-old.html#S)`, `[`A`](assign-old.html#A)`>.assignOld(a: `[`A`](assign-old.html#A)`): State<`[`S`](assign-old.html#S)`, ListK<`[`A`](assign-old.html#A)`>>`

Assign the focus [A](assign-old.html#A) viewed through the [Traversal](-traversal.html) and returns its *old* value.

