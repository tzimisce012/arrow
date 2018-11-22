---
title: Birecursive - arrow-recursion
---

[arrow-recursion](../index.html) / [arrow.recursion.typeclasses](index.html) / [Birecursive](./-birecursive.html)

# Birecursive

`interface Birecursive<F> : `[`Recursive`](-recursive/index.html)`<`[`F`](-birecursive.html#F)`>, `[`Corecursive`](-corecursive/index.html)`<`[`F`](-birecursive.html#F)`>`



Typeclass for types that can be generically folded and unfolded with algebras and coalgebras.

### Inherited Functions

| [ana](-corecursive/ana.html) | `open fun <F, A> Functor<`[`F`](-corecursive/ana.html#F)`>.ana(a: `[`A`](-corecursive/ana.html#A)`, coalg: `[`Coalgebra`](../arrow.recursion/-coalgebra.html)`<`[`F`](-corecursive/ana.html#F)`, `[`A`](-corecursive/ana.html#A)`>): Kind<`[`T`](-corecursive/index.html#T)`, `[`F`](-corecursive/ana.html#F)`>`<br>Unfold into any recursive type. |
| [cata](-recursive/cata.html) | `open fun <F, A> Functor<`[`F`](-recursive/cata.html#F)`>.cata(tf: Kind<`[`T`](-recursive/index.html#T)`, `[`F`](-recursive/cata.html#F)`>, alg: `[`Algebra`](../arrow.recursion/-algebra.html)`<`[`F`](-recursive/cata.html#F)`, Eval<`[`A`](-recursive/cata.html#A)`>>): `[`A`](-recursive/cata.html#A)<br>Fold generalized over any recursive type. |
| [embed](-corecursive/embed.html) | `open fun <F> Functor<`[`F`](-corecursive/embed.html#F)`>.embed(): `[`Algebra`](../arrow.recursion/-algebra.html)`<`[`F`](-corecursive/embed.html#F)`, Eval<Kind<`[`T`](-corecursive/index.html#T)`, `[`F`](-corecursive/embed.html#F)`>>>`<br>Creates a algebra given a functor. |
| [embedT](-corecursive/embed-t.html) | `abstract fun <F> Functor<`[`F`](-corecursive/embed-t.html#F)`>.embedT(tf: Kind<`[`F`](-corecursive/embed-t.html#F)`, Eval<Kind<`[`T`](-corecursive/index.html#T)`, `[`F`](-corecursive/embed-t.html#F)`>>>): Eval<Kind<`[`T`](-corecursive/index.html#T)`, `[`F`](-corecursive/embed-t.html#F)`>>`<br>Implementation for embed. |
| [project](-recursive/project.html) | `open fun <F> Functor<`[`F`](-recursive/project.html#F)`>.project(): `[`Coalgebra`](../arrow.recursion/-coalgebra.html)`<`[`F`](-recursive/project.html#F)`, Kind<`[`T`](-recursive/index.html#T)`, `[`F`](-recursive/project.html#F)`>>`<br>Creates a coalgebra given a functor. |
| [projectT](-recursive/project-t.html) | `abstract fun <F> Functor<`[`F`](-recursive/project-t.html#F)`>.projectT(tf: Kind<`[`T`](-recursive/index.html#T)`, `[`F`](-recursive/project-t.html#F)`>): Kind<`[`F`](-recursive/project-t.html#F)`, Kind<`[`T`](-recursive/index.html#T)`, `[`F`](-recursive/project-t.html#F)`>>`<br>Implementation for project. |




## Type Class Hierarchy

<canvas id="arrow.recursion.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.recursion.typeclasses-hierarchy-diagram', 'arrow.recursion.typeclasses-diagram.nomnol')
</script>

