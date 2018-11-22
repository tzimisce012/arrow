---
title: Ref.unsafe - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects](../index.html) / [Ref](index.html) / [unsafe](./unsafe.html)

# unsafe

`fun <F, A> unsafe(a: `[`A`](unsafe.html#A)`, MD: `[`MonadDefer`](../../arrow.effects.typeclasses/-monad-defer/index.html)`<`[`F`](unsafe.html#F)`>): `[`Ref`](index.html)`<`[`F`](unsafe.html#F)`, `[`A`](unsafe.html#A)`>`

Like [of](of.html) but returns the newly allocated ref directly instead of wrapping it in [MonadDefer.invoke](../../arrow.effects.typeclasses/-monad-defer/invoke.html).
This method is considered unsafe because it is not referentially transparent -- it allocates mutable state.

**See Also**

[invoke](invoke.html)

