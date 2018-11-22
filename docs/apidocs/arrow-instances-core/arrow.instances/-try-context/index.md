---
title: TryContext - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [TryContext](./index.html)

# TryContext

`object TryContext : `[`TryMonadErrorInstance`](../-try-monad-error-instance/index.html)`, `[`TryTraverseInstance`](../-try-traverse-instance/index.html)

### Functions

| [map](map.html) | `fun <A, B> Kind<ForTry, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Try<`[`B`](map.html#B)`>` |

### Inherited Functions

| [exists](../-try-traverse-instance/exists.html) | `open fun <A> TryOf<`[`A`](../-try-traverse-instance/exists.html#A)`>.exists(p: (`[`A`](../-try-traverse-instance/exists.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [foldLeft](../-try-traverse-instance/fold-left.html) | `open fun <A, B> Kind<ForTry, `[`A`](../-try-traverse-instance/fold-left.html#A)`>.foldLeft(b: `[`B`](../-try-traverse-instance/fold-left.html#B)`, f: (`[`B`](../-try-traverse-instance/fold-left.html#B)`, `[`A`](../-try-traverse-instance/fold-left.html#A)`) -> `[`B`](../-try-traverse-instance/fold-left.html#B)`): `[`B`](../-try-traverse-instance/fold-left.html#B) |
| [foldRight](../-try-traverse-instance/fold-right.html) | `open fun <A, B> Kind<ForTry, `[`A`](../-try-traverse-instance/fold-right.html#A)`>.foldRight(lb: Eval<`[`B`](../-try-traverse-instance/fold-right.html#B)`>, f: (`[`A`](../-try-traverse-instance/fold-right.html#A)`, Eval<`[`B`](../-try-traverse-instance/fold-right.html#B)`>) -> Eval<`[`B`](../-try-traverse-instance/fold-right.html#B)`>): Eval<`[`B`](../-try-traverse-instance/fold-right.html#B)`>` |
| [handleErrorWith](../-try-monad-error-instance/handle-error-with.html) | `open fun <A> Kind<ForTry, `[`A`](../-try-monad-error-instance/handle-error-with.html#A)`>.handleErrorWith(f: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> Kind<ForTry, `[`A`](../-try-monad-error-instance/handle-error-with.html#A)`>): Try<`[`A`](../-try-monad-error-instance/handle-error-with.html#A)`>` |
| [raiseError](../-try-monad-error-instance/raise-error.html) | `open fun <A> raiseError(e: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): Try<`[`A`](../-try-monad-error-instance/raise-error.html#A)`>` |
| [traverse](../-try-traverse-instance/traverse.html) | `open fun <G, A, B> TryOf<`[`A`](../-try-traverse-instance/traverse.html#A)`>.traverse(AP: Applicative<`[`G`](../-try-traverse-instance/traverse.html#G)`>, f: (`[`A`](../-try-traverse-instance/traverse.html#A)`) -> Kind<`[`G`](../-try-traverse-instance/traverse.html#G)`, `[`B`](../-try-traverse-instance/traverse.html#B)`>): Kind<`[`G`](../-try-traverse-instance/traverse.html#G)`, Try<`[`B`](../-try-traverse-instance/traverse.html#B)`>>` |

### Extension Functions

| [catch](../../arrow.instances.try.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForTry, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.instances.try.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): Try<`[`A`](../../arrow.instances.try.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

