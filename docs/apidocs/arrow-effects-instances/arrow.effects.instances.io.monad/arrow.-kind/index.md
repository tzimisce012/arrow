---
title: arrow.effects.instances.io.monad.arrow.Kind - arrow-effects-instances
---

[arrow-effects-instances](../../index.html) / [arrow.effects.instances.io.monad](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [ap](ap.html) | `fun <A, B> Kind<ForIO, `[`A`](ap.html#A)`>.ap(arg1: Kind<ForIO, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): IO<`[`B`](ap.html#B)`>` |
| [effectM](effect-m.html) | `fun <A, B> Kind<ForIO, `[`A`](effect-m.html#A)`>.effectM(arg1: (`[`A`](effect-m.html#A)`) -> Kind<ForIO, `[`B`](effect-m.html#B)`>): IO<`[`A`](effect-m.html#A)`>` |
| [flatMap](flat-map.html) | `fun <A, B> Kind<ForIO, `[`A`](flat-map.html#A)`>.flatMap(arg1: (`[`A`](flat-map.html#A)`) -> Kind<ForIO, `[`B`](flat-map.html#B)`>): IO<`[`B`](flat-map.html#B)`>` |
| [flatten](flatten.html) | `fun <A> Kind<ForIO, Kind<ForIO, `[`A`](flatten.html#A)`>>.flatten(): IO<`[`A`](flatten.html#A)`>` |
| [followedBy](followed-by.html) | `fun <A, B> Kind<ForIO, `[`A`](followed-by.html#A)`>.followedBy(arg1: Kind<ForIO, `[`B`](followed-by.html#B)`>): IO<`[`B`](followed-by.html#B)`>` |
| [followedByEval](followed-by-eval.html) | `fun <A, B> Kind<ForIO, `[`A`](followed-by-eval.html#A)`>.followedByEval(arg1: Eval<Kind<ForIO, `[`B`](followed-by-eval.html#B)`>>): IO<`[`B`](followed-by-eval.html#B)`>` |
| [forEffect](for-effect.html) | `fun <A, B> Kind<ForIO, `[`A`](for-effect.html#A)`>.forEffect(arg1: Kind<ForIO, `[`B`](for-effect.html#B)`>): IO<`[`A`](for-effect.html#A)`>` |
| [forEffectEval](for-effect-eval.html) | `fun <A, B> Kind<ForIO, `[`A`](for-effect-eval.html#A)`>.forEffectEval(arg1: Eval<Kind<ForIO, `[`B`](for-effect-eval.html#B)`>>): IO<`[`A`](for-effect-eval.html#A)`>` |
| [ifM](if-m.html) | `fun <B> Kind<ForIO, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>.ifM(arg1: () -> Kind<ForIO, `[`B`](if-m.html#B)`>, arg2: () -> Kind<ForIO, `[`B`](if-m.html#B)`>): IO<`[`B`](if-m.html#B)`>` |
| [map](map.html) | `fun <A, B> Kind<ForIO, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): IO<`[`B`](map.html#B)`>` |
| [mproduct](mproduct.html) | `fun <A, B> Kind<ForIO, `[`A`](mproduct.html#A)`>.mproduct(arg1: (`[`A`](mproduct.html#A)`) -> Kind<ForIO, `[`B`](mproduct.html#B)`>): IO<Tuple2<`[`A`](mproduct.html#A)`, `[`B`](mproduct.html#B)`>>` |

