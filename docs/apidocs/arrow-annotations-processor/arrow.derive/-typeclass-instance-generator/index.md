---
title: TypeclassInstanceGenerator - arrow-annotations-processor
---

[arrow-annotations-processor](../../index.html) / [arrow.derive](../index.html) / [TypeclassInstanceGenerator](./index.html)

# TypeclassInstanceGenerator

`class TypeclassInstanceGenerator`

### Constructors

| [&lt;init&gt;](-init-.html) | `TypeclassInstanceGenerator(targetType: `[`AnnotatedDeriving`](../-annotated-deriving/index.html)`, typeClass: `[`Class`](../../arrow.common.utils/-class-or-package-data-wrapper/-class/index.html)`)` |

### Properties

| [companionFactoryName](companion-factory-name.html) | `val companionFactoryName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [delegatedFunctions](delegated-functions.html) | `val delegatedFunctions: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [instanceName](instance-name.html) | `val instanceName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [receiverName](receiver-name.html) | `val receiverName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [receiverSimpleName](receiver-simple-name.html) | `val receiverSimpleName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [receiverType](receiver-type.html) | `val receiverType: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [target](target.html) | `val target: `[`Class`](../../arrow.common.utils/-class-or-package-data-wrapper/-class/index.html) |
| [targetType](target-type.html) | `val targetType: `[`AnnotatedDeriving`](../-annotated-deriving/index.html) |
| [tparams](tparams.html) | `val tparams: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [tparamsAsSeenFromReceiver](tparams-as-seen-from-receiver.html) | `val tparamsAsSeenFromReceiver: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [typeClass](type-class.html) | `val typeClass: `[`Class`](../../arrow.common.utils/-class-or-package-data-wrapper/-class/index.html) |
| [typeClassFQName](type-class-f-q-name.html) | `val typeClassFQName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [typeClassName](type-class-name.html) | `val typeClassName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Functions

| [functionSignatures](function-signatures.html) | `fun functionSignatures(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`FunctionSignature`](../-function-signature/index.html)`>` |
| [generate](generate.html) | `fun generate(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [targetHasFunction](target-has-function.html) | `fun targetHasFunction(f: `[`FunctionSignature`](../-function-signature/index.html)`, c: `[`ClassOrPackageDataWrapper`](../../arrow.common.utils/-class-or-package-data-wrapper/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [targetRequestsDelegation](target-requests-delegation.html) | `fun targetRequestsDelegation(f: `[`FunctionSignature`](../-function-signature/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

