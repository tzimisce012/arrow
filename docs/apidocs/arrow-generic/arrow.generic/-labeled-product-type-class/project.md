---
title: LabeledProductTypeClass.project - arrow-generic
---

[arrow-generic](../../index.html) / [arrow.generic](../index.html) / [LabeledProductTypeClass](index.html) / [project](./project.html)

# project

`abstract fun <F, G> project(instance: () -> Kind<`[`C`](index.html#C)`, `[`G`](project.html#G)`>, to: (`[`F`](project.html#F)`) -> `[`G`](project.html#G)`, from: (`[`G`](project.html#G)`) -> `[`F`](project.html#F)`): Kind<`[`C`](index.html#C)`, `[`F`](project.html#F)`>`

Given an isomorphism between `F` and `G`, and a type class instance for `G`,
produce a type class instance for `F`.

