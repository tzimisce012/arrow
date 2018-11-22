---
title: arrow.instances.tuple2.monad.arrow.Kind - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances.tuple2.monad](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [ap](ap.html) | `fun <F, A, B> Kind<Kind<ForTuple2, `[`F`](ap.html#F)`>, `[`A`](ap.html#A)`>.ap(arg1: Kind<Kind<ForTuple2, `[`F`](ap.html#F)`>, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>, MF: Monoid<`[`F`](ap.html#F)`>): Tuple2<`[`F`](ap.html#F)`, `[`B`](ap.html#B)`>` |
| [effectM](effect-m.html) | `fun <F, A, B> Kind<Kind<ForTuple2, `[`F`](effect-m.html#F)`>, `[`A`](effect-m.html#A)`>.effectM(arg1: (`[`A`](effect-m.html#A)`) -> Kind<Kind<ForTuple2, `[`F`](effect-m.html#F)`>, `[`B`](effect-m.html#B)`>, MF: Monoid<`[`F`](effect-m.html#F)`>): Tuple2<`[`F`](effect-m.html#F)`, `[`A`](effect-m.html#A)`>` |
| [flatMap](flat-map.html) | `fun <F, A, B> Kind<Kind<ForTuple2, `[`F`](flat-map.html#F)`>, `[`A`](flat-map.html#A)`>.flatMap(arg1: (`[`A`](flat-map.html#A)`) -> Kind<Kind<ForTuple2, `[`F`](flat-map.html#F)`>, `[`B`](flat-map.html#B)`>, MF: Monoid<`[`F`](flat-map.html#F)`>): Tuple2<`[`F`](flat-map.html#F)`, `[`B`](flat-map.html#B)`>` |
| [flatten](flatten.html) | `fun <F, A> Kind<Kind<ForTuple2, `[`F`](flatten.html#F)`>, Kind<Kind<ForTuple2, `[`F`](flatten.html#F)`>, `[`A`](flatten.html#A)`>>.flatten(MF: Monoid<`[`F`](flatten.html#F)`>): Tuple2<`[`F`](flatten.html#F)`, `[`A`](flatten.html#A)`>` |
| [followedBy](followed-by.html) | `fun <F, A, B> Kind<Kind<ForTuple2, `[`F`](followed-by.html#F)`>, `[`A`](followed-by.html#A)`>.followedBy(arg1: Kind<Kind<ForTuple2, `[`F`](followed-by.html#F)`>, `[`B`](followed-by.html#B)`>, MF: Monoid<`[`F`](followed-by.html#F)`>): Tuple2<`[`F`](followed-by.html#F)`, `[`B`](followed-by.html#B)`>` |
| [followedByEval](followed-by-eval.html) | `fun <F, A, B> Kind<Kind<ForTuple2, `[`F`](followed-by-eval.html#F)`>, `[`A`](followed-by-eval.html#A)`>.followedByEval(arg1: Eval<Kind<Kind<ForTuple2, `[`F`](followed-by-eval.html#F)`>, `[`B`](followed-by-eval.html#B)`>>, MF: Monoid<`[`F`](followed-by-eval.html#F)`>): Tuple2<`[`F`](followed-by-eval.html#F)`, `[`B`](followed-by-eval.html#B)`>` |
| [forEffect](for-effect.html) | `fun <F, A, B> Kind<Kind<ForTuple2, `[`F`](for-effect.html#F)`>, `[`A`](for-effect.html#A)`>.forEffect(arg1: Kind<Kind<ForTuple2, `[`F`](for-effect.html#F)`>, `[`B`](for-effect.html#B)`>, MF: Monoid<`[`F`](for-effect.html#F)`>): Tuple2<`[`F`](for-effect.html#F)`, `[`A`](for-effect.html#A)`>` |
| [forEffectEval](for-effect-eval.html) | `fun <F, A, B> Kind<Kind<ForTuple2, `[`F`](for-effect-eval.html#F)`>, `[`A`](for-effect-eval.html#A)`>.forEffectEval(arg1: Eval<Kind<Kind<ForTuple2, `[`F`](for-effect-eval.html#F)`>, `[`B`](for-effect-eval.html#B)`>>, MF: Monoid<`[`F`](for-effect-eval.html#F)`>): Tuple2<`[`F`](for-effect-eval.html#F)`, `[`A`](for-effect-eval.html#A)`>` |
| [ifM](if-m.html) | `fun <F, B> Kind<Kind<ForTuple2, `[`F`](if-m.html#F)`>, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>.ifM(arg1: () -> Kind<Kind<ForTuple2, `[`F`](if-m.html#F)`>, `[`B`](if-m.html#B)`>, arg2: () -> Kind<Kind<ForTuple2, `[`F`](if-m.html#F)`>, `[`B`](if-m.html#B)`>, MF: Monoid<`[`F`](if-m.html#F)`>): Tuple2<`[`F`](if-m.html#F)`, `[`B`](if-m.html#B)`>` |
| [map](map.html) | `fun <F, A, B> Kind<Kind<ForTuple2, `[`F`](map.html#F)`>, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`, MF: Monoid<`[`F`](map.html#F)`>): Tuple2<`[`F`](map.html#F)`, `[`B`](map.html#B)`>` |
| [mproduct](mproduct.html) | `fun <F, A, B> Kind<Kind<ForTuple2, `[`F`](mproduct.html#F)`>, `[`A`](mproduct.html#A)`>.mproduct(arg1: (`[`A`](mproduct.html#A)`) -> Kind<Kind<ForTuple2, `[`F`](mproduct.html#F)`>, `[`B`](mproduct.html#B)`>, MF: Monoid<`[`F`](mproduct.html#F)`>): Tuple2<`[`F`](mproduct.html#F)`, Tuple2<`[`A`](mproduct.html#A)`, `[`B`](mproduct.html#B)`>>` |

