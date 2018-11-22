---
title: arrow.instances.listk.monad.arrow.Kind - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.listk.monad](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [ap](ap.html) | `fun <A, B> Kind<ForListK, `[`A`](ap.html#A)`>.ap(arg1: Kind<ForListK, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): ListK<`[`B`](ap.html#B)`>` |
| [effectM](effect-m.html) | `fun <A, B> Kind<ForListK, `[`A`](effect-m.html#A)`>.effectM(arg1: (`[`A`](effect-m.html#A)`) -> Kind<ForListK, `[`B`](effect-m.html#B)`>): ListK<`[`A`](effect-m.html#A)`>` |
| [flatMap](flat-map.html) | `fun <A, B> Kind<ForListK, `[`A`](flat-map.html#A)`>.flatMap(arg1: (`[`A`](flat-map.html#A)`) -> Kind<ForListK, `[`B`](flat-map.html#B)`>): ListK<`[`B`](flat-map.html#B)`>` |
| [flatten](flatten.html) | `fun <A> Kind<ForListK, Kind<ForListK, `[`A`](flatten.html#A)`>>.flatten(): ListK<`[`A`](flatten.html#A)`>` |
| [followedBy](followed-by.html) | `fun <A, B> Kind<ForListK, `[`A`](followed-by.html#A)`>.followedBy(arg1: Kind<ForListK, `[`B`](followed-by.html#B)`>): ListK<`[`B`](followed-by.html#B)`>` |
| [followedByEval](followed-by-eval.html) | `fun <A, B> Kind<ForListK, `[`A`](followed-by-eval.html#A)`>.followedByEval(arg1: Eval<Kind<ForListK, `[`B`](followed-by-eval.html#B)`>>): ListK<`[`B`](followed-by-eval.html#B)`>` |
| [forEffect](for-effect.html) | `fun <A, B> Kind<ForListK, `[`A`](for-effect.html#A)`>.forEffect(arg1: Kind<ForListK, `[`B`](for-effect.html#B)`>): ListK<`[`A`](for-effect.html#A)`>` |
| [forEffectEval](for-effect-eval.html) | `fun <A, B> Kind<ForListK, `[`A`](for-effect-eval.html#A)`>.forEffectEval(arg1: Eval<Kind<ForListK, `[`B`](for-effect-eval.html#B)`>>): ListK<`[`A`](for-effect-eval.html#A)`>` |
| [ifM](if-m.html) | `fun <B> Kind<ForListK, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>.ifM(arg1: () -> Kind<ForListK, `[`B`](if-m.html#B)`>, arg2: () -> Kind<ForListK, `[`B`](if-m.html#B)`>): ListK<`[`B`](if-m.html#B)`>` |
| [map](map.html) | `fun <A, B> Kind<ForListK, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): ListK<`[`B`](map.html#B)`>` |
| [mproduct](mproduct.html) | `fun <A, B> Kind<ForListK, `[`A`](mproduct.html#A)`>.mproduct(arg1: (`[`A`](mproduct.html#A)`) -> Kind<ForListK, `[`B`](mproduct.html#B)`>): ListK<Tuple2<`[`A`](mproduct.html#A)`, `[`B`](mproduct.html#B)`>>` |

