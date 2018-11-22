---
title: MonadCombine - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.typeclasses](../index.html) / [MonadCombine](./index.html)

# MonadCombine

`interface MonadCombine<F> : `[`MonadFilter`](../-monad-filter/index.html)`<`[`F`](index.html#F)`>, Alternative<`[`F`](index.html#F)`>`



### Functions

| [separate](separate.html) | `open fun <G, A, B> Kind<`[`F`](index.html#F)`, Kind2<`[`G`](separate.html#G)`, `[`A`](separate.html#A)`, `[`B`](separate.html#B)`>>.separate(BFG: Bifoldable<`[`G`](separate.html#G)`>): Tuple2<Kind<`[`F`](index.html#F)`, `[`A`](separate.html#A)`>, Kind<`[`F`](index.html#F)`, `[`B`](separate.html#B)`>>` |
| [unite](unite.html) | `open fun <G, A> Kind<`[`F`](index.html#F)`, Kind<`[`G`](unite.html#G)`, `[`A`](unite.html#A)`>>.unite(FG: Foldable<`[`G`](unite.html#G)`>): Kind<`[`F`](index.html#F)`, `[`A`](unite.html#A)`>` |

### Inherited Functions

| [bindingFilter](../-monad-filter/binding-filter.html) | `open fun <B> bindingFilter(c: suspend `[`MonadFilterContinuation`](../-monad-filter-continuation/index.html)`<`[`F`](../-monad-filter/index.html#F)`, *>.() -> `[`B`](../-monad-filter/binding-filter.html#B)`): Kind<`[`F`](../-monad-filter/index.html#F)`, `[`B`](../-monad-filter/binding-filter.html#B)`>`<br>Entry point for monad bindings which enables for comprehension. The underlying impl is based on coroutines. A coroutine is initiated and inside [MonadContinuation](#) suspended yielding to [flatMap](#). Once all the flatMap binds are completed the underlying monad is returned from the act of executing the coroutine |
| [empty](../-monad-filter/empty.html) | `abstract fun <A> empty(): Kind<`[`F`](../-monad-filter/index.html#F)`, `[`A`](../-monad-filter/empty.html#A)`>` |
| [mapFilter](../-monad-filter/map-filter.html) | `open fun <A, B> Kind<`[`F`](../-monad-filter/index.html#F)`, `[`A`](../-monad-filter/map-filter.html#A)`>.mapFilter(f: (`[`A`](../-monad-filter/map-filter.html#A)`) -> Option<`[`B`](../-monad-filter/map-filter.html#B)`>): Kind<`[`F`](../-monad-filter/index.html#F)`, `[`B`](../-monad-filter/map-filter.html#B)`>`<br>A combined map and filter. Filtering is handled via Option instead of Boolean such that the output type B can be different than the input type A. |

### Inheritors

| [ListKMonadCombineInstance](../../arrow.mtl.instances/-list-k-monad-combine-instance/index.html) | `interface ListKMonadCombineInstance : `[`MonadCombine`](./index.html)`<ForListK>` |
| [OptionMonadCombineInstance](../../arrow.mtl.instances/-option-monad-combine-instance/index.html) | `interface OptionMonadCombineInstance : `[`MonadCombine`](./index.html)`<ForOption>` |
| [SequenceKMonadCombineInstance](../../arrow.mtl.instances/-sequence-k-monad-combine-instance/index.html) | `interface SequenceKMonadCombineInstance : `[`MonadCombine`](./index.html)`<ForSequenceK>` |
| [StateTMonadCombineInstance](../../arrow.mtl.instances/-state-t-monad-combine-instance/index.html) | `interface StateTMonadCombineInstance<F, S> : `[`MonadCombine`](./index.html)`<StateTPartialOf<`[`F`](../../arrow.mtl.instances/-state-t-monad-combine-instance/index.html#F)`, `[`S`](../../arrow.mtl.instances/-state-t-monad-combine-instance/index.html#S)`>>, StateTMonadInstance<`[`F`](../../arrow.mtl.instances/-state-t-monad-combine-instance/index.html#F)`, `[`S`](../../arrow.mtl.instances/-state-t-monad-combine-instance/index.html#S)`>, StateTSemigroupKInstance<`[`F`](../../arrow.mtl.instances/-state-t-monad-combine-instance/index.html#F)`, `[`S`](../../arrow.mtl.instances/-state-t-monad-combine-instance/index.html#S)`>` |




## Type Class Hierarchy

<canvas id="arrow.mtl.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.mtl.typeclasses-hierarchy-diagram', 'arrow.mtl.typeclasses-diagram.nomnol')
</script>

