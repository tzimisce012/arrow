---
title: MetaApi.downKindReceiver - arrow-annotations-processor
---

[arrow-annotations-processor](../../index.html) / [arrow.meta.encoder](../index.html) / [MetaApi](index.html) / [downKindReceiver](./down-kind-receiver.html)

# downKindReceiver

`abstract fun `[`Func`](../../arrow.meta.ast/-func/index.html)`.downKindReceiver(): `[`Func`](../../arrow.meta.ast/-func/index.html)

Performs a type application transforming the receiver type in this function
in kinded position into it's concrete counterpart:
ex: `Kind<ForIO, A>.someFun(): A` -&gt; `IO.someFun(): A`

