---
title: ComposedBifoldable - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [ComposedBifoldable](./index.html)

# ComposedBifoldable

`interface ComposedBifoldable<F, G> : `[`Bifoldable`](../-bifoldable/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`>>`

### Functions

| [F](-f.html) | `abstract fun F(): `[`Bifoldable`](../-bifoldable/index.html)`<`[`F`](index.html#F)`>` |
| [G](-g.html) | `abstract fun G(): `[`Bifoldable`](../-bifoldable/index.html)`<`[`G`](index.html#G)`>` |
| [bifoldLeft](bifold-left.html) | `open fun <A, B, C> `[`BinestedType`](../-binested-type.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](bifold-left.html#A)`, `[`B`](bifold-left.html#B)`>.bifoldLeft(c: `[`C`](bifold-left.html#C)`, f: (`[`C`](bifold-left.html#C)`, `[`A`](bifold-left.html#A)`) -> `[`C`](bifold-left.html#C)`, g: (`[`C`](bifold-left.html#C)`, `[`B`](bifold-left.html#B)`) -> `[`C`](bifold-left.html#C)`): `[`C`](bifold-left.html#C) |
| [bifoldLeftC](bifold-left-c.html) | `open fun <A, B, C> `[`BiunnestedType`](../-biunnested-type.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](bifold-left-c.html#A)`, `[`B`](bifold-left-c.html#B)`>.bifoldLeftC(c: `[`C`](bifold-left-c.html#C)`, f: (`[`C`](bifold-left-c.html#C)`, `[`A`](bifold-left-c.html#A)`) -> `[`C`](bifold-left-c.html#C)`, g: (`[`C`](bifold-left-c.html#C)`, `[`B`](bifold-left-c.html#B)`) -> `[`C`](bifold-left-c.html#C)`): `[`C`](bifold-left-c.html#C) |
| [bifoldRight](bifold-right.html) | `open fun <A, B, C> `[`BinestedType`](../-binested-type.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](bifold-right.html#A)`, `[`B`](bifold-right.html#B)`>.bifoldRight(c: Eval<`[`C`](bifold-right.html#C)`>, f: (`[`A`](bifold-right.html#A)`, Eval<`[`C`](bifold-right.html#C)`>) -> Eval<`[`C`](bifold-right.html#C)`>, g: (`[`B`](bifold-right.html#B)`, Eval<`[`C`](bifold-right.html#C)`>) -> Eval<`[`C`](bifold-right.html#C)`>): Eval<`[`C`](bifold-right.html#C)`>` |
| [bifoldRightC](bifold-right-c.html) | `open fun <A, B, C> `[`BiunnestedType`](../-biunnested-type.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](bifold-right-c.html#A)`, `[`B`](bifold-right-c.html#B)`>.bifoldRightC(c: Eval<`[`C`](bifold-right-c.html#C)`>, f: (`[`A`](bifold-right-c.html#A)`, Eval<`[`C`](bifold-right-c.html#C)`>) -> Eval<`[`C`](bifold-right-c.html#C)`>, g: (`[`B`](bifold-right-c.html#B)`, Eval<`[`C`](bifold-right-c.html#C)`>) -> Eval<`[`C`](bifold-right-c.html#C)`>): Eval<`[`C`](bifold-right-c.html#C)`>` |

### Inherited Functions

| [bifoldMap](../-bifoldable/bifold-map.html) | `open fun <A, B, C> Kind2<`[`F`](../-bifoldable/index.html#F)`, `[`A`](../-bifoldable/bifold-map.html#A)`, `[`B`](../-bifoldable/bifold-map.html#B)`>.bifoldMap(MN: `[`Monoid`](../-monoid/index.html)`<`[`C`](../-bifoldable/bifold-map.html#C)`>, f: (`[`A`](../-bifoldable/bifold-map.html#A)`) -> `[`C`](../-bifoldable/bifold-map.html#C)`, g: (`[`B`](../-bifoldable/bifold-map.html#B)`) -> `[`C`](../-bifoldable/bifold-map.html#C)`): `[`C`](../-bifoldable/bifold-map.html#C) |

### Companion Object Functions

| [invoke](invoke.html) | `operator fun <F, G> invoke(BF: `[`Bifoldable`](../-bifoldable/index.html)`<`[`F`](invoke.html#F)`>, BG: `[`Bifoldable`](../-bifoldable/index.html)`<`[`G`](invoke.html#G)`>): `[`ComposedBifoldable`](./index.html)`<`[`F`](invoke.html#F)`, `[`G`](invoke.html#G)`>` |

### Extension Functions

| [compose](../compose.html) | `fun <F, G> `[`Bifoldable`](../-bifoldable/index.html)`<`[`F`](../compose.html#F)`>.compose(BG: `[`Bifoldable`](../-bifoldable/index.html)`<`[`G`](../compose.html#G)`>): `[`Bifoldable`](../-bifoldable/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>` |

