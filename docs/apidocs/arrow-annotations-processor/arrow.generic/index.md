---
title: arrow.generic - arrow-annotations-processor
---

[arrow-annotations-processor](../index.html) / [arrow.generic](./index.html)

## Package arrow.generic

### Types

| [AnnotatedGeneric](-annotated-generic/index.html) | `data class AnnotatedGeneric` |
| [CoproductProcessor](-coproduct-processor/index.html) | `class CoproductProcessor : `[`AbstractProcessor`](../arrow.common.utils/-abstract-processor/index.html) |
| [DerivedTypeClass](-derived-type-class/index.html) | `sealed class DerivedTypeClass` |
| [Eq](-eq.html) | `object Eq : `[`DerivedTypeClass`](-derived-type-class/index.html) |
| [Hash](-hash.html) | `object Hash : `[`DerivedTypeClass`](-derived-type-class/index.html) |
| [Monoid](-monoid.html) | `object Monoid : `[`DerivedTypeClass`](-derived-type-class/index.html) |
| [Order](-order.html) | `object Order : `[`DerivedTypeClass`](-derived-type-class/index.html) |
| [ProductFileGenerator](-product-file-generator/index.html) | `class ProductFileGenerator` |
| [ProductProcessor](-product-processor/index.html) | `class ProductProcessor : `[`AbstractProcessor`](../arrow.common.utils/-abstract-processor/index.html) |
| [Semigroup](-semigroup.html) | `object Semigroup : `[`DerivedTypeClass`](-derived-type-class/index.html) |
| [Show](-show.html) | `object Show : `[`DerivedTypeClass`](-derived-type-class/index.html) |
| [Target](-target/index.html) | `data class Target` |

### Properties

| [productAnnotationClass](product-annotation-class.html) | `val productAnnotationClass: `[`Class`](http://docs.oracle.com/javase/6/docs/api/java/lang/Class.html)`<product>` |
| [productAnnotationKClass](product-annotation-k-class.html) | `val productAnnotationKClass: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<product>` |
| [productAnnotationName](product-annotation-name.html) | `val productAnnotationName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [productAnnotationTarget](product-annotation-target.html) | `val productAnnotationTarget: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Functions

| [generateCoproducts](generate-coproducts.html) | `fun generateCoproducts(destination: `[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

