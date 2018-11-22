---
title: FreeCEq - arrow-streams
---

[arrow-streams](../../index.html) / [arrow.streams.internal](../index.html) / [FreeCEq](./index.html)

# FreeCEq

`@extension interface FreeCEq<F, G, A> : Eq<Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`A`](index.html#A)`>>`

### Functions

| [EQFA](-e-q-f-a.html) | `abstract fun EQFA(): Eq<Kind<`[`G`](index.html#G)`, Option<`[`A`](index.html#A)`>>>` |
| [FK](-f-k.html) | `abstract fun FK(): FunctionK<`[`F`](index.html#F)`, `[`G`](index.html#G)`>` |
| [ME](-m-e.html) | `abstract fun ME(): MonadError<`[`G`](index.html#G)`, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>` |
| [eqv](eqv.html) | `open fun Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`A`](index.html#A)`>.eqv(b: Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`A`](index.html#A)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

