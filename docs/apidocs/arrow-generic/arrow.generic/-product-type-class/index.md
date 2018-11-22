---
title: ProductTypeClass - arrow-generic
---

[arrow-generic](../../index.html) / [arrow.generic](../index.html) / [ProductTypeClass](./index.html)

# ProductTypeClass

`interface ProductTypeClass<C>`

### Functions

| [emptyProduct](empty-product.html) | `abstract fun emptyProduct(): Kind<`[`C`](index.html#C)`, `[`HNil`](../-h-nil/index.html)`>`<br>The empty product. |
| [product](product.html) | `abstract fun <H, T : `[`HList`](../-h-list/index.html)`> product(ch: Kind<`[`C`](index.html#C)`, `[`H`](product.html#H)`>, ct: Kind<`[`C`](index.html#C)`, `[`T`](product.html#T)`>): Kind<`[`C`](index.html#C)`, `[`HCons`](../-h-cons/index.html)`<`[`H`](product.html#H)`, `[`T`](product.html#T)`>>`<br>Given a type class instance for `H`, and a type class instance for a product, produce a type class instance for the product prepended with `H`. |
| [project](project.html) | `abstract fun <F, G> project(instance: () -> Kind<`[`C`](index.html#C)`, `[`G`](project.html#G)`>, to: (`[`F`](project.html#F)`) -> `[`G`](project.html#G)`, from: (`[`G`](project.html#G)`) -> `[`F`](project.html#F)`): Kind<`[`C`](index.html#C)`, `[`F`](project.html#F)`>`<br>Given an isomorphism between `F` and `G`, and a type class instance for `G`, produce a type class instance for `F`. |

