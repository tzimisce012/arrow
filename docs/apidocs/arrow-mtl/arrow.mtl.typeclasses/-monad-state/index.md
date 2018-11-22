---
title: MonadState - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.typeclasses](../index.html) / [MonadState](./index.html)

# MonadState

`interface MonadState<F, S> : Monad<`[`F`](index.html#F)`>`



### Functions

| [get](get.html) | `abstract fun get(): Kind<`[`F`](index.html#F)`, `[`S`](index.html#S)`>` |
| [inspect](inspect.html) | `open fun <A> inspect(f: (`[`S`](index.html#S)`) -> `[`A`](inspect.html#A)`): Kind<`[`F`](index.html#F)`, `[`A`](inspect.html#A)`>` |
| [modify](modify.html) | `open fun modify(f: (`[`S`](index.html#S)`) -> `[`S`](index.html#S)`): Kind<`[`F`](index.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [set](set.html) | `abstract fun set(s: `[`S`](index.html#S)`): Kind<`[`F`](index.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [state](state.html) | `open fun <A> state(f: (`[`S`](index.html#S)`) -> Tuple2<`[`S`](index.html#S)`, `[`A`](state.html#A)`>): Kind<`[`F`](index.html#F)`, `[`A`](state.html#A)`>` |

### Inheritors

| [StateTMonadStateInstance](../../arrow.mtl.instances/-state-t-monad-state-instance/index.html) | `interface StateTMonadStateInstance<F, S> : `[`MonadState`](./index.html)`<StateTPartialOf<`[`F`](../../arrow.mtl.instances/-state-t-monad-state-instance/index.html#F)`, `[`S`](../../arrow.mtl.instances/-state-t-monad-state-instance/index.html#S)`>, `[`S`](../../arrow.mtl.instances/-state-t-monad-state-instance/index.html#S)`>, StateTMonadInstance<`[`F`](../../arrow.mtl.instances/-state-t-monad-state-instance/index.html#F)`, `[`S`](../../arrow.mtl.instances/-state-t-monad-state-instance/index.html#S)`>` |




## Type Class Hierarchy

<canvas id="arrow.mtl.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.mtl.typeclasses-hierarchy-diagram', 'arrow.mtl.typeclasses-diagram.nomnol')
</script>

