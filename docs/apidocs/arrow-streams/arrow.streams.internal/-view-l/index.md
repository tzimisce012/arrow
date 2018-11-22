---
title: ViewL - arrow-streams
---

[arrow-streams](../../index.html) / [arrow.streams.internal](../index.html) / [ViewL](./index.html)

# ViewL

`interface ViewL<F, out R>`

Emulated sealed trait. **Never extend this interface!**
Working with `ViewL` must be done using [ViewL.fold](../fold.html)

### Companion Object Functions

| [invoke](invoke.html) | `operator fun <F, R> invoke(free: `[`FreeC`](../-free-c/index.html)`<`[`F`](invoke.html#F)`, `[`R`](invoke.html#R)`>): `[`ViewL`](./index.html)`<`[`F`](invoke.html#F)`, `[`R`](invoke.html#R)`>` |

### Extension Functions

| [fold](../fold.html) | `fun <F, R, A> `[`ViewL`](./index.html)`<`[`F`](../fold.html#F)`, `[`R`](../fold.html#R)`>.fold(pure: (`[`R`](../fold.html#R)`) -> `[`A`](../fold.html#A)`, fail: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`A`](../fold.html#A)`, interrupted: (`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, Option<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>) -> `[`A`](../fold.html#A)`, view: (Kind<`[`F`](../fold.html#F)`, `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?>, (`[`Result`](../-free-c/-result/index.html)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?>) -> `[`FreeC`](../-free-c/index.html)`<`[`F`](../fold.html#F)`, `[`R`](../fold.html#R)`>) -> `[`A`](../fold.html#A)`): `[`A`](../fold.html#A) |

