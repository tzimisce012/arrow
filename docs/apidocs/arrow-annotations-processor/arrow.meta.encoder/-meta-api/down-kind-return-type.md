---
title: MetaApi.downKindReturnType - arrow-annotations-processor
---

[arrow-annotations-processor](../../index.html) / [arrow.meta.encoder](../index.html) / [MetaApi](index.html) / [downKindReturnType](./down-kind-return-type.html)

# downKindReturnType

`abstract fun `[`Func`](../../arrow.meta.ast/-func/index.html)`.downKindReturnType(): `[`Func`](../../arrow.meta.ast/-func/index.html)

Performs a type application transforming the return type in this function
in kinded position into it's concrete counterpart:
ex: `someFun(): Kind<ForIO, A>` -&gt; `someFun(): IO<A>`

