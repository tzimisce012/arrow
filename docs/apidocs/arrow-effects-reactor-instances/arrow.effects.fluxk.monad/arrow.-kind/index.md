---
title: arrow.effects.fluxk.monad.arrow.Kind - arrow-effects-reactor-instances
---

[arrow-effects-reactor-instances](../../index.html) / [arrow.effects.fluxk.monad](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [ap](ap.html) | `fun <A, B> Kind<ForFluxK, `[`A`](ap.html#A)`>.ap(arg1: Kind<ForFluxK, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): FluxK<`[`B`](ap.html#B)`>` |
| [effectM](effect-m.html) | `fun <A, B> Kind<ForFluxK, `[`A`](effect-m.html#A)`>.effectM(arg1: (`[`A`](effect-m.html#A)`) -> Kind<ForFluxK, `[`B`](effect-m.html#B)`>): FluxK<`[`A`](effect-m.html#A)`>` |
| [flatMap](flat-map.html) | `fun <A, B> Kind<ForFluxK, `[`A`](flat-map.html#A)`>.flatMap(arg1: (`[`A`](flat-map.html#A)`) -> Kind<ForFluxK, `[`B`](flat-map.html#B)`>): FluxK<`[`B`](flat-map.html#B)`>` |
| [flatten](flatten.html) | `fun <A> Kind<ForFluxK, Kind<ForFluxK, `[`A`](flatten.html#A)`>>.flatten(): FluxK<`[`A`](flatten.html#A)`>` |
| [followedBy](followed-by.html) | `fun <A, B> Kind<ForFluxK, `[`A`](followed-by.html#A)`>.followedBy(arg1: Kind<ForFluxK, `[`B`](followed-by.html#B)`>): FluxK<`[`B`](followed-by.html#B)`>` |
| [followedByEval](followed-by-eval.html) | `fun <A, B> Kind<ForFluxK, `[`A`](followed-by-eval.html#A)`>.followedByEval(arg1: Eval<Kind<ForFluxK, `[`B`](followed-by-eval.html#B)`>>): FluxK<`[`B`](followed-by-eval.html#B)`>` |
| [forEffect](for-effect.html) | `fun <A, B> Kind<ForFluxK, `[`A`](for-effect.html#A)`>.forEffect(arg1: Kind<ForFluxK, `[`B`](for-effect.html#B)`>): FluxK<`[`A`](for-effect.html#A)`>` |
| [forEffectEval](for-effect-eval.html) | `fun <A, B> Kind<ForFluxK, `[`A`](for-effect-eval.html#A)`>.forEffectEval(arg1: Eval<Kind<ForFluxK, `[`B`](for-effect-eval.html#B)`>>): FluxK<`[`A`](for-effect-eval.html#A)`>` |
| [ifM](if-m.html) | `fun <B> Kind<ForFluxK, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>.ifM(arg1: () -> Kind<ForFluxK, `[`B`](if-m.html#B)`>, arg2: () -> Kind<ForFluxK, `[`B`](if-m.html#B)`>): FluxK<`[`B`](if-m.html#B)`>` |
| [map](map.html) | `fun <A, B> Kind<ForFluxK, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): FluxK<`[`B`](map.html#B)`>` |
| [mproduct](mproduct.html) | `fun <A, B> Kind<ForFluxK, `[`A`](mproduct.html#A)`>.mproduct(arg1: (`[`A`](mproduct.html#A)`) -> Kind<ForFluxK, `[`B`](mproduct.html#B)`>): FluxK<Tuple2<`[`A`](mproduct.html#A)`, `[`B`](mproduct.html#B)`>>` |

