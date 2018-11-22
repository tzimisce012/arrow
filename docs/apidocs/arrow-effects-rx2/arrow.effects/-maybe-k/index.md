---
title: MaybeK - arrow-effects-rx2
---

[arrow-effects-rx2](../../index.html) / [arrow.effects](../index.html) / [MaybeK](./index.html)

# MaybeK

`@higherkind data class MaybeK<A> : `[`MaybeKOf`](../-maybe-k-of.html)`<`[`A`](index.html#A)`>, `[`MaybeKKindedJ`](../-maybe-k-kinded-j.html)`<`[`A`](index.html#A)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `MaybeK(maybe: Maybe<`[`A`](index.html#A)`>)` |

### Properties

| [maybe](maybe.html) | `val maybe: Maybe<`[`A`](index.html#A)`>` |

### Functions

| [ap](ap.html) | `fun <B> ap(fa: `[`MaybeKOf`](../-maybe-k-of.html)`<(`[`A`](index.html#A)`) -> `[`B`](ap.html#B)`>): `[`MaybeK`](./index.html)`<`[`B`](ap.html#B)`>` |
| [bracketCase](bracket-case.html) | `fun <B> bracketCase(use: (`[`A`](index.html#A)`) -> `[`MaybeKOf`](../-maybe-k-of.html)`<`[`B`](bracket-case.html#B)`>, release: (`[`A`](index.html#A)`, ExitCase<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>) -> `[`MaybeKOf`](../-maybe-k-of.html)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`MaybeK`](./index.html)`<`[`B`](bracket-case.html#B)`>` |
| [continueOn](continue-on.html) | `fun continueOn(ctx: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)`): `[`MaybeK`](./index.html)`<`[`A`](index.html#A)`>` |
| [equals](equals.html) | `fun equals(other: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [exists](exists.html) | `fun exists(predicate: Predicate<`[`A`](index.html#A)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [flatMap](flat-map.html) | `fun <B> flatMap(f: (`[`A`](index.html#A)`) -> `[`MaybeKOf`](../-maybe-k-of.html)`<`[`B`](flat-map.html#B)`>): `[`MaybeK`](./index.html)`<`[`B`](flat-map.html#B)`>` |
| [fold](fold.html) | `fun <B> fold(ifEmpty: () -> `[`B`](fold.html#B)`, ifSome: (`[`A`](index.html#A)`) -> `[`B`](fold.html#B)`): `[`B`](fold.html#B) |
| [foldLeft](fold-left.html) | `fun <B> foldLeft(b: `[`B`](fold-left.html#B)`, f: (`[`B`](fold-left.html#B)`, `[`A`](index.html#A)`) -> `[`B`](fold-left.html#B)`): `[`B`](fold-left.html#B) |
| [foldRight](fold-right.html) | `fun <B> foldRight(lb: Eval<`[`B`](fold-right.html#B)`>, f: (`[`A`](index.html#A)`, Eval<`[`B`](fold-right.html#B)`>) -> Eval<`[`B`](fold-right.html#B)`>): Eval<`[`B`](fold-right.html#B)`>` |
| [forall](forall.html) | `fun forall(p: Predicate<`[`A`](index.html#A)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [handleErrorWith](handle-error-with.html) | `fun handleErrorWith(function: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`MaybeK`](./index.html)`<`[`A`](index.html#A)`>): `[`MaybeK`](./index.html)`<`[`A`](index.html#A)`>` |
| [hashCode](hash-code.html) | `fun hashCode(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [isEmpty](is-empty.html) | `fun isEmpty(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [map](map.html) | `fun <B> map(f: (`[`A`](index.html#A)`) -> `[`B`](map.html#B)`): `[`MaybeK`](./index.html)`<`[`B`](map.html#B)`>` |
| [nonEmpty](non-empty.html) | `fun nonEmpty(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [runAsync](run-async.html) | `fun runAsync(cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](index.html#A)`>) -> `[`MaybeKOf`](../-maybe-k-of.html)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`MaybeK`](./index.html)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |

### Companion Object Functions

| [async](async.html) | `fun <A> async(fa: Proc<`[`A`](async.html#A)`>): `[`MaybeK`](./index.html)`<`[`A`](async.html#A)`>` |
| [defer](defer.html) | `fun <A> defer(fa: () -> `[`MaybeKOf`](../-maybe-k-of.html)`<`[`A`](defer.html#A)`>): `[`MaybeK`](./index.html)`<`[`A`](defer.html#A)`>` |
| [invoke](invoke.html) | `operator fun <A> invoke(fa: () -> `[`A`](invoke.html#A)`): `[`MaybeK`](./index.html)`<`[`A`](invoke.html#A)`>` |
| [just](just.html) | `fun <A> just(a: `[`A`](just.html#A)`): `[`MaybeK`](./index.html)`<`[`A`](just.html#A)`>` |
| [raiseError](raise-error.html) | `fun <A> raiseError(t: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): `[`MaybeK`](./index.html)`<`[`A`](raise-error.html#A)`>` |
| [tailRecM](tail-rec-m.html) | `tailrec fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> `[`MaybeKOf`](../-maybe-k-of.html)`<Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): `[`MaybeK`](./index.html)`<`[`B`](tail-rec-m.html#B)`>` |

