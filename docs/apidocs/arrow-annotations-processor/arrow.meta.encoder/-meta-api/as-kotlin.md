---
title: MetaApi.asKotlin - arrow-annotations-processor
---

[arrow-annotations-processor](../../index.html) / [arrow.meta.encoder](../index.html) / [MetaApi](index.html) / [asKotlin](./as-kotlin.html)

# asKotlin

`abstract fun `[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`.asKotlin(): `[`TypeName`](../../arrow.meta.ast/-type-name/index.html)

Normalizes potentially rogue types coming from Java introspection into their Kotlin counterpart.
ex: `java.lang.Integer -> Kotlin.Int`
It's implementation is partial and does not cover all corner cases.

`abstract fun `[`TypeVariable`](../../arrow.meta.ast/-type-name/-type-variable/index.html)`.asKotlin(): `[`TypeVariable`](../../arrow.meta.ast/-type-name/-type-variable/index.html)
`abstract fun `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)`.asKotlin(): `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)
`abstract fun `[`FunctionLiteral`](../../arrow.meta.ast/-type-name/-function-literal/index.html)`.asKotlin(): `[`FunctionLiteral`](../../arrow.meta.ast/-type-name/-function-literal/index.html)
`abstract fun `[`WildcardType`](../../arrow.meta.ast/-type-name/-wildcard-type/index.html)`.asKotlin(): `[`WildcardType`](../../arrow.meta.ast/-type-name/-wildcard-type/index.html)
`abstract fun `[`Classy`](../../arrow.meta.ast/-type-name/-classy/index.html)`.asKotlin(): `[`Classy`](../../arrow.meta.ast/-type-name/-classy/index.html)