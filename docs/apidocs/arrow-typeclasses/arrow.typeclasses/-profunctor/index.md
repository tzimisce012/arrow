---
title: Profunctor - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Profunctor](./index.html)

# Profunctor

`interface Profunctor<F>`



### Functions

| [dimap](dimap.html) | `abstract fun <A, B, C, D> Kind2<`[`F`](index.html#F)`, `[`A`](dimap.html#A)`, `[`B`](dimap.html#B)`>.dimap(fl: (`[`C`](dimap.html#C)`) -> `[`A`](dimap.html#A)`, fr: (`[`B`](dimap.html#B)`) -> `[`D`](dimap.html#D)`): Kind2<`[`F`](index.html#F)`, `[`C`](dimap.html#C)`, `[`D`](dimap.html#D)`>` |
| [lmap](lmap.html) | `open fun <A, B, C> Kind2<`[`F`](index.html#F)`, `[`A`](lmap.html#A)`, `[`B`](lmap.html#B)`>.lmap(f: (`[`C`](lmap.html#C)`) -> `[`A`](lmap.html#A)`): Kind2<`[`F`](index.html#F)`, `[`C`](lmap.html#C)`, `[`B`](lmap.html#B)`>` |
| [rmap](rmap.html) | `open fun <A, B, D> Kind2<`[`F`](index.html#F)`, `[`A`](rmap.html#A)`, `[`B`](rmap.html#B)`>.rmap(f: (`[`B`](rmap.html#B)`) -> `[`D`](rmap.html#D)`): Kind2<`[`F`](index.html#F)`, `[`A`](rmap.html#A)`, `[`D`](rmap.html#D)`>` |




## Type Class Hierarchy

<canvas id="arrow.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.typeclasses-hierarchy-diagram', 'arrow.typeclasses-diagram.nomnol')
</script>

