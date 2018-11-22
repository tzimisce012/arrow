---
title: MonadError - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [MonadError](./index.html)

# MonadError

`interface MonadError<F, E> : `[`ApplicativeError`](../-applicative-error/index.html)`<`[`F`](index.html#F)`, `[`E`](index.html#E)`>, `[`Monad`](../-monad/index.html)`<`[`F`](index.html#F)`>`



### Functions

| [ensure](ensure.html) | `open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](ensure.html#A)`>.ensure(error: () -> `[`E`](index.html#E)`, predicate: (`[`A`](ensure.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): Kind<`[`F`](index.html#F)`, `[`A`](ensure.html#A)`>` |

### Inherited Functions

| [attempt](../-applicative-error/attempt.html) | `open fun <A> Kind<`[`F`](../-applicative-error/index.html#F)`, `[`A`](../-applicative-error/attempt.html#A)`>.attempt(): Kind<`[`F`](../-applicative-error/index.html#F)`, Either<`[`E`](../-applicative-error/index.html#E)`, `[`A`](../-applicative-error/attempt.html#A)`>>` |
| [binding](../-monad/binding.html) | `open fun <B> binding(c: suspend `[`MonadContinuation`](../-monad-continuation/index.html)`<`[`F`](../-monad/index.html#F)`, *>.() -> `[`B`](../-monad/binding.html#B)`): Kind<`[`F`](../-monad/index.html#F)`, `[`B`](../-monad/binding.html#B)`>`<br>Entry point for monad bindings which enables for comprehension. The underlying implementation is based on coroutines. A coroutine is initiated and suspended inside [MonadErrorContinuation](../-monad-error-continuation/index.html) yielding to [Monad.flatMap](../-monad/flat-map.html). Once all the flatMap binds are completed the underlying monad is returned from the act of executing the coroutine |
| [catch](../-applicative-error/catch.html) | `open fun <A> catch(recover: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`E`](../-applicative-error/index.html#E)`, f: () -> `[`A`](../-applicative-error/catch.html#A)`): Kind<`[`F`](../-applicative-error/index.html#F)`, `[`A`](../-applicative-error/catch.html#A)`>`<br>`open fun <A> `[`ApplicativeError`](../-applicative-error/index.html)`<`[`F`](../-applicative-error/index.html#F)`, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(f: () -> `[`A`](../-applicative-error/catch.html#A)`): Kind<`[`F`](../-applicative-error/index.html#F)`, `[`A`](../-applicative-error/catch.html#A)`>` |
| [effectM](../-monad/effect-m.html) | `open fun <A, B> Kind<`[`F`](../-monad/index.html#F)`, `[`A`](../-monad/effect-m.html#A)`>.effectM(f: (`[`A`](../-monad/effect-m.html#A)`) -> Kind<`[`F`](../-monad/index.html#F)`, `[`B`](../-monad/effect-m.html#B)`>): Kind<`[`F`](../-monad/index.html#F)`, `[`A`](../-monad/effect-m.html#A)`>` |
| [flatMap](../-monad/flat-map.html) | `abstract fun <A, B> Kind<`[`F`](../-monad/index.html#F)`, `[`A`](../-monad/flat-map.html#A)`>.flatMap(f: (`[`A`](../-monad/flat-map.html#A)`) -> Kind<`[`F`](../-monad/index.html#F)`, `[`B`](../-monad/flat-map.html#B)`>): Kind<`[`F`](../-monad/index.html#F)`, `[`B`](../-monad/flat-map.html#B)`>` |
| [flatten](../-monad/flatten.html) | `open fun <A> Kind<`[`F`](../-monad/index.html#F)`, Kind<`[`F`](../-monad/index.html#F)`, `[`A`](../-monad/flatten.html#A)`>>.flatten(): Kind<`[`F`](../-monad/index.html#F)`, `[`A`](../-monad/flatten.html#A)`>` |
| [followedBy](../-monad/followed-by.html) | `open fun <A, B> Kind<`[`F`](../-monad/index.html#F)`, `[`A`](../-monad/followed-by.html#A)`>.followedBy(fb: Kind<`[`F`](../-monad/index.html#F)`, `[`B`](../-monad/followed-by.html#B)`>): Kind<`[`F`](../-monad/index.html#F)`, `[`B`](../-monad/followed-by.html#B)`>` |
| [followedByEval](../-monad/followed-by-eval.html) | `open fun <A, B> Kind<`[`F`](../-monad/index.html#F)`, `[`A`](../-monad/followed-by-eval.html#A)`>.followedByEval(fb: Eval<Kind<`[`F`](../-monad/index.html#F)`, `[`B`](../-monad/followed-by-eval.html#B)`>>): Kind<`[`F`](../-monad/index.html#F)`, `[`B`](../-monad/followed-by-eval.html#B)`>` |
| [forEffect](../-monad/for-effect.html) | `open fun <A, B> Kind<`[`F`](../-monad/index.html#F)`, `[`A`](../-monad/for-effect.html#A)`>.forEffect(fb: Kind<`[`F`](../-monad/index.html#F)`, `[`B`](../-monad/for-effect.html#B)`>): Kind<`[`F`](../-monad/index.html#F)`, `[`A`](../-monad/for-effect.html#A)`>` |
| [forEffectEval](../-monad/for-effect-eval.html) | `open fun <A, B> Kind<`[`F`](../-monad/index.html#F)`, `[`A`](../-monad/for-effect-eval.html#A)`>.forEffectEval(fb: Eval<Kind<`[`F`](../-monad/index.html#F)`, `[`B`](../-monad/for-effect-eval.html#B)`>>): Kind<`[`F`](../-monad/index.html#F)`, `[`A`](../-monad/for-effect-eval.html#A)`>` |
| [fromEither](../-applicative-error/from-either.html) | `open fun <A, EE> Either<`[`EE`](../-applicative-error/from-either.html#EE)`, `[`A`](../-applicative-error/from-either.html#A)`>.fromEither(f: (`[`EE`](../-applicative-error/from-either.html#EE)`) -> `[`E`](../-applicative-error/index.html#E)`): Kind<`[`F`](../-applicative-error/index.html#F)`, `[`A`](../-applicative-error/from-either.html#A)`>` |
| [fromOption](../-applicative-error/from-option.html) | `open fun <A> OptionOf<`[`A`](../-applicative-error/from-option.html#A)`>.fromOption(f: () -> `[`E`](../-applicative-error/index.html#E)`): Kind<`[`F`](../-applicative-error/index.html#F)`, `[`A`](../-applicative-error/from-option.html#A)`>` |
| [fromTry](../-applicative-error/from-try.html) | `open fun <A> TryOf<`[`A`](../-applicative-error/from-try.html#A)`>.fromTry(f: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`E`](../-applicative-error/index.html#E)`): Kind<`[`F`](../-applicative-error/index.html#F)`, `[`A`](../-applicative-error/from-try.html#A)`>` |
| [handleError](../-applicative-error/handle-error.html) | `open fun <A> Kind<`[`F`](../-applicative-error/index.html#F)`, `[`A`](../-applicative-error/handle-error.html#A)`>.handleError(f: (`[`E`](../-applicative-error/index.html#E)`) -> `[`A`](../-applicative-error/handle-error.html#A)`): Kind<`[`F`](../-applicative-error/index.html#F)`, `[`A`](../-applicative-error/handle-error.html#A)`>` |
| [handleErrorWith](../-applicative-error/handle-error-with.html) | `abstract fun <A> Kind<`[`F`](../-applicative-error/index.html#F)`, `[`A`](../-applicative-error/handle-error-with.html#A)`>.handleErrorWith(f: (`[`E`](../-applicative-error/index.html#E)`) -> Kind<`[`F`](../-applicative-error/index.html#F)`, `[`A`](../-applicative-error/handle-error-with.html#A)`>): Kind<`[`F`](../-applicative-error/index.html#F)`, `[`A`](../-applicative-error/handle-error-with.html#A)`>` |
| [ifM](../-monad/if-m.html) | `open fun <B> Kind<`[`F`](../-monad/index.html#F)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>.ifM(ifTrue: () -> Kind<`[`F`](../-monad/index.html#F)`, `[`B`](../-monad/if-m.html#B)`>, ifFalse: () -> Kind<`[`F`](../-monad/index.html#F)`, `[`B`](../-monad/if-m.html#B)`>): Kind<`[`F`](../-monad/index.html#F)`, `[`B`](../-monad/if-m.html#B)`>` |
| [mproduct](../-monad/mproduct.html) | `open fun <A, B> Kind<`[`F`](../-monad/index.html#F)`, `[`A`](../-monad/mproduct.html#A)`>.mproduct(f: (`[`A`](../-monad/mproduct.html#A)`) -> Kind<`[`F`](../-monad/index.html#F)`, `[`B`](../-monad/mproduct.html#B)`>): Kind<`[`F`](../-monad/index.html#F)`, Tuple2<`[`A`](../-monad/mproduct.html#A)`, `[`B`](../-monad/mproduct.html#B)`>>` |
| [raiseError](../-applicative-error/raise-error.html) | `abstract fun <A> raiseError(e: `[`E`](../-applicative-error/index.html#E)`): Kind<`[`F`](../-applicative-error/index.html#F)`, `[`A`](../-applicative-error/raise-error.html#A)`>`<br>`open fun <A> `[`E`](../-applicative-error/index.html#E)`.raiseError(dummy: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit): Kind<`[`F`](../-applicative-error/index.html#F)`, `[`A`](../-applicative-error/raise-error.html#A)`>` |
| [tailRecM](../-monad/tail-rec-m.html) | `abstract fun <A, B> tailRecM(a: `[`A`](../-monad/tail-rec-m.html#A)`, f: (`[`A`](../-monad/tail-rec-m.html#A)`) -> Kind<`[`F`](../-monad/index.html#F)`, Either<`[`A`](../-monad/tail-rec-m.html#A)`, `[`B`](../-monad/tail-rec-m.html#B)`>>): Kind<`[`F`](../-monad/index.html#F)`, `[`B`](../-monad/tail-rec-m.html#B)`>` |

### Extension Functions

| [compose](../compose.html) | `fun <F, G> `[`Invariant`](../-invariant/index.html)`<`[`F`](../compose.html#F)`>.compose(GF: `[`Invariant`](../-invariant/index.html)`<`[`G`](../compose.html#G)`>): `[`Invariant`](../-invariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>`<br>`fun <F, G> `[`Functor`](../-functor/index.html)`<`[`F`](../compose.html#F)`>.compose(GF: `[`Functor`](../-functor/index.html)`<`[`G`](../compose.html#G)`>): `[`Functor`](../-functor/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>`<br>`fun <F, G> `[`Applicative`](../-applicative/index.html)`<`[`F`](../compose.html#F)`>.compose(GA: `[`Applicative`](../-applicative/index.html)`<`[`G`](../compose.html#G)`>): `[`Applicative`](../-applicative/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>` |
| [composeContravariant](../compose-contravariant.html) | `fun <F, G> `[`Invariant`](../-invariant/index.html)`<`[`F`](../compose-contravariant.html#F)`>.composeContravariant(GF: `[`Contravariant`](../-contravariant/index.html)`<`[`G`](../compose-contravariant.html#G)`>): `[`Invariant`](../-invariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-contravariant.html#F)`, `[`G`](../compose-contravariant.html#G)`>>`<br>`fun <F, G> `[`Functor`](../-functor/index.html)`<`[`F`](../compose-contravariant.html#F)`>.composeContravariant(GF: `[`Contravariant`](../-contravariant/index.html)`<`[`G`](../compose-contravariant.html#G)`>): `[`Contravariant`](../-contravariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-contravariant.html#F)`, `[`G`](../compose-contravariant.html#G)`>>` |
| [composeFunctor](../compose-functor.html) | `fun <F, G> `[`Invariant`](../-invariant/index.html)`<`[`F`](../compose-functor.html#F)`>.composeFunctor(GF: `[`Functor`](../-functor/index.html)`<`[`G`](../compose-functor.html#G)`>): `[`Invariant`](../-invariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-functor.html#F)`, `[`G`](../compose-functor.html#G)`>>` |

### Inheritors

| [MonadErrorContinuation](../-monad-error-continuation/index.html) | `open class MonadErrorContinuation<F, A> : `[`MonadContinuation`](../-monad-continuation/index.html)`<`[`F`](../-monad-error-continuation/index.html#F)`, `[`A`](../-monad-error-continuation/index.html#A)`>, `[`MonadError`](./index.html)`<`[`F`](../-monad-error-continuation/index.html#F)`, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>` |
| [MonadThrow](../-monad-throw/index.html) | `interface MonadThrow<F> : `[`MonadError`](./index.html)`<`[`F`](../-monad-throw/index.html#F)`, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>` |




## Type Class Hierarchy

<canvas id="arrow.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.typeclasses-hierarchy-diagram', 'arrow.typeclasses-diagram.nomnol')
</script>

