---
title: arrow.free.instances.free.monad.arrow.Kind - arrow-instances-free
---

[arrow-instances-free](../../index.html) / [arrow.free.instances.free.monad](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [ap](ap.html) | `fun <S, A, B> Kind<Kind<ForFree, `[`S`](ap.html#S)`>, `[`A`](ap.html#A)`>.ap(arg1: Kind<Kind<ForFree, `[`S`](ap.html#S)`>, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): Free<`[`S`](ap.html#S)`, `[`B`](ap.html#B)`>` |
| [effectM](effect-m.html) | `fun <S, A, B> Kind<Kind<ForFree, `[`S`](effect-m.html#S)`>, `[`A`](effect-m.html#A)`>.effectM(arg1: (`[`A`](effect-m.html#A)`) -> Kind<Kind<ForFree, `[`S`](effect-m.html#S)`>, `[`B`](effect-m.html#B)`>): Free<`[`S`](effect-m.html#S)`, `[`A`](effect-m.html#A)`>` |
| [flatMap](flat-map.html) | `fun <S, A, B> Kind<Kind<ForFree, `[`S`](flat-map.html#S)`>, `[`A`](flat-map.html#A)`>.flatMap(arg1: (`[`A`](flat-map.html#A)`) -> Kind<Kind<ForFree, `[`S`](flat-map.html#S)`>, `[`B`](flat-map.html#B)`>): Free<`[`S`](flat-map.html#S)`, `[`B`](flat-map.html#B)`>` |
| [flatten](flatten.html) | `fun <S, A> Kind<Kind<ForFree, `[`S`](flatten.html#S)`>, Kind<Kind<ForFree, `[`S`](flatten.html#S)`>, `[`A`](flatten.html#A)`>>.flatten(): Free<`[`S`](flatten.html#S)`, `[`A`](flatten.html#A)`>` |
| [followedBy](followed-by.html) | `fun <S, A, B> Kind<Kind<ForFree, `[`S`](followed-by.html#S)`>, `[`A`](followed-by.html#A)`>.followedBy(arg1: Kind<Kind<ForFree, `[`S`](followed-by.html#S)`>, `[`B`](followed-by.html#B)`>): Free<`[`S`](followed-by.html#S)`, `[`B`](followed-by.html#B)`>` |
| [followedByEval](followed-by-eval.html) | `fun <S, A, B> Kind<Kind<ForFree, `[`S`](followed-by-eval.html#S)`>, `[`A`](followed-by-eval.html#A)`>.followedByEval(arg1: Eval<Kind<Kind<ForFree, `[`S`](followed-by-eval.html#S)`>, `[`B`](followed-by-eval.html#B)`>>): Free<`[`S`](followed-by-eval.html#S)`, `[`B`](followed-by-eval.html#B)`>` |
| [forEffect](for-effect.html) | `fun <S, A, B> Kind<Kind<ForFree, `[`S`](for-effect.html#S)`>, `[`A`](for-effect.html#A)`>.forEffect(arg1: Kind<Kind<ForFree, `[`S`](for-effect.html#S)`>, `[`B`](for-effect.html#B)`>): Free<`[`S`](for-effect.html#S)`, `[`A`](for-effect.html#A)`>` |
| [forEffectEval](for-effect-eval.html) | `fun <S, A, B> Kind<Kind<ForFree, `[`S`](for-effect-eval.html#S)`>, `[`A`](for-effect-eval.html#A)`>.forEffectEval(arg1: Eval<Kind<Kind<ForFree, `[`S`](for-effect-eval.html#S)`>, `[`B`](for-effect-eval.html#B)`>>): Free<`[`S`](for-effect-eval.html#S)`, `[`A`](for-effect-eval.html#A)`>` |
| [ifM](if-m.html) | `fun <S, B> Kind<Kind<ForFree, `[`S`](if-m.html#S)`>, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>.ifM(arg1: () -> Kind<Kind<ForFree, `[`S`](if-m.html#S)`>, `[`B`](if-m.html#B)`>, arg2: () -> Kind<Kind<ForFree, `[`S`](if-m.html#S)`>, `[`B`](if-m.html#B)`>): Free<`[`S`](if-m.html#S)`, `[`B`](if-m.html#B)`>` |
| [map](map.html) | `fun <S, A, B> Kind<Kind<ForFree, `[`S`](map.html#S)`>, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Free<`[`S`](map.html#S)`, `[`B`](map.html#B)`>` |
| [mproduct](mproduct.html) | `fun <S, A, B> Kind<Kind<ForFree, `[`S`](mproduct.html#S)`>, `[`A`](mproduct.html#A)`>.mproduct(arg1: (`[`A`](mproduct.html#A)`) -> Kind<Kind<ForFree, `[`S`](mproduct.html#S)`>, `[`B`](mproduct.html#B)`>): Free<`[`S`](mproduct.html#S)`, Tuple2<`[`A`](mproduct.html#A)`, `[`B`](mproduct.html#B)`>>` |

