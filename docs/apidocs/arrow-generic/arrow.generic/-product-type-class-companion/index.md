---
title: ProductTypeClassCompanion - arrow-generic
---

[arrow-generic](../../index.html) / [arrow.generic](../index.html) / [ProductTypeClassCompanion](./index.html)

# ProductTypeClassCompanion

`interface ProductTypeClassCompanion<C>`

### Properties

| [typeClass](type-class.html) | `abstract val typeClass: `[`ProductTypeClass`](../-product-type-class/index.html)`<`[`C`](index.html#C)`>` |

### Functions

| [deriveHCons](derive-h-cons.html) | `open fun <H, T : `[`HList`](../-h-list/index.html)`> deriveHCons(ch: Kind<`[`C`](index.html#C)`, `[`H`](derive-h-cons.html#H)`>, ct: Kind<`[`C`](index.html#C)`, `[`T`](derive-h-cons.html#T)`>): Kind<`[`C`](index.html#C)`, `[`HCons`](../-h-cons/index.html)`<`[`H`](derive-h-cons.html#H)`, `[`T`](derive-h-cons.html#T)`>>` |
| [deriveHNil](derive-h-nil.html) | `open fun deriveHNil(): Kind<`[`C`](index.html#C)`, `[`HNil`](../-h-nil/index.html)`>` |
| [deriveInstance](derive-instance.html) | `open fun <F, G> deriveInstance(gen: `[`Generic`](../-generic/index.html)`<`[`F`](derive-instance.html#F)`, `[`G`](derive-instance.html#G)`>, cg: Kind<`[`C`](index.html#C)`, `[`G`](derive-instance.html#G)`>): Kind<`[`C`](index.html#C)`, `[`F`](derive-instance.html#F)`>` |

