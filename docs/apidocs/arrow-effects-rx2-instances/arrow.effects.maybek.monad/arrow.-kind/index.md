---
title: arrow.effects.maybek.monad.arrow.Kind - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects.maybek.monad](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [ap](ap.html) | `fun <A, B> Kind<ForMaybeK, `[`A`](ap.html#A)`>.ap(arg1: Kind<ForMaybeK, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): MaybeK<`[`B`](ap.html#B)`>` |
| [effectM](effect-m.html) | `fun <A, B> Kind<ForMaybeK, `[`A`](effect-m.html#A)`>.effectM(arg1: (`[`A`](effect-m.html#A)`) -> Kind<ForMaybeK, `[`B`](effect-m.html#B)`>): MaybeK<`[`A`](effect-m.html#A)`>` |
| [flatMap](flat-map.html) | `fun <A, B> Kind<ForMaybeK, `[`A`](flat-map.html#A)`>.flatMap(arg1: (`[`A`](flat-map.html#A)`) -> Kind<ForMaybeK, `[`B`](flat-map.html#B)`>): MaybeK<`[`B`](flat-map.html#B)`>` |
| [flatten](flatten.html) | `fun <A> Kind<ForMaybeK, Kind<ForMaybeK, `[`A`](flatten.html#A)`>>.flatten(): MaybeK<`[`A`](flatten.html#A)`>` |
| [followedBy](followed-by.html) | `fun <A, B> Kind<ForMaybeK, `[`A`](followed-by.html#A)`>.followedBy(arg1: Kind<ForMaybeK, `[`B`](followed-by.html#B)`>): MaybeK<`[`B`](followed-by.html#B)`>` |
| [followedByEval](followed-by-eval.html) | `fun <A, B> Kind<ForMaybeK, `[`A`](followed-by-eval.html#A)`>.followedByEval(arg1: Eval<Kind<ForMaybeK, `[`B`](followed-by-eval.html#B)`>>): MaybeK<`[`B`](followed-by-eval.html#B)`>` |
| [forEffect](for-effect.html) | `fun <A, B> Kind<ForMaybeK, `[`A`](for-effect.html#A)`>.forEffect(arg1: Kind<ForMaybeK, `[`B`](for-effect.html#B)`>): MaybeK<`[`A`](for-effect.html#A)`>` |
| [forEffectEval](for-effect-eval.html) | `fun <A, B> Kind<ForMaybeK, `[`A`](for-effect-eval.html#A)`>.forEffectEval(arg1: Eval<Kind<ForMaybeK, `[`B`](for-effect-eval.html#B)`>>): MaybeK<`[`A`](for-effect-eval.html#A)`>` |
| [ifM](if-m.html) | `fun <B> Kind<ForMaybeK, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>.ifM(arg1: () -> Kind<ForMaybeK, `[`B`](if-m.html#B)`>, arg2: () -> Kind<ForMaybeK, `[`B`](if-m.html#B)`>): MaybeK<`[`B`](if-m.html#B)`>` |
| [map](map.html) | `fun <A, B> Kind<ForMaybeK, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): MaybeK<`[`B`](map.html#B)`>` |
| [mproduct](mproduct.html) | `fun <A, B> Kind<ForMaybeK, `[`A`](mproduct.html#A)`>.mproduct(arg1: (`[`A`](mproduct.html#A)`) -> Kind<ForMaybeK, `[`B`](mproduct.html#B)`>): MaybeK<Tuple2<`[`A`](mproduct.html#A)`, `[`B`](mproduct.html#B)`>>` |

