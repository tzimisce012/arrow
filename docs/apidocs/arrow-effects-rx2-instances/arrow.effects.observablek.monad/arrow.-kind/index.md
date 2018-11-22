---
title: arrow.effects.observablek.monad.arrow.Kind - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects.observablek.monad](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [ap](ap.html) | `fun <A, B> Kind<ForObservableK, `[`A`](ap.html#A)`>.ap(arg1: Kind<ForObservableK, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): ObservableK<`[`B`](ap.html#B)`>` |
| [effectM](effect-m.html) | `fun <A, B> Kind<ForObservableK, `[`A`](effect-m.html#A)`>.effectM(arg1: (`[`A`](effect-m.html#A)`) -> Kind<ForObservableK, `[`B`](effect-m.html#B)`>): ObservableK<`[`A`](effect-m.html#A)`>` |
| [flatMap](flat-map.html) | `fun <A, B> Kind<ForObservableK, `[`A`](flat-map.html#A)`>.flatMap(arg1: (`[`A`](flat-map.html#A)`) -> Kind<ForObservableK, `[`B`](flat-map.html#B)`>): ObservableK<`[`B`](flat-map.html#B)`>` |
| [flatten](flatten.html) | `fun <A> Kind<ForObservableK, Kind<ForObservableK, `[`A`](flatten.html#A)`>>.flatten(): ObservableK<`[`A`](flatten.html#A)`>` |
| [followedBy](followed-by.html) | `fun <A, B> Kind<ForObservableK, `[`A`](followed-by.html#A)`>.followedBy(arg1: Kind<ForObservableK, `[`B`](followed-by.html#B)`>): ObservableK<`[`B`](followed-by.html#B)`>` |
| [followedByEval](followed-by-eval.html) | `fun <A, B> Kind<ForObservableK, `[`A`](followed-by-eval.html#A)`>.followedByEval(arg1: Eval<Kind<ForObservableK, `[`B`](followed-by-eval.html#B)`>>): ObservableK<`[`B`](followed-by-eval.html#B)`>` |
| [forEffect](for-effect.html) | `fun <A, B> Kind<ForObservableK, `[`A`](for-effect.html#A)`>.forEffect(arg1: Kind<ForObservableK, `[`B`](for-effect.html#B)`>): ObservableK<`[`A`](for-effect.html#A)`>` |
| [forEffectEval](for-effect-eval.html) | `fun <A, B> Kind<ForObservableK, `[`A`](for-effect-eval.html#A)`>.forEffectEval(arg1: Eval<Kind<ForObservableK, `[`B`](for-effect-eval.html#B)`>>): ObservableK<`[`A`](for-effect-eval.html#A)`>` |
| [ifM](if-m.html) | `fun <B> Kind<ForObservableK, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>.ifM(arg1: () -> Kind<ForObservableK, `[`B`](if-m.html#B)`>, arg2: () -> Kind<ForObservableK, `[`B`](if-m.html#B)`>): ObservableK<`[`B`](if-m.html#B)`>` |
| [map](map.html) | `fun <A, B> Kind<ForObservableK, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): ObservableK<`[`B`](map.html#B)`>` |
| [mproduct](mproduct.html) | `fun <A, B> Kind<ForObservableK, `[`A`](mproduct.html#A)`>.mproduct(arg1: (`[`A`](mproduct.html#A)`) -> Kind<ForObservableK, `[`B`](mproduct.html#B)`>): ObservableK<Tuple2<`[`A`](mproduct.html#A)`, `[`B`](mproduct.html#B)`>>` |

