---
title: arrow.instances.nonemptylist.monad.arrow.Kind - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.nonemptylist.monad](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [ap](ap.html) | `fun <A, B> Kind<ForNonEmptyList, `[`A`](ap.html#A)`>.ap(arg1: Kind<ForNonEmptyList, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): NonEmptyList<`[`B`](ap.html#B)`>` |
| [effectM](effect-m.html) | `fun <A, B> Kind<ForNonEmptyList, `[`A`](effect-m.html#A)`>.effectM(arg1: (`[`A`](effect-m.html#A)`) -> Kind<ForNonEmptyList, `[`B`](effect-m.html#B)`>): NonEmptyList<`[`A`](effect-m.html#A)`>` |
| [flatMap](flat-map.html) | `fun <A, B> Kind<ForNonEmptyList, `[`A`](flat-map.html#A)`>.flatMap(arg1: (`[`A`](flat-map.html#A)`) -> Kind<ForNonEmptyList, `[`B`](flat-map.html#B)`>): NonEmptyList<`[`B`](flat-map.html#B)`>` |
| [flatten](flatten.html) | `fun <A> Kind<ForNonEmptyList, Kind<ForNonEmptyList, `[`A`](flatten.html#A)`>>.flatten(): NonEmptyList<`[`A`](flatten.html#A)`>` |
| [followedBy](followed-by.html) | `fun <A, B> Kind<ForNonEmptyList, `[`A`](followed-by.html#A)`>.followedBy(arg1: Kind<ForNonEmptyList, `[`B`](followed-by.html#B)`>): NonEmptyList<`[`B`](followed-by.html#B)`>` |
| [followedByEval](followed-by-eval.html) | `fun <A, B> Kind<ForNonEmptyList, `[`A`](followed-by-eval.html#A)`>.followedByEval(arg1: Eval<Kind<ForNonEmptyList, `[`B`](followed-by-eval.html#B)`>>): NonEmptyList<`[`B`](followed-by-eval.html#B)`>` |
| [forEffect](for-effect.html) | `fun <A, B> Kind<ForNonEmptyList, `[`A`](for-effect.html#A)`>.forEffect(arg1: Kind<ForNonEmptyList, `[`B`](for-effect.html#B)`>): NonEmptyList<`[`A`](for-effect.html#A)`>` |
| [forEffectEval](for-effect-eval.html) | `fun <A, B> Kind<ForNonEmptyList, `[`A`](for-effect-eval.html#A)`>.forEffectEval(arg1: Eval<Kind<ForNonEmptyList, `[`B`](for-effect-eval.html#B)`>>): NonEmptyList<`[`A`](for-effect-eval.html#A)`>` |
| [ifM](if-m.html) | `fun <B> Kind<ForNonEmptyList, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>.ifM(arg1: () -> Kind<ForNonEmptyList, `[`B`](if-m.html#B)`>, arg2: () -> Kind<ForNonEmptyList, `[`B`](if-m.html#B)`>): NonEmptyList<`[`B`](if-m.html#B)`>` |
| [map](map.html) | `fun <A, B> Kind<ForNonEmptyList, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): NonEmptyList<`[`B`](map.html#B)`>` |
| [mproduct](mproduct.html) | `fun <A, B> Kind<ForNonEmptyList, `[`A`](mproduct.html#A)`>.mproduct(arg1: (`[`A`](mproduct.html#A)`) -> Kind<ForNonEmptyList, `[`B`](mproduct.html#B)`>): NonEmptyList<Tuple2<`[`A`](mproduct.html#A)`, `[`B`](mproduct.html#B)`>>` |

