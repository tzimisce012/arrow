---
title: StateT.tailRecM - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [StateT](index.html) / [tailRecM](./tail-rec-m.html)

# tailRecM

`fun <F, S, A, B> tailRecM(MF: Monad<`[`F`](tail-rec-m.html#F)`>, a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> Kind<`[`StateTPartialOf`](../-state-t-partial-of.html)`<`[`F`](tail-rec-m.html#F)`, `[`S`](tail-rec-m.html#S)`>, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): `[`StateT`](index.html)`<`[`F`](tail-rec-m.html#F)`, `[`S`](tail-rec-m.html#S)`, `[`B`](tail-rec-m.html#B)`>`

Tail recursive function that keeps calling [f](tail-rec-m.html#arrow.data.StateT.Companion$tailRecM(arrow.typeclasses.Monad((arrow.data.StateT.Companion.tailRecM.F)), arrow.data.StateT.Companion.tailRecM.A, kotlin.Function1((arrow.data.StateT.Companion.tailRecM.A, arrow.Kind((arrow.Kind((arrow.Kind((arrow.data.ForStateT, arrow.data.StateT.Companion.tailRecM.F)), arrow.data.StateT.Companion.tailRecM.S)), arrow.core.Either((, arrow.data.StateT.Companion.tailRecM.B)))))))/f)  until [arrow.Either.Right](#) is returned.

### Parameters

`a` - initial value to start running recursive call to [f](tail-rec-m.html#arrow.data.StateT.Companion$tailRecM(arrow.typeclasses.Monad((arrow.data.StateT.Companion.tailRecM.F)), arrow.data.StateT.Companion.tailRecM.A, kotlin.Function1((arrow.data.StateT.Companion.tailRecM.A, arrow.Kind((arrow.Kind((arrow.Kind((arrow.data.ForStateT, arrow.data.StateT.Companion.tailRecM.F)), arrow.data.StateT.Companion.tailRecM.S)), arrow.core.Either((, arrow.data.StateT.Companion.tailRecM.B)))))))/f)

`f` - function that is called recusively until [arrow.Either.Right](#) is returned.

`MF` - [Monad](#) for the context [F](tail-rec-m.html#F).