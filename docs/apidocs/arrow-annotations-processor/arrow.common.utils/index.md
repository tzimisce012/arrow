---
title: arrow.common.utils - arrow-annotations-processor
---

[arrow-annotations-processor](../index.html) / [arrow.common.utils](./index.html)

## Package arrow.common.utils

### Types

| [AbstractProcessor](-abstract-processor/index.html) | `abstract class AbstractProcessor : KotlinAbstractProcessor, `[`ProcessorUtils`](-processor-utils/index.html)`, `[`KotlinMetatadataEncoder`](../arrow.meta.encoder.jvm/-kotlin-metatadata-encoder/index.html) |
| [ClassOrPackageDataWrapper](-class-or-package-data-wrapper/index.html) | `sealed class ClassOrPackageDataWrapper` |
| [ProcessorUtils](-processor-utils/index.html) | `interface ProcessorUtils : KotlinMetadataUtils` |

### Exceptions

| [KnownException](-known-exception/index.html) | `class KnownException : `[`RuntimeException`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-runtime-exception/index.html) |

### Extensions for External Classes

| [kotlin.String](kotlin.-string/index.html) |  |
| [me.eugeniomarletti.kotlin.metadata.ClassData](me.eugeniomarletti.kotlin.metadata.-class-data/index.html) |  |
| [me.eugeniomarletti.kotlin.metadata.PackageData](me.eugeniomarletti.kotlin.metadata.-package-data/index.html) |  |
| [me.eugeniomarletti.kotlin.metadata.shadow.metadata.ProtoBuf.Class](me.eugeniomarletti.kotlin.metadata.shadow.metadata.-proto-buf.-class/index.html) |  |
| [me.eugeniomarletti.kotlin.metadata.shadow.metadata.ProtoBuf.Class.Kind](me.eugeniomarletti.kotlin.metadata.shadow.metadata.-proto-buf.-class.-kind/index.html) |  |
| [me.eugeniomarletti.kotlin.metadata.shadow.metadata.ProtoBuf.Type](me.eugeniomarletti.kotlin.metadata.shadow.metadata.-proto-buf.-type/index.html) |  |

### Properties

| [fullName](full-name.html) | `val `[`Class`](-class-or-package-data-wrapper/-class/index.html)`.fullName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [simpleName](simple-name.html) | `val `[`Class`](-class-or-package-data-wrapper/-class/index.html)`.simpleName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Functions

| [getParameter](get-parameter.html) | `fun `[`ClassOrPackageDataWrapper`](-class-or-package-data-wrapper/index.html)`.getParameter(function: Function, parameterElement: `[`VariableElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/VariableElement.html)`): ValueParameter` |
| [getPropertyOrNull](get-property-or-null.html) | `fun `[`ClassOrPackageDataWrapper`](-class-or-package-data-wrapper/index.html)`.getPropertyOrNull(methodElement: `[`ExecutableElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/ExecutableElement.html)`): Property?` |
| [knownError](known-error.html) | `fun knownError(message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, element: `[`Element`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/Element.html)`? = null): `[`Nothing`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html) |
| [recurseFilesUpwards](recurse-files-upwards.html) | `fun recurseFilesUpwards(fileNames: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)<br>`fun recurseFilesUpwards(fileNames: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, currentDirectory: `[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`): `[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html) |
| [typeConstraints](type-constraints.html) | `fun `[`ClassOrPackageDataWrapper`](-class-or-package-data-wrapper/index.html)`.typeConstraints(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

