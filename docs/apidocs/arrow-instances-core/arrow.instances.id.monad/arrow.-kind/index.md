---
title: arrow.instances.id.monad.arrow.Kind - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances.id.monad](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [ap](ap.html) | `fun <A, B> Kind<ForId, `[`A`](ap.html#A)`>.ap(arg1: Kind<ForId, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): Id<`[`B`](ap.html#B)`>` |
| [effectM](effect-m.html) | `fun <A, B> Kind<ForId, `[`A`](effect-m.html#A)`>.effectM(arg1: (`[`A`](effect-m.html#A)`) -> Kind<ForId, `[`B`](effect-m.html#B)`>): Id<`[`A`](effect-m.html#A)`>` |
| [flatMap](flat-map.html) | `fun <A, B> Kind<ForId, `[`A`](flat-map.html#A)`>.flatMap(arg1: (`[`A`](flat-map.html#A)`) -> Kind<ForId, `[`B`](flat-map.html#B)`>): Id<`[`B`](flat-map.html#B)`>` |
| [flatten](flatten.html) | `fun <A> Kind<ForId, Kind<ForId, `[`A`](flatten.html#A)`>>.flatten(): Id<`[`A`](flatten.html#A)`>` |
| [followedBy](followed-by.html) | `fun <A, B> Kind<ForId, `[`A`](followed-by.html#A)`>.followedBy(arg1: Kind<ForId, `[`B`](followed-by.html#B)`>): Id<`[`B`](followed-by.html#B)`>` |
| [followedByEval](followed-by-eval.html) | `fun <A, B> Kind<ForId, `[`A`](followed-by-eval.html#A)`>.followedByEval(arg1: Eval<Kind<ForId, `[`B`](followed-by-eval.html#B)`>>): Id<`[`B`](followed-by-eval.html#B)`>` |
| [forEffect](for-effect.html) | `fun <A, B> Kind<ForId, `[`A`](for-effect.html#A)`>.forEffect(arg1: Kind<ForId, `[`B`](for-effect.html#B)`>): Id<`[`A`](for-effect.html#A)`>` |
| [forEffectEval](for-effect-eval.html) | `fun <A, B> Kind<ForId, `[`A`](for-effect-eval.html#A)`>.forEffectEval(arg1: Eval<Kind<ForId, `[`B`](for-effect-eval.html#B)`>>): Id<`[`A`](for-effect-eval.html#A)`>` |
| [ifM](if-m.html) | `fun <B> Kind<ForId, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>.ifM(arg1: () -> Kind<ForId, `[`B`](if-m.html#B)`>, arg2: () -> Kind<ForId, `[`B`](if-m.html#B)`>): Id<`[`B`](if-m.html#B)`>` |
| [map](map.html) | `fun <A, B> Kind<ForId, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Id<`[`B`](map.html#B)`>` |
| [mproduct](mproduct.html) | `fun <A, B> Kind<ForId, `[`A`](mproduct.html#A)`>.mproduct(arg1: (`[`A`](mproduct.html#A)`) -> Kind<ForId, `[`B`](mproduct.html#B)`>): Id<Tuple2<`[`A`](mproduct.html#A)`, `[`B`](mproduct.html#B)`>>` |

