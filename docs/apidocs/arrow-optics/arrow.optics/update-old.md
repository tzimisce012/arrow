---
title: updateOld - arrow-optics
---

[arrow-optics](../index.html) / [arrow.optics](index.html) / [updateOld](./update-old.html)

# updateOld

`fun <S, A> `[`Lens`](-lens.html)`<`[`S`](update-old.html#S)`, `[`A`](update-old.html#A)`>.updateOld(f: (`[`A`](update-old.html#A)`) -> `[`A`](update-old.html#A)`): State<`[`S`](update-old.html#S)`, `[`A`](update-old.html#A)`>`

Update the focus [A](update-old.html#A) viewed through the [Lens](-lens.html) and returns its *old* value.

`fun <S, A> `[`Optional`](-optional.html)`<`[`S`](update-old.html#S)`, `[`A`](update-old.html#A)`>.updateOld(f: (`[`A`](update-old.html#A)`) -> `[`A`](update-old.html#A)`): State<`[`S`](update-old.html#S)`, Option<`[`A`](update-old.html#A)`>>`

Update the focus [A](update-old.html#A) viewed through the [Optional](-optional.html) and returns its *old* value.

`fun <S, A> `[`Traversal`](-traversal.html)`<`[`S`](update-old.html#S)`, `[`A`](update-old.html#A)`>.updateOld(f: (`[`A`](update-old.html#A)`) -> `[`A`](update-old.html#A)`): State<`[`S`](update-old.html#S)`, ListK<`[`A`](update-old.html#A)`>>`

Update the focus [A](update-old.html#A) viewed through the [Traversal](-traversal.html) and returns its *old* value.

