---
title: Kleisli.<init> - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [Kleisli](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`Kleisli(run: `[`KleisliFun`](../-kleisli-fun.html)`<`[`F`](index.html#F)`, `[`D`](index.html#D)`, `[`A`](index.html#A)`>)`

[Kleisli](index.html) represents an arrow from [D](index.html#D) to a monadic value `Kind<F, A>`.

### Parameters

`F` - the context of the result.

`D` - the dependency or environment we depend on.

`A` - resulting type of the computation.