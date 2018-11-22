---
title: TypeName - arrow-annotations-processor
---

[arrow-annotations-processor](../../index.html) / [arrow.meta.ast](../index.html) / [TypeName](./index.html)

# TypeName

`sealed class TypeName : `[`Tree`](../-tree.html)

### Types

| [Classy](-classy/index.html) | `data class Classy : `[`TypeName`](./index.html) |
| [FunctionLiteral](-function-literal/index.html) | `data class FunctionLiteral : `[`TypeName`](./index.html) |
| [ParameterizedType](-parameterized-type/index.html) | `data class ParameterizedType : `[`TypeName`](./index.html) |
| [TypeVariable](-type-variable/index.html) | `data class TypeVariable : `[`TypeName`](./index.html) |
| [WildcardType](-wildcard-type/index.html) | `data class WildcardType : `[`TypeName`](./index.html) |

### Properties

| [rawName](raw-name.html) | `abstract val rawName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [simpleName](simple-name.html) | `abstract val simpleName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Companion Object Properties

| [Unit](-unit.html) | `val Unit: `[`TypeName`](./index.html) |

### Extension Properties

| [downKind](../../arrow.meta.encoder/-meta-api/down-kind.html) | `abstract val `[`TypeName`](./index.html)`.downKind: `[`TypeName`](./index.html)<br>Performs a type application transforming a type in kinded position into it's concrete counterpart: ex: `Kind<ForIO, A> -> IO<A>` |
| [downKind](../../arrow.meta.encoder.jvm/-jvm-meta-api/down-kind.html) | `open val `[`TypeName`](./index.html)`.downKind: `[`TypeName`](./index.html) |
| [nestedTypeVariables](../../arrow.meta.encoder/-meta-api/nested-type-variables.html) | `abstract val `[`TypeName`](./index.html)`.nestedTypeVariables: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TypeName`](./index.html)`>`<br>Recursively gathers all the nested [TypeName.TypeVariable](-type-variable/index.html) inside a [TypeName](./index.html) |
| [nestedTypeVariables](../../arrow.meta.encoder.jvm/-jvm-meta-api/nested-type-variables.html) | `open val `[`TypeName`](./index.html)`.nestedTypeVariables: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TypeName`](./index.html)`>` |
| [projectedCompanion](../../arrow.meta.encoder/-meta-api/projected-companion.html) | `abstract val `[`TypeName`](./index.html)`.projectedCompanion: `[`TypeName`](./index.html)<br>Returns a suitable companion for this type considering it's kinded or conested position. This is frequently use to project extensions or other static instances as needed via codegen |
| [projectedCompanion](../../arrow.meta.encoder.jvm/-jvm-meta-api/projected-companion.html) | `open val `[`TypeName`](./index.html)`.projectedCompanion: `[`TypeName`](./index.html) |
| [type](../../arrow.meta.encoder/-meta-api/type.html) | `abstract val `[`TypeName`](./index.html)`.type: `[`Type`](../-type/index.html)`?`<br>Obtains type information for a class or interface given a TypeName |
| [type](../../arrow.meta.encoder.jvm/-jvm-meta-api/type.html) | `open val `[`TypeName`](./index.html)`.type: `[`Type`](../-type/index.html)`?` |

### Inheritors

| [Classy](-classy/index.html) | `data class Classy : `[`TypeName`](./index.html) |
| [FunctionLiteral](-function-literal/index.html) | `data class FunctionLiteral : `[`TypeName`](./index.html) |
| [ParameterizedType](-parameterized-type/index.html) | `data class ParameterizedType : `[`TypeName`](./index.html) |
| [TypeVariable](-type-variable/index.html) | `data class TypeVariable : `[`TypeName`](./index.html) |
| [WildcardType](-wildcard-type/index.html) | `data class WildcardType : `[`TypeName`](./index.html) |

