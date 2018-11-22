---
title: arrow.instances.ior.monad.arrow.Kind - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.ior.monad](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [ap](ap.html) | `fun <L, A, B> Kind<Kind<ForIor, `[`L`](ap.html#L)`>, `[`A`](ap.html#A)`>.ap(arg1: Kind<Kind<ForIor, `[`L`](ap.html#L)`>, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>, SL: Semigroup<`[`L`](ap.html#L)`>): Ior<`[`L`](ap.html#L)`, `[`B`](ap.html#B)`>` |
| [effectM](effect-m.html) | `fun <L, A, B> Kind<Kind<ForIor, `[`L`](effect-m.html#L)`>, `[`A`](effect-m.html#A)`>.effectM(arg1: (`[`A`](effect-m.html#A)`) -> Kind<Kind<ForIor, `[`L`](effect-m.html#L)`>, `[`B`](effect-m.html#B)`>, SL: Semigroup<`[`L`](effect-m.html#L)`>): Ior<`[`L`](effect-m.html#L)`, `[`A`](effect-m.html#A)`>` |
| [flatMap](flat-map.html) | `fun <L, A, B> Kind<Kind<ForIor, `[`L`](flat-map.html#L)`>, `[`A`](flat-map.html#A)`>.flatMap(arg1: (`[`A`](flat-map.html#A)`) -> Kind<Kind<ForIor, `[`L`](flat-map.html#L)`>, `[`B`](flat-map.html#B)`>, SL: Semigroup<`[`L`](flat-map.html#L)`>): Ior<`[`L`](flat-map.html#L)`, `[`B`](flat-map.html#B)`>` |
| [flatten](flatten.html) | `fun <L, A> Kind<Kind<ForIor, `[`L`](flatten.html#L)`>, Kind<Kind<ForIor, `[`L`](flatten.html#L)`>, `[`A`](flatten.html#A)`>>.flatten(SL: Semigroup<`[`L`](flatten.html#L)`>): Ior<`[`L`](flatten.html#L)`, `[`A`](flatten.html#A)`>` |
| [followedBy](followed-by.html) | `fun <L, A, B> Kind<Kind<ForIor, `[`L`](followed-by.html#L)`>, `[`A`](followed-by.html#A)`>.followedBy(arg1: Kind<Kind<ForIor, `[`L`](followed-by.html#L)`>, `[`B`](followed-by.html#B)`>, SL: Semigroup<`[`L`](followed-by.html#L)`>): Ior<`[`L`](followed-by.html#L)`, `[`B`](followed-by.html#B)`>` |
| [followedByEval](followed-by-eval.html) | `fun <L, A, B> Kind<Kind<ForIor, `[`L`](followed-by-eval.html#L)`>, `[`A`](followed-by-eval.html#A)`>.followedByEval(arg1: Eval<Kind<Kind<ForIor, `[`L`](followed-by-eval.html#L)`>, `[`B`](followed-by-eval.html#B)`>>, SL: Semigroup<`[`L`](followed-by-eval.html#L)`>): Ior<`[`L`](followed-by-eval.html#L)`, `[`B`](followed-by-eval.html#B)`>` |
| [forEffect](for-effect.html) | `fun <L, A, B> Kind<Kind<ForIor, `[`L`](for-effect.html#L)`>, `[`A`](for-effect.html#A)`>.forEffect(arg1: Kind<Kind<ForIor, `[`L`](for-effect.html#L)`>, `[`B`](for-effect.html#B)`>, SL: Semigroup<`[`L`](for-effect.html#L)`>): Ior<`[`L`](for-effect.html#L)`, `[`A`](for-effect.html#A)`>` |
| [forEffectEval](for-effect-eval.html) | `fun <L, A, B> Kind<Kind<ForIor, `[`L`](for-effect-eval.html#L)`>, `[`A`](for-effect-eval.html#A)`>.forEffectEval(arg1: Eval<Kind<Kind<ForIor, `[`L`](for-effect-eval.html#L)`>, `[`B`](for-effect-eval.html#B)`>>, SL: Semigroup<`[`L`](for-effect-eval.html#L)`>): Ior<`[`L`](for-effect-eval.html#L)`, `[`A`](for-effect-eval.html#A)`>` |
| [ifM](if-m.html) | `fun <L, B> Kind<Kind<ForIor, `[`L`](if-m.html#L)`>, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>.ifM(arg1: () -> Kind<Kind<ForIor, `[`L`](if-m.html#L)`>, `[`B`](if-m.html#B)`>, arg2: () -> Kind<Kind<ForIor, `[`L`](if-m.html#L)`>, `[`B`](if-m.html#B)`>, SL: Semigroup<`[`L`](if-m.html#L)`>): Ior<`[`L`](if-m.html#L)`, `[`B`](if-m.html#B)`>` |
| [map](map.html) | `fun <L, A, B> Kind<Kind<ForIor, `[`L`](map.html#L)`>, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`, SL: Semigroup<`[`L`](map.html#L)`>): Ior<`[`L`](map.html#L)`, `[`B`](map.html#B)`>` |
| [mproduct](mproduct.html) | `fun <L, A, B> Kind<Kind<ForIor, `[`L`](mproduct.html#L)`>, `[`A`](mproduct.html#A)`>.mproduct(arg1: (`[`A`](mproduct.html#A)`) -> Kind<Kind<ForIor, `[`L`](mproduct.html#L)`>, `[`B`](mproduct.html#B)`>, SL: Semigroup<`[`L`](mproduct.html#L)`>): Ior<`[`L`](mproduct.html#L)`, Tuple2<`[`A`](mproduct.html#A)`, `[`B`](mproduct.html#B)`>>` |

