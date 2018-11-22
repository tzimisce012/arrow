---
title: arrow.instances.function1.monad.arrow.Kind - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances.function1.monad](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [ap](ap.html) | `fun <I, A, B> Kind<Kind<ForFunction1, `[`I`](ap.html#I)`>, `[`A`](ap.html#A)`>.ap(arg1: Kind<Kind<ForFunction1, `[`I`](ap.html#I)`>, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): (`[`I`](ap.html#I)`) -> `[`B`](ap.html#B) |
| [effectM](effect-m.html) | `fun <I, A, B> Kind<Kind<ForFunction1, `[`I`](effect-m.html#I)`>, `[`A`](effect-m.html#A)`>.effectM(arg1: (`[`A`](effect-m.html#A)`) -> Kind<Kind<ForFunction1, `[`I`](effect-m.html#I)`>, `[`B`](effect-m.html#B)`>): (`[`I`](effect-m.html#I)`) -> `[`A`](effect-m.html#A) |
| [flatMap](flat-map.html) | `fun <I, A, B> Kind<Kind<ForFunction1, `[`I`](flat-map.html#I)`>, `[`A`](flat-map.html#A)`>.flatMap(arg1: (`[`A`](flat-map.html#A)`) -> Kind<Kind<ForFunction1, `[`I`](flat-map.html#I)`>, `[`B`](flat-map.html#B)`>): (`[`I`](flat-map.html#I)`) -> `[`B`](flat-map.html#B) |
| [flatten](flatten.html) | `fun <I, A> Kind<Kind<ForFunction1, `[`I`](flatten.html#I)`>, Kind<Kind<ForFunction1, `[`I`](flatten.html#I)`>, `[`A`](flatten.html#A)`>>.flatten(): (`[`I`](flatten.html#I)`) -> `[`A`](flatten.html#A) |
| [followedBy](followed-by.html) | `fun <I, A, B> Kind<Kind<ForFunction1, `[`I`](followed-by.html#I)`>, `[`A`](followed-by.html#A)`>.followedBy(arg1: Kind<Kind<ForFunction1, `[`I`](followed-by.html#I)`>, `[`B`](followed-by.html#B)`>): (`[`I`](followed-by.html#I)`) -> `[`B`](followed-by.html#B) |
| [followedByEval](followed-by-eval.html) | `fun <I, A, B> Kind<Kind<ForFunction1, `[`I`](followed-by-eval.html#I)`>, `[`A`](followed-by-eval.html#A)`>.followedByEval(arg1: Eval<Kind<Kind<ForFunction1, `[`I`](followed-by-eval.html#I)`>, `[`B`](followed-by-eval.html#B)`>>): (`[`I`](followed-by-eval.html#I)`) -> `[`B`](followed-by-eval.html#B) |
| [forEffect](for-effect.html) | `fun <I, A, B> Kind<Kind<ForFunction1, `[`I`](for-effect.html#I)`>, `[`A`](for-effect.html#A)`>.forEffect(arg1: Kind<Kind<ForFunction1, `[`I`](for-effect.html#I)`>, `[`B`](for-effect.html#B)`>): (`[`I`](for-effect.html#I)`) -> `[`A`](for-effect.html#A) |
| [forEffectEval](for-effect-eval.html) | `fun <I, A, B> Kind<Kind<ForFunction1, `[`I`](for-effect-eval.html#I)`>, `[`A`](for-effect-eval.html#A)`>.forEffectEval(arg1: Eval<Kind<Kind<ForFunction1, `[`I`](for-effect-eval.html#I)`>, `[`B`](for-effect-eval.html#B)`>>): (`[`I`](for-effect-eval.html#I)`) -> `[`A`](for-effect-eval.html#A) |
| [ifM](if-m.html) | `fun <I, B> Kind<Kind<ForFunction1, `[`I`](if-m.html#I)`>, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>.ifM(arg1: () -> Kind<Kind<ForFunction1, `[`I`](if-m.html#I)`>, `[`B`](if-m.html#B)`>, arg2: () -> Kind<Kind<ForFunction1, `[`I`](if-m.html#I)`>, `[`B`](if-m.html#B)`>): (`[`I`](if-m.html#I)`) -> `[`B`](if-m.html#B) |
| [map](map.html) | `fun <I, A, B> Kind<Kind<ForFunction1, `[`I`](map.html#I)`>, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): (`[`I`](map.html#I)`) -> `[`B`](map.html#B) |
| [mproduct](mproduct.html) | `fun <I, A, B> Kind<Kind<ForFunction1, `[`I`](mproduct.html#I)`>, `[`A`](mproduct.html#A)`>.mproduct(arg1: (`[`A`](mproduct.html#A)`) -> Kind<Kind<ForFunction1, `[`I`](mproduct.html#I)`>, `[`B`](mproduct.html#B)`>): (`[`I`](mproduct.html#I)`) -> Tuple2<`[`A`](mproduct.html#A)`, `[`B`](mproduct.html#B)`>` |

