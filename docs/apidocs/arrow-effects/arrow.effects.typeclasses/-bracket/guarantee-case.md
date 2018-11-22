---
title: Bracket.guaranteeCase - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects.typeclasses](../index.html) / [Bracket](index.html) / [guaranteeCase](./guarantee-case.html)

# guaranteeCase

`open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](guarantee-case.html#A)`>.guaranteeCase(finalizer: (`[`ExitCase`](../-exit-case/index.html)`<`[`E`](index.html#E)`>) -> Kind<`[`F`](index.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): Kind<`[`F`](index.html#F)`, `[`A`](guarantee-case.html#A)`>`

Executes the given `finalizer` when the source is finished, either in success or in error, or if canceled, allowing
for differentiating between exit conditions. That's thanks to the [ExitCase](../-exit-case/index.html) argument of the finalizer.

As best practice, it's not a good idea to release resources via `guaranteeCase` in polymorphic code.
Prefer [bracketCase](bracket-case.html) for the acquisition and release of resources.

**See Also**

[guarantee](guarantee.html)

[bracketCase](bracket-case.html)

