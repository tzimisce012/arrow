---
title: Ior.fromOptions - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [Ior](index.html) / [fromOptions](./from-options.html)

# fromOptions

`fun <A, B> fromOptions(oa: Option<`[`A`](from-options.html#A)`>, ob: Option<`[`B`](from-options.html#B)`>): Option<`[`Ior`](index.html)`<`[`A`](from-options.html#A)`, `[`B`](from-options.html#B)`>>`

Create an [Ior](index.html) from two Options if at least one of them is defined.

### Parameters

`oa` - an element (optional) for the left side of the [Ior](index.html)

`ob` - an element (optional) for the right side of the [Ior](index.html)

**Return**
[None](#) if both [oa](from-options.html#arrow.data.Ior.Companion$fromOptions(arrow.core.Option((arrow.data.Ior.Companion.fromOptions.A)), arrow.core.Option((arrow.data.Ior.Companion.fromOptions.B)))/oa) and [ob](from-options.html#arrow.data.Ior.Companion$fromOptions(arrow.core.Option((arrow.data.Ior.Companion.fromOptions.A)), arrow.core.Option((arrow.data.Ior.Companion.fromOptions.B)))/ob) are [None](#). Otherwise [Some](#) wrapping
an [Ior.Left](-left/index.html), [Ior.Right](-right/index.html), or [Ior.Both](-both/index.html) if [oa](from-options.html#arrow.data.Ior.Companion$fromOptions(arrow.core.Option((arrow.data.Ior.Companion.fromOptions.A)), arrow.core.Option((arrow.data.Ior.Companion.fromOptions.B)))/oa), [ob](from-options.html#arrow.data.Ior.Companion$fromOptions(arrow.core.Option((arrow.data.Ior.Companion.fromOptions.A)), arrow.core.Option((arrow.data.Ior.Companion.fromOptions.B)))/ob), or both are defined (respectively).

