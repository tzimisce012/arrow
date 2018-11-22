---
title: KotlinMetatadataEncoder - arrow-annotations-processor
---

[arrow-annotations-processor](../../index.html) / [arrow.meta.encoder.jvm](../index.html) / [KotlinMetatadataEncoder](./index.html)

# KotlinMetatadataEncoder

`interface KotlinMetatadataEncoder`

### Functions

| [asModifier](as-modifier.html) | `open fun Visibility.asModifier(): `[`Modifier`](../../arrow.meta.ast/-modifier/index.html)`?`<br>`open fun Modality.asModifier(): `[`Modifier`](../../arrow.meta.ast/-modifier/index.html) |
| [asTypeName](as-type-name.html) | `open fun Type.asTypeName(meta: `[`Class`](../../arrow.common.utils/-class-or-package-data-wrapper/-class/index.html)`): `[`TypeName`](../../arrow.meta.ast/-type-name/index.html) |
| [extractFullName](extract-full-name.html) | `open fun Type.extractFullName(classData: `[`ClassOrPackageDataWrapper`](../../arrow.common.utils/-class-or-package-data-wrapper/index.html)`, outputTypeAlias: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = true): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [modifiersFromFlags](modifiers-from-flags.html) | `open fun modifiersFromFlags(flags: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Modifier`](../../arrow.meta.ast/-modifier/index.html)`>` |
| [nameOf](name-of.html) | `open fun `[`Class`](../../arrow.common.utils/-class-or-package-data-wrapper/-class/index.html)`.nameOf(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [supertypes](supertypes.html) | `open fun supertypes(current: `[`Class`](../../arrow.common.utils/-class-or-package-data-wrapper/-class/index.html)`, typeTable: TypeTable, processorUtils: `[`ProcessorUtils`](../../arrow.common.utils/-processor-utils/index.html)`, acc: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`ClassOrPackageDataWrapper`](../../arrow.common.utils/-class-or-package-data-wrapper/index.html)`>): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`ClassOrPackageDataWrapper`](../../arrow.common.utils/-class-or-package-data-wrapper/index.html)`>` |
| [toMeta](to-meta.html) | `open fun Modality.toMeta(): `[`Modifier`](../../arrow.meta.ast/-modifier/index.html)<br>`open fun ValueParameter.toMeta(owner: `[`Class`](../../arrow.common.utils/-class-or-package-data-wrapper/-class/index.html)`): `[`Parameter`](../../arrow.meta.ast/-parameter/index.html)<br>`open fun Variance.toMeta(): `[`Modifier`](../../arrow.meta.ast/-modifier/index.html)<br>`open fun TypeParameter.toMeta(owner: `[`Class`](../../arrow.common.utils/-class-or-package-data-wrapper/-class/index.html)`): `[`TypeVariable`](../../arrow.meta.ast/-type-name/-type-variable/index.html)<br>`open fun Function.toMeta(owner: `[`Class`](../../arrow.common.utils/-class-or-package-data-wrapper/-class/index.html)`, executableElement: `[`ExecutableElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/ExecutableElement.html)`): `[`Func`](../../arrow.meta.ast/-func/index.html) |

### Inheritors

| [AbstractProcessor](../../arrow.common.utils/-abstract-processor/index.html) | `abstract class AbstractProcessor : KotlinAbstractProcessor, `[`ProcessorUtils`](../../arrow.common.utils/-processor-utils/index.html)`, `[`KotlinMetatadataEncoder`](./index.html) |
| [TypeElementEncoder](../-type-element-encoder/index.html) | `interface TypeElementEncoder : `[`KotlinMetatadataEncoder`](./index.html)`, `[`KotlinPoetEncoder`](../-kotlin-poet-encoder/index.html)`, `[`ProcessorUtils`](../../arrow.common.utils/-processor-utils/index.html) |

