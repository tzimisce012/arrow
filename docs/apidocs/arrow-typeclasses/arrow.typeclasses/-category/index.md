---
title: Category - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Category](./index.html)

# Category

`interface Category<F>`



### Functions

| [andThen](and-then.html) | `open fun <A, B, C> Kind2<`[`F`](index.html#F)`, `[`A`](and-then.html#A)`, `[`B`](and-then.html#B)`>.andThen(arr: Kind2<`[`F`](index.html#F)`, `[`B`](and-then.html#B)`, `[`C`](and-then.html#C)`>): Kind2<`[`F`](index.html#F)`, `[`A`](and-then.html#A)`, `[`C`](and-then.html#C)`>` |
| [compose](compose.html) | `abstract fun <A, B, C> Kind2<`[`F`](index.html#F)`, `[`B`](compose.html#B)`, `[`C`](compose.html#C)`>.compose(arr: Kind2<`[`F`](index.html#F)`, `[`A`](compose.html#A)`, `[`B`](compose.html#B)`>): Kind2<`[`F`](index.html#F)`, `[`A`](compose.html#A)`, `[`C`](compose.html#C)`>` |
| [id](id.html) | `abstract fun <A> id(): Kind2<`[`F`](index.html#F)`, `[`A`](id.html#A)`, `[`A`](id.html#A)`>` |




## Type Class Hierarchy

<canvas id="arrow.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.typeclasses-hierarchy-diagram', 'arrow.typeclasses-diagram.nomnol')
</script>

