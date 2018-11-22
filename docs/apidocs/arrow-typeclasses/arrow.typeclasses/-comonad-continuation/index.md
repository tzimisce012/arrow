---
title: ComonadContinuation - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [ComonadContinuation](./index.html)

# ComonadContinuation

`open class ComonadContinuation<F, A : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Serializable`](http://docs.oracle.com/javase/6/docs/api/java/io/Serializable.html)`, Continuation<`[`A`](index.html#A)`>, `[`Comonad`](../-comonad/index.html)`<`[`F`](index.html#F)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `ComonadContinuation(CM: `[`Comonad`](../-comonad/index.html)`<`[`F`](index.html#F)`>, context: <ERROR CLASS> = EmptyCoroutineContext)` |

### Properties

| [context](context.html) | `open val context: <ERROR CLASS>` |

### Functions

| [extract](extract.html) | `suspend fun <B> extract(m: () -> Kind<`[`F`](index.html#F)`, `[`B`](extract.html#B)`>): `[`B`](extract.html#B) |
| [fix](fix.html) | `suspend fun <B> Kind<`[`F`](index.html#F)`, `[`B`](fix.html#B)`>.fix(): `[`B`](fix.html#B) |
| [resume](resume.html) | `open fun resume(value: `[`A`](index.html#A)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [resumeWith](resume-with.html) | `open fun resumeWith(result: <ERROR CLASS><`[`A`](index.html#A)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [resumeWithException](resume-with-exception.html) | `open fun resumeWithException(exception: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Extension Properties

| [stateStack](../kotlin.coroutines.-continuation/state-stack.html) | `var <T> `[`Continuation`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-continuation/index.html)`<`[`T`](../kotlin.coroutines.-continuation/state-stack.html#T)`>.stateStack: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, *>>` |

### Extension Functions

| [cobinding](../cobinding.html) | `fun <F, B : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> `[`Comonad`](../-comonad/index.html)`<`[`F`](../cobinding.html#F)`>.cobinding(c: suspend `[`ComonadContinuation`](./index.html)`<`[`F`](../cobinding.html#F)`, *>.() -> `[`B`](../cobinding.html#B)`): `[`B`](../cobinding.html#B)<br>Entry point for monad bindings which enables for comprehension. The underlying impl is based on coroutines. A coroutine is initiated and inside `MonadContinuation` suspended yielding to `flatMap` once all the flatMap binds are completed the underlying monad is returned from the act of executing the coroutine |
| [compose](../compose.html) | `fun <F, G> `[`Invariant`](../-invariant/index.html)`<`[`F`](../compose.html#F)`>.compose(GF: `[`Invariant`](../-invariant/index.html)`<`[`G`](../compose.html#G)`>): `[`Invariant`](../-invariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>`<br>`fun <F, G> `[`Functor`](../-functor/index.html)`<`[`F`](../compose.html#F)`>.compose(GF: `[`Functor`](../-functor/index.html)`<`[`G`](../compose.html#G)`>): `[`Functor`](../-functor/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>` |
| [composeContravariant](../compose-contravariant.html) | `fun <F, G> `[`Invariant`](../-invariant/index.html)`<`[`F`](../compose-contravariant.html#F)`>.composeContravariant(GF: `[`Contravariant`](../-contravariant/index.html)`<`[`G`](../compose-contravariant.html#G)`>): `[`Invariant`](../-invariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-contravariant.html#F)`, `[`G`](../compose-contravariant.html#G)`>>`<br>`fun <F, G> `[`Functor`](../-functor/index.html)`<`[`F`](../compose-contravariant.html#F)`>.composeContravariant(GF: `[`Contravariant`](../-contravariant/index.html)`<`[`G`](../compose-contravariant.html#G)`>): `[`Contravariant`](../-contravariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-contravariant.html#F)`, `[`G`](../compose-contravariant.html#G)`>>` |
| [composeFunctor](../compose-functor.html) | `fun <F, G> `[`Invariant`](../-invariant/index.html)`<`[`F`](../compose-functor.html#F)`>.composeFunctor(GF: `[`Functor`](../-functor/index.html)`<`[`G`](../compose-functor.html#G)`>): `[`Invariant`](../-invariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-functor.html#F)`, `[`G`](../compose-functor.html#G)`>>` |

