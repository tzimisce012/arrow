---
title: Corecursive - arrow-recursion
---

[arrow-recursion](../../index.html) / [arrow.recursion.typeclasses](../index.html) / [Corecursive](./index.html)

# Corecursive

`interface Corecursive<T>`



Typeclass for types that can be generically unfolded with coalgebras.

### Functions

| [ana](ana.html) | `open fun <F, A> Functor<`[`F`](ana.html#F)`>.ana(a: `[`A`](ana.html#A)`, coalg: `[`Coalgebra`](../../arrow.recursion/-coalgebra.html)`<`[`F`](ana.html#F)`, `[`A`](ana.html#A)`>): Kind<`[`T`](index.html#T)`, `[`F`](ana.html#F)`>`<br>Unfold into any recursive type. |
| [embed](embed.html) | `open fun <F> Functor<`[`F`](embed.html#F)`>.embed(): `[`Algebra`](../../arrow.recursion/-algebra.html)`<`[`F`](embed.html#F)`, Eval<Kind<`[`T`](index.html#T)`, `[`F`](embed.html#F)`>>>`<br>Creates a algebra given a functor. |
| [embedT](embed-t.html) | `abstract fun <F> Functor<`[`F`](embed-t.html#F)`>.embedT(tf: Kind<`[`F`](embed-t.html#F)`, Eval<Kind<`[`T`](index.html#T)`, `[`F`](embed-t.html#F)`>>>): Eval<Kind<`[`T`](index.html#T)`, `[`F`](embed-t.html#F)`>>`<br>Implementation for embed. |

### Inheritors

| [Birecursive](../-birecursive.html) | `interface Birecursive<F> : `[`Recursive`](../-recursive/index.html)`<`[`F`](../-birecursive.html#F)`>, `[`Corecursive`](./index.html)`<`[`F`](../-birecursive.html#F)`>`<br> |




## Type Class Hierarchy

<canvas id="arrow.recursion.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.recursion.typeclasses-hierarchy-diagram', 'arrow.recursion.typeclasses-diagram.nomnol')
</script>

