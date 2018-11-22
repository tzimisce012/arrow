---
title: ifM - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.kleisli.monad](../index.html) / [arrow.Kind](index.html) / [ifM](./if-m.html)

# ifM

`@JvmName("ifM") fun <F, D, B> Kind<Kind<Kind<ForKleisli, `[`F`](if-m.html#F)`>, `[`D`](if-m.html#D)`>, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>.ifM(arg1: () -> Kind<Kind<Kind<ForKleisli, `[`F`](if-m.html#F)`>, `[`D`](if-m.html#D)`>, `[`B`](if-m.html#B)`>, arg2: () -> Kind<Kind<Kind<ForKleisli, `[`F`](if-m.html#F)`>, `[`D`](if-m.html#D)`>, `[`B`](if-m.html#B)`>, MF: Monad<`[`F`](if-m.html#F)`>): Kind<`[`D`](if-m.html#D)`, `[`B`](if-m.html#B)`>`