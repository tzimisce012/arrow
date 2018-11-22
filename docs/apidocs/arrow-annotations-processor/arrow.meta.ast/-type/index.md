---
title: Type - arrow-annotations-processor
---

[arrow-annotations-processor](../../index.html) / [arrow.meta.ast](../index.html) / [Type](./index.html)

# Type

`data class Type : `[`Tree`](../-tree.html)

### Types

| [Shape](-shape/index.html) | `sealed class Shape` |

### Constructors

| [&lt;init&gt;](-init-.html) | `Type(packageName: `[`PackageName`](../-package-name/index.html)`, name: `[`TypeName`](../-type-name/index.html)`, kind: `[`Shape`](-shape/index.html)`, kdoc: `[`Code`](../-code/index.html)`? = null, modifiers: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Modifier`](../-modifier/index.html)`> = emptyList(), primaryConstructor: `[`Func`](../-func/index.html)`? = null, superclass: `[`TypeName`](../-type-name/index.html)`? = null, initializer: `[`Code`](../-code/index.html)`? = null, superInterfaces: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TypeName`](../-type-name/index.html)`> = emptyList(), enumConstants: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Type`](./index.html)`> = emptyMap(), annotations: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Annotation`](../-annotation/index.html)`> = emptyList(), typeVariables: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TypeVariable`](../-type-name/-type-variable/index.html)`> = emptyList(), superclassConstructorParameters: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Code`](../-code/index.html)`> = emptyList(), properties: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Property`](../-property/index.html)`> = emptyList(), declaredFunctions: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Func`](../-func/index.html)`> = emptyList(), allFunctions: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Func`](../-func/index.html)`> = emptyList(), types: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Type`](./index.html)`> = emptyList())` |

### Properties

| [allFunctions](all-functions.html) | `val allFunctions: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Func`](../-func/index.html)`>` |
| [annotations](annotations.html) | `val annotations: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Annotation`](../-annotation/index.html)`>` |
| [declaredFunctions](declared-functions.html) | `val declaredFunctions: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Func`](../-func/index.html)`>` |
| [enumConstants](enum-constants.html) | `val enumConstants: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Type`](./index.html)`>` |
| [initializer](initializer.html) | `val initializer: `[`Code`](../-code/index.html)`?` |
| [kdoc](kdoc.html) | `val kdoc: `[`Code`](../-code/index.html)`?` |
| [kind](kind.html) | `val kind: `[`Shape`](-shape/index.html) |
| [modifiers](modifiers.html) | `val modifiers: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Modifier`](../-modifier/index.html)`>` |
| [name](name.html) | `val name: `[`TypeName`](../-type-name/index.html) |
| [packageName](package-name.html) | `val packageName: `[`PackageName`](../-package-name/index.html) |
| [primaryConstructor](primary-constructor.html) | `val primaryConstructor: `[`Func`](../-func/index.html)`?` |
| [properties](properties.html) | `val properties: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Property`](../-property/index.html)`>` |
| [superInterfaces](super-interfaces.html) | `val superInterfaces: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TypeName`](../-type-name/index.html)`>` |
| [superclass](superclass.html) | `val superclass: `[`TypeName`](../-type-name/index.html)`?` |
| [superclassConstructorParameters](superclass-constructor-parameters.html) | `val superclassConstructorParameters: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Code`](../-code/index.html)`>` |
| [typeVariables](type-variables.html) | `val typeVariables: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TypeVariable`](../-type-name/-type-variable/index.html)`>` |
| [types](types.html) | `val types: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Type`](./index.html)`>` |

### Extension Properties

| [kindWrapper](../../arrow.meta.encoder.jvm/-jvm-meta-api/kind-wrapper.html) | `open val `[`Type`](./index.html)`.kindWrapper: `[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<`[`TypeName`](../-type-name/index.html)`, `[`ParameterizedType`](../-type-name/-parameterized-type/index.html)`>?`<br>Returns a Pair matching a type as wrapper and the type it wraps ex: SetK to Set |

