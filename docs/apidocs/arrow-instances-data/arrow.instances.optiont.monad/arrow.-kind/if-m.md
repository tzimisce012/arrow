---
title: ifM - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.optiont.monad](../index.html) / [arrow.Kind](index.html) / [ifM](./if-m.html)

# ifM

`@JvmName("ifM") fun <F, B> Kind<Kind<ForOptionT, `[`F`](if-m.html#F)`>, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>.ifM(arg1: () -> Kind<Kind<ForOptionT, `[`F`](if-m.html#F)`>, `[`B`](if-m.html#B)`>, arg2: () -> Kind<Kind<ForOptionT, `[`F`](if-m.html#F)`>, `[`B`](if-m.html#B)`>, MF: Monad<`[`F`](if-m.html#F)`>): OptionT<`[`F`](if-m.html#F)`, `[`B`](if-m.html#B)`>`