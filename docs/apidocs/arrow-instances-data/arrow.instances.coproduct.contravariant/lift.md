---
title: lift - arrow-instances-data
---

[arrow-instances-data](../index.html) / [arrow.instances.coproduct.contravariant](index.html) / [lift](./lift.html)

# lift

`@JvmName("lift1") fun <F, G, A, B> lift(arg0: (`[`A`](lift.html#A)`) -> `[`B`](lift.html#B)`, CF: Contravariant<`[`F`](lift.html#F)`>, CG: Contravariant<`[`G`](lift.html#G)`>): (Kind<Kind<Kind<ForCoproduct, `[`F`](lift.html#F)`>, `[`G`](lift.html#G)`>, `[`B`](lift.html#B)`>) -> Kind<Kind<Kind<ForCoproduct, `[`F`](lift.html#F)`>, `[`G`](lift.html#G)`>, `[`A`](lift.html#A)`>`