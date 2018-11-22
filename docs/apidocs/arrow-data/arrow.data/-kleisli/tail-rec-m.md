---
title: Kleisli.tailRecM - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [Kleisli](index.html) / [tailRecM](./tail-rec-m.html)

# tailRecM

`fun <F, D, A, B> tailRecM(MF: Monad<`[`F`](tail-rec-m.html#F)`>, a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> `[`KleisliOf`](../-kleisli-of.html)`<`[`F`](tail-rec-m.html#F)`, `[`D`](tail-rec-m.html#D)`, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): `[`Kleisli`](index.html)`<`[`F`](tail-rec-m.html#F)`, `[`D`](tail-rec-m.html#D)`, `[`B`](tail-rec-m.html#B)`>`

Tail recursive function that keeps calling [f](tail-rec-m.html#arrow.data.Kleisli.Companion$tailRecM(arrow.typeclasses.Monad((arrow.data.Kleisli.Companion.tailRecM.F)), arrow.data.Kleisli.Companion.tailRecM.A, kotlin.Function1((arrow.data.Kleisli.Companion.tailRecM.A, arrow.Kind((arrow.Kind((arrow.Kind((arrow.data.ForKleisli, arrow.data.Kleisli.Companion.tailRecM.F)), arrow.data.Kleisli.Companion.tailRecM.D)), arrow.core.Either((, arrow.data.Kleisli.Companion.tailRecM.B)))))))/f) until [arrow.Either.Right](#) is returned.

### Parameters

`a` - initial value to start running recursive call to [f](tail-rec-m.html#arrow.data.Kleisli.Companion$tailRecM(arrow.typeclasses.Monad((arrow.data.Kleisli.Companion.tailRecM.F)), arrow.data.Kleisli.Companion.tailRecM.A, kotlin.Function1((arrow.data.Kleisli.Companion.tailRecM.A, arrow.Kind((arrow.Kind((arrow.Kind((arrow.data.ForKleisli, arrow.data.Kleisli.Companion.tailRecM.F)), arrow.data.Kleisli.Companion.tailRecM.D)), arrow.core.Either((, arrow.data.Kleisli.Companion.tailRecM.B)))))))/f)

`f` - function that is called recusively until [arrow.Either.Right](#) is returned.

`MF` - [Monad](#) for the context [F](tail-rec-m.html#F).