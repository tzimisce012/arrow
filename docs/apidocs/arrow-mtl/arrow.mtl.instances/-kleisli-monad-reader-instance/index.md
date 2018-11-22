---
title: KleisliMonadReaderInstance - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances](../index.html) / [KleisliMonadReaderInstance](./index.html)

# KleisliMonadReaderInstance

`@extension interface KleisliMonadReaderInstance<F, D> : `[`MonadReader`](../../arrow.mtl.typeclasses/-monad-reader/index.html)`<KleisliPartialOf<`[`F`](index.html#F)`, `[`D`](index.html#D)`>, `[`D`](index.html#D)`>, KleisliMonadInstance<`[`F`](index.html#F)`, `[`D`](index.html#D)`>`

### Functions

| [MF](-m-f.html) | `abstract fun MF(): Monad<`[`F`](index.html#F)`>` |
| [ask](ask.html) | `open fun ask(): Kleisli<`[`F`](index.html#F)`, `[`D`](index.html#D)`, `[`D`](index.html#D)`>`<br>Get the environment |
| [local](local.html) | `open fun <A> Kind<KleisliPartialOf<`[`F`](index.html#F)`, `[`D`](index.html#D)`>, `[`A`](local.html#A)`>.local(f: (`[`D`](index.html#D)`) -> `[`D`](index.html#D)`): Kleisli<`[`F`](index.html#F)`, `[`D`](index.html#D)`, `[`A`](local.html#A)`>`<br>Modify the environment |

### Inherited Functions

| [reader](../../arrow.mtl.typeclasses/-monad-reader/reader.html) | `open fun <A> reader(f: (`[`D`](../../arrow.mtl.typeclasses/-monad-reader/index.html#D)`) -> `[`A`](../../arrow.mtl.typeclasses/-monad-reader/reader.html#A)`): Kind<`[`F`](../../arrow.mtl.typeclasses/-monad-reader/index.html#F)`, `[`A`](../../arrow.mtl.typeclasses/-monad-reader/reader.html#A)`>`<br>Retrieves a function of the environment |

### Inheritors

| [KleisliMtlContext](../-kleisli-mtl-context/index.html) | `class KleisliMtlContext<F, D, E> : `[`KleisliMonadReaderInstance`](./index.html)`<`[`F`](../-kleisli-mtl-context/index.html#F)`, `[`D`](../-kleisli-mtl-context/index.html#D)`>, KleisliMonadErrorInstance<`[`F`](../-kleisli-mtl-context/index.html#F)`, `[`D`](../-kleisli-mtl-context/index.html#D)`, `[`E`](../-kleisli-mtl-context/index.html#E)`>` |

