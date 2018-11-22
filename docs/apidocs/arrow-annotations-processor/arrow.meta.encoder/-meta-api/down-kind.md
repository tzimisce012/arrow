---
title: MetaApi.downKind - arrow-annotations-processor
---

[arrow-annotations-processor](../../index.html) / [arrow.meta.encoder](../index.html) / [MetaApi](index.html) / [downKind](./down-kind.html)

# downKind

`abstract val `[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`.downKind: `[`TypeName`](../../arrow.meta.ast/-type-name/index.html)

Performs a type application transforming a type in kinded position into it's concrete counterpart:
ex: `Kind<ForIO, A> -> IO<A>`

`abstract val `[`TypeVariable`](../../arrow.meta.ast/-type-name/-type-variable/index.html)`.downKind: `[`TypeVariable`](../../arrow.meta.ast/-type-name/-type-variable/index.html)
`abstract val `[`FunctionLiteral`](../../arrow.meta.ast/-type-name/-function-literal/index.html)`.downKind: `[`FunctionLiteral`](../../arrow.meta.ast/-type-name/-function-literal/index.html)
`abstract val `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)`.downKind: `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)
`abstract val `[`WildcardType`](../../arrow.meta.ast/-type-name/-wildcard-type/index.html)`.downKind: `[`WildcardType`](../../arrow.meta.ast/-type-name/-wildcard-type/index.html)
`abstract val `[`Classy`](../../arrow.meta.ast/-type-name/-classy/index.html)`.downKind: `[`Classy`](../../arrow.meta.ast/-type-name/-classy/index.html)`abstract fun `[`Parameter`](../../arrow.meta.ast/-parameter/index.html)`.downKind(): `[`Parameter`](../../arrow.meta.ast/-parameter/index.html)

Performs a type application transforming the type of this parameter
in kinded position into it's concrete counterpart:
ex: `arg: Kind<ForIO, A>` -&gt; `arg: IO<A>`

