---
title: arrow.derive - arrow-annotations-processor
---

[arrow-annotations-processor](../index.html) / [arrow.derive](./index.html)

## Package arrow.derive

### Types

| [AnnotatedDeriving](-annotated-deriving/index.html) | `class AnnotatedDeriving` |
| [DerivingFileGenerator](-deriving-file-generator/index.html) | `class DerivingFileGenerator` |
| [DerivingProcessor](-deriving-processor/index.html) | `class DerivingProcessor : `[`AbstractProcessor`](../arrow.common.utils/-abstract-processor/index.html) |
| [FunctionSignature](-function-signature/index.html) | `data class FunctionSignature` |
| [HKArgs](-h-k-args/index.html) | `sealed class HKArgs` |
| [TypeclassInstanceGenerator](-typeclass-instance-generator/index.html) | `class TypeclassInstanceGenerator` |

### Extensions for External Classes

| [kotlin.String](kotlin.-string/index.html) |  |

### Properties

| [derivingAnnotationClass](deriving-annotation-class.html) | `val derivingAnnotationClass: `[`Class`](http://docs.oracle.com/javase/6/docs/api/java/lang/Class.html)`<deriving>` |
| [derivingAnnotationKClass](deriving-annotation-k-class.html) | `val derivingAnnotationKClass: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<deriving>` |
| [derivingAnnotationName](deriving-annotation-name.html) | `val derivingAnnotationName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Functions

| [argAsSeenFromReceiver](arg-as-seen-from-receiver.html) | `fun argAsSeenFromReceiver(typeClassFirstTypeArg: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, abstractType: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, recType: `[`Class`](../arrow.common.utils/-class-or-package-data-wrapper/-class/index.html)`, invariantTypeArgs: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, unappliedTypeArgs: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>>): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [retTypeAsSeenFromReceiver](ret-type-as-seen-from-receiver.html) | `fun retTypeAsSeenFromReceiver(typeClassFirstTypeArg: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, abstractType: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, recType: `[`Class`](../arrow.common.utils/-class-or-package-data-wrapper/-class/index.html)`, invariantTypeArgs: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, unappliedTypeArgs: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>>): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

