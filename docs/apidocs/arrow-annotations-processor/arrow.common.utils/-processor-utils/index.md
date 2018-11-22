---
title: ProcessorUtils - arrow-annotations-processor
---

[arrow-annotations-processor](../../index.html) / [arrow.common.utils](../index.html) / [ProcessorUtils](./index.html)

# ProcessorUtils

`interface ProcessorUtils : KotlinMetadataUtils`

### Properties

| [hasNoCompanion](has-no-companion.html) | `open val `[`Element`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/Element.html)`.hasNoCompanion: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

### Functions

| [asClassOrPackageDataWrapper](as-class-or-package-data-wrapper.html) | `open fun KotlinMetadata.asClassOrPackageDataWrapper(classElement: `[`TypeElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/TypeElement.html)`): `[`ClassOrPackageDataWrapper`](../-class-or-package-data-wrapper/index.html)`?` |
| [declaredTypeClassInterfaces](declared-type-class-interfaces.html) | `open fun `[`Class`](../-class-or-package-data-wrapper/-class/index.html)`.declaredTypeClassInterfaces(typeTable: TypeTable): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`ClassOrPackageDataWrapper`](../-class-or-package-data-wrapper/index.html)`>` |
| [getClassData](get-class-data.html) | `open fun `[`Element`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/Element.html)`.getClassData(): `[`Class`](../-class-or-package-data-wrapper/-class/index.html) |
| [getClassOrPackageDataWrapper](get-class-or-package-data-wrapper.html) | `open fun getClassOrPackageDataWrapper(classElement: `[`TypeElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/TypeElement.html)`): `[`ClassOrPackageDataWrapper`](../-class-or-package-data-wrapper/index.html) |
| [getConstructorParamNames](get-constructor-param-names.html) | `open fun `[`Element`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/Element.html)`.getConstructorParamNames(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [getConstructorTypesNames](get-constructor-types-names.html) | `open fun `[`Element`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/Element.html)`.getConstructorTypesNames(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [getFunction](get-function.html) | `open fun `[`ClassOrPackageDataWrapper`](../-class-or-package-data-wrapper/index.html)`.getFunction(methodElement: `[`ExecutableElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/ExecutableElement.html)`): Function` |
| [overrides](overrides.html) | `open fun Function.overrides(o: Function): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

### Extension Functions

| [log](../../arrow.common.messager/me.eugeniomarletti.kotlin.processing.-kotlin-processing-environment/log.html) | `fun KotlinProcessingEnvironment.log(message: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, element: `[`Element`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/Element.html)`? = null, annotationMirror: `[`AnnotationMirror`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/AnnotationMirror.html)`? = null, annotationValue: `[`AnnotationValue`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/AnnotationValue.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [logE](../../arrow.common.messager/me.eugeniomarletti.kotlin.processing.-kotlin-processing-environment/log-e.html) | `fun KotlinProcessingEnvironment.logE(message: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, element: `[`Element`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/Element.html)`? = null, annotationMirror: `[`AnnotationMirror`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/AnnotationMirror.html)`? = null, annotationValue: `[`AnnotationValue`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/AnnotationValue.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [logMW](../../arrow.common.messager/me.eugeniomarletti.kotlin.processing.-kotlin-processing-environment/log-m-w.html) | `fun KotlinProcessingEnvironment.logMW(message: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, element: `[`Element`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/Element.html)`? = null, annotationMirror: `[`AnnotationMirror`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/AnnotationMirror.html)`? = null, annotationValue: `[`AnnotationValue`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/AnnotationValue.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [logW](../../arrow.common.messager/me.eugeniomarletti.kotlin.processing.-kotlin-processing-environment/log-w.html) | `fun KotlinProcessingEnvironment.logW(message: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, element: `[`Element`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/Element.html)`? = null, annotationMirror: `[`AnnotationMirror`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/AnnotationMirror.html)`? = null, annotationValue: `[`AnnotationValue`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/AnnotationValue.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Inheritors

| [AbstractProcessor](../-abstract-processor/index.html) | `abstract class AbstractProcessor : KotlinAbstractProcessor, `[`ProcessorUtils`](./index.html)`, `[`KotlinMetatadataEncoder`](../../arrow.meta.encoder.jvm/-kotlin-metatadata-encoder/index.html) |
| [JvmMetaApi](../../arrow.meta.encoder.jvm/-jvm-meta-api/index.html) | `interface JvmMetaApi : `[`MetaApi`](../../arrow.meta.encoder/-meta-api/index.html)`, `[`TypeElementEncoder`](../../arrow.meta.encoder.jvm/-type-element-encoder/index.html)`, `[`ProcessorUtils`](./index.html)`, `[`TypeDecoder`](../../arrow.meta.decoder/-type-decoder/index.html)<br>A JVM implementation of the Meta Api meant to be mixed in with kapt annotation processors |
| [TypeElementEncoder](../../arrow.meta.encoder.jvm/-type-element-encoder/index.html) | `interface TypeElementEncoder : `[`KotlinMetatadataEncoder`](../../arrow.meta.encoder.jvm/-kotlin-metatadata-encoder/index.html)`, `[`KotlinPoetEncoder`](../../arrow.meta.encoder.jvm/-kotlin-poet-encoder/index.html)`, `[`ProcessorUtils`](./index.html) |

