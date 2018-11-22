---
title: ClassOrPackageDataWrapper - arrow-annotations-processor
---

[arrow-annotations-processor](../../index.html) / [arrow.common.utils](../index.html) / [ClassOrPackageDataWrapper](./index.html)

# ClassOrPackageDataWrapper

`sealed class ClassOrPackageDataWrapper`

### Types

| [Class](-class/index.html) | `class Class : `[`ClassOrPackageDataWrapper`](./index.html) |
| [Package](-package/index.html) | `class Package : `[`ClassOrPackageDataWrapper`](./index.html) |

### Properties

| [constructorList](constructor-list.html) | `abstract val constructorList: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<Constructor>` |
| [functionList](function-list.html) | `abstract val functionList: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<Function>` |
| [nameResolver](name-resolver.html) | `abstract val nameResolver: NameResolver` |
| [package](package.html) | `abstract val package: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [propertyList](property-list.html) | `abstract val propertyList: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<Property>` |
| [typeParameters](type-parameters.html) | `abstract val typeParameters: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<TypeParameter>` |

### Functions

| [getTypeParameter](get-type-parameter.html) | `abstract fun getTypeParameter(typeParameterIndex: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): TypeParameter?` |

### Extension Functions

| [getParameter](../get-parameter.html) | `fun `[`ClassOrPackageDataWrapper`](./index.html)`.getParameter(function: Function, parameterElement: `[`VariableElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/VariableElement.html)`): ValueParameter` |
| [getPropertyOrNull](../get-property-or-null.html) | `fun `[`ClassOrPackageDataWrapper`](./index.html)`.getPropertyOrNull(methodElement: `[`ExecutableElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/ExecutableElement.html)`): Property?` |
| [typeConstraints](../type-constraints.html) | `fun `[`ClassOrPackageDataWrapper`](./index.html)`.typeConstraints(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Inheritors

| [Class](-class/index.html) | `class Class : `[`ClassOrPackageDataWrapper`](./index.html) |
| [Package](-package/index.html) | `class Package : `[`ClassOrPackageDataWrapper`](./index.html) |

