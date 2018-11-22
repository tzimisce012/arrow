---
title: ObservableKContext - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects](../index.html) / [ObservableKContext](./index.html)

# ObservableKContext

`object ObservableKContext : `[`ObservableKConcurrentEffectInstance`](../-observable-k-concurrent-effect-instance/index.html)`, `[`ObservableKTraverseInstance`](../-observable-k-traverse-instance/index.html)

### Functions

| [map](map.html) | `fun <A, B> Kind<ForObservableK, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): ObservableK<`[`B`](map.html#B)`>` |

### Inherited Functions

| [foldLeft](../-observable-k-traverse-instance/fold-left.html) | `open fun <A, B> Kind<ForObservableK, `[`A`](../-observable-k-traverse-instance/fold-left.html#A)`>.foldLeft(b: `[`B`](../-observable-k-traverse-instance/fold-left.html#B)`, f: (`[`B`](../-observable-k-traverse-instance/fold-left.html#B)`, `[`A`](../-observable-k-traverse-instance/fold-left.html#A)`) -> `[`B`](../-observable-k-traverse-instance/fold-left.html#B)`): `[`B`](../-observable-k-traverse-instance/fold-left.html#B) |
| [foldRight](../-observable-k-traverse-instance/fold-right.html) | `open fun <A, B> Kind<ForObservableK, `[`A`](../-observable-k-traverse-instance/fold-right.html#A)`>.foldRight(lb: Eval<`[`B`](../-observable-k-traverse-instance/fold-right.html#B)`>, f: (`[`A`](../-observable-k-traverse-instance/fold-right.html#A)`, Eval<`[`B`](../-observable-k-traverse-instance/fold-right.html#B)`>) -> Eval<`[`B`](../-observable-k-traverse-instance/fold-right.html#B)`>): Eval<`[`B`](../-observable-k-traverse-instance/fold-right.html#B)`>` |
| [runAsyncCancellable](../-observable-k-concurrent-effect-instance/run-async-cancellable.html) | `open fun <A> Kind<ForObservableK, `[`A`](../-observable-k-concurrent-effect-instance/run-async-cancellable.html#A)`>.runAsyncCancellable(cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](../-observable-k-concurrent-effect-instance/run-async-cancellable.html#A)`>) -> ObservableKOf<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): ObservableK<Disposable>` |
| [traverse](../-observable-k-traverse-instance/traverse.html) | `open fun <G, A, B> ObservableKOf<`[`A`](../-observable-k-traverse-instance/traverse.html#A)`>.traverse(AP: Applicative<`[`G`](../-observable-k-traverse-instance/traverse.html#G)`>, f: (`[`A`](../-observable-k-traverse-instance/traverse.html#A)`) -> Kind<`[`G`](../-observable-k-traverse-instance/traverse.html#G)`, `[`B`](../-observable-k-traverse-instance/traverse.html#B)`>): Kind<`[`G`](../-observable-k-traverse-instance/traverse.html#G)`, ObservableK<`[`B`](../-observable-k-traverse-instance/traverse.html#B)`>>` |

### Extension Functions

| [catch](../../arrow.effects.observablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForObservableK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.observablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): ObservableK<`[`A`](../../arrow.effects.observablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

