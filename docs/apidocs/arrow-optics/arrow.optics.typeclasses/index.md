---
title: arrow.optics.typeclasses - arrow-optics
---

[arrow-optics](../index.html) / [arrow.optics.typeclasses](./index.html)

## Package arrow.optics.typeclasses

### Types

| [At](-at/index.html) | `interface At<S, I, A>`<br> |
| [Cons](-cons/index.html) | `interface Cons<S, A>`<br> |
| [Each](-each/index.html) | `interface Each<S, A>`<br> |
| [FilterIndex](-filter-index/index.html) | `interface FilterIndex<S, I, A>`<br> |
| [Index](-index/index.html) | `interface Index<S, I, A>`<br> |
| [Snoc](-snoc/index.html) | `interface Snoc<S, A>`<br> |

### Type Aliases

| [Conj](-conj.html) | `typealias Conj<S, A> = `[`Snoc`](-snoc/index.html)`<`[`S`](-conj.html#S)`, `[`A`](-conj.html#A)`>` |

### Functions

| [remove](remove.html) | `fun <S, I, A> `[`At`](-at/index.html)`<`[`S`](remove.html#S)`, `[`I`](remove.html#I)`, Option<`[`A`](remove.html#A)`>>.remove(s: `[`S`](remove.html#S)`, i: `[`I`](remove.html#I)`): `[`S`](remove.html#S)<br>Delete a value associated with a key in a Map-like container`fun <S, I, A> `[`At`](-at/index.html)`<`[`S`](remove.html#S)`, `[`I`](remove.html#I)`, Option<`[`A`](remove.html#A)`>>.remove(i: `[`I`](remove.html#I)`): (`[`S`](remove.html#S)`) -> `[`S`](remove.html#S)<br>Lift deletion of a value associated with a key in a Map-like container |




## Type Class Hierarchy

<canvas id="arrow.optics.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.optics.typeclasses-hierarchy-diagram', 'arrow.optics.typeclasses-diagram.nomnol')
</script>

