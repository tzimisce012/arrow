---
title: At - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics.typeclasses](../index.html) / [At](./index.html)

# At

`interface At<S, I, A>`



[At](./index.html) provides a [Lens](../../arrow.optics/-lens.html) for a structure [S](index.html#S) to focus in [A](index.html#A) at a given index [I](index.html#I).

### Parameters

`S` - source of [Lens](../../arrow.optics/-lens.html)

`I` - index that uniquely identifies the focus of the [Lens](../../arrow.optics/-lens.html)

`A` - focus that is supposed to be unique for a given pair [S](index.html#S) and [I](index.html#I).

### Functions

| [at](at.html) | `abstract fun at(i: `[`I`](index.html#I)`): `[`Lens`](../../arrow.optics/-lens.html)`<`[`S`](index.html#S)`, `[`A`](index.html#A)`>`<br>Get a [Lens](../../arrow.optics/-lens.html) for a structure [S](index.html#S) with focus in [A](index.html#A) at index [i](at.html#arrow.optics.typeclasses.At$at(arrow.optics.typeclasses.At.I)/i).`open fun <T> `[`Lens`](../../arrow.optics/-lens.html)`<`[`T`](at.html#T)`, `[`S`](index.html#S)`>.at(i: `[`I`](index.html#I)`): `[`Lens`](../../arrow.optics/-lens.html)`<`[`T`](at.html#T)`, `[`A`](index.html#A)`>`<br>DSL to compose [At](./index.html) with a [Lens](../../arrow.optics/-lens.html) for a structure [S](index.html#S) to focus in on [A](index.html#A) at given index [I](index.html#I).`open fun <T> `[`Iso`](../../arrow.optics/-iso.html)`<`[`T`](at.html#T)`, `[`S`](index.html#S)`>.at(i: `[`I`](index.html#I)`): `[`Lens`](../../arrow.optics/-lens.html)`<`[`T`](at.html#T)`, `[`A`](index.html#A)`>`<br>DSL to compose [At](./index.html) with an [Iso](../../arrow.optics/-iso.html) for a structure [S](index.html#S) to focus in on [A](index.html#A) at given index [I](index.html#I).`open fun <T> `[`Prism`](../../arrow.optics/-prism.html)`<`[`T`](at.html#T)`, `[`S`](index.html#S)`>.at(i: `[`I`](index.html#I)`): `[`Optional`](../../arrow.optics/-optional.html)`<`[`T`](at.html#T)`, `[`A`](index.html#A)`>`<br>DSL to compose [At](./index.html) with a [Prism](../../arrow.optics/-prism.html) for a structure [S](index.html#S) to focus in on [A](index.html#A) at given index [I](index.html#I).`open fun <T> `[`Optional`](../../arrow.optics/-optional.html)`<`[`T`](at.html#T)`, `[`S`](index.html#S)`>.at(i: `[`I`](index.html#I)`): `[`Optional`](../../arrow.optics/-optional.html)`<`[`T`](at.html#T)`, `[`A`](index.html#A)`>`<br>DSL to compose [At](./index.html) with an [Optional](../../arrow.optics/-optional.html) for a structure [S](index.html#S) to focus in on [A](index.html#A) at given index [I](index.html#I).`open fun <T> `[`Getter`](../../arrow.optics/-getter/index.html)`<`[`T`](at.html#T)`, `[`S`](index.html#S)`>.at(i: `[`I`](index.html#I)`): `[`Getter`](../../arrow.optics/-getter/index.html)`<`[`T`](at.html#T)`, `[`A`](index.html#A)`>`<br>DSL to compose [At](./index.html) with a [Getter](../../arrow.optics/-getter/index.html) for a structure [S](index.html#S) to focus in on [A](index.html#A) at given index [I](index.html#I).`open fun <T> `[`Setter`](../../arrow.optics/-setter.html)`<`[`T`](at.html#T)`, `[`S`](index.html#S)`>.at(i: `[`I`](index.html#I)`): `[`Setter`](../../arrow.optics/-setter.html)`<`[`T`](at.html#T)`, `[`A`](index.html#A)`>`<br>DSL to compose [At](./index.html) with a [Setter](../../arrow.optics/-setter.html) for a structure [S](index.html#S) to focus in on [A](index.html#A) at given index [I](index.html#I).`open fun <T> `[`Traversal`](../../arrow.optics/-traversal.html)`<`[`T`](at.html#T)`, `[`S`](index.html#S)`>.at(i: `[`I`](index.html#I)`): `[`Traversal`](../../arrow.optics/-traversal.html)`<`[`T`](at.html#T)`, `[`A`](index.html#A)`>`<br>DSL to compose [At](./index.html) with a [Traversal](../../arrow.optics/-traversal.html) for a structure [S](index.html#S) to focus in on [A](index.html#A) at given index [I](index.html#I).`open fun <T> `[`Fold`](../../arrow.optics/-fold/index.html)`<`[`T`](at.html#T)`, `[`S`](index.html#S)`>.at(i: `[`I`](index.html#I)`): `[`Fold`](../../arrow.optics/-fold/index.html)`<`[`T`](at.html#T)`, `[`A`](index.html#A)`>`<br>DSL to compose [At](./index.html) with a [Fold](../../arrow.optics/-fold/index.html) for a structure [S](index.html#S) to focus in on [A](index.html#A) at given index [I](index.html#I). |

### Companion Object Functions

| [fromIso](from-iso.html) | `fun <S, U, I, A> fromIso(AT: `[`At`](./index.html)`<`[`U`](from-iso.html#U)`, `[`I`](from-iso.html#I)`, `[`A`](from-iso.html#A)`>, iso: `[`Iso`](../../arrow.optics/-iso.html)`<`[`S`](from-iso.html#S)`, `[`U`](from-iso.html#U)`>): `[`At`](./index.html)`<`[`S`](from-iso.html#S)`, `[`I`](from-iso.html#I)`, `[`A`](from-iso.html#A)`>`<br>Lift an instance of [At](./index.html) using an [Iso](../../arrow.optics/-iso.html). |

### Extension Functions

| [remove](../remove.html) | `fun <S, I, A> `[`At`](./index.html)`<`[`S`](../remove.html#S)`, `[`I`](../remove.html#I)`, Option<`[`A`](../remove.html#A)`>>.remove(s: `[`S`](../remove.html#S)`, i: `[`I`](../remove.html#I)`): `[`S`](../remove.html#S)<br>Delete a value associated with a key in a Map-like container`fun <S, I, A> `[`At`](./index.html)`<`[`S`](../remove.html#S)`, `[`I`](../remove.html#I)`, Option<`[`A`](../remove.html#A)`>>.remove(i: `[`I`](../remove.html#I)`): (`[`S`](../remove.html#S)`) -> `[`S`](../remove.html#S)<br>Lift deletion of a value associated with a key in a Map-like container |

### Inheritors

| [MapAtInstance](../../arrow.optics.instances/-map-at-instance/index.html) | `interface MapAtInstance<K, V> : `[`At`](./index.html)`<`[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`K`](../../arrow.optics.instances/-map-at-instance/index.html#K)`, `[`V`](../../arrow.optics.instances/-map-at-instance/index.html#V)`>, `[`K`](../../arrow.optics.instances/-map-at-instance/index.html#K)`, Option<`[`V`](../../arrow.optics.instances/-map-at-instance/index.html#V)`>>`<br>[At](./index.html) instance definition for [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html). |
| [MapKAtInstance](../../arrow.optics.instances/-map-k-at-instance/index.html) | `interface MapKAtInstance<K, V> : `[`At`](./index.html)`<MapK<`[`K`](../../arrow.optics.instances/-map-k-at-instance/index.html#K)`, `[`V`](../../arrow.optics.instances/-map-k-at-instance/index.html#V)`>, `[`K`](../../arrow.optics.instances/-map-k-at-instance/index.html#K)`, Option<`[`V`](../../arrow.optics.instances/-map-k-at-instance/index.html#V)`>>`<br>[At](./index.html) instance definition for [MapK](#). |
| [SetAtInstance](../../arrow.optics.instances/-set-at-instance/index.html) | `interface SetAtInstance<A> : `[`At`](./index.html)`<`[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`A`](../../arrow.optics.instances/-set-at-instance/index.html#A)`>, `[`A`](../../arrow.optics.instances/-set-at-instance/index.html#A)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>[At](./index.html) instance definition for [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html). |
| [SetKAtInstance](../../arrow.optics.instances/-set-k-at-instance/index.html) | `interface SetKAtInstance<A> : `[`At`](./index.html)`<SetK<`[`A`](../../arrow.optics.instances/-set-k-at-instance/index.html#A)`>, `[`A`](../../arrow.optics.instances/-set-k-at-instance/index.html#A)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>[At](./index.html) instance definition for [SetK](#). |




## Type Class Hierarchy

<canvas id="arrow.optics.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.optics.typeclasses-hierarchy-diagram', 'arrow.optics.typeclasses-diagram.nomnol')
</script>

