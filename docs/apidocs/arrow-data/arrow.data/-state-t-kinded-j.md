---
title: StateTKindedJ - arrow-data
---

[arrow-data](../index.html) / [arrow.data](index.html) / [StateTKindedJ](./-state-t-kinded-j.html)

# StateTKindedJ

`typealias StateTKindedJ<F, S, A> = HkJ3<`[`ForStateT`](-for-state-t.html)`, `[`F`](-state-t-kinded-j.html#F)`, `[`S`](-state-t-kinded-j.html#S)`, `[`A`](-state-t-kinded-j.html#A)`>`

### Inheritors

| [StateT](-state-t/index.html) | `class StateT<F, S, A> : `[`StateTOf`](-state-t-of.html)`<`[`F`](-state-t/index.html#F)`, `[`S`](-state-t/index.html#S)`, `[`A`](-state-t/index.html#A)`>, `[`StateTKindedJ`](./-state-t-kinded-j.html)`<`[`F`](-state-t/index.html#F)`, `[`S`](-state-t/index.html#S)`, `[`A`](-state-t/index.html#A)`>`<br>`StateT<F, S, A>` is a stateful computation within a context `F` yielding a value of type `A`. i.e. StateT&lt;EitherPartialOf, S, A&gt; = Either&lt;E, State&lt;S, A&gt;&gt; |

