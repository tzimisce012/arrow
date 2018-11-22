---
title: Fiber - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects.typeclasses](../index.html) / [Fiber](./index.html)

# Fiber

`interface Fiber<F, A>`

[Fiber](./index.html) represents the pure result of an [Async](../-async/index.html) data type
being started concurrently and that can be either joined or canceled.

You can think of fibers as being lightweight threads, a fiber being a
concurrency primitive for doing cooperative multi-tasking.

### Properties

| [cancel](cancel.html) | `abstract val cancel: CancelToken<`[`F`](index.html#F)`>`<br>Triggers the cancellation of the fiber. |
| [join](join.html) | `abstract val join: Kind<`[`F`](index.html#F)`, `[`A`](index.html#A)`>`<br>Returns a new task that will await for the completion of the underlying fiber, (asynchronously) blocking the current run-loop until that result is available. |

### Functions

| [component1](component1.html) | `open operator fun component1(): Kind<`[`F`](index.html#F)`, `[`A`](index.html#A)`>` |
| [component2](component2.html) | `open operator fun component2(): CancelToken<`[`F`](index.html#F)`>` |

### Companion Object Functions

| [invoke](invoke.html) | `operator fun <F, A> invoke(join: Kind<`[`F`](invoke.html#F)`, `[`A`](invoke.html#A)`>, cancel: CancelToken<`[`F`](invoke.html#F)`>): `[`Fiber`](./index.html)`<`[`F`](invoke.html#F)`, `[`A`](invoke.html#A)`>`<br>[Fiber](./index.html) constructor. |

