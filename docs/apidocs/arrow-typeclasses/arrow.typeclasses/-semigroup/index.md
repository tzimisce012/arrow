---
title: Semigroup - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Semigroup](./index.html)

# Semigroup

`interface Semigroup<A>`



### Functions

| [combine](combine.html) | `abstract fun `[`A`](index.html#A)`.combine(b: `[`A`](index.html#A)`): `[`A`](index.html#A)<br>Combine two [A](index.html#A) values. |
| [maybeCombine](maybe-combine.html) | `open fun `[`A`](index.html#A)`.maybeCombine(b: `[`A`](index.html#A)`?): `[`A`](index.html#A) |
| [plus](plus.html) | `open operator fun `[`A`](index.html#A)`.plus(b: `[`A`](index.html#A)`): `[`A`](index.html#A) |

### Inheritors

| [Monoid](../-monoid/index.html) | `interface Monoid<A> : `[`Semigroup`](./index.html)`<`[`A`](../-monoid/index.html#A)`>, `[`MonoidOf`](../-monoid-of.html)`<`[`A`](../-monoid/index.html#A)`>`<br> |




## Type Class Hierarchy

<canvas id="arrow.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.typeclasses-hierarchy-diagram', 'arrow.typeclasses-diagram.nomnol')
</script>

