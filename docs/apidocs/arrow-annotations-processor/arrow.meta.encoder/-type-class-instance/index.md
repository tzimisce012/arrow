---
title: TypeClassInstance - arrow-annotations-processor
---

[arrow-annotations-processor](../../index.html) / [arrow.meta.encoder](../index.html) / [TypeClassInstance](./index.html)

# TypeClassInstance

`data class TypeClassInstance`

### Constructors

| [&lt;init&gt;](-init-.html) | `TypeClassInstance(instance: `[`Type`](../../arrow.meta.ast/-type/index.html)`, dataType: `[`Type`](../../arrow.meta.ast/-type/index.html)`, typeClass: `[`Type`](../../arrow.meta.ast/-type/index.html)`, instanceTypeElement: `[`TypeElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/TypeElement.html)`, dataTypeTypeElement: `[`TypeElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/TypeElement.html)`, typeClassTypeElement: `[`TypeElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/TypeElement.html)`, projectedCompanion: `[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`)` |

### Properties

| [dataType](data-type.html) | `val dataType: `[`Type`](../../arrow.meta.ast/-type/index.html) |
| [dataTypeTypeElement](data-type-type-element.html) | `val dataTypeTypeElement: `[`TypeElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/TypeElement.html) |
| [instance](instance.html) | `val instance: `[`Type`](../../arrow.meta.ast/-type/index.html) |
| [instanceTypeElement](instance-type-element.html) | `val instanceTypeElement: `[`TypeElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/TypeElement.html) |
| [projectedCompanion](projected-companion.html) | `val projectedCompanion: `[`TypeName`](../../arrow.meta.ast/-type-name/index.html) |
| [typeClass](type-class.html) | `val typeClass: `[`Type`](../../arrow.meta.ast/-type/index.html) |
| [typeClassTypeElement](type-class-type-element.html) | `val typeClassTypeElement: `[`TypeElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/TypeElement.html) |

### Extension Properties

| [requiredAbstractFunctions](../-meta-api/required-abstract-functions.html) | `abstract val `[`TypeClassInstance`](./index.html)`.requiredAbstractFunctions: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Func`](../../arrow.meta.ast/-func/index.html)`>`<br>The list of functions a type class instance needs to implement to resolve it's hierarchical dependencies to other type classes ex: override fun MF(): arrow.typeclasses.Monad in the KleisliMonadInstance |
| [requiredAbstractFunctions](../../arrow.meta.encoder.jvm/-jvm-meta-api/required-abstract-functions.html) | `open val `[`TypeClassInstance`](./index.html)`.requiredAbstractFunctions: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Func`](../../arrow.meta.ast/-func/index.html)`>` |
| [requiredParameters](../-meta-api/required-parameters.html) | `abstract val `[`TypeClassInstance`](./index.html)`.requiredParameters: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Parameter`](../../arrow.meta.ast/-parameter/index.html)`>`<br>The list of parameters a type class instance needs to be able to implement the [requiredAbstractFunctions](../-meta-api/required-abstract-functions.html) ex: override fun MF: Monad in KleisliMonadInstance |
| [requiredParameters](../../arrow.meta.encoder.jvm/-jvm-meta-api/required-parameters.html) | `open val `[`TypeClassInstance`](./index.html)`.requiredParameters: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Parameter`](../../arrow.meta.ast/-parameter/index.html)`>` |

