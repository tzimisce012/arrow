---
title: arrow.reflect - arrow-reflect
---

[arrow-reflect](../index.html) / [arrow.reflect](./index.html)

## Package arrow.reflect

### Types

| [DataType](-data-type/index.html) | `data class DataType`<br>Represents a data type providing a type class instance |
| [Extends](-extends/index.html) | `data class Extends` |
| [Instance](-instance/index.html) | `data class Instance`<br>A type class instance pairing a type class contract with a data type implementation of such contract |
| [TypeClass](-type-class/index.html) | `data class TypeClass`<br>A type class such as arrow.typeclasses.Functor |
| [TypeClassExtension](-type-class-extension/index.html) | `data class TypeClassExtension`<br>The triple of a [dataType](-type-class-extension/data-type.html), a [typeClass](-type-class-extension/type-class.html) and an [instance](-type-class-extension/instance.html) |

### Functions

| [extends](extends.html) | `fun `[`TypeClass`](-type-class/index.html)`.extends(other: `[`TypeClass`](-type-class/index.html)`): `[`Extends`](-extends/index.html)`?` |
| [extensions](extensions.html) | `fun `[`DataType`](-data-type/index.html)`.extensions(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TypeClassExtension`](-type-class-extension/index.html)`>`<br>`fun `[`TypeClass`](-type-class/index.html)`.extensions(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TypeClassExtension`](-type-class-extension/index.html)`>` |
| [hierarchy](hierarchy.html) | `fun `[`TypeClass`](-type-class/index.html)`.hierarchy(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Extends`](-extends/index.html)`>` |
| [supportedDataTypes](supported-data-types.html) | `fun `[`TypeClass`](-type-class/index.html)`.supportedDataTypes(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`DataType`](-data-type/index.html)`>` |
| [supportedTypeClasses](supported-type-classes.html) | `fun `[`DataType`](-data-type/index.html)`.supportedTypeClasses(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TypeClass`](-type-class/index.html)`>` |

