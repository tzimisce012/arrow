---
title: KleisliContext - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [KleisliContext](./index.html)

# KleisliContext

`class KleisliContext<F, D, E> : `[`KleisliMonadErrorInstance`](../-kleisli-monad-error-instance/index.html)`<`[`F`](index.html#F)`, `[`D`](index.html#D)`, `[`E`](index.html#E)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `KleisliContext(ME: MonadError<`[`F`](index.html#F)`, `[`E`](index.html#E)`>)` |

### Properties

| [ME](-m-e.html) | `val ME: MonadError<`[`F`](index.html#F)`, `[`E`](index.html#E)`>` |

### Functions

| [ME](-m-e.html) | `fun ME(): MonadError<`[`F`](index.html#F)`, `[`E`](index.html#E)`>` |

### Inherited Functions

| [AE](../-kleisli-monad-error-instance/-a-e.html) | `open fun AE(): ApplicativeError<`[`F`](../-kleisli-monad-error-instance/index.html#F)`, `[`E`](../-kleisli-monad-error-instance/index.html#E)`>` |
| [AF](../-kleisli-monad-error-instance/-a-f.html) | `open fun AF(): Applicative<`[`F`](../-kleisli-monad-error-instance/index.html#F)`>` |
| [MF](../-kleisli-monad-error-instance/-m-f.html) | `open fun MF(): Monad<`[`F`](../-kleisli-monad-error-instance/index.html#F)`>` |

