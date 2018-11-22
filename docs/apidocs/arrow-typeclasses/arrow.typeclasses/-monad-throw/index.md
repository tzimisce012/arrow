---
title: MonadThrow - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [MonadThrow](./index.html)

# MonadThrow

`interface MonadThrow<F> : `[`MonadError`](../-monad-error/index.html)`<`[`F`](index.html#F)`, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>`

### Functions

| [bindingCatch](binding-catch.html) | `open fun <B> bindingCatch(c: suspend `[`MonadErrorContinuation`](../-monad-error-continuation/index.html)`<`[`F`](index.html#F)`, *>.() -> `[`B`](binding-catch.html#B)`): Kind<`[`F`](index.html#F)`, `[`B`](binding-catch.html#B)`>`<br>Entry point for monad bindings which enables for comprehensions. The underlying implementation is based on coroutines. A coroutine is initiated and suspended inside [MonadErrorContinuation](../-monad-error-continuation/index.html) yielding to [Monad.flatMap](../-monad/flat-map.html). Once all the flatMap binds are completed the underlying monad is returned from the act of executing the coroutine |

### Inherited Functions

| [ensure](../-monad-error/ensure.html) | `open fun <A> Kind<`[`F`](../-monad-error/index.html#F)`, `[`A`](../-monad-error/ensure.html#A)`>.ensure(error: () -> `[`E`](../-monad-error/index.html#E)`, predicate: (`[`A`](../-monad-error/ensure.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): Kind<`[`F`](../-monad-error/index.html#F)`, `[`A`](../-monad-error/ensure.html#A)`>` |

### Extension Functions

| [compose](../compose.html) | `fun <F, G> `[`Invariant`](../-invariant/index.html)`<`[`F`](../compose.html#F)`>.compose(GF: `[`Invariant`](../-invariant/index.html)`<`[`G`](../compose.html#G)`>): `[`Invariant`](../-invariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>`<br>`fun <F, G> `[`Functor`](../-functor/index.html)`<`[`F`](../compose.html#F)`>.compose(GF: `[`Functor`](../-functor/index.html)`<`[`G`](../compose.html#G)`>): `[`Functor`](../-functor/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>`<br>`fun <F, G> `[`Applicative`](../-applicative/index.html)`<`[`F`](../compose.html#F)`>.compose(GA: `[`Applicative`](../-applicative/index.html)`<`[`G`](../compose.html#G)`>): `[`Applicative`](../-applicative/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>` |
| [composeContravariant](../compose-contravariant.html) | `fun <F, G> `[`Invariant`](../-invariant/index.html)`<`[`F`](../compose-contravariant.html#F)`>.composeContravariant(GF: `[`Contravariant`](../-contravariant/index.html)`<`[`G`](../compose-contravariant.html#G)`>): `[`Invariant`](../-invariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-contravariant.html#F)`, `[`G`](../compose-contravariant.html#G)`>>`<br>`fun <F, G> `[`Functor`](../-functor/index.html)`<`[`F`](../compose-contravariant.html#F)`>.composeContravariant(GF: `[`Contravariant`](../-contravariant/index.html)`<`[`G`](../compose-contravariant.html#G)`>): `[`Contravariant`](../-contravariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-contravariant.html#F)`, `[`G`](../compose-contravariant.html#G)`>>` |
| [composeFunctor](../compose-functor.html) | `fun <F, G> `[`Invariant`](../-invariant/index.html)`<`[`F`](../compose-functor.html#F)`>.composeFunctor(GF: `[`Functor`](../-functor/index.html)`<`[`G`](../compose-functor.html#G)`>): `[`Invariant`](../-invariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-functor.html#F)`, `[`G`](../compose-functor.html#G)`>>` |

