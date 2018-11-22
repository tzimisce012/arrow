---
title: Instance - arrow-annotations-processor
---

[arrow-annotations-processor](../../index.html) / [arrow.instances](../index.html) / [Instance](./index.html)

# Instance

`data class Instance`

### Types

| [ParamInfo](-param-info/index.html) | `data class ParamInfo` |

### Constructors

| [&lt;init&gt;](-init-.html) | `Instance(package: `[`Package`](../../arrow.common/-package.html)`, target: `[`AnnotatedInstance`](../-annotated-instance/index.html)`, processorUtils: `[`ProcessorUtils`](../../arrow.common.utils/-processor-utils/index.html)`)` |

### Properties

| [args](args.html) | `val args: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>>` |
| [companionFactoryName](companion-factory-name.html) | `val companionFactoryName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [name](name.html) | `val name: `[`Name`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/Name.html) |
| [package](package.html) | `val package: `[`Package`](../../arrow.common/-package.html) |
| [processorUtils](processor-utils.html) | `val processorUtils: `[`ProcessorUtils`](../../arrow.common.utils/-processor-utils/index.html) |
| [receiverTypeName](receiver-type-name.html) | `val receiverTypeName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [receiverTypeSimpleName](receiver-type-simple-name.html) | `val receiverTypeSimpleName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [target](target.html) | `val target: `[`AnnotatedInstance`](../-annotated-instance/index.html) |
| [targetImplementations](target-implementations.html) | `val targetImplementations: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Functions

| [expandedTypeArgs](expanded-type-args.html) | `fun expandedTypeArgs(reified: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, includeBounds: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [extendingFunctions](extending-functions.html) | `fun extendingFunctions(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`FunctionMapping`](../-function-mapping/index.html)`>` |
| [typeArgs](type-args.html) | `fun typeArgs(reified: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, includeBounds: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [typeConstraints](type-constraints.html) | `fun typeConstraints(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

