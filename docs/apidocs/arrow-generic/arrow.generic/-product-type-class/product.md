---
title: ProductTypeClass.product - arrow-generic
---

[arrow-generic](../../index.html) / [arrow.generic](../index.html) / [ProductTypeClass](index.html) / [product](./product.html)

# product

`abstract fun <H, T : `[`HList`](../-h-list/index.html)`> product(ch: Kind<`[`C`](index.html#C)`, `[`H`](product.html#H)`>, ct: Kind<`[`C`](index.html#C)`, `[`T`](product.html#T)`>): Kind<`[`C`](index.html#C)`, `[`HCons`](../-h-cons/index.html)`<`[`H`](product.html#H)`, `[`T`](product.html#T)`>>`

Given a type class instance for `H`, and a type class instance for a
product, produce a type class instance for the product prepended with `H`.

