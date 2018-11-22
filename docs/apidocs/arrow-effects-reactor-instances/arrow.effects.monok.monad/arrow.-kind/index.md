---
title: arrow.effects.monok.monad.arrow.Kind - arrow-effects-reactor-instances
---

[arrow-effects-reactor-instances](../../index.html) / [arrow.effects.monok.monad](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [ap](ap.html) | `fun <A, B> Kind<ForMonoK, `[`A`](ap.html#A)`>.ap(arg1: Kind<ForMonoK, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): MonoK<`[`B`](ap.html#B)`>` |
| [effectM](effect-m.html) | `fun <A, B> Kind<ForMonoK, `[`A`](effect-m.html#A)`>.effectM(arg1: (`[`A`](effect-m.html#A)`) -> Kind<ForMonoK, `[`B`](effect-m.html#B)`>): MonoK<`[`A`](effect-m.html#A)`>` |
| [flatMap](flat-map.html) | `fun <A, B> Kind<ForMonoK, `[`A`](flat-map.html#A)`>.flatMap(arg1: (`[`A`](flat-map.html#A)`) -> Kind<ForMonoK, `[`B`](flat-map.html#B)`>): MonoK<`[`B`](flat-map.html#B)`>` |
| [flatten](flatten.html) | `fun <A> Kind<ForMonoK, Kind<ForMonoK, `[`A`](flatten.html#A)`>>.flatten(): MonoK<`[`A`](flatten.html#A)`>` |
| [followedBy](followed-by.html) | `fun <A, B> Kind<ForMonoK, `[`A`](followed-by.html#A)`>.followedBy(arg1: Kind<ForMonoK, `[`B`](followed-by.html#B)`>): MonoK<`[`B`](followed-by.html#B)`>` |
| [followedByEval](followed-by-eval.html) | `fun <A, B> Kind<ForMonoK, `[`A`](followed-by-eval.html#A)`>.followedByEval(arg1: Eval<Kind<ForMonoK, `[`B`](followed-by-eval.html#B)`>>): MonoK<`[`B`](followed-by-eval.html#B)`>` |
| [forEffect](for-effect.html) | `fun <A, B> Kind<ForMonoK, `[`A`](for-effect.html#A)`>.forEffect(arg1: Kind<ForMonoK, `[`B`](for-effect.html#B)`>): MonoK<`[`A`](for-effect.html#A)`>` |
| [forEffectEval](for-effect-eval.html) | `fun <A, B> Kind<ForMonoK, `[`A`](for-effect-eval.html#A)`>.forEffectEval(arg1: Eval<Kind<ForMonoK, `[`B`](for-effect-eval.html#B)`>>): MonoK<`[`A`](for-effect-eval.html#A)`>` |
| [ifM](if-m.html) | `fun <B> Kind<ForMonoK, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>.ifM(arg1: () -> Kind<ForMonoK, `[`B`](if-m.html#B)`>, arg2: () -> Kind<ForMonoK, `[`B`](if-m.html#B)`>): MonoK<`[`B`](if-m.html#B)`>` |
| [map](map.html) | `fun <A, B> Kind<ForMonoK, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): MonoK<`[`B`](map.html#B)`>` |
| [mproduct](mproduct.html) | `fun <A, B> Kind<ForMonoK, `[`A`](mproduct.html#A)`>.mproduct(arg1: (`[`A`](mproduct.html#A)`) -> Kind<ForMonoK, `[`B`](mproduct.html#B)`>): MonoK<Tuple2<`[`A`](mproduct.html#A)`, `[`B`](mproduct.html#B)`>>` |

