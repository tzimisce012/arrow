---
title: Cons - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics.typeclasses](../index.html) / [Cons](./index.html)

# Cons

`interface Cons<S, A>`



[Cons](./index.html) provides a [Prism](../../arrow.optics/-prism.html) between [S](index.html#S) and its first element [A](index.html#A) and tail [S](index.html#S).
It provides a convenient way to attach or detach elements to the left side of a structure [S](index.html#S).

### Parameters

`S` - source of [Prism](../../arrow.optics/-prism.html) and tail of [Prism](../../arrow.optics/-prism.html) focus.

`A` - first element of [Prism](../../arrow.optics/-prism.html) focus, [A](index.html#A) is supposed to be unique for a given [S](index.html#S).

### Functions

| [cons](cons.html) | `abstract fun cons(): `[`Prism`](../../arrow.optics/-prism.html)`<`[`S`](index.html#S)`, Tuple2<`[`A`](index.html#A)`, `[`S`](index.html#S)`>>`<br>Provides a [Prism](../../arrow.optics/-prism.html) between [S](index.html#S) and its first element [A](index.html#A) and tail [S](index.html#S).`open infix fun `[`A`](index.html#A)`.cons(tail: `[`S`](index.html#S)`): `[`S`](index.html#S)<br>Prepend an element [A](index.html#A) to the first element of [S](index.html#S). |
| [firstOption](first-option.html) | `open fun firstOption(): `[`Optional`](../../arrow.optics/-optional.html)`<`[`S`](index.html#S)`, `[`A`](index.html#A)`>`<br>Provides an [Optional](../../arrow.optics/-optional.html) between [S](index.html#S) and its first element [A](index.html#A). |
| [tailOption](tail-option.html) | `open fun tailOption(): `[`Optional`](../../arrow.optics/-optional.html)`<`[`S`](index.html#S)`, `[`S`](index.html#S)`>`<br>Provides an [Optional](../../arrow.optics/-optional.html) between [S](index.html#S) and its tail [S](index.html#S). |
| [uncons](uncons.html) | `open fun `[`S`](index.html#S)`.uncons(): Option<Tuple2<`[`A`](index.html#A)`, `[`S`](index.html#S)`>>`<br>Deconstruct an [S](index.html#S) to its optional first element [A](index.html#A) and tail [S](index.html#S). |

### Companion Object Functions

| [fromIso](from-iso.html) | `fun <S, A, B> fromIso(C: `[`Cons`](./index.html)`<`[`A`](from-iso.html#A)`, `[`B`](from-iso.html#B)`>, iso: `[`Iso`](../../arrow.optics/-iso.html)`<`[`S`](from-iso.html#S)`, `[`A`](from-iso.html#A)`>): `[`Cons`](./index.html)`<`[`S`](from-iso.html#S)`, `[`B`](from-iso.html#B)`>`<br>Lift an instance of [Cons](./index.html) using an [Iso](../../arrow.optics/-iso.html). |
| [invoke](invoke.html) | `operator fun <S, A> invoke(prism: `[`Prism`](../../arrow.optics/-prism.html)`<`[`S`](invoke.html#S)`, Tuple2<`[`A`](invoke.html#A)`, `[`S`](invoke.html#S)`>>): `[`Cons`](./index.html)`<`[`S`](invoke.html#S)`, `[`A`](invoke.html#A)`>` |

### Inheritors

| [ListConsInstance](../../arrow.optics.instances/-list-cons-instance/index.html) | `interface ListConsInstance<A> : `[`Cons`](./index.html)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`A`](../../arrow.optics.instances/-list-cons-instance/index.html#A)`>, `[`A`](../../arrow.optics.instances/-list-cons-instance/index.html#A)`>`<br>[Cons](./index.html) instance definition for [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html). |
| [ListKConsInstance](../../arrow.optics.instances/-list-k-cons-instance/index.html) | `interface ListKConsInstance<A> : `[`Cons`](./index.html)`<ListK<`[`A`](../../arrow.optics.instances/-list-k-cons-instance/index.html#A)`>, `[`A`](../../arrow.optics.instances/-list-k-cons-instance/index.html#A)`>`<br>[Cons](./index.html) instance definition for [ListK](#). |
| [StringConsInstance](../../arrow.optics.instances/-string-cons-instance/index.html) | `interface StringConsInstance : `[`Cons`](./index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`>` |




## Type Class Hierarchy

<canvas id="arrow.optics.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.optics.typeclasses-hierarchy-diagram', 'arrow.optics.typeclasses-diagram.nomnol')
</script>

