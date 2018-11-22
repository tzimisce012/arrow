---
title: Bracket.guarantee - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects.typeclasses](../index.html) / [Bracket](index.html) / [guarantee](./guarantee.html)

# guarantee

`open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](guarantee.html#A)`>.guarantee(finalizer: Kind<`[`F`](index.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): Kind<`[`F`](index.html#F)`, `[`A`](guarantee.html#A)`>`

Executes the given `finalizer` when the source is finished, either in success or in error, or if canceled.

As best practice, it's not a good idea to release resources via `guaranteeCase` in polymorphic code.
Prefer [bracket](bracket.html) for the acquisition and release of resources.

**See Also**

[guaranteeCase](guarantee-case.html)

[bracket](bracket.html)

