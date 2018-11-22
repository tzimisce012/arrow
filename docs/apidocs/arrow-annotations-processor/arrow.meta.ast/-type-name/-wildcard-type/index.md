---
title: TypeName.WildcardType - arrow-annotations-processor
---

[arrow-annotations-processor](../../../index.html) / [arrow.meta.ast](../../index.html) / [TypeName](../index.html) / [WildcardType](./index.html)

# WildcardType

`data class WildcardType : `[`TypeName`](../index.html)

### Constructors

| [&lt;init&gt;](-init-.html) | `WildcardType(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, upperBounds: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TypeName`](../index.html)`>, lowerBounds: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TypeName`](../index.html)`>, nullable: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, annotations: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Annotation`](../../-annotation/index.html)`>)` |

### Properties

| [annotations](annotations.html) | `val annotations: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Annotation`](../../-annotation/index.html)`>` |
| [lowerBounds](lower-bounds.html) | `val lowerBounds: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TypeName`](../index.html)`>` |
| [name](name.html) | `val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [nullable](nullable.html) | `val nullable: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [rawName](raw-name.html) | `val rawName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [simpleName](simple-name.html) | `val simpleName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [upperBounds](upper-bounds.html) | `val upperBounds: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TypeName`](../index.html)`>` |

### Extension Properties

| [downKind](../../../arrow.meta.encoder/-meta-api/down-kind.html) | `abstract val `[`WildcardType`](./index.html)`.downKind: `[`WildcardType`](./index.html) |
| [downKind](../../../arrow.meta.encoder.jvm/-jvm-meta-api/down-kind.html) | `open val `[`WildcardType`](./index.html)`.downKind: `[`WildcardType`](./index.html) |
| [nestedTypeVariables](../../../arrow.meta.encoder/-meta-api/nested-type-variables.html) | `abstract val `[`WildcardType`](./index.html)`.nestedTypeVariables: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TypeName`](../index.html)`>` |
| [nestedTypeVariables](../../../arrow.meta.encoder.jvm/-jvm-meta-api/nested-type-variables.html) | `open val `[`WildcardType`](./index.html)`.nestedTypeVariables: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TypeName`](../index.html)`>` |

