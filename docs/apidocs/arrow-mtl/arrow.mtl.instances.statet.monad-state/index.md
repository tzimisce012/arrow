---
title: arrow.mtl.instances.statet.monadState - arrow-mtl
---

[arrow-mtl](../index.html) / [arrow.mtl.instances.statet.monadState](./index.html)

## Package arrow.mtl.instances.statet.monadState

### Extensions for External Classes

| [arrow.data.StateT](arrow.data.-state-t/index.html) |  |

### Functions

| [inspect](inspect.html) | `fun <F, S, A> inspect(f: (`[`S`](inspect.html#S)`) -> `[`A`](inspect.html#A)`, MF: Monad<`[`F`](inspect.html#F)`>): Kind<`[`S`](inspect.html#S)`, `[`A`](inspect.html#A)`>` |
| [modify](modify.html) | `fun <F, S> modify(f: (`[`S`](modify.html#S)`) -> `[`S`](modify.html#S)`, MF: Monad<`[`F`](modify.html#F)`>): Kind<`[`S`](modify.html#S)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [state](state.html) | `fun <F, S, A> state(f: (`[`S`](state.html#S)`) -> Tuple2<`[`S`](state.html#S)`, `[`A`](state.html#A)`>, MF: Monad<`[`F`](state.html#F)`>): Kind<`[`S`](state.html#S)`, `[`A`](state.html#A)`>` |

