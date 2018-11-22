---
title: ifM - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.statet.monad](../index.html) / [arrow.Kind](index.html) / [ifM](./if-m.html)

# ifM

`@JvmName("ifM") fun <F, S, B> Kind<Kind<Kind<ForStateT, `[`F`](if-m.html#F)`>, `[`S`](if-m.html#S)`>, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>.ifM(arg1: () -> Kind<Kind<Kind<ForStateT, `[`F`](if-m.html#F)`>, `[`S`](if-m.html#S)`>, `[`B`](if-m.html#B)`>, arg2: () -> Kind<Kind<Kind<ForStateT, `[`F`](if-m.html#F)`>, `[`S`](if-m.html#S)`>, `[`B`](if-m.html#B)`>, MF: Monad<`[`F`](if-m.html#F)`>): Kind<`[`S`](if-m.html#S)`, `[`B`](if-m.html#B)`>`