---
title: TypeName.ParameterizedType - arrow-annotations-processor
---

[arrow-annotations-processor](../../../index.html) / [arrow.meta.ast](../../index.html) / [TypeName](../index.html) / [ParameterizedType](./index.html)

# ParameterizedType

`data class ParameterizedType : `[`TypeName`](../index.html)

### Constructors

| [&lt;init&gt;](-init-.html) | `ParameterizedType(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, enclosingType: `[`TypeName`](../index.html)`? = null, rawType: `[`Classy`](../-classy/index.html)`, typeArguments: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TypeName`](../index.html)`> = emptyList(), nullable: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, annotations: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Annotation`](../../-annotation/index.html)`> = emptyList())` |

### Properties

| [annotations](annotations.html) | `val annotations: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Annotation`](../../-annotation/index.html)`>` |
| [enclosingType](enclosing-type.html) | `val enclosingType: `[`TypeName`](../index.html)`?` |
| [name](name.html) | `val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [nullable](nullable.html) | `val nullable: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [rawName](raw-name.html) | `val rawName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [rawType](raw-type.html) | `val rawType: `[`Classy`](../-classy/index.html) |
| [simpleName](simple-name.html) | `val simpleName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [typeArguments](type-arguments.html) | `val typeArguments: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TypeName`](../index.html)`>` |

### Extension Properties

| [downKind](../../../arrow.meta.encoder/-meta-api/down-kind.html) | `abstract val `[`ParameterizedType`](./index.html)`.downKind: `[`ParameterizedType`](./index.html) |
| [downKind](../../../arrow.meta.encoder.jvm/-jvm-meta-api/down-kind.html) | `open val `[`ParameterizedType`](./index.html)`.downKind: `[`ParameterizedType`](./index.html) |
| [kinded](../../../arrow.meta.encoder/-meta-api/kinded.html) | `abstract val `[`ParameterizedType`](./index.html)`.kinded: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Determine if this [TypeName.ParameterizedType](./index.html) is in kinded position. ex: `arrow.Kind<ForIO, A>` =&gt; true ex: `IO<A>` =&gt; false |
| [kinded](../../../arrow.meta.encoder.jvm/-jvm-meta-api/kinded.html) | `open val `[`ParameterizedType`](./index.html)`.kinded: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [nestedTypeVariables](../../../arrow.meta.encoder/-meta-api/nested-type-variables.html) | `abstract val `[`ParameterizedType`](./index.html)`.nestedTypeVariables: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TypeName`](../index.html)`>` |
| [nestedTypeVariables](../../../arrow.meta.encoder.jvm/-jvm-meta-api/nested-type-variables.html) | `open val `[`ParameterizedType`](./index.html)`.nestedTypeVariables: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TypeName`](../index.html)`>` |

