---
title: arrow.effects.flowablek.monad.arrow.Kind - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects.flowablek.monad](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [ap](ap.html) | `fun <A, B> Kind<ForFlowableK, `[`A`](ap.html#A)`>.ap(arg1: Kind<ForFlowableK, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): FlowableK<`[`B`](ap.html#B)`>` |
| [effectM](effect-m.html) | `fun <A, B> Kind<ForFlowableK, `[`A`](effect-m.html#A)`>.effectM(arg1: (`[`A`](effect-m.html#A)`) -> Kind<ForFlowableK, `[`B`](effect-m.html#B)`>): FlowableK<`[`A`](effect-m.html#A)`>` |
| [flatMap](flat-map.html) | `fun <A, B> Kind<ForFlowableK, `[`A`](flat-map.html#A)`>.flatMap(arg1: (`[`A`](flat-map.html#A)`) -> Kind<ForFlowableK, `[`B`](flat-map.html#B)`>): FlowableK<`[`B`](flat-map.html#B)`>` |
| [flatten](flatten.html) | `fun <A> Kind<ForFlowableK, Kind<ForFlowableK, `[`A`](flatten.html#A)`>>.flatten(): FlowableK<`[`A`](flatten.html#A)`>` |
| [followedBy](followed-by.html) | `fun <A, B> Kind<ForFlowableK, `[`A`](followed-by.html#A)`>.followedBy(arg1: Kind<ForFlowableK, `[`B`](followed-by.html#B)`>): FlowableK<`[`B`](followed-by.html#B)`>` |
| [followedByEval](followed-by-eval.html) | `fun <A, B> Kind<ForFlowableK, `[`A`](followed-by-eval.html#A)`>.followedByEval(arg1: Eval<Kind<ForFlowableK, `[`B`](followed-by-eval.html#B)`>>): FlowableK<`[`B`](followed-by-eval.html#B)`>` |
| [forEffect](for-effect.html) | `fun <A, B> Kind<ForFlowableK, `[`A`](for-effect.html#A)`>.forEffect(arg1: Kind<ForFlowableK, `[`B`](for-effect.html#B)`>): FlowableK<`[`A`](for-effect.html#A)`>` |
| [forEffectEval](for-effect-eval.html) | `fun <A, B> Kind<ForFlowableK, `[`A`](for-effect-eval.html#A)`>.forEffectEval(arg1: Eval<Kind<ForFlowableK, `[`B`](for-effect-eval.html#B)`>>): FlowableK<`[`A`](for-effect-eval.html#A)`>` |
| [ifM](if-m.html) | `fun <B> Kind<ForFlowableK, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>.ifM(arg1: () -> Kind<ForFlowableK, `[`B`](if-m.html#B)`>, arg2: () -> Kind<ForFlowableK, `[`B`](if-m.html#B)`>): FlowableK<`[`B`](if-m.html#B)`>` |
| [map](map.html) | `fun <A, B> Kind<ForFlowableK, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): FlowableK<`[`B`](map.html#B)`>` |
| [mproduct](mproduct.html) | `fun <A, B> Kind<ForFlowableK, `[`A`](mproduct.html#A)`>.mproduct(arg1: (`[`A`](mproduct.html#A)`) -> Kind<ForFlowableK, `[`B`](mproduct.html#B)`>): FlowableK<Tuple2<`[`A`](mproduct.html#A)`, `[`B`](mproduct.html#B)`>>` |

