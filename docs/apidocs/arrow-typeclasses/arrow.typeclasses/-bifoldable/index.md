---
title: Bifoldable - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Bifoldable](./index.html)

# Bifoldable

`interface Bifoldable<F>`



### Functions

| [bifoldLeft](bifold-left.html) | `abstract fun <A, B, C> Kind2<`[`F`](index.html#F)`, `[`A`](bifold-left.html#A)`, `[`B`](bifold-left.html#B)`>.bifoldLeft(c: `[`C`](bifold-left.html#C)`, f: (`[`C`](bifold-left.html#C)`, `[`A`](bifold-left.html#A)`) -> `[`C`](bifold-left.html#C)`, g: (`[`C`](bifold-left.html#C)`, `[`B`](bifold-left.html#B)`) -> `[`C`](bifold-left.html#C)`): `[`C`](bifold-left.html#C) |
| [bifoldMap](bifold-map.html) | `open fun <A, B, C> Kind2<`[`F`](index.html#F)`, `[`A`](bifold-map.html#A)`, `[`B`](bifold-map.html#B)`>.bifoldMap(MN: `[`Monoid`](../-monoid/index.html)`<`[`C`](bifold-map.html#C)`>, f: (`[`A`](bifold-map.html#A)`) -> `[`C`](bifold-map.html#C)`, g: (`[`B`](bifold-map.html#B)`) -> `[`C`](bifold-map.html#C)`): `[`C`](bifold-map.html#C) |
| [bifoldRight](bifold-right.html) | `abstract fun <A, B, C> Kind2<`[`F`](index.html#F)`, `[`A`](bifold-right.html#A)`, `[`B`](bifold-right.html#B)`>.bifoldRight(c: Eval<`[`C`](bifold-right.html#C)`>, f: (`[`A`](bifold-right.html#A)`, Eval<`[`C`](bifold-right.html#C)`>) -> Eval<`[`C`](bifold-right.html#C)`>, g: (`[`B`](bifold-right.html#B)`, Eval<`[`C`](bifold-right.html#C)`>) -> Eval<`[`C`](bifold-right.html#C)`>): Eval<`[`C`](bifold-right.html#C)`>` |

### Extension Functions

| [compose](../compose.html) | `fun <F, G> `[`Bifoldable`](./index.html)`<`[`F`](../compose.html#F)`>.compose(BG: `[`Bifoldable`](./index.html)`<`[`G`](../compose.html#G)`>): `[`Bifoldable`](./index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>` |

### Inheritors

| [ComposedBifoldable](../-composed-bifoldable/index.html) | `interface ComposedBifoldable<F, G> : `[`Bifoldable`](./index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../-composed-bifoldable/index.html#F)`, `[`G`](../-composed-bifoldable/index.html#G)`>>` |




## Type Class Hierarchy

<canvas id="arrow.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.typeclasses-hierarchy-diagram', 'arrow.typeclasses-diagram.nomnol')
</script>

