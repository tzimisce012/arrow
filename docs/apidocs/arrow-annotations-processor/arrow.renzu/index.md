---
title: arrow.renzu - arrow-annotations-processor
---

[arrow-annotations-processor](../index.html) / [arrow.renzu](./index.html)

## Package arrow.renzu

### Types

| [Instance](-instance/index.html) | `data class Instance` |
| [RenzuGenerator](-renzu-generator/index.html) | `class RenzuGenerator` |
| [RenzuProcessor](-renzu-processor/index.html) | `class RenzuProcessor : `[`AbstractProcessor`](../arrow.common.utils/-abstract-processor/index.html) |
| [TypeClass](-type-class/index.html) | `data class TypeClass` |

### Type Aliases

| [Instances](-instances.html) | `typealias Instances = `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`Instance`](-instance/index.html)`>` |
| [ParentTypeClass](-parent-type-class.html) | `typealias ParentTypeClass = `[`TypeClass`](-type-class/index.html) |

### Functions

| [getModuleStyle](get-module-style.html) | `fun getModuleStyle(module: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Provides nomnoml formatted style to use per module. That means different colors and font style per module. |
| [normalizeModule](normalize-module.html) | `fun normalizeModule(module: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Renzu module will be parsed for test samples. We want to normalize that one to be treated as standard instances. |
| [parentTypeClasses](parent-type-classes.html) | `fun parentTypeClasses(processor: `[`RenzuProcessor`](-renzu-processor/index.html)`, current: `[`Class`](../arrow.common.utils/-class-or-package-data-wrapper/-class/index.html)`): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TypeClass`](-type-class/index.html)`>` |

