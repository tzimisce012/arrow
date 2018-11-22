---
title: FluxKContext - arrow-effects-reactor-instances
---

[arrow-effects-reactor-instances](../../index.html) / [arrow.effects](../index.html) / [FluxKContext](./index.html)

# FluxKContext

`object FluxKContext : `[`FluxKConcurrentEffectInstance`](../-flux-k-concurrent-effect-instance/index.html)`, `[`FluxKTraverseInstance`](../-flux-k-traverse-instance/index.html)

### Functions

| [map](map.html) | `fun <A, B> FluxKOf<`[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): FluxK<`[`B`](map.html#B)`>` |

### Inherited Functions

| [foldLeft](../-flux-k-traverse-instance/fold-left.html) | `open fun <A, B> Kind<ForFluxK, `[`A`](../-flux-k-traverse-instance/fold-left.html#A)`>.foldLeft(b: `[`B`](../-flux-k-traverse-instance/fold-left.html#B)`, f: (`[`B`](../-flux-k-traverse-instance/fold-left.html#B)`, `[`A`](../-flux-k-traverse-instance/fold-left.html#A)`) -> `[`B`](../-flux-k-traverse-instance/fold-left.html#B)`): `[`B`](../-flux-k-traverse-instance/fold-left.html#B) |
| [foldRight](../-flux-k-traverse-instance/fold-right.html) | `open fun <A, B> Kind<ForFluxK, `[`A`](../-flux-k-traverse-instance/fold-right.html#A)`>.foldRight(lb: Eval<`[`B`](../-flux-k-traverse-instance/fold-right.html#B)`>, f: (`[`A`](../-flux-k-traverse-instance/fold-right.html#A)`, Eval<`[`B`](../-flux-k-traverse-instance/fold-right.html#B)`>) -> Eval<`[`B`](../-flux-k-traverse-instance/fold-right.html#B)`>): Eval<`[`B`](../-flux-k-traverse-instance/fold-right.html#B)`>` |
| [runAsyncCancellable](../-flux-k-concurrent-effect-instance/run-async-cancellable.html) | `open fun <A> Kind<ForFluxK, `[`A`](../-flux-k-concurrent-effect-instance/run-async-cancellable.html#A)`>.runAsyncCancellable(cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](../-flux-k-concurrent-effect-instance/run-async-cancellable.html#A)`>) -> FluxKOf<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): FluxK<Disposable>` |
| [traverse](../-flux-k-traverse-instance/traverse.html) | `open fun <G, A, B> FluxKOf<`[`A`](../-flux-k-traverse-instance/traverse.html#A)`>.traverse(AP: Applicative<`[`G`](../-flux-k-traverse-instance/traverse.html#G)`>, f: (`[`A`](../-flux-k-traverse-instance/traverse.html#A)`) -> Kind<`[`G`](../-flux-k-traverse-instance/traverse.html#G)`, `[`B`](../-flux-k-traverse-instance/traverse.html#B)`>): Kind<`[`G`](../-flux-k-traverse-instance/traverse.html#G)`, FluxK<`[`B`](../-flux-k-traverse-instance/traverse.html#B)`>>` |

### Extension Functions

| [catch](../../arrow.effects.fluxk.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForFluxK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.fluxk.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): FluxK<`[`A`](../../arrow.effects.fluxk.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

