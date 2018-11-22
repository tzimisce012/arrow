---
title: ifM - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.writert.monad](../index.html) / [arrow.Kind](index.html) / [ifM](./if-m.html)

# ifM

`@JvmName("ifM") fun <F, W, B> Kind<Kind<Kind<ForWriterT, `[`F`](if-m.html#F)`>, `[`W`](if-m.html#W)`>, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>.ifM(arg1: () -> Kind<Kind<Kind<ForWriterT, `[`F`](if-m.html#F)`>, `[`W`](if-m.html#W)`>, `[`B`](if-m.html#B)`>, arg2: () -> Kind<Kind<Kind<ForWriterT, `[`F`](if-m.html#F)`>, `[`W`](if-m.html#W)`>, `[`B`](if-m.html#B)`>, MF: Monad<`[`F`](if-m.html#F)`>, MM: Monoid<`[`W`](if-m.html#W)`>): Kind<`[`W`](if-m.html#W)`, `[`B`](if-m.html#B)`>`