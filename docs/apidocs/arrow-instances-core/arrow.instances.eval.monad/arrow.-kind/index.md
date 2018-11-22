---
title: arrow.instances.eval.monad.arrow.Kind - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances.eval.monad](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [ap](ap.html) | `fun <A, B> Kind<ForEval, `[`A`](ap.html#A)`>.ap(arg1: Kind<ForEval, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): Eval<`[`B`](ap.html#B)`>` |
| [effectM](effect-m.html) | `fun <A, B> Kind<ForEval, `[`A`](effect-m.html#A)`>.effectM(arg1: (`[`A`](effect-m.html#A)`) -> Kind<ForEval, `[`B`](effect-m.html#B)`>): Eval<`[`A`](effect-m.html#A)`>` |
| [flatMap](flat-map.html) | `fun <A, B> Kind<ForEval, `[`A`](flat-map.html#A)`>.flatMap(arg1: (`[`A`](flat-map.html#A)`) -> Kind<ForEval, `[`B`](flat-map.html#B)`>): Eval<`[`B`](flat-map.html#B)`>` |
| [flatten](flatten.html) | `fun <A> Kind<ForEval, Kind<ForEval, `[`A`](flatten.html#A)`>>.flatten(): Eval<`[`A`](flatten.html#A)`>` |
| [followedBy](followed-by.html) | `fun <A, B> Kind<ForEval, `[`A`](followed-by.html#A)`>.followedBy(arg1: Kind<ForEval, `[`B`](followed-by.html#B)`>): Eval<`[`B`](followed-by.html#B)`>` |
| [followedByEval](followed-by-eval.html) | `fun <A, B> Kind<ForEval, `[`A`](followed-by-eval.html#A)`>.followedByEval(arg1: Eval<Kind<ForEval, `[`B`](followed-by-eval.html#B)`>>): Eval<`[`B`](followed-by-eval.html#B)`>` |
| [forEffect](for-effect.html) | `fun <A, B> Kind<ForEval, `[`A`](for-effect.html#A)`>.forEffect(arg1: Kind<ForEval, `[`B`](for-effect.html#B)`>): Eval<`[`A`](for-effect.html#A)`>` |
| [forEffectEval](for-effect-eval.html) | `fun <A, B> Kind<ForEval, `[`A`](for-effect-eval.html#A)`>.forEffectEval(arg1: Eval<Kind<ForEval, `[`B`](for-effect-eval.html#B)`>>): Eval<`[`A`](for-effect-eval.html#A)`>` |
| [ifM](if-m.html) | `fun <B> Kind<ForEval, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>.ifM(arg1: () -> Kind<ForEval, `[`B`](if-m.html#B)`>, arg2: () -> Kind<ForEval, `[`B`](if-m.html#B)`>): Eval<`[`B`](if-m.html#B)`>` |
| [map](map.html) | `fun <A, B> Kind<ForEval, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Eval<`[`B`](map.html#B)`>` |
| [mproduct](mproduct.html) | `fun <A, B> Kind<ForEval, `[`A`](mproduct.html#A)`>.mproduct(arg1: (`[`A`](mproduct.html#A)`) -> Kind<ForEval, `[`B`](mproduct.html#B)`>): Eval<Tuple2<`[`A`](mproduct.html#A)`, `[`B`](mproduct.html#B)`>>` |

