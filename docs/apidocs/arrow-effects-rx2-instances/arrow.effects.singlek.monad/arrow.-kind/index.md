---
title: arrow.effects.singlek.monad.arrow.Kind - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects.singlek.monad](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [ap](ap.html) | `fun <A, B> Kind<ForSingleK, `[`A`](ap.html#A)`>.ap(arg1: Kind<ForSingleK, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): SingleK<`[`B`](ap.html#B)`>` |
| [effectM](effect-m.html) | `fun <A, B> Kind<ForSingleK, `[`A`](effect-m.html#A)`>.effectM(arg1: (`[`A`](effect-m.html#A)`) -> Kind<ForSingleK, `[`B`](effect-m.html#B)`>): SingleK<`[`A`](effect-m.html#A)`>` |
| [flatMap](flat-map.html) | `fun <A, B> Kind<ForSingleK, `[`A`](flat-map.html#A)`>.flatMap(arg1: (`[`A`](flat-map.html#A)`) -> Kind<ForSingleK, `[`B`](flat-map.html#B)`>): SingleK<`[`B`](flat-map.html#B)`>` |
| [flatten](flatten.html) | `fun <A> Kind<ForSingleK, Kind<ForSingleK, `[`A`](flatten.html#A)`>>.flatten(): SingleK<`[`A`](flatten.html#A)`>` |
| [followedBy](followed-by.html) | `fun <A, B> Kind<ForSingleK, `[`A`](followed-by.html#A)`>.followedBy(arg1: Kind<ForSingleK, `[`B`](followed-by.html#B)`>): SingleK<`[`B`](followed-by.html#B)`>` |
| [followedByEval](followed-by-eval.html) | `fun <A, B> Kind<ForSingleK, `[`A`](followed-by-eval.html#A)`>.followedByEval(arg1: Eval<Kind<ForSingleK, `[`B`](followed-by-eval.html#B)`>>): SingleK<`[`B`](followed-by-eval.html#B)`>` |
| [forEffect](for-effect.html) | `fun <A, B> Kind<ForSingleK, `[`A`](for-effect.html#A)`>.forEffect(arg1: Kind<ForSingleK, `[`B`](for-effect.html#B)`>): SingleK<`[`A`](for-effect.html#A)`>` |
| [forEffectEval](for-effect-eval.html) | `fun <A, B> Kind<ForSingleK, `[`A`](for-effect-eval.html#A)`>.forEffectEval(arg1: Eval<Kind<ForSingleK, `[`B`](for-effect-eval.html#B)`>>): SingleK<`[`A`](for-effect-eval.html#A)`>` |
| [ifM](if-m.html) | `fun <B> Kind<ForSingleK, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>.ifM(arg1: () -> Kind<ForSingleK, `[`B`](if-m.html#B)`>, arg2: () -> Kind<ForSingleK, `[`B`](if-m.html#B)`>): SingleK<`[`B`](if-m.html#B)`>` |
| [map](map.html) | `fun <A, B> Kind<ForSingleK, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): SingleK<`[`B`](map.html#B)`>` |
| [mproduct](mproduct.html) | `fun <A, B> Kind<ForSingleK, `[`A`](mproduct.html#A)`>.mproduct(arg1: (`[`A`](mproduct.html#A)`) -> Kind<ForSingleK, `[`B`](mproduct.html#B)`>): SingleK<Tuple2<`[`A`](mproduct.html#A)`, `[`B`](mproduct.html#B)`>>` |

