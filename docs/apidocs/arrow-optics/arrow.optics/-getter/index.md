---
title: Getter - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics](../index.html) / [Getter](./index.html)

# Getter

`@higherkind interface Getter<S, A> : `[`GetterOf`](../-getter-of.html)`<`[`S`](index.html#S)`, `[`A`](index.html#A)`>`

A [Getter](./index.html) is an optic that allows to see into a structure and getting a focus.

A [Getter](./index.html) can be seen as a get function:

* `get: (S) -> A` meaning we can look into an `S` and get an `A`

### Parameters

`S` - the source of a [Getter](./index.html)

`A` - the focus of a [Getter](./index.html)

### Functions

| [asFold](as-fold.html) | `open fun asFold(): `[`Fold`](../-fold/index.html)`<`[`S`](index.html#S)`, `[`A`](index.html#A)`>` |
| [ask](ask.html) | `open fun ask(): Reader<`[`S`](index.html#S)`, `[`A`](index.html#A)`>`<br>Extracts the value viewed through the [get](get.html) function. |
| [asks](asks.html) | `open fun <B> asks(f: (`[`A`](index.html#A)`) -> `[`B`](asks.html#B)`): Reader<`[`S`](index.html#S)`, `[`B`](asks.html#B)`>`<br>Extracts the value viewed through the [get](get.html) and applies [f](asks.html#arrow.optics.Getter$asks(kotlin.Function1((arrow.optics.Getter.A, arrow.optics.Getter.asks.B)))/f) to it. |
| [choice](choice.html) | `open infix fun <C> choice(other: `[`Getter`](./index.html)`<`[`C`](choice.html#C)`, `[`A`](index.html#A)`>): `[`Getter`](./index.html)`<Either<`[`S`](index.html#S)`, `[`C`](choice.html#C)`>, `[`A`](index.html#A)`>`<br>Join two [Getter](./index.html) with the same focus |
| [compose](compose.html) | `open infix fun <C> compose(other: `[`Getter`](./index.html)`<`[`A`](index.html#A)`, `[`C`](compose.html#C)`>): `[`Getter`](./index.html)`<`[`S`](index.html#S)`, `[`C`](compose.html#C)`>`<br>Compose a [Getter](./index.html) with a [Getter](./index.html)`open infix fun <C> compose(other: `[`Lens`](../-lens.html)`<`[`A`](index.html#A)`, `[`C`](compose.html#C)`>): `[`Getter`](./index.html)`<`[`S`](index.html#S)`, `[`C`](compose.html#C)`>`<br>Compose a [Getter](./index.html) with a [Lens](../-lens.html)`open infix fun <C> compose(other: `[`Iso`](../-iso.html)`<`[`A`](index.html#A)`, `[`C`](compose.html#C)`>): `[`Getter`](./index.html)`<`[`S`](index.html#S)`, `[`C`](compose.html#C)`>`<br>Compose a [Getter](./index.html) with a [Iso](../-iso.html)`open infix fun <C> compose(other: `[`Fold`](../-fold/index.html)`<`[`A`](index.html#A)`, `[`C`](compose.html#C)`>): `[`Fold`](../-fold/index.html)`<`[`S`](index.html#S)`, `[`C`](compose.html#C)`>`<br>Compose a [Getter](./index.html) with a [Fold](../-fold/index.html) |
| [exist](exist.html) | `open fun exist(s: `[`S`](index.html#S)`, p: (`[`A`](index.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Check if the focus [A](index.html#A) satisfies the predicate [p](exist.html#arrow.optics.Getter$exist(arrow.optics.Getter.S, kotlin.Function1((arrow.optics.Getter.A, kotlin.Boolean)))/p). |
| [extract](extract.html) | `open fun extract(): State<`[`S`](index.html#S)`, `[`A`](index.html#A)`>`<br>Extracts the focus [A](index.html#A) viewed through the [Getter](./index.html). |
| [extractMap](extract-map.html) | `open fun <B> extractMap(f: (`[`A`](index.html#A)`) -> `[`B`](extract-map.html#B)`): State<`[`S`](index.html#S)`, `[`B`](extract-map.html#B)`>`<br>Extract and map the focus [A](index.html#A) viewed through the [Getter](./index.html) and applies [f](extract-map.html#arrow.optics.Getter$extractMap(kotlin.Function1((arrow.optics.Getter.A, arrow.optics.Getter.extractMap.B)))/f) to it. |
| [find](find.html) | `open fun find(s: `[`S`](index.html#S)`, p: (`[`A`](index.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): Option<`[`A`](index.html#A)`>`<br>Find the focus [A](index.html#A) if it satisfies the predicate [p](find.html#arrow.optics.Getter$find(arrow.optics.Getter.S, kotlin.Function1((arrow.optics.Getter.A, kotlin.Boolean)))/p). |
| [first](first.html) | `open fun <C> first(): `[`Getter`](./index.html)`<Tuple2<`[`S`](index.html#S)`, `[`C`](first.html#C)`>, Tuple2<`[`A`](index.html#A)`, `[`C`](first.html#C)`>>`<br>Create a product of the [Getter](./index.html) and a type [C](first.html#C) |
| [get](get.html) | `abstract fun get(s: `[`S`](index.html#S)`): `[`A`](index.html#A)<br>Get the focus of a [Getter](./index.html) |
| [left](left.html) | `open fun <C> left(): `[`Getter`](./index.html)`<Either<`[`S`](index.html#S)`, `[`C`](left.html#C)`>, Either<`[`A`](index.html#A)`, `[`C`](left.html#C)`>>`<br>Create a sum of the [Getter](./index.html) and type [C](left.html#C) |
| [plus](plus.html) | `open operator fun <C> plus(other: `[`Getter`](./index.html)`<`[`A`](index.html#A)`, `[`C`](plus.html#C)`>): `[`Getter`](./index.html)`<`[`S`](index.html#S)`, `[`C`](plus.html#C)`>`<br>Plus operator overload to compose optionals`open operator fun <C> plus(other: `[`Lens`](../-lens.html)`<`[`A`](index.html#A)`, `[`C`](plus.html#C)`>): `[`Getter`](./index.html)`<`[`S`](index.html#S)`, `[`C`](plus.html#C)`>`<br>`open operator fun <C> plus(other: `[`Iso`](../-iso.html)`<`[`A`](index.html#A)`, `[`C`](plus.html#C)`>): `[`Getter`](./index.html)`<`[`S`](index.html#S)`, `[`C`](plus.html#C)`>`<br>`open operator fun <C> plus(other: `[`Fold`](../-fold/index.html)`<`[`A`](index.html#A)`, `[`C`](plus.html#C)`>): `[`Fold`](../-fold/index.html)`<`[`S`](index.html#S)`, `[`C`](plus.html#C)`>` |
| [right](right.html) | `open fun <C> right(): `[`Getter`](./index.html)`<Either<`[`C`](right.html#C)`, `[`S`](index.html#S)`>, Either<`[`C`](right.html#C)`, `[`A`](index.html#A)`>>`<br>Create a sum of type [C](right.html#C) and the [Getter](./index.html) |
| [second](second.html) | `open fun <C> second(): `[`Getter`](./index.html)`<Tuple2<`[`C`](second.html#C)`, `[`S`](index.html#S)`>, Tuple2<`[`C`](second.html#C)`, `[`A`](index.html#A)`>>`<br>Create a product of type [C](second.html#C) and the [Getter](./index.html) |
| [split](split.html) | `open infix fun <C, D> split(other: `[`Getter`](./index.html)`<`[`C`](split.html#C)`, `[`D`](split.html#D)`>): `[`Getter`](./index.html)`<Tuple2<`[`S`](index.html#S)`, `[`C`](split.html#C)`>, Tuple2<`[`A`](index.html#A)`, `[`D`](split.html#D)`>>`<br>Pair two disjoint [Getter](./index.html) |
| [toReader](to-reader.html) | `open fun toReader(): Reader<`[`S`](index.html#S)`, `[`A`](index.html#A)`>`<br>Transforms a [Getter](./index.html) into a [Reader](#). Alias for [ask](ask.html). |
| [toState](to-state.html) | `open fun toState(): State<`[`S`](index.html#S)`, `[`A`](index.html#A)`>`<br>Transforms a [Getter](./index.html) into a [State](#). Alias for [extract](extract.html). |
| [zip](zip.html) | `open infix fun <C> zip(other: `[`Getter`](./index.html)`<`[`S`](index.html#S)`, `[`C`](zip.html#C)`>): `[`Getter`](./index.html)`<`[`S`](index.html#S)`, Tuple2<`[`A`](index.html#A)`, `[`C`](zip.html#C)`>>`<br>Zip two [Getter](./index.html) optics with the same source [S](index.html#S) |

### Companion Object Functions

| [codiagonal](codiagonal.html) | `fun <S> codiagonal(): `[`Getter`](./index.html)`<Either<`[`S`](codiagonal.html#S)`, `[`S`](codiagonal.html#S)`>, `[`S`](codiagonal.html#S)`>`<br>[Getter](./index.html) that takes either [S](codiagonal.html#S) or [S](codiagonal.html#S) and strips the choice of [S](codiagonal.html#S). |
| [id](id.html) | `fun <S> id(): `[`Getter`](./index.html)`<`[`S`](id.html#S)`, `[`S`](id.html#S)`>` |
| [invoke](invoke.html) | `operator fun <S, A> invoke(get: (`[`S`](invoke.html#S)`) -> `[`A`](invoke.html#A)`): `[`Getter`](./index.html)`<`[`S`](invoke.html#S)`, `[`A`](invoke.html#A)`>`<br>Invoke operator overload to create a [Getter](./index.html) of type `S` with focus `A`. |

### Extension Functions

| [at](../../arrow.optics.dsl/at.html) | `fun <T, S, I, A> `[`Getter`](./index.html)`<`[`T`](../../arrow.optics.dsl/at.html#T)`, `[`S`](../../arrow.optics.dsl/at.html#S)`>.at(AT: `[`At`](../../arrow.optics.typeclasses/-at/index.html)`<`[`S`](../../arrow.optics.dsl/at.html#S)`, `[`I`](../../arrow.optics.dsl/at.html#I)`, `[`A`](../../arrow.optics.dsl/at.html#A)`>, i: `[`I`](../../arrow.optics.dsl/at.html#I)`): `[`Getter`](./index.html)`<`[`T`](../../arrow.optics.dsl/at.html#T)`, `[`A`](../../arrow.optics.dsl/at.html#A)`>`<br>DSL to compose [At](../../arrow.optics.typeclasses/-at/index.html) with a [Getter](./index.html) for a structure [S](../../arrow.optics.dsl/at.html#S) to focus in on [A](../../arrow.optics.dsl/at.html#A) at given index [I](../../arrow.optics.dsl/at.html#I). |

