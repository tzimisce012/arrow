---
title: Snoc - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics.typeclasses](../index.html) / [Snoc](./index.html)

# Snoc

`interface Snoc<S, A>`



[Snoc](./index.html) defines a [Prism](../../arrow.optics/-prism.html) between a [S](index.html#S) and its [init](index.html#S) and last element [A](index.html#A) and thus can be seen as the reverse of [Cons](../-cons/index.html).
It provides a way to attach or detach elements on the end side of a structure.

### Parameters

`S` - source of [Prism](../../arrow.optics/-prism.html) and init of [Prism](../../arrow.optics/-prism.html) target.

`A` - last of [Prism](../../arrow.optics/-prism.html) focus, [A](index.html#A) is supposed to be unique for a given [S](index.html#S).

### Properties

| [init](init.html) | `open val `[`S`](index.html#S)`.init: Option<`[`S`](index.html#S)`>`<br>Selects all elements except the last. |

### Functions

| [initOption](init-option.html) | `open fun initOption(): `[`Optional`](../../arrow.optics/-optional.html)`<`[`S`](index.html#S)`, `[`S`](index.html#S)`>`<br>Provides an [Optional](../../arrow.optics/-optional.html) between [S](index.html#S) and its init [S](index.html#S). |
| [lastOption](last-option.html) | `open fun lastOption(): `[`Optional`](../../arrow.optics/-optional.html)`<`[`S`](index.html#S)`, `[`A`](index.html#A)`>`<br>Provides an [Optional](../../arrow.optics/-optional.html) between [S](index.html#S) and its last element [A](index.html#A). |
| [snoc](snoc.html) | `abstract fun snoc(): `[`Prism`](../../arrow.optics/-prism.html)`<`[`S`](index.html#S)`, Tuple2<`[`S`](index.html#S)`, `[`A`](index.html#A)`>>`<br>Provides a [Prism](../../arrow.optics/-prism.html) between a [S](index.html#S) and its [init](index.html#S) and last element [A](index.html#A).`open infix fun `[`S`](index.html#S)`.snoc(last: `[`A`](index.html#A)`): `[`S`](index.html#S)<br>Append an element [A](index.html#A) to [S](index.html#S). |
| [unsnoc](unsnoc.html) | `open fun `[`S`](index.html#S)`.unsnoc(): Option<Tuple2<`[`S`](index.html#S)`, `[`A`](index.html#A)`>>`<br>Deconstruct an [S](index.html#S) between its [init](init.html) and last element. |

### Companion Object Functions

| [fromIso](from-iso.html) | `fun <S, A, B> fromIso(SS: `[`Snoc`](./index.html)`<`[`A`](from-iso.html#A)`, `[`B`](from-iso.html#B)`>, iso: `[`Iso`](../../arrow.optics/-iso.html)`<`[`S`](from-iso.html#S)`, `[`A`](from-iso.html#A)`>): `[`Snoc`](./index.html)`<`[`S`](from-iso.html#S)`, `[`B`](from-iso.html#B)`>`<br>Lift an instance of [Snoc](./index.html) using an [Iso](../../arrow.optics/-iso.html). |
| [invoke](invoke.html) | `operator fun <S, A> invoke(prism: `[`Prism`](../../arrow.optics/-prism.html)`<`[`S`](invoke.html#S)`, Tuple2<`[`S`](invoke.html#S)`, `[`A`](invoke.html#A)`>>): `[`Snoc`](./index.html)`<`[`S`](invoke.html#S)`, `[`A`](invoke.html#A)`>`<br>Construct a [Snoc](./index.html) instance from a [Prism](../../arrow.optics/-prism.html). |

### Inheritors

| [ListKSnocInstance](../../arrow.optics.instances/-list-k-snoc-instance/index.html) | `interface ListKSnocInstance<A> : `[`Snoc`](./index.html)`<ListK<`[`A`](../../arrow.optics.instances/-list-k-snoc-instance/index.html#A)`>, `[`A`](../../arrow.optics.instances/-list-k-snoc-instance/index.html#A)`>`<br>[Snoc](./index.html) instance definition for [ListK](#). |
| [ListSnocInstance](../../arrow.optics.instances/-list-snoc-instance/index.html) | `interface ListSnocInstance<A> : `[`Snoc`](./index.html)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`A`](../../arrow.optics.instances/-list-snoc-instance/index.html#A)`>, `[`A`](../../arrow.optics.instances/-list-snoc-instance/index.html#A)`>`<br>[Snoc](./index.html) instance definition for [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html). |
| [StringSnocInstance](../../arrow.optics.instances/-string-snoc-instance/index.html) | `interface StringSnocInstance : `[`Snoc`](./index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`>` |




## Type Class Hierarchy

<canvas id="arrow.optics.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.optics.typeclasses-hierarchy-diagram', 'arrow.optics.typeclasses-diagram.nomnol')
</script>

