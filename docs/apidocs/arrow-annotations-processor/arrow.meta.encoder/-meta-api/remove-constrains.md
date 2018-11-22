---
title: MetaApi.removeConstrains - arrow-annotations-processor
---

[arrow-annotations-processor](../../index.html) / [arrow.meta.encoder](../index.html) / [MetaApi](index.html) / [removeConstrains](./remove-constrains.html)

# removeConstrains

`abstract fun `[`WildcardType`](../../arrow.meta.ast/-type-name/-wildcard-type/index.html)`.removeConstrains(): `[`WildcardType`](../../arrow.meta.ast/-type-name/-wildcard-type/index.html)

Remove undesired constrains such as `java.lang.Object` which appears
in upper bound position in certain type shapes

`abstract fun `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)`.removeConstrains(): `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)
`abstract fun `[`Classy`](../../arrow.meta.ast/-type-name/-classy/index.html)`.removeConstrains(): `[`Classy`](../../arrow.meta.ast/-type-name/-classy/index.html)
`abstract fun `[`FunctionLiteral`](../../arrow.meta.ast/-type-name/-function-literal/index.html)`.removeConstrains(): `[`FunctionLiteral`](../../arrow.meta.ast/-type-name/-function-literal/index.html)
`abstract fun `[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`.removeConstrains(): `[`TypeName`](../../arrow.meta.ast/-type-name/index.html)
`abstract fun `[`TypeVariable`](../../arrow.meta.ast/-type-name/-type-variable/index.html)`.removeConstrains(): `[`TypeVariable`](../../arrow.meta.ast/-type-name/-type-variable/index.html)`abstract fun `[`Func`](../../arrow.meta.ast/-func/index.html)`.removeConstrains(keepModifiers: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`Modifier`](../../arrow.meta.ast/-modifier/index.html)`> = emptySet()): `[`Func`](../../arrow.meta.ast/-func/index.html)

Removes all modifiers and annotations from this function and normalizes type variables upper bound
constrains to not explicitly include implicit types such as `java.lang.Object`.
Preserves all modifiers [keepModifiers](remove-constrains.html#arrow.meta.encoder.MetaApi$removeConstrains(arrow.meta.ast.Func, kotlin.collections.Set((arrow.meta.ast.Modifier)))/keepModifiers)

`abstract fun `[`Parameter`](../../arrow.meta.ast/-parameter/index.html)`.removeConstrains(): `[`Parameter`](../../arrow.meta.ast/-parameter/index.html)

**See Also**

[removeConstrains](./remove-constrains.html)

