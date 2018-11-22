---
title: arrow.instances.option.monad.arrow.Kind - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances.option.monad](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [ap](ap.html) | `fun <A, B> Kind<ForOption, `[`A`](ap.html#A)`>.ap(arg1: Kind<ForOption, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): Option<`[`B`](ap.html#B)`>` |
| [effectM](effect-m.html) | `fun <A, B> Kind<ForOption, `[`A`](effect-m.html#A)`>.effectM(arg1: (`[`A`](effect-m.html#A)`) -> Kind<ForOption, `[`B`](effect-m.html#B)`>): Option<`[`A`](effect-m.html#A)`>` |
| [flatMap](flat-map.html) | `fun <A, B> Kind<ForOption, `[`A`](flat-map.html#A)`>.flatMap(arg1: (`[`A`](flat-map.html#A)`) -> Kind<ForOption, `[`B`](flat-map.html#B)`>): Option<`[`B`](flat-map.html#B)`>` |
| [flatten](flatten.html) | `fun <A> Kind<ForOption, Kind<ForOption, `[`A`](flatten.html#A)`>>.flatten(): Option<`[`A`](flatten.html#A)`>` |
| [followedBy](followed-by.html) | `fun <A, B> Kind<ForOption, `[`A`](followed-by.html#A)`>.followedBy(arg1: Kind<ForOption, `[`B`](followed-by.html#B)`>): Option<`[`B`](followed-by.html#B)`>` |
| [followedByEval](followed-by-eval.html) | `fun <A, B> Kind<ForOption, `[`A`](followed-by-eval.html#A)`>.followedByEval(arg1: Eval<Kind<ForOption, `[`B`](followed-by-eval.html#B)`>>): Option<`[`B`](followed-by-eval.html#B)`>` |
| [forEffect](for-effect.html) | `fun <A, B> Kind<ForOption, `[`A`](for-effect.html#A)`>.forEffect(arg1: Kind<ForOption, `[`B`](for-effect.html#B)`>): Option<`[`A`](for-effect.html#A)`>` |
| [forEffectEval](for-effect-eval.html) | `fun <A, B> Kind<ForOption, `[`A`](for-effect-eval.html#A)`>.forEffectEval(arg1: Eval<Kind<ForOption, `[`B`](for-effect-eval.html#B)`>>): Option<`[`A`](for-effect-eval.html#A)`>` |
| [ifM](if-m.html) | `fun <B> Kind<ForOption, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>.ifM(arg1: () -> Kind<ForOption, `[`B`](if-m.html#B)`>, arg2: () -> Kind<ForOption, `[`B`](if-m.html#B)`>): Option<`[`B`](if-m.html#B)`>` |
| [map](map.html) | `fun <A, B> Kind<ForOption, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Option<`[`B`](map.html#B)`>` |
| [mproduct](mproduct.html) | `fun <A, B> Kind<ForOption, `[`A`](mproduct.html#A)`>.mproduct(arg1: (`[`A`](mproduct.html#A)`) -> Kind<ForOption, `[`B`](mproduct.html#B)`>): Option<Tuple2<`[`A`](mproduct.html#A)`, `[`B`](mproduct.html#B)`>>` |

