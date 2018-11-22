---
title: update - arrow-optics
---

[arrow-optics](../index.html) / [arrow.optics](index.html) / [update](./update.html)

# update

`fun <S, A> `[`Lens`](-lens.html)`<`[`S`](update.html#S)`, `[`A`](update.html#A)`>.update(f: (`[`A`](update.html#A)`) -> `[`A`](update.html#A)`): State<`[`S`](update.html#S)`, `[`A`](update.html#A)`>`

Update the focus [A](update.html#A) viewed through the [Lens](-lens.html) and returns its *new* value.

`fun <S, A> `[`Optional`](-optional.html)`<`[`S`](update.html#S)`, `[`A`](update.html#A)`>.update(f: (`[`A`](update.html#A)`) -> `[`A`](update.html#A)`): State<`[`S`](update.html#S)`, Option<`[`A`](update.html#A)`>>`

Update the focus [A](update.html#A) viewed through the [Optional](-optional.html) and returns its *new* value.

`fun <S, A> `[`Traversal`](-traversal.html)`<`[`S`](update.html#S)`, `[`A`](update.html#A)`>.update(f: (`[`A`](update.html#A)`) -> `[`A`](update.html#A)`): State<`[`S`](update.html#S)`, ListK<`[`A`](update.html#A)`>>`

Update the focus [A](update.html#A) viewed through the [Traversal](-traversal.html) and returns its *new* value.

