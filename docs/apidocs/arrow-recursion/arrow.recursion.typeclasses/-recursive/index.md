---
title: Recursive - arrow-recursion
---

[arrow-recursion](../../index.html) / [arrow.recursion.typeclasses](../index.html) / [Recursive](./index.html)

# Recursive

`interface Recursive<T>`



Typeclass for types that can be generically folded with algebras.

### Functions

| [cata](cata.html) | `open fun <F, A> Functor<`[`F`](cata.html#F)`>.cata(tf: Kind<`[`T`](index.html#T)`, `[`F`](cata.html#F)`>, alg: `[`Algebra`](../../arrow.recursion/-algebra.html)`<`[`F`](cata.html#F)`, Eval<`[`A`](cata.html#A)`>>): `[`A`](cata.html#A)<br>Fold generalized over any recursive type. |
| [project](project.html) | `open fun <F> Functor<`[`F`](project.html#F)`>.project(): `[`Coalgebra`](../../arrow.recursion/-coalgebra.html)`<`[`F`](project.html#F)`, Kind<`[`T`](index.html#T)`, `[`F`](project.html#F)`>>`<br>Creates a coalgebra given a functor. |
| [projectT](project-t.html) | `abstract fun <F> Functor<`[`F`](project-t.html#F)`>.projectT(tf: Kind<`[`T`](index.html#T)`, `[`F`](project-t.html#F)`>): Kind<`[`F`](project-t.html#F)`, Kind<`[`T`](index.html#T)`, `[`F`](project-t.html#F)`>>`<br>Implementation for project. |

### Inheritors

| [Birecursive](../-birecursive.html) | `interface Birecursive<F> : `[`Recursive`](./index.html)`<`[`F`](../-birecursive.html#F)`>, `[`Corecursive`](../-corecursive/index.html)`<`[`F`](../-birecursive.html#F)`>`<br> |




## Type Class Hierarchy

<canvas id="arrow.recursion.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.recursion.typeclasses-hierarchy-diagram', 'arrow.recursion.typeclasses-diagram.nomnol')
</script>

