---
title: arrow.instances.function0.monad.arrow.Kind - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances.function0.monad](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [ap](ap.html) | `fun <A, B> Kind<ForFunction0, `[`A`](ap.html#A)`>.ap(arg1: Kind<ForFunction0, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): () -> `[`B`](ap.html#B) |
| [effectM](effect-m.html) | `fun <A, B> Kind<ForFunction0, `[`A`](effect-m.html#A)`>.effectM(arg1: (`[`A`](effect-m.html#A)`) -> Kind<ForFunction0, `[`B`](effect-m.html#B)`>): () -> `[`A`](effect-m.html#A) |
| [flatMap](flat-map.html) | `fun <A, B> Kind<ForFunction0, `[`A`](flat-map.html#A)`>.flatMap(arg1: (`[`A`](flat-map.html#A)`) -> Kind<ForFunction0, `[`B`](flat-map.html#B)`>): () -> `[`B`](flat-map.html#B) |
| [flatten](flatten.html) | `fun <A> Kind<ForFunction0, Kind<ForFunction0, `[`A`](flatten.html#A)`>>.flatten(): () -> `[`A`](flatten.html#A) |
| [followedBy](followed-by.html) | `fun <A, B> Kind<ForFunction0, `[`A`](followed-by.html#A)`>.followedBy(arg1: Kind<ForFunction0, `[`B`](followed-by.html#B)`>): () -> `[`B`](followed-by.html#B) |
| [followedByEval](followed-by-eval.html) | `fun <A, B> Kind<ForFunction0, `[`A`](followed-by-eval.html#A)`>.followedByEval(arg1: Eval<Kind<ForFunction0, `[`B`](followed-by-eval.html#B)`>>): () -> `[`B`](followed-by-eval.html#B) |
| [forEffect](for-effect.html) | `fun <A, B> Kind<ForFunction0, `[`A`](for-effect.html#A)`>.forEffect(arg1: Kind<ForFunction0, `[`B`](for-effect.html#B)`>): () -> `[`A`](for-effect.html#A) |
| [forEffectEval](for-effect-eval.html) | `fun <A, B> Kind<ForFunction0, `[`A`](for-effect-eval.html#A)`>.forEffectEval(arg1: Eval<Kind<ForFunction0, `[`B`](for-effect-eval.html#B)`>>): () -> `[`A`](for-effect-eval.html#A) |
| [ifM](if-m.html) | `fun <B> Kind<ForFunction0, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>.ifM(arg1: () -> Kind<ForFunction0, `[`B`](if-m.html#B)`>, arg2: () -> Kind<ForFunction0, `[`B`](if-m.html#B)`>): () -> `[`B`](if-m.html#B) |
| [map](map.html) | `fun <A, B> Kind<ForFunction0, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): () -> `[`B`](map.html#B) |
| [mproduct](mproduct.html) | `fun <A, B> Kind<ForFunction0, `[`A`](mproduct.html#A)`>.mproduct(arg1: (`[`A`](mproduct.html#A)`) -> Kind<ForFunction0, `[`B`](mproduct.html#B)`>): () -> Tuple2<`[`A`](mproduct.html#A)`, `[`B`](mproduct.html#B)`>` |

