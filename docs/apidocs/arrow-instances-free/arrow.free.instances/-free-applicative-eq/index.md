---
title: FreeApplicativeEq - arrow-instances-free
---

[arrow-instances-free](../../index.html) / [arrow.free.instances](../index.html) / [FreeApplicativeEq](./index.html)

# FreeApplicativeEq

`@extension interface FreeApplicativeEq<F, G, A> : Eq<Kind<FreeApplicativePartialOf<`[`F`](index.html#F)`>, `[`A`](index.html#A)`>>`

### Functions

| [FK](-f-k.html) | `abstract fun FK(): FunctionK<`[`F`](index.html#F)`, `[`G`](index.html#G)`>` |
| [MG](-m-g.html) | `abstract fun MG(): Monad<`[`G`](index.html#G)`>` |
| [eqv](eqv.html) | `open fun Kind<FreeApplicativePartialOf<`[`F`](index.html#F)`>, `[`A`](index.html#A)`>.eqv(b: Kind<FreeApplicativePartialOf<`[`F`](index.html#F)`>, `[`A`](index.html#A)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

