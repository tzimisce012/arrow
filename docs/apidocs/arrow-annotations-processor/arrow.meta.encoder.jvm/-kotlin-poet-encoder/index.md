---
title: KotlinPoetEncoder - arrow-annotations-processor
---

[arrow-annotations-processor](../../index.html) / [arrow.meta.encoder.jvm](../index.html) / [KotlinPoetEncoder](./index.html)

# KotlinPoetEncoder

`interface KotlinPoetEncoder`

### Properties

| [typeNameToMeta](type-name-to-meta.html) | `abstract val typeNameToMeta: (typeName: TypeName) -> `[`TypeName`](../../arrow.meta.ast/-type-name/index.html) |

### Functions

| [kotlinMetadataUtils](kotlin-metadata-utils.html) | `abstract fun kotlinMetadataUtils(): KotlinMetadataUtils` |
| [metaApi](meta-api.html) | `abstract fun metaApi(): `[`MetaApi`](../../arrow.meta.encoder/-meta-api/index.html) |
| [toMeta](to-meta.html) | `open fun FunSpec.toMeta(element: `[`ExecutableElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/ExecutableElement.html)`): `[`Func`](../../arrow.meta.ast/-func/index.html)<br>`open fun AnnotationSpec.toMeta(): `[`Annotation`](../../arrow.meta.ast/-annotation/index.html)<br>`open fun TypeVariableName.toMeta(): `[`TypeVariable`](../../arrow.meta.ast/-type-name/-type-variable/index.html)<br>`open fun TypeName.toMeta(): `[`TypeName`](../../arrow.meta.ast/-type-name/index.html) |
| [typeNameToMetaImpl](type-name-to-meta-impl.html) | `open fun typeNameToMetaImpl(typeName: TypeName): `[`TypeName`](../../arrow.meta.ast/-type-name/index.html) |

### Inheritors

| [TypeElementEncoder](../-type-element-encoder/index.html) | `interface TypeElementEncoder : `[`KotlinMetatadataEncoder`](../-kotlin-metatadata-encoder/index.html)`, `[`KotlinPoetEncoder`](./index.html)`, `[`ProcessorUtils`](../../arrow.common.utils/-processor-utils/index.html) |

