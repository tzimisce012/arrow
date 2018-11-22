---
title: StateTMtlContext - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances](../index.html) / [StateTMtlContext](./index.html)

# StateTMtlContext

`class StateTMtlContext<F, S, E> : `[`StateTMonadStateInstance`](../-state-t-monad-state-instance/index.html)`<`[`F`](index.html#F)`, `[`S`](index.html#S)`>, StateTMonadErrorInstance<`[`F`](index.html#F)`, `[`S`](index.html#S)`, `[`E`](index.html#E)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `StateTMtlContext(ME: MonadError<`[`F`](index.html#F)`, `[`E`](index.html#E)`>)` |

### Properties

| [ME](-m-e.html) | `val ME: MonadError<`[`F`](index.html#F)`, `[`E`](index.html#E)`>` |

### Functions

| [ME](-m-e.html) | `fun ME(): MonadError<`[`F`](index.html#F)`, `[`E`](index.html#E)`>` |
| [MF](-m-f.html) | `fun MF(): Monad<`[`F`](index.html#F)`>` |

### Inherited Functions

| [get](../-state-t-monad-state-instance/get.html) | `open fun get(): StateT<`[`F`](../-state-t-monad-state-instance/index.html#F)`, `[`S`](../-state-t-monad-state-instance/index.html#S)`, `[`S`](../-state-t-monad-state-instance/index.html#S)`>` |
| [set](../-state-t-monad-state-instance/set.html) | `open fun set(s: `[`S`](../-state-t-monad-state-instance/index.html#S)`): StateT<`[`F`](../-state-t-monad-state-instance/index.html#F)`, `[`S`](../-state-t-monad-state-instance/index.html#S)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |

