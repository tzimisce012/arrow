---
title: arrow.effects.fluxk.functor.arrow.Kind - arrow-effects-reactor-instances
---

[arrow-effects-reactor-instances](../../index.html) / [arrow.effects.fluxk.functor](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [as](as.html) | `fun <A, B> Kind<ForFluxK, `[`A`](as.html#A)`>.as(arg1: `[`B`](as.html#B)`): FluxK<`[`B`](as.html#B)`>` |
| [fproduct](fproduct.html) | `fun <A, B> Kind<ForFluxK, `[`A`](fproduct.html#A)`>.fproduct(arg1: (`[`A`](fproduct.html#A)`) -> `[`B`](fproduct.html#B)`): FluxK<Tuple2<`[`A`](fproduct.html#A)`, `[`B`](fproduct.html#B)`>>` |
| [imap](imap.html) | `fun <A, B> Kind<ForFluxK, `[`A`](imap.html#A)`>.imap(arg1: (`[`A`](imap.html#A)`) -> `[`B`](imap.html#B)`, arg2: (`[`B`](imap.html#B)`) -> `[`A`](imap.html#A)`): FluxK<`[`B`](imap.html#B)`>` |
| [map](map.html) | `fun <A, B> Kind<ForFluxK, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): FluxK<`[`B`](map.html#B)`>` |
| [tupleLeft](tuple-left.html) | `fun <A, B> Kind<ForFluxK, `[`A`](tuple-left.html#A)`>.tupleLeft(arg1: `[`B`](tuple-left.html#B)`): FluxK<Tuple2<`[`B`](tuple-left.html#B)`, `[`A`](tuple-left.html#A)`>>` |
| [tupleRight](tuple-right.html) | `fun <A, B> Kind<ForFluxK, `[`A`](tuple-right.html#A)`>.tupleRight(arg1: `[`B`](tuple-right.html#B)`): FluxK<Tuple2<`[`A`](tuple-right.html#A)`, `[`B`](tuple-right.html#B)`>>` |
| [void](void.html) | `fun <A> Kind<ForFluxK, `[`A`](void.html#A)`>.void(): FluxK<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [widen](widen.html) | `fun <B, A : `[`B`](widen.html#B)`> Kind<ForFluxK, `[`A`](widen.html#A)`>.widen(): FluxK<`[`B`](widen.html#B)`>` |

