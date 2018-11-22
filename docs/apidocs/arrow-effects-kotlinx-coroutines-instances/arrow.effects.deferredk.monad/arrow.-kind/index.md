---
title: arrow.effects.deferredk.monad.arrow.Kind - arrow-effects-kotlinx-coroutines-instances
---

[arrow-effects-kotlinx-coroutines-instances](../../index.html) / [arrow.effects.deferredk.monad](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [ap](ap.html) | `fun <A, B> Kind<ForDeferredK, `[`A`](ap.html#A)`>.ap(arg1: Kind<ForDeferredK, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): DeferredK<`[`B`](ap.html#B)`>` |
| [effectM](effect-m.html) | `fun <A, B> Kind<ForDeferredK, `[`A`](effect-m.html#A)`>.effectM(arg1: (`[`A`](effect-m.html#A)`) -> Kind<ForDeferredK, `[`B`](effect-m.html#B)`>): DeferredK<`[`A`](effect-m.html#A)`>` |
| [flatMap](flat-map.html) | `fun <A, B> Kind<ForDeferredK, `[`A`](flat-map.html#A)`>.flatMap(arg1: (`[`A`](flat-map.html#A)`) -> Kind<ForDeferredK, `[`B`](flat-map.html#B)`>): DeferredK<`[`B`](flat-map.html#B)`>` |
| [flatten](flatten.html) | `fun <A> Kind<ForDeferredK, Kind<ForDeferredK, `[`A`](flatten.html#A)`>>.flatten(): DeferredK<`[`A`](flatten.html#A)`>` |
| [followedBy](followed-by.html) | `fun <A, B> Kind<ForDeferredK, `[`A`](followed-by.html#A)`>.followedBy(arg1: Kind<ForDeferredK, `[`B`](followed-by.html#B)`>): DeferredK<`[`B`](followed-by.html#B)`>` |
| [followedByEval](followed-by-eval.html) | `fun <A, B> Kind<ForDeferredK, `[`A`](followed-by-eval.html#A)`>.followedByEval(arg1: Eval<Kind<ForDeferredK, `[`B`](followed-by-eval.html#B)`>>): DeferredK<`[`B`](followed-by-eval.html#B)`>` |
| [forEffect](for-effect.html) | `fun <A, B> Kind<ForDeferredK, `[`A`](for-effect.html#A)`>.forEffect(arg1: Kind<ForDeferredK, `[`B`](for-effect.html#B)`>): DeferredK<`[`A`](for-effect.html#A)`>` |
| [forEffectEval](for-effect-eval.html) | `fun <A, B> Kind<ForDeferredK, `[`A`](for-effect-eval.html#A)`>.forEffectEval(arg1: Eval<Kind<ForDeferredK, `[`B`](for-effect-eval.html#B)`>>): DeferredK<`[`A`](for-effect-eval.html#A)`>` |
| [ifM](if-m.html) | `fun <B> Kind<ForDeferredK, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>.ifM(arg1: () -> Kind<ForDeferredK, `[`B`](if-m.html#B)`>, arg2: () -> Kind<ForDeferredK, `[`B`](if-m.html#B)`>): DeferredK<`[`B`](if-m.html#B)`>` |
| [map](map.html) | `fun <A, B> Kind<ForDeferredK, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): DeferredK<`[`B`](map.html#B)`>` |
| [mproduct](mproduct.html) | `fun <A, B> Kind<ForDeferredK, `[`A`](mproduct.html#A)`>.mproduct(arg1: (`[`A`](mproduct.html#A)`) -> Kind<ForDeferredK, `[`B`](mproduct.html#B)`>): DeferredK<Tuple2<`[`A`](mproduct.html#A)`, `[`B`](mproduct.html#B)`>>` |

