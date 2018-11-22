---
title: JvmMetaApi.wrap - arrow-annotations-processor
---

[arrow-annotations-processor](../../index.html) / [arrow.meta.encoder.jvm](../index.html) / [JvmMetaApi](index.html) / [wrap](./wrap.html)

# wrap

`open fun `[`TypeVariable`](../../arrow.meta.ast/-type-name/-type-variable/index.html)`.wrap(wrapped: `[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<`[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`, `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)`>): `[`TypeVariable`](../../arrow.meta.ast/-type-name/-type-variable/index.html)
`open fun `[`WildcardType`](../../arrow.meta.ast/-type-name/-wildcard-type/index.html)`.wrap(wrapped: `[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<`[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`, `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)`>): `[`WildcardType`](../../arrow.meta.ast/-type-name/-wildcard-type/index.html)
`open fun `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)`.wrap(wrapped: `[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<`[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`, `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)`>): `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)
`open fun `[`Classy`](../../arrow.meta.ast/-type-name/-classy/index.html)`.wrap(wrapped: `[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<`[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`, `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)`>): `[`Classy`](../../arrow.meta.ast/-type-name/-classy/index.html)
`open fun `[`FunctionLiteral`](../../arrow.meta.ast/-type-name/-function-literal/index.html)`.wrap(wrapped: `[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<`[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`, `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)`>): `[`FunctionLiteral`](../../arrow.meta.ast/-type-name/-function-literal/index.html)
`open fun `[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`.wrap(wrapped: `[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<`[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`, `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)`>): `[`TypeName`](../../arrow.meta.ast/-type-name/index.html)

Applies replacement on a type recursively changing it's wrapper type for it's wrapped type
and [MetaApi.getDownKind](#) as needed
ex: Kind&lt;ForSetK, A&gt; -&gt; Set

`open fun `[`Func`](../../arrow.meta.ast/-func/index.html)`.wrap(wrappedType: `[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<`[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`, `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)`>? = null): `[`Func`](../../arrow.meta.ast/-func/index.html)

Applies replacement on all types of this function recursively changing wrapper types for their wrapped type
over all three receiver, parameters and return type.
and [MetaApi.getDownKind](#) as needed

