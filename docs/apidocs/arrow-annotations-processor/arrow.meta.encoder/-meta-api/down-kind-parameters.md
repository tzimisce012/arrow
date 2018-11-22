---
title: MetaApi.downKindParameters - arrow-annotations-processor
---

[arrow-annotations-processor](../../index.html) / [arrow.meta.encoder](../index.html) / [MetaApi](index.html) / [downKindParameters](./down-kind-parameters.html)

# downKindParameters

`abstract fun `[`Func`](../../arrow.meta.ast/-func/index.html)`.downKindParameters(): `[`Func`](../../arrow.meta.ast/-func/index.html)

Performs a type application transforming all parameter types in this function
in kinded position into it's concrete counterpart:
ex: `(fa: Kind<ForIO, A>) -> (fa: IO<A>)`

