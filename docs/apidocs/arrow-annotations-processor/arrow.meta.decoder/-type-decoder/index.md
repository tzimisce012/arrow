---
title: TypeDecoder - arrow-annotations-processor
---

[arrow-annotations-processor](../../index.html) / [arrow.meta.decoder](../index.html) / [TypeDecoder](./index.html)

# TypeDecoder

`interface TypeDecoder : `[`MetaDecoder`](../-meta-decoder/index.html)`<`[`Type`](../../arrow.meta.ast/-type/index.html)`>`

Type decoder that leverages Kotlin Poet to organize imports and output formatted code

### Functions

| [code](code.html) | `open fun `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Parameter`](../../arrow.meta.ast/-parameter/index.html)`>.code(f: (`[`Parameter`](../../arrow.meta.ast/-parameter/index.html)`) -> `[`Code`](../../arrow.meta.ast/-code/index.html)` = { Code(it.lyrics().toString()) }): `[`Code`](../../arrow.meta.ast/-code/index.html)<br>`open fun `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Func`](../../arrow.meta.ast/-func/index.html)`>.code(dummy: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit): `[`Code`](../../arrow.meta.ast/-code/index.html) |
| [codeNames](code-names.html) | `open fun `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Parameter`](../../arrow.meta.ast/-parameter/index.html)`>.codeNames(): `[`Code`](../../arrow.meta.ast/-code/index.html) |
| [decode](decode.html) | `open fun decode(tree: `[`Type`](../../arrow.meta.ast/-type/index.html)`): `[`Code`](../../arrow.meta.ast/-code/index.html) |
| [joinToCode](join-to-code.html) | `open fun <A : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`A`](join-to-code.html#A)`>.joinToCode(separator: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Code`](../../arrow.meta.ast/-code/index.html) |
| [lyrics](lyrics.html) | `open fun `[`Type`](../../arrow.meta.ast/-type/index.html)`.lyrics(): TypeSpec`<br>`open fun `[`Code`](../../arrow.meta.ast/-code/index.html)`.lyrics(): CodeBlock`<br>`open fun `[`Parameter`](../../arrow.meta.ast/-parameter/index.html)`.lyrics(): ParameterSpec`<br>`open fun `[`UseSiteTarget`](../../arrow.meta.ast/-use-site-target/index.html)`.lyrics(): UseSiteTarget`<br>`open fun `[`Annotation`](../../arrow.meta.ast/-annotation/index.html)`.lyrics(): AnnotationSpec`<br>`open fun `[`Property`](../../arrow.meta.ast/-property/index.html)`.lyrics(): PropertySpec`<br>`open fun `[`Func`](../../arrow.meta.ast/-func/index.html)`.lyrics(): FunSpec`<br>`open fun `[`Modifier`](../../arrow.meta.ast/-modifier/index.html)`.lyrics(): KModifier`<br>`open fun `[`TypeVariable`](../../arrow.meta.ast/-type-name/-type-variable/index.html)`.lyrics(): TypeVariableName`<br>`open fun `[`WildcardType`](../../arrow.meta.ast/-type-name/-wildcard-type/index.html)`.lyrics(): TypeName`<br>`open fun `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)`.lyrics(): TypeName`<br>`open fun `[`FunctionLiteral`](../../arrow.meta.ast/-type-name/-function-literal/index.html)`.lyrics(): TypeName`<br>`open fun `[`Classy`](../../arrow.meta.ast/-type-name/-classy/index.html)`.lyrics(): ClassName`<br>`open fun `[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`.lyrics(): TypeName` |
| [unaryPlus](unary-plus.html) | `open operator fun `[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`?.unaryPlus(): `[`Code`](../../arrow.meta.ast/-code/index.html)<br>`open operator fun `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`.unaryPlus(): `[`Code`](../../arrow.meta.ast/-code/index.html)<br>`open operator fun `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>.unaryPlus(): `[`Code`](../../arrow.meta.ast/-code/index.html)<br>`open operator fun `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`TypeVariable`](../../arrow.meta.ast/-type-name/-type-variable/index.html)`>.unaryPlus(): `[`Code`](../../arrow.meta.ast/-code/index.html) |

### Companion Object Functions

| [empty](empty.html) | `open fun CodeBlock.Companion.empty(): CodeBlock` |
| [invoke](invoke.html) | `open operator fun Code.Companion.invoke(f: () -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Code`](../../arrow.meta.ast/-code/index.html) |

### Inheritors

| [JvmMetaApi](../../arrow.meta.encoder.jvm/-jvm-meta-api/index.html) | `interface JvmMetaApi : `[`MetaApi`](../../arrow.meta.encoder/-meta-api/index.html)`, `[`TypeElementEncoder`](../../arrow.meta.encoder.jvm/-type-element-encoder/index.html)`, `[`ProcessorUtils`](../../arrow.common.utils/-processor-utils/index.html)`, `[`TypeDecoder`](./index.html)<br>A JVM implementation of the Meta Api meant to be mixed in with kapt annotation processors |

