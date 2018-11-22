---
title: StateT.<init> - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [StateT](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`StateT(runF: `[`StateTFunOf`](../-state-t-fun-of.html)`<`[`F`](index.html#F)`, `[`S`](index.html#S)`, `[`A`](index.html#A)`>)`

`StateT<F, S, A>` is a stateful computation within a context `F` yielding
a value of type `A`. i.e. StateT&lt;EitherPartialOf, S, A&gt; = Either&lt;E, State&lt;S, A&gt;&gt;

### Parameters

`F` - the context that wraps the stateful computation.

`S` - the state we are preforming computation upon.

`A` - current value of computation.

`runF` - the stateful computation that is wrapped and managed by `StateT`