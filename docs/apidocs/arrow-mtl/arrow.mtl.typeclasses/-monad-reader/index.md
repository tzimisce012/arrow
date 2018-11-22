---
title: MonadReader - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.typeclasses](../index.html) / [MonadReader](./index.html)

# MonadReader

`interface MonadReader<F, D> : Monad<`[`F`](index.html#F)`>`



### Functions

| [ask](ask.html) | `abstract fun ask(): Kind<`[`F`](index.html#F)`, `[`D`](index.html#D)`>`<br>Get the environment |
| [local](local.html) | `abstract fun <A> Kind<`[`F`](index.html#F)`, `[`A`](local.html#A)`>.local(f: (`[`D`](index.html#D)`) -> `[`D`](index.html#D)`): Kind<`[`F`](index.html#F)`, `[`A`](local.html#A)`>`<br>Modify the environment |
| [reader](reader.html) | `open fun <A> reader(f: (`[`D`](index.html#D)`) -> `[`A`](reader.html#A)`): Kind<`[`F`](index.html#F)`, `[`A`](reader.html#A)`>`<br>Retrieves a function of the environment |

### Inheritors

| [Function1MonadReaderInstance](../../arrow.mtl.instances/-function1-monad-reader-instance/index.html) | `interface Function1MonadReaderInstance<I> : `[`MonadReader`](./index.html)`<Function1PartialOf<`[`I`](../../arrow.mtl.instances/-function1-monad-reader-instance/index.html#I)`>, `[`I`](../../arrow.mtl.instances/-function1-monad-reader-instance/index.html#I)`>, Function1MonadInstance<`[`I`](../../arrow.mtl.instances/-function1-monad-reader-instance/index.html#I)`>` |
| [KleisliMonadReaderInstance](../../arrow.mtl.instances/-kleisli-monad-reader-instance/index.html) | `interface KleisliMonadReaderInstance<F, D> : `[`MonadReader`](./index.html)`<KleisliPartialOf<`[`F`](../../arrow.mtl.instances/-kleisli-monad-reader-instance/index.html#F)`, `[`D`](../../arrow.mtl.instances/-kleisli-monad-reader-instance/index.html#D)`>, `[`D`](../../arrow.mtl.instances/-kleisli-monad-reader-instance/index.html#D)`>, KleisliMonadInstance<`[`F`](../../arrow.mtl.instances/-kleisli-monad-reader-instance/index.html#F)`, `[`D`](../../arrow.mtl.instances/-kleisli-monad-reader-instance/index.html#D)`>` |




## Type Class Hierarchy

<canvas id="arrow.mtl.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.mtl.typeclasses-hierarchy-diagram', 'arrow.mtl.typeclasses-diagram.nomnol')
</script>

