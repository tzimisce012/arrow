---
title: MonadErrorContinuation - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [MonadErrorContinuation](./index.html)

# MonadErrorContinuation

`open class MonadErrorContinuation<F, A> : `[`MonadContinuation`](../-monad-continuation/index.html)`<`[`F`](index.html#F)`, `[`A`](index.html#A)`>, `[`MonadError`](../-monad-error/index.html)`<`[`F`](index.html#F)`, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `MonadErrorContinuation(ME: `[`MonadError`](../-monad-error/index.html)`<`[`F`](index.html#F)`, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, context: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)` = EmptyCoroutineContext)` |

### Properties

| [ME](-m-e.html) | `val ME: `[`MonadError`](../-monad-error/index.html)`<`[`F`](index.html#F)`, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>` |
| [context](context.html) | `open val context: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html) |

### Inherited Properties

| [returnedMonad](../-monad-continuation/returned-monad.html) | `lateinit var returnedMonad: Kind<`[`F`](../-monad-continuation/index.html#F)`, `[`A`](../-monad-continuation/index.html#A)`>` |

### Functions

| [resumeWithException](resume-with-exception.html) | `open fun resumeWithException(exception: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Inherited Functions

| [bind](../-monad-continuation/bind.html) | `suspend fun <B> Kind<`[`F`](../-monad-continuation/index.html#F)`, `[`B`](../-monad-continuation/bind.html#B)`>.bind(): `[`B`](../-monad-continuation/bind.html#B)<br>`open suspend fun <B> bind(m: () -> Kind<`[`F`](../-monad-continuation/index.html#F)`, `[`B`](../-monad-continuation/bind.html#B)`>): `[`B`](../-monad-continuation/bind.html#B) |
| [bindIn](../-monad-continuation/bind-in.html) | `suspend fun <B> (() -> `[`B`](../-monad-continuation/bind-in.html#B)`).bindIn(context: <ERROR CLASS>): `[`B`](../-monad-continuation/bind-in.html#B)<br>`open suspend fun <B> bindIn(context: <ERROR CLASS>, m: () -> `[`B`](../-monad-continuation/bind-in.html#B)`): `[`B`](../-monad-continuation/bind-in.html#B) |
| [bindingInContextContinuation](../-monad-continuation/binding-in-context-continuation.html) | `fun bindingInContextContinuation(context: <ERROR CLASS>): `[`BindingInContextContinuation`](../-binding-in-context-continuation/index.html)`<Kind<`[`F`](../-monad-continuation/index.html#F)`, `[`A`](../-monad-continuation/index.html#A)`>>` |
| [resume](../-monad-continuation/resume.html) | `open fun resume(value: Kind<`[`F`](../-monad-continuation/index.html#F)`, `[`A`](../-monad-continuation/index.html#A)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [returnedMonad](../-monad-continuation/returned-monad.html) | `open fun returnedMonad(): Kind<`[`F`](../-monad-continuation/index.html#F)`, `[`A`](../-monad-continuation/index.html#A)`>` |

### Extension Properties

| [stateStack](../kotlin.coroutines.-continuation/state-stack.html) | `var <T> `[`Continuation`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-continuation/index.html)`<`[`T`](../kotlin.coroutines.-continuation/state-stack.html#T)`>.stateStack: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, *>>` |

### Extension Functions

| [compose](../compose.html) | `fun <F, G> `[`Invariant`](../-invariant/index.html)`<`[`F`](../compose.html#F)`>.compose(GF: `[`Invariant`](../-invariant/index.html)`<`[`G`](../compose.html#G)`>): `[`Invariant`](../-invariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>`<br>`fun <F, G> `[`Functor`](../-functor/index.html)`<`[`F`](../compose.html#F)`>.compose(GF: `[`Functor`](../-functor/index.html)`<`[`G`](../compose.html#G)`>): `[`Functor`](../-functor/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>`<br>`fun <F, G> `[`Applicative`](../-applicative/index.html)`<`[`F`](../compose.html#F)`>.compose(GA: `[`Applicative`](../-applicative/index.html)`<`[`G`](../compose.html#G)`>): `[`Applicative`](../-applicative/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>` |
| [composeContravariant](../compose-contravariant.html) | `fun <F, G> `[`Invariant`](../-invariant/index.html)`<`[`F`](../compose-contravariant.html#F)`>.composeContravariant(GF: `[`Contravariant`](../-contravariant/index.html)`<`[`G`](../compose-contravariant.html#G)`>): `[`Invariant`](../-invariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-contravariant.html#F)`, `[`G`](../compose-contravariant.html#G)`>>`<br>`fun <F, G> `[`Functor`](../-functor/index.html)`<`[`F`](../compose-contravariant.html#F)`>.composeContravariant(GF: `[`Contravariant`](../-contravariant/index.html)`<`[`G`](../compose-contravariant.html#G)`>): `[`Contravariant`](../-contravariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-contravariant.html#F)`, `[`G`](../compose-contravariant.html#G)`>>` |
| [composeFunctor](../compose-functor.html) | `fun <F, G> `[`Invariant`](../-invariant/index.html)`<`[`F`](../compose-functor.html#F)`>.composeFunctor(GF: `[`Functor`](../-functor/index.html)`<`[`G`](../compose-functor.html#G)`>): `[`Invariant`](../-invariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-functor.html#F)`, `[`G`](../compose-functor.html#G)`>>` |

