---
title: arrow.instances.try.monad.arrow.Kind - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances.try.monad](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [ap](ap.html) | `fun <A, B> Kind<ForTry, `[`A`](ap.html#A)`>.ap(arg1: Kind<ForTry, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): Try<`[`B`](ap.html#B)`>` |
| [effectM](effect-m.html) | `fun <A, B> Kind<ForTry, `[`A`](effect-m.html#A)`>.effectM(arg1: (`[`A`](effect-m.html#A)`) -> Kind<ForTry, `[`B`](effect-m.html#B)`>): Try<`[`A`](effect-m.html#A)`>` |
| [flatMap](flat-map.html) | `fun <A, B> Kind<ForTry, `[`A`](flat-map.html#A)`>.flatMap(arg1: (`[`A`](flat-map.html#A)`) -> Kind<ForTry, `[`B`](flat-map.html#B)`>): Try<`[`B`](flat-map.html#B)`>` |
| [flatten](flatten.html) | `fun <A> Kind<ForTry, Kind<ForTry, `[`A`](flatten.html#A)`>>.flatten(): Try<`[`A`](flatten.html#A)`>` |
| [followedBy](followed-by.html) | `fun <A, B> Kind<ForTry, `[`A`](followed-by.html#A)`>.followedBy(arg1: Kind<ForTry, `[`B`](followed-by.html#B)`>): Try<`[`B`](followed-by.html#B)`>` |
| [followedByEval](followed-by-eval.html) | `fun <A, B> Kind<ForTry, `[`A`](followed-by-eval.html#A)`>.followedByEval(arg1: Eval<Kind<ForTry, `[`B`](followed-by-eval.html#B)`>>): Try<`[`B`](followed-by-eval.html#B)`>` |
| [forEffect](for-effect.html) | `fun <A, B> Kind<ForTry, `[`A`](for-effect.html#A)`>.forEffect(arg1: Kind<ForTry, `[`B`](for-effect.html#B)`>): Try<`[`A`](for-effect.html#A)`>` |
| [forEffectEval](for-effect-eval.html) | `fun <A, B> Kind<ForTry, `[`A`](for-effect-eval.html#A)`>.forEffectEval(arg1: Eval<Kind<ForTry, `[`B`](for-effect-eval.html#B)`>>): Try<`[`A`](for-effect-eval.html#A)`>` |
| [ifM](if-m.html) | `fun <B> Kind<ForTry, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>.ifM(arg1: () -> Kind<ForTry, `[`B`](if-m.html#B)`>, arg2: () -> Kind<ForTry, `[`B`](if-m.html#B)`>): Try<`[`B`](if-m.html#B)`>` |
| [map](map.html) | `fun <A, B> Kind<ForTry, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Try<`[`B`](map.html#B)`>` |
| [mproduct](mproduct.html) | `fun <A, B> Kind<ForTry, `[`A`](mproduct.html#A)`>.mproduct(arg1: (`[`A`](mproduct.html#A)`) -> Kind<ForTry, `[`B`](mproduct.html#B)`>): Try<Tuple2<`[`A`](mproduct.html#A)`, `[`B`](mproduct.html#B)`>>` |

