---
title: arrow.mtl.typeclasses - arrow-mtl
---

[arrow-mtl](../index.html) / [arrow.mtl.typeclasses](./index.html)

## Package arrow.mtl.typeclasses

### Types

| [FunctorFilter](-functor-filter/index.html) | `interface FunctorFilter<F> : Functor<`[`F`](-functor-filter/index.html#F)`>`<br> |
| [MonadCombine](-monad-combine/index.html) | `interface MonadCombine<F> : `[`MonadFilter`](-monad-filter/index.html)`<`[`F`](-monad-combine/index.html#F)`>, Alternative<`[`F`](-monad-combine/index.html#F)`>`<br> |
| [MonadFilter](-monad-filter/index.html) | `interface MonadFilter<F> : Monad<`[`F`](-monad-filter/index.html#F)`>, `[`FunctorFilter`](-functor-filter/index.html)`<`[`F`](-monad-filter/index.html#F)`>`<br> |
| [MonadFilterContinuation](-monad-filter-continuation/index.html) | `open class MonadFilterContinuation<F, A> : MonadContinuation<`[`F`](-monad-filter-continuation/index.html#F)`, `[`A`](-monad-filter-continuation/index.html#A)`>` |
| [MonadReader](-monad-reader/index.html) | `interface MonadReader<F, D> : Monad<`[`F`](-monad-reader/index.html#F)`>`<br> |
| [MonadState](-monad-state/index.html) | `interface MonadState<F, S> : Monad<`[`F`](-monad-state/index.html#F)`>`<br> |
| [MonadWriter](-monad-writer/index.html) | `interface MonadWriter<F, W> : Monad<`[`F`](-monad-writer/index.html#F)`>`<br> A monad that support monoidal accumulation (e.g. logging List of String) |
| [TraverseFilter](-traverse-filter/index.html) | `interface TraverseFilter<F> : Traverse<`[`F`](-traverse-filter/index.html#F)`>, `[`FunctorFilter`](-functor-filter/index.html)`<`[`F`](-traverse-filter/index.html#F)`>`<br> |




## Type Class Hierarchy

<canvas id="arrow.mtl.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.mtl.typeclasses-hierarchy-diagram', 'arrow.mtl.typeclasses-diagram.nomnol')
</script>

