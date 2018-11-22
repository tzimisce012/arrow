---
title: Ref - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects](../index.html) / [Ref](./index.html)

# Ref

`interface Ref<F, A>`

An asynchronous, concurrent mutable reference.

Provides safe concurrent access and modification of its content.
[Ref](./index.html) is a purely functional wrapper over an [AtomicReference](http://docs.oracle.com/javase/6/docs/api/java/util/concurrent/atomic/AtomicReference.html) in context [F](index.html#F),
that is always initialised to a value [A](index.html#A).

### Functions

| [access](access.html) | `abstract fun access(): Kind<`[`F`](index.html#F)`, Tuple2<`[`A`](index.html#A)`, (`[`A`](index.html#A)`) -> Kind<`[`F`](index.html#F)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>>>`<br>Obtains a snapshot of the current value, and a setter for updating it. |
| [get](get.html) | `abstract fun get(): Kind<`[`F`](index.html#F)`, `[`A`](index.html#A)`>`<br>Obtains the current value. Since [Ref](./index.html) is always guaranteed to have a value, the returned action completes immediately after being bound. |
| [getAndSet](get-and-set.html) | `abstract fun getAndSet(a: `[`A`](index.html#A)`): Kind<`[`F`](index.html#F)`, `[`A`](index.html#A)`>`<br>Replaces the current value with [a](get-and-set.html#arrow.effects.Ref$getAndSet(arrow.effects.Ref.A)/a), returning the *old* value. |
| [getAndUpdate](get-and-update.html) | `abstract fun getAndUpdate(f: (`[`A`](index.html#A)`) -> `[`A`](index.html#A)`): Kind<`[`F`](index.html#F)`, `[`A`](index.html#A)`>`<br>Modifies the current value using the supplied update function and returns the *old* value. |
| [modify](modify.html) | `abstract fun <B> modify(f: (`[`A`](index.html#A)`) -> Tuple2<`[`A`](index.html#A)`, `[`B`](modify.html#B)`>): Kind<`[`F`](index.html#F)`, `[`B`](modify.html#B)`>`<br>Like [update](update.html) but allows the update function to return an output value of type [B](modify.html#B). |
| [set](set.html) | `abstract fun set(a: `[`A`](index.html#A)`): Kind<`[`F`](index.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`<br>Sets the current value to [a](set.html#arrow.effects.Ref$set(arrow.effects.Ref.A)/a). The returned action completes after the reference has been successfully set. |
| [setAndGet](set-and-get.html) | `abstract fun setAndGet(a: `[`A`](index.html#A)`): Kind<`[`F`](index.html#F)`, `[`A`](index.html#A)`>`<br>Replaces the current value with [a](set-and-get.html#arrow.effects.Ref$setAndGet(arrow.effects.Ref.A)/a), returning the *new* value. |
| [tryModify](try-modify.html) | `abstract fun <B> tryModify(f: (`[`A`](index.html#A)`) -> Tuple2<`[`A`](index.html#A)`, `[`B`](try-modify.html#B)`>): Kind<`[`F`](index.html#F)`, Option<`[`B`](try-modify.html#B)`>>`<br>Like [tryUpdate](try-update.html) but allows the update function to return an output value of type [B](try-modify.html#B). |
| [tryUpdate](try-update.html) | `abstract fun tryUpdate(f: (`[`A`](index.html#A)`) -> `[`A`](index.html#A)`): Kind<`[`F`](index.html#F)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Attempts to modify the current value once, in contrast to [update](update.html) which calls [f](try-update.html#arrow.effects.Ref$tryUpdate(kotlin.Function1((arrow.effects.Ref.A, )))/f) until it succeeds. |
| [update](update.html) | `abstract fun update(f: (`[`A`](index.html#A)`) -> `[`A`](index.html#A)`): Kind<`[`F`](index.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`<br>Updates the current value using the supplied function [f](update.html#arrow.effects.Ref$update(kotlin.Function1((arrow.effects.Ref.A, )))/f). |
| [updateAndGet](update-and-get.html) | `abstract fun updateAndGet(f: (`[`A`](index.html#A)`) -> `[`A`](index.html#A)`): Kind<`[`F`](index.html#F)`, `[`A`](index.html#A)`>`<br>Modifies the current value using the supplied update function and returns the *new* value. |

### Companion Object Functions

| [invoke](invoke.html) | `operator fun <F> invoke(MD: `[`MonadDefer`](../../arrow.effects.typeclasses/-monad-defer/index.html)`<`[`F`](invoke.html#F)`>): `[`PartiallyAppliedRef`](../-partially-applied-ref/index.html)`<`[`F`](invoke.html#F)`>`<br>Builds a [Ref](./index.html) value for data types given a [MonadDefer](../../arrow.effects.typeclasses/-monad-defer/index.html) instance without deciding the type of the Ref's value. |
| [of](of.html) | `fun <F, A> of(a: `[`A`](of.html#A)`, MD: `[`MonadDefer`](../../arrow.effects.typeclasses/-monad-defer/index.html)`<`[`F`](of.html#F)`>): Kind<`[`F`](of.html#F)`, `[`Ref`](./index.html)`<`[`F`](of.html#F)`, `[`A`](of.html#A)`>>`<br>Creates an asynchronous, concurrent mutable reference initialized to the supplied value. |
| [unsafe](unsafe.html) | `fun <F, A> unsafe(a: `[`A`](unsafe.html#A)`, MD: `[`MonadDefer`](../../arrow.effects.typeclasses/-monad-defer/index.html)`<`[`F`](unsafe.html#F)`>): `[`Ref`](./index.html)`<`[`F`](unsafe.html#F)`, `[`A`](unsafe.html#A)`>`<br>Like [of](of.html) but returns the newly allocated ref directly instead of wrapping it in [MonadDefer.invoke](../../arrow.effects.typeclasses/-monad-defer/invoke.html). This method is considered unsafe because it is not referentially transparent -- it allocates mutable state. |

