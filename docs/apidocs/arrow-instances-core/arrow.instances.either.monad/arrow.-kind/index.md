---
title: arrow.instances.either.monad.arrow.Kind - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances.either.monad](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [ap](ap.html) | `fun <L, A, B> Kind<Kind<ForEither, `[`L`](ap.html#L)`>, `[`A`](ap.html#A)`>.ap(arg1: Kind<Kind<ForEither, `[`L`](ap.html#L)`>, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): Either<`[`L`](ap.html#L)`, `[`B`](ap.html#B)`>` |
| [effectM](effect-m.html) | `fun <L, A, B> Kind<Kind<ForEither, `[`L`](effect-m.html#L)`>, `[`A`](effect-m.html#A)`>.effectM(arg1: (`[`A`](effect-m.html#A)`) -> Kind<Kind<ForEither, `[`L`](effect-m.html#L)`>, `[`B`](effect-m.html#B)`>): Either<`[`L`](effect-m.html#L)`, `[`A`](effect-m.html#A)`>` |
| [flatMap](flat-map.html) | `fun <L, A, B> Kind<Kind<ForEither, `[`L`](flat-map.html#L)`>, `[`A`](flat-map.html#A)`>.flatMap(arg1: (`[`A`](flat-map.html#A)`) -> Kind<Kind<ForEither, `[`L`](flat-map.html#L)`>, `[`B`](flat-map.html#B)`>): Either<`[`L`](flat-map.html#L)`, `[`B`](flat-map.html#B)`>` |
| [flatten](flatten.html) | `fun <L, A> Kind<Kind<ForEither, `[`L`](flatten.html#L)`>, Kind<Kind<ForEither, `[`L`](flatten.html#L)`>, `[`A`](flatten.html#A)`>>.flatten(): Either<`[`L`](flatten.html#L)`, `[`A`](flatten.html#A)`>` |
| [followedBy](followed-by.html) | `fun <L, A, B> Kind<Kind<ForEither, `[`L`](followed-by.html#L)`>, `[`A`](followed-by.html#A)`>.followedBy(arg1: Kind<Kind<ForEither, `[`L`](followed-by.html#L)`>, `[`B`](followed-by.html#B)`>): Either<`[`L`](followed-by.html#L)`, `[`B`](followed-by.html#B)`>` |
| [followedByEval](followed-by-eval.html) | `fun <L, A, B> Kind<Kind<ForEither, `[`L`](followed-by-eval.html#L)`>, `[`A`](followed-by-eval.html#A)`>.followedByEval(arg1: Eval<Kind<Kind<ForEither, `[`L`](followed-by-eval.html#L)`>, `[`B`](followed-by-eval.html#B)`>>): Either<`[`L`](followed-by-eval.html#L)`, `[`B`](followed-by-eval.html#B)`>` |
| [forEffect](for-effect.html) | `fun <L, A, B> Kind<Kind<ForEither, `[`L`](for-effect.html#L)`>, `[`A`](for-effect.html#A)`>.forEffect(arg1: Kind<Kind<ForEither, `[`L`](for-effect.html#L)`>, `[`B`](for-effect.html#B)`>): Either<`[`L`](for-effect.html#L)`, `[`A`](for-effect.html#A)`>` |
| [forEffectEval](for-effect-eval.html) | `fun <L, A, B> Kind<Kind<ForEither, `[`L`](for-effect-eval.html#L)`>, `[`A`](for-effect-eval.html#A)`>.forEffectEval(arg1: Eval<Kind<Kind<ForEither, `[`L`](for-effect-eval.html#L)`>, `[`B`](for-effect-eval.html#B)`>>): Either<`[`L`](for-effect-eval.html#L)`, `[`A`](for-effect-eval.html#A)`>` |
| [ifM](if-m.html) | `fun <L, B> Kind<Kind<ForEither, `[`L`](if-m.html#L)`>, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>.ifM(arg1: () -> Kind<Kind<ForEither, `[`L`](if-m.html#L)`>, `[`B`](if-m.html#B)`>, arg2: () -> Kind<Kind<ForEither, `[`L`](if-m.html#L)`>, `[`B`](if-m.html#B)`>): Either<`[`L`](if-m.html#L)`, `[`B`](if-m.html#B)`>` |
| [map](map.html) | `fun <L, A, B> Kind<Kind<ForEither, `[`L`](map.html#L)`>, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Either<`[`L`](map.html#L)`, `[`B`](map.html#B)`>` |
| [mproduct](mproduct.html) | `fun <L, A, B> Kind<Kind<ForEither, `[`L`](mproduct.html#L)`>, `[`A`](mproduct.html#A)`>.mproduct(arg1: (`[`A`](mproduct.html#A)`) -> Kind<Kind<ForEither, `[`L`](mproduct.html#L)`>, `[`B`](mproduct.html#B)`>): Either<`[`L`](mproduct.html#L)`, Tuple2<`[`A`](mproduct.html#A)`, `[`B`](mproduct.html#B)`>>` |

