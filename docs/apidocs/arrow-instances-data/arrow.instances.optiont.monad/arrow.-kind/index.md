---
title: arrow.instances.optiont.monad.arrow.Kind - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.optiont.monad](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [ap](ap.html) | `fun <F, A, B> Kind<Kind<ForOptionT, `[`F`](ap.html#F)`>, `[`A`](ap.html#A)`>.ap(arg1: Kind<Kind<ForOptionT, `[`F`](ap.html#F)`>, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>, MF: Monad<`[`F`](ap.html#F)`>): OptionT<`[`F`](ap.html#F)`, `[`B`](ap.html#B)`>` |
| [effectM](effect-m.html) | `fun <F, A, B> Kind<Kind<ForOptionT, `[`F`](effect-m.html#F)`>, `[`A`](effect-m.html#A)`>.effectM(arg1: (`[`A`](effect-m.html#A)`) -> Kind<Kind<ForOptionT, `[`F`](effect-m.html#F)`>, `[`B`](effect-m.html#B)`>, MF: Monad<`[`F`](effect-m.html#F)`>): OptionT<`[`F`](effect-m.html#F)`, `[`A`](effect-m.html#A)`>` |
| [flatMap](flat-map.html) | `fun <F, A, B> Kind<Kind<ForOptionT, `[`F`](flat-map.html#F)`>, `[`A`](flat-map.html#A)`>.flatMap(arg1: (`[`A`](flat-map.html#A)`) -> Kind<Kind<ForOptionT, `[`F`](flat-map.html#F)`>, `[`B`](flat-map.html#B)`>, MF: Monad<`[`F`](flat-map.html#F)`>): OptionT<`[`F`](flat-map.html#F)`, `[`B`](flat-map.html#B)`>` |
| [flatten](flatten.html) | `fun <F, A> Kind<Kind<ForOptionT, `[`F`](flatten.html#F)`>, Kind<Kind<ForOptionT, `[`F`](flatten.html#F)`>, `[`A`](flatten.html#A)`>>.flatten(MF: Monad<`[`F`](flatten.html#F)`>): OptionT<`[`F`](flatten.html#F)`, `[`A`](flatten.html#A)`>` |
| [followedBy](followed-by.html) | `fun <F, A, B> Kind<Kind<ForOptionT, `[`F`](followed-by.html#F)`>, `[`A`](followed-by.html#A)`>.followedBy(arg1: Kind<Kind<ForOptionT, `[`F`](followed-by.html#F)`>, `[`B`](followed-by.html#B)`>, MF: Monad<`[`F`](followed-by.html#F)`>): OptionT<`[`F`](followed-by.html#F)`, `[`B`](followed-by.html#B)`>` |
| [followedByEval](followed-by-eval.html) | `fun <F, A, B> Kind<Kind<ForOptionT, `[`F`](followed-by-eval.html#F)`>, `[`A`](followed-by-eval.html#A)`>.followedByEval(arg1: Eval<Kind<Kind<ForOptionT, `[`F`](followed-by-eval.html#F)`>, `[`B`](followed-by-eval.html#B)`>>, MF: Monad<`[`F`](followed-by-eval.html#F)`>): OptionT<`[`F`](followed-by-eval.html#F)`, `[`B`](followed-by-eval.html#B)`>` |
| [forEffect](for-effect.html) | `fun <F, A, B> Kind<Kind<ForOptionT, `[`F`](for-effect.html#F)`>, `[`A`](for-effect.html#A)`>.forEffect(arg1: Kind<Kind<ForOptionT, `[`F`](for-effect.html#F)`>, `[`B`](for-effect.html#B)`>, MF: Monad<`[`F`](for-effect.html#F)`>): OptionT<`[`F`](for-effect.html#F)`, `[`A`](for-effect.html#A)`>` |
| [forEffectEval](for-effect-eval.html) | `fun <F, A, B> Kind<Kind<ForOptionT, `[`F`](for-effect-eval.html#F)`>, `[`A`](for-effect-eval.html#A)`>.forEffectEval(arg1: Eval<Kind<Kind<ForOptionT, `[`F`](for-effect-eval.html#F)`>, `[`B`](for-effect-eval.html#B)`>>, MF: Monad<`[`F`](for-effect-eval.html#F)`>): OptionT<`[`F`](for-effect-eval.html#F)`, `[`A`](for-effect-eval.html#A)`>` |
| [ifM](if-m.html) | `fun <F, B> Kind<Kind<ForOptionT, `[`F`](if-m.html#F)`>, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>.ifM(arg1: () -> Kind<Kind<ForOptionT, `[`F`](if-m.html#F)`>, `[`B`](if-m.html#B)`>, arg2: () -> Kind<Kind<ForOptionT, `[`F`](if-m.html#F)`>, `[`B`](if-m.html#B)`>, MF: Monad<`[`F`](if-m.html#F)`>): OptionT<`[`F`](if-m.html#F)`, `[`B`](if-m.html#B)`>` |
| [map](map.html) | `fun <F, A, B> Kind<Kind<ForOptionT, `[`F`](map.html#F)`>, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`, MF: Monad<`[`F`](map.html#F)`>): OptionT<`[`F`](map.html#F)`, `[`B`](map.html#B)`>` |
| [mproduct](mproduct.html) | `fun <F, A, B> Kind<Kind<ForOptionT, `[`F`](mproduct.html#F)`>, `[`A`](mproduct.html#A)`>.mproduct(arg1: (`[`A`](mproduct.html#A)`) -> Kind<Kind<ForOptionT, `[`F`](mproduct.html#F)`>, `[`B`](mproduct.html#B)`>, MF: Monad<`[`F`](mproduct.html#F)`>): OptionT<`[`F`](mproduct.html#F)`, Tuple2<`[`A`](mproduct.html#A)`, `[`B`](mproduct.html#B)`>>` |

