---
title: Each - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics.typeclasses](../index.html) / [Each](./index.html)

# Each

`interface Each<S, A>`



[Each](./index.html) provides a [Traversal](../../arrow.optics/-traversal.html) that can focus into a structure [S](index.html#S) to see all its foci [A](index.html#A)

### Parameters

`S` - source of the [Traversal](../../arrow.optics/-traversal.html)

`A` - focus of [Traversal](../../arrow.optics/-traversal.html)

### Properties

| [every](every.html) | `open val <T> `[`Lens`](../../arrow.optics/-lens.html)`<`[`T`](every.html#T)`, `[`S`](index.html#S)`>.every: `[`Traversal`](../../arrow.optics/-traversal.html)`<`[`T`](every.html#T)`, `[`A`](index.html#A)`>`<br>DSL to compose [Each](./index.html) with a [Lens](../../arrow.optics/-lens.html) for a structure [S](index.html#S) to see all its foci [A](index.html#A)`open val <T> `[`Iso`](../../arrow.optics/-iso.html)`<`[`T`](every.html#T)`, `[`S`](index.html#S)`>.every: `[`Traversal`](../../arrow.optics/-traversal.html)`<`[`T`](every.html#T)`, `[`A`](index.html#A)`>`<br>DSL to compose [Each](./index.html) with a [Iso](../../arrow.optics/-iso.html) for a structure [S](index.html#S) to see all its foci [A](index.html#A)`open val <T> `[`Prism`](../../arrow.optics/-prism.html)`<`[`T`](every.html#T)`, `[`S`](index.html#S)`>.every: `[`Traversal`](../../arrow.optics/-traversal.html)`<`[`T`](every.html#T)`, `[`A`](index.html#A)`>`<br>DSL to compose [Each](./index.html) with a [Prism](../../arrow.optics/-prism.html) for a structure [S](index.html#S) to see all its foci [A](index.html#A)`open val <T> `[`Optional`](../../arrow.optics/-optional.html)`<`[`T`](every.html#T)`, `[`S`](index.html#S)`>.every: `[`Traversal`](../../arrow.optics/-traversal.html)`<`[`T`](every.html#T)`, `[`A`](index.html#A)`>`<br>DSL to compose [Each](./index.html) with a [Optional](../../arrow.optics/-optional.html) for a structure [S](index.html#S) to see all its foci [A](index.html#A)`open val <T> `[`Setter`](../../arrow.optics/-setter.html)`<`[`T`](every.html#T)`, `[`S`](index.html#S)`>.every: `[`Setter`](../../arrow.optics/-setter.html)`<`[`T`](every.html#T)`, `[`A`](index.html#A)`>`<br>DSL to compose [Each](./index.html) with a [Setter](../../arrow.optics/-setter.html) for a structure [S](index.html#S) to see all its foci [A](index.html#A)`open val <T> `[`Traversal`](../../arrow.optics/-traversal.html)`<`[`T`](every.html#T)`, `[`S`](index.html#S)`>.every: `[`Traversal`](../../arrow.optics/-traversal.html)`<`[`T`](every.html#T)`, `[`A`](index.html#A)`>`<br>DSL to compose [Each](./index.html) with a [Traversal](../../arrow.optics/-traversal.html) for a structure [S](index.html#S) to see all its foci [A](index.html#A)`open val <T> `[`Fold`](../../arrow.optics/-fold/index.html)`<`[`T`](every.html#T)`, `[`S`](index.html#S)`>.every: `[`Fold`](../../arrow.optics/-fold/index.html)`<`[`T`](every.html#T)`, `[`A`](index.html#A)`>`<br>DSL to compose [Each](./index.html) with a [Fold](../../arrow.optics/-fold/index.html) for a structure [S](index.html#S) to see all its foci [A](index.html#A) |

### Functions

| [each](each.html) | `abstract fun each(): `[`Traversal`](../../arrow.optics/-traversal.html)`<`[`S`](index.html#S)`, `[`A`](index.html#A)`>`<br>Provide a [Traversal](../../arrow.optics/-traversal.html) for a structure [S](index.html#S) with focus in [A](index.html#A) |

### Companion Object Functions

| [fromIso](from-iso.html) | `fun <S, A, B> fromIso(EA: `[`Each`](./index.html)`<`[`A`](from-iso.html#A)`, `[`B`](from-iso.html#B)`>, iso: `[`Iso`](../../arrow.optics/-iso.html)`<`[`S`](from-iso.html#S)`, `[`A`](from-iso.html#A)`>): `[`Each`](./index.html)`<`[`S`](from-iso.html#S)`, `[`B`](from-iso.html#B)`>`<br>Lift an instance of [Each](./index.html) using an [Iso](../../arrow.optics/-iso.html) |
| [fromTraverse](from-traverse.html) | `fun <S, A> fromTraverse(T: Traverse<`[`S`](from-traverse.html#S)`>): `[`Each`](./index.html)`<Kind<`[`S`](from-traverse.html#S)`, `[`A`](from-traverse.html#A)`>, `[`A`](from-traverse.html#A)`>`<br>Create an instance of [Each](./index.html) from a [Traverse](#) |

### Inheritors

| [EitherEachInstance](../../arrow.optics.instances/-either-each-instance/index.html) | `interface EitherEachInstance<L, R> : `[`Each`](./index.html)`<Either<`[`L`](../../arrow.optics.instances/-either-each-instance/index.html#L)`, `[`R`](../../arrow.optics.instances/-either-each-instance/index.html#R)`>, `[`R`](../../arrow.optics.instances/-either-each-instance/index.html#R)`>`<br>[Each](./index.html) instance for [Either](#) that has focus in each [Either.Right](#). |
| [ListEachInstance](../../arrow.optics.instances/-list-each-instance/index.html) | `interface ListEachInstance<A> : `[`Each`](./index.html)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`A`](../../arrow.optics.instances/-list-each-instance/index.html#A)`>, `[`A`](../../arrow.optics.instances/-list-each-instance/index.html#A)`>`<br>[Each](./index.html) instance definition for [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) that summons a [Traversal](../../arrow.optics/-traversal.html) to focus in each [A](../../arrow.optics.instances/-list-each-instance/index.html#A) of the source [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html). |
| [ListKEachInstance](../../arrow.optics.instances/-list-k-each-instance/index.html) | `interface ListKEachInstance<A> : `[`Each`](./index.html)`<ListK<`[`A`](../../arrow.optics.instances/-list-k-each-instance/index.html#A)`>, `[`A`](../../arrow.optics.instances/-list-k-each-instance/index.html#A)`>`<br>[Each](./index.html) instance definition for [ListK](#). |
| [MapEachInstance](../../arrow.optics.instances/-map-each-instance/index.html) | `interface MapEachInstance<K, V> : `[`Each`](./index.html)`<`[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`K`](../../arrow.optics.instances/-map-each-instance/index.html#K)`, `[`V`](../../arrow.optics.instances/-map-each-instance/index.html#V)`>, `[`V`](../../arrow.optics.instances/-map-each-instance/index.html#V)`>`<br>[Each](./index.html) instance definition for [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html). |
| [MapKEachInstance](../../arrow.optics.instances/-map-k-each-instance/index.html) | `interface MapKEachInstance<K, V> : `[`Each`](./index.html)`<MapK<`[`K`](../../arrow.optics.instances/-map-k-each-instance/index.html#K)`, `[`V`](../../arrow.optics.instances/-map-k-each-instance/index.html#V)`>, `[`V`](../../arrow.optics.instances/-map-k-each-instance/index.html#V)`>`<br>[Each](./index.html) instance definition for [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html). |
| [NonEmptyListEachInstance](../../arrow.optics.instances/-non-empty-list-each-instance/index.html) | `interface NonEmptyListEachInstance<A> : `[`Each`](./index.html)`<NonEmptyList<`[`A`](../../arrow.optics.instances/-non-empty-list-each-instance/index.html#A)`>, `[`A`](../../arrow.optics.instances/-non-empty-list-each-instance/index.html#A)`>`<br>[Each](./index.html) instance definition for [NonEmptyList](#). |
| [OptionEachInstance](../../arrow.optics.instances/-option-each-instance/index.html) | `interface OptionEachInstance<A> : `[`Each`](./index.html)`<Option<`[`A`](../../arrow.optics.instances/-option-each-instance/index.html#A)`>, `[`A`](../../arrow.optics.instances/-option-each-instance/index.html#A)`>`<br>[Each](./index.html) instance definition for [Option](#). |
| [SequenceKEachInstance](../../arrow.optics.instances/-sequence-k-each-instance/index.html) | `interface SequenceKEachInstance<A> : `[`Each`](./index.html)`<SequenceK<`[`A`](../../arrow.optics.instances/-sequence-k-each-instance/index.html#A)`>, `[`A`](../../arrow.optics.instances/-sequence-k-each-instance/index.html#A)`>`<br>[Each](./index.html) instance definition for [SequenceK](#). |
| [StringEachInstance](../../arrow.optics.instances/-string-each-instance/index.html) | `interface StringEachInstance : `[`Each`](./index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`>`<br>[Each](./index.html) instance for [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html). |
| [TryEachInstance](../../arrow.optics.instances/-try-each-instance/index.html) | `interface TryEachInstance<A> : `[`Each`](./index.html)`<Try<`[`A`](../../arrow.optics.instances/-try-each-instance/index.html#A)`>, `[`A`](../../arrow.optics.instances/-try-each-instance/index.html#A)`>`<br>[Each](./index.html) instance definition for [Try](#). |




## Type Class Hierarchy

<canvas id="arrow.optics.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.optics.typeclasses-hierarchy-diagram', 'arrow.optics.typeclasses-diagram.nomnol')
</script>

