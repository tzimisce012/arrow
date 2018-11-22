---
title: ifM - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances.tuple2.monad](../index.html) / [arrow.Kind](index.html) / [ifM](./if-m.html)

# ifM

`@JvmName("ifM") fun <F, B> Kind<Kind<ForTuple2, `[`F`](if-m.html#F)`>, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>.ifM(arg1: () -> Kind<Kind<ForTuple2, `[`F`](if-m.html#F)`>, `[`B`](if-m.html#B)`>, arg2: () -> Kind<Kind<ForTuple2, `[`F`](if-m.html#F)`>, `[`B`](if-m.html#B)`>, MF: Monoid<`[`F`](if-m.html#F)`>): Tuple2<`[`F`](if-m.html#F)`, `[`B`](if-m.html#B)`>`