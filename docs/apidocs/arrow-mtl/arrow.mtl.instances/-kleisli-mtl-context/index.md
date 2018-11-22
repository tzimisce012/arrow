---
title: KleisliMtlContext - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances](../index.html) / [KleisliMtlContext](./index.html)

# KleisliMtlContext

`class KleisliMtlContext<F, D, E> : `[`KleisliMonadReaderInstance`](../-kleisli-monad-reader-instance/index.html)`<`[`F`](index.html#F)`, `[`D`](index.html#D)`>, KleisliMonadErrorInstance<`[`F`](index.html#F)`, `[`D`](index.html#D)`, `[`E`](index.html#E)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `KleisliMtlContext(MF: MonadError<`[`F`](index.html#F)`, `[`E`](index.html#E)`>)` |

### Properties

| [MF](-m-f.html) | `val MF: MonadError<`[`F`](index.html#F)`, `[`E`](index.html#E)`>` |

### Functions

| [ME](-m-e.html) | `fun ME(): MonadError<`[`F`](index.html#F)`, `[`E`](index.html#E)`>` |
| [MF](-m-f.html) | `fun MF(): Monad<`[`F`](index.html#F)`>` |

### Inherited Functions

| [ask](../-kleisli-monad-reader-instance/ask.html) | `open fun ask(): Kleisli<`[`F`](../-kleisli-monad-reader-instance/index.html#F)`, `[`D`](../-kleisli-monad-reader-instance/index.html#D)`, `[`D`](../-kleisli-monad-reader-instance/index.html#D)`>`<br>Get the environment |
| [local](../-kleisli-monad-reader-instance/local.html) | `open fun <A> Kind<KleisliPartialOf<`[`F`](../-kleisli-monad-reader-instance/index.html#F)`, `[`D`](../-kleisli-monad-reader-instance/index.html#D)`>, `[`A`](../-kleisli-monad-reader-instance/local.html#A)`>.local(f: (`[`D`](../-kleisli-monad-reader-instance/index.html#D)`) -> `[`D`](../-kleisli-monad-reader-instance/index.html#D)`): Kleisli<`[`F`](../-kleisli-monad-reader-instance/index.html#F)`, `[`D`](../-kleisli-monad-reader-instance/index.html#D)`, `[`A`](../-kleisli-monad-reader-instance/local.html#A)`>`<br>Modify the environment |

