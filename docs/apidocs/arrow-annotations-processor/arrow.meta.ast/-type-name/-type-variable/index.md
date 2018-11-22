---
title: TypeName.TypeVariable - arrow-annotations-processor
---

[arrow-annotations-processor](../../../index.html) / [arrow.meta.ast](../../index.html) / [TypeName](../index.html) / [TypeVariable](./index.html)

# TypeVariable

`data class TypeVariable : `[`TypeName`](../index.html)

### Constructors

| [&lt;init&gt;](-init-.html) | `TypeVariable(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, bounds: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TypeName`](../index.html)`> = emptyList(), variance: `[`Modifier`](../../-modifier/index.html)`? = null, reified: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, nullable: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, annotations: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Annotation`](../../-annotation/index.html)`> = emptyList())` |

### Properties

| [annotations](annotations.html) | `val annotations: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Annotation`](../../-annotation/index.html)`>` |
| [bounds](bounds.html) | `val bounds: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TypeName`](../index.html)`>` |
| [name](name.html) | `val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [nullable](nullable.html) | `val nullable: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [rawName](raw-name.html) | `val rawName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [reified](reified.html) | `val reified: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [simpleName](simple-name.html) | `val simpleName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [variance](variance.html) | `val variance: `[`Modifier`](../../-modifier/index.html)`?` |

### Extension Properties

| [downKind](../../../arrow.meta.encoder/-meta-api/down-kind.html) | `abstract val `[`TypeVariable`](./index.html)`.downKind: `[`TypeVariable`](./index.html) |
| [downKind](../../../arrow.meta.encoder.jvm/-jvm-meta-api/down-kind.html) | `open val `[`TypeVariable`](./index.html)`.downKind: `[`TypeVariable`](./index.html) |
| [nestedTypeVariables](../../../arrow.meta.encoder/-meta-api/nested-type-variables.html) | `abstract val `[`TypeVariable`](./index.html)`.nestedTypeVariables: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TypeName`](../index.html)`>` |
| [nestedTypeVariables](../../../arrow.meta.encoder.jvm/-jvm-meta-api/nested-type-variables.html) | `open val `[`TypeVariable`](./index.html)`.nestedTypeVariables: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TypeName`](../index.html)`>` |

