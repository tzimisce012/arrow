---
title: arrow.optics - arrow-annotations-processor
---

[arrow-annotations-processor](../index.html) / [arrow.optics](./index.html)

## Package arrow.optics

### Types

| [AnnotatedElement](-annotated-element/index.html) | `data class AnnotatedElement` |
| [Focus](-focus/index.html) | `sealed class Focus` |
| [OpticsProcessor](-optics-processor/index.html) | `class OpticsProcessor : `[`AbstractProcessor`](../arrow.common.utils/-abstract-processor/index.html) |
| [Snippet](-snippet/index.html) | `data class Snippet` |
| [Target](-target/index.html) | `sealed class Target` |

### Type Aliases

| [DataClassDsl](-data-class-dsl.html) | `typealias DataClassDsl = `[`DataClassDsl`](-target/-data-class-dsl/index.html) |
| [IsoTarget](-iso-target.html) | `typealias IsoTarget = `[`Iso`](-target/-iso/index.html) |
| [LensTarget](-lens-target.html) | `typealias LensTarget = `[`Lens`](-target/-lens/index.html) |
| [NonNullFocus](-non-null-focus.html) | `typealias NonNullFocus = `[`NonNull`](-focus/-non-null/index.html) |
| [NullableFocus](-nullable-focus.html) | `typealias NullableFocus = `[`Nullable`](-focus/-nullable/index.html) |
| [OptionFocus](-option-focus.html) | `typealias OptionFocus = `[`Option`](-focus/-option/index.html) |
| [OptionalTarget](-optional-target.html) | `typealias OptionalTarget = `[`Optional`](-target/-optional/index.html) |
| [PrismTarget](-prism-target.html) | `typealias PrismTarget = `[`Prism`](-target/-prism/index.html) |
| [SealedClassDsl](-sealed-class-dsl.html) | `typealias SealedClassDsl = `[`SealedClassDsl`](-target/-sealed-class-dsl/index.html) |

### Extensions for External Classes

| [javax.lang.model.element.Element](javax.lang.model.element.-element/index.html) |  |

### Properties

| [Fold](-fold.html) | `const val Fold: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [Getter](-getter.html) | `const val Getter: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [Iso](-iso.html) | `const val Iso: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [Lens](-lens.html) | `const val Lens: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [Optional](-optional.html) | `const val Optional: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [Prism](-prism.html) | `const val Prism: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [Setter](-setter.html) | `const val Setter: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [Traversal](-traversal.html) | `const val Traversal: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [Tuple](-tuple.html) | `const val Tuple: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [opticsAnnotationClass](optics-annotation-class.html) | `val opticsAnnotationClass: `[`Class`](http://docs.oracle.com/javase/6/docs/api/java/lang/Class.html)`<optics>` |
| [opticsAnnotationKClass](optics-annotation-k-class.html) | `val opticsAnnotationKClass: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<optics>` |
| [targetNames](target-names.html) | `val `[`Target`](-target/index.html)`.targetNames: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |

### Functions

| [asFileText](as-file-text.html) | `fun `[`Snippet`](-snippet/index.html)`.asFileText(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [generateIsos](generate-isos.html) | `fun generateIsos(ele: `[`AnnotatedElement`](-annotated-element/index.html)`, target: `[`IsoTarget`](-iso-target.html)`): `[`Snippet`](-snippet/index.html) |
| [generateLensDsl](generate-lens-dsl.html) | `fun generateLensDsl(ele: `[`AnnotatedElement`](-annotated-element/index.html)`, optic: `[`DataClassDsl`](-data-class-dsl.html)`): `[`Snippet`](-snippet/index.html) |
| [generateLenses](generate-lenses.html) | `fun generateLenses(ele: `[`AnnotatedElement`](-annotated-element/index.html)`, target: `[`LensTarget`](-lens-target.html)`): `[`Snippet`](-snippet/index.html) |
| [generateOptionalDsl](generate-optional-dsl.html) | `fun generateOptionalDsl(ele: `[`AnnotatedElement`](-annotated-element/index.html)`, optic: `[`DataClassDsl`](-data-class-dsl.html)`): `[`Snippet`](-snippet/index.html) |
| [generateOptionals](generate-optionals.html) | `fun generateOptionals(ele: `[`AnnotatedElement`](-annotated-element/index.html)`, target: `[`OptionalTarget`](-optional-target.html)`): `[`Snippet`](-snippet/index.html) |
| [generatePrismDsl](generate-prism-dsl.html) | `fun generatePrismDsl(ele: `[`AnnotatedElement`](-annotated-element/index.html)`, isoOptic: `[`SealedClassDsl`](-sealed-class-dsl.html)`): `[`Snippet`](-snippet/index.html) |
| [generatePrisms](generate-prisms.html) | `fun generatePrisms(ele: `[`AnnotatedElement`](-annotated-element/index.html)`, target: `[`PrismTarget`](-prism-target.html)`): `[`Snippet`](-snippet/index.html) |
| [lensParamName](lens-param-name.html) | `fun `[`Focus`](-focus/index.html)`.lensParamName(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

