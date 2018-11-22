---
title: ExtensionProcessor - arrow-annotations-processor
---

[arrow-annotations-processor](../../index.html) / [arrow.instances](../index.html) / [ExtensionProcessor](./index.html)

# ExtensionProcessor

`@AutoService([Processor]) class ExtensionProcessor : `[`MetaProcessor`](../../arrow.meta.processor/-meta-processor/index.html)`<extension>`

### Constructors

| [&lt;init&gt;](-init-.html) | `ExtensionProcessor()` |

### Inherited Properties

| [typeElementToMeta](../../arrow.meta.processor/-meta-processor/type-element-to-meta.html) | `open val typeElementToMeta: (classElement: `[`TypeElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/TypeElement.html)`) -> `[`ClassOrPackageDataWrapper`](../../arrow.common.utils/-class-or-package-data-wrapper/index.html) |
| [typeNameDownKind](../../arrow.meta.processor/-meta-processor/type-name-down-kind.html) | `open val typeNameDownKind: (typeName: `[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`) -> `[`TypeName`](../../arrow.meta.ast/-type-name/index.html) |
| [typeNameToMeta](../../arrow.meta.processor/-meta-processor/type-name-to-meta.html) | `open val typeNameToMeta: (typeName: TypeName) -> `[`TypeName`](../../arrow.meta.ast/-type-name/index.html) |

### Functions

| [genCompanionFactory](gen-companion-factory.html) | `fun `[`TypeClassInstance`](../../arrow.meta.encoder/-type-class-instance/index.html)`.genCompanionFactory(targetType: `[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`): `[`Func`](../../arrow.meta.ast/-func/index.html) |
| [transform](transform.html) | `fun transform(annotatedElement: `[`AnnotatedElement`](../../arrow.meta.processor/-meta-processor/-annotated-element/index.html)`): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<Builder>` |

### Inherited Functions

| [getSupportedAnnotationTypes](../../arrow.meta.processor/-meta-processor/get-supported-annotation-types.html) | `open fun getSupportedAnnotationTypes(): `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [getSupportedSourceVersion](../../arrow.meta.processor/-meta-processor/get-supported-source-version.html) | `open fun getSupportedSourceVersion(): `[`SourceVersion`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/SourceVersion.html) |
| [kotlinMetadataUtils](../../arrow.meta.processor/-meta-processor/kotlin-metadata-utils.html) | `open fun kotlinMetadataUtils(): KotlinMetadataUtils` |
| [onProcess](../../arrow.meta.processor/-meta-processor/on-process.html) | `open fun onProcess(annotations: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`TypeElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/TypeElement.html)`>, roundEnv: `[`RoundEnvironment`](http://docs.oracle.com/javase/6/docs/api/javax/annotation/processing/RoundEnvironment.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Processor entry point |
| [processorUtils](../../arrow.meta.processor/-meta-processor/processor-utils.html) | `open fun processorUtils(): `[`ProcessorUtils`](../../arrow.common.utils/-processor-utils/index.html) |

### Extension Functions

| [log](../../arrow.common.messager/me.eugeniomarletti.kotlin.processing.-kotlin-processing-environment/log.html) | `fun KotlinProcessingEnvironment.log(message: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, element: `[`Element`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/Element.html)`? = null, annotationMirror: `[`AnnotationMirror`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/AnnotationMirror.html)`? = null, annotationValue: `[`AnnotationValue`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/AnnotationValue.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [logE](../../arrow.common.messager/me.eugeniomarletti.kotlin.processing.-kotlin-processing-environment/log-e.html) | `fun KotlinProcessingEnvironment.logE(message: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, element: `[`Element`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/Element.html)`? = null, annotationMirror: `[`AnnotationMirror`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/AnnotationMirror.html)`? = null, annotationValue: `[`AnnotationValue`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/AnnotationValue.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [logMW](../../arrow.common.messager/me.eugeniomarletti.kotlin.processing.-kotlin-processing-environment/log-m-w.html) | `fun KotlinProcessingEnvironment.logMW(message: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, element: `[`Element`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/Element.html)`? = null, annotationMirror: `[`AnnotationMirror`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/AnnotationMirror.html)`? = null, annotationValue: `[`AnnotationValue`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/AnnotationValue.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [logW](../../arrow.common.messager/me.eugeniomarletti.kotlin.processing.-kotlin-processing-environment/log-w.html) | `fun KotlinProcessingEnvironment.logW(message: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, element: `[`Element`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/Element.html)`? = null, annotationMirror: `[`AnnotationMirror`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/AnnotationMirror.html)`? = null, annotationValue: `[`AnnotationValue`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/AnnotationValue.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

