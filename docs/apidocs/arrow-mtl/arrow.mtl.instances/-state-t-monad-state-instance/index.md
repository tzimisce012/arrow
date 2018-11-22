---
title: StateTMonadStateInstance - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances](../index.html) / [StateTMonadStateInstance](./index.html)

# StateTMonadStateInstance

`@extension interface StateTMonadStateInstance<F, S> : `[`MonadState`](../../arrow.mtl.typeclasses/-monad-state/index.html)`<StateTPartialOf<`[`F`](index.html#F)`, `[`S`](index.html#S)`>, `[`S`](index.html#S)`>, StateTMonadInstance<`[`F`](index.html#F)`, `[`S`](index.html#S)`>`

### Functions

| [MF](-m-f.html) | `abstract fun MF(): Monad<`[`F`](index.html#F)`>` |
| [get](get.html) | `open fun get(): StateT<`[`F`](index.html#F)`, `[`S`](index.html#S)`, `[`S`](index.html#S)`>` |
| [set](set.html) | `open fun set(s: `[`S`](index.html#S)`): StateT<`[`F`](index.html#F)`, `[`S`](index.html#S)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |

### Inherited Functions

| [inspect](../../arrow.mtl.typeclasses/-monad-state/inspect.html) | `open fun <A> inspect(f: (`[`S`](../../arrow.mtl.typeclasses/-monad-state/index.html#S)`) -> `[`A`](../../arrow.mtl.typeclasses/-monad-state/inspect.html#A)`): Kind<`[`F`](../../arrow.mtl.typeclasses/-monad-state/index.html#F)`, `[`A`](../../arrow.mtl.typeclasses/-monad-state/inspect.html#A)`>` |
| [modify](../../arrow.mtl.typeclasses/-monad-state/modify.html) | `open fun modify(f: (`[`S`](../../arrow.mtl.typeclasses/-monad-state/index.html#S)`) -> `[`S`](../../arrow.mtl.typeclasses/-monad-state/index.html#S)`): Kind<`[`F`](../../arrow.mtl.typeclasses/-monad-state/index.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [state](../../arrow.mtl.typeclasses/-monad-state/state.html) | `open fun <A> state(f: (`[`S`](../../arrow.mtl.typeclasses/-monad-state/index.html#S)`) -> Tuple2<`[`S`](../../arrow.mtl.typeclasses/-monad-state/index.html#S)`, `[`A`](../../arrow.mtl.typeclasses/-monad-state/state.html#A)`>): Kind<`[`F`](../../arrow.mtl.typeclasses/-monad-state/index.html#F)`, `[`A`](../../arrow.mtl.typeclasses/-monad-state/state.html#A)`>` |

### Inheritors

| [StateTMtlContext](../-state-t-mtl-context/index.html) | `class StateTMtlContext<F, S, E> : `[`StateTMonadStateInstance`](./index.html)`<`[`F`](../-state-t-mtl-context/index.html#F)`, `[`S`](../-state-t-mtl-context/index.html#S)`>, StateTMonadErrorInstance<`[`F`](../-state-t-mtl-context/index.html#F)`, `[`S`](../-state-t-mtl-context/index.html#S)`, `[`E`](../-state-t-mtl-context/index.html#E)`>` |

