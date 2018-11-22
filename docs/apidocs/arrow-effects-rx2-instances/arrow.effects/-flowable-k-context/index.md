---
title: FlowableKContext - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects](../index.html) / [FlowableKContext](./index.html)

# FlowableKContext

`object FlowableKContext : `[`FlowableKConcurrentEffectInstance`](../-flowable-k-concurrent-effect-instance/index.html)`, `[`FlowableKTraverseInstance`](../-flowable-k-traverse-instance/index.html)

### Functions

| [map](map.html) | `fun <A, B> FlowableKOf<`[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): FlowableK<`[`B`](map.html#B)`>` |

### Inherited Functions

| [foldLeft](../-flowable-k-traverse-instance/fold-left.html) | `open fun <A, B> Kind<ForFlowableK, `[`A`](../-flowable-k-traverse-instance/fold-left.html#A)`>.foldLeft(b: `[`B`](../-flowable-k-traverse-instance/fold-left.html#B)`, f: (`[`B`](../-flowable-k-traverse-instance/fold-left.html#B)`, `[`A`](../-flowable-k-traverse-instance/fold-left.html#A)`) -> `[`B`](../-flowable-k-traverse-instance/fold-left.html#B)`): `[`B`](../-flowable-k-traverse-instance/fold-left.html#B) |
| [foldRight](../-flowable-k-traverse-instance/fold-right.html) | `open fun <A, B> Kind<ForFlowableK, `[`A`](../-flowable-k-traverse-instance/fold-right.html#A)`>.foldRight(lb: Eval<`[`B`](../-flowable-k-traverse-instance/fold-right.html#B)`>, f: (`[`A`](../-flowable-k-traverse-instance/fold-right.html#A)`, Eval<`[`B`](../-flowable-k-traverse-instance/fold-right.html#B)`>) -> Eval<`[`B`](../-flowable-k-traverse-instance/fold-right.html#B)`>): Eval<`[`B`](../-flowable-k-traverse-instance/fold-right.html#B)`>` |
| [runAsyncCancellable](../-flowable-k-concurrent-effect-instance/run-async-cancellable.html) | `open fun <A> Kind<ForFlowableK, `[`A`](../-flowable-k-concurrent-effect-instance/run-async-cancellable.html#A)`>.runAsyncCancellable(cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](../-flowable-k-concurrent-effect-instance/run-async-cancellable.html#A)`>) -> FlowableKOf<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): FlowableK<Disposable>` |
| [traverse](../-flowable-k-traverse-instance/traverse.html) | `open fun <G, A, B> FlowableKOf<`[`A`](../-flowable-k-traverse-instance/traverse.html#A)`>.traverse(AP: Applicative<`[`G`](../-flowable-k-traverse-instance/traverse.html#G)`>, f: (`[`A`](../-flowable-k-traverse-instance/traverse.html#A)`) -> Kind<`[`G`](../-flowable-k-traverse-instance/traverse.html#G)`, `[`B`](../-flowable-k-traverse-instance/traverse.html#B)`>): Kind<`[`G`](../-flowable-k-traverse-instance/traverse.html#G)`, FlowableK<`[`B`](../-flowable-k-traverse-instance/traverse.html#B)`>>` |

### Extension Functions

| [catch](../../arrow.effects.flowablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForFlowableK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.flowablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): FlowableK<`[`A`](../../arrow.effects.flowablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

