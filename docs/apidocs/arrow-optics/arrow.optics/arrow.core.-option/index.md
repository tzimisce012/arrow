---
title: arrow.optics.arrow.core.Option - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics](../index.html) / [arrow.core.Option](./index.html)

### Extensions for arrow.core.Option

| [PSome](-p-some.html) | `fun <A, B> Option.Companion.PSome(): `[`PPrism`](../-p-prism/index.html)`<Option<`[`A`](-p-some.html#A)`>, Option<`[`B`](-p-some.html#B)`>, `[`A`](-p-some.html#A)`, `[`B`](-p-some.html#B)`>`<br>[PPrism](../-p-prism/index.html) to focus into an [arrow.core.Some](#) |
| [none](none.html) | `fun <A> Option.Companion.none(): `[`Prism`](../-prism.html)`<Option<`[`A`](none.html#A)`>, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`<br>[Prism](../-prism.html) to focus into an [arrow.core.None](#) |
| [some](some.html) | `fun <A> Option.Companion.some(): `[`Prism`](../-prism.html)`<Option<`[`A`](some.html#A)`>, `[`A`](some.html#A)`>`<br>[Prism](../-prism.html) to focus into an [arrow.core.Some](#) |
| [toEither](to-either.html) | `fun <A> Option.Companion.toEither(): `[`Iso`](../-iso.html)`<Option<`[`A`](to-either.html#A)`>, Either<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`, `[`A`](to-either.html#A)`>>`<br>[Iso](../-iso.html) that defines the equality between and [arrow.core.Option](#) and [arrow.core.Either](#) |
| [toNullable](to-nullable.html) | `fun <A> Option.Companion.toNullable(): `[`Iso`](../-iso.html)`<Option<`[`A`](to-nullable.html#A)`>, `[`A`](to-nullable.html#A)`?>`<br>[PIso](../-p-iso/index.html) that defines the isomorphic relationship between [Option](#) and the nullable platform type. |
| [toPEither](to-p-either.html) | `fun <A, B> Option.Companion.toPEither(): `[`PIso`](../-p-iso/index.html)`<Option<`[`A`](to-p-either.html#A)`>, Option<`[`B`](to-p-either.html#B)`>, Either<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`, `[`A`](to-p-either.html#A)`>, Either<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`, `[`B`](to-p-either.html#B)`>>`<br>[Iso](../-iso.html) that defines the equality between and [arrow.core.Option](#) and [arrow.core.Either](#) |
| [toPNullable](to-p-nullable.html) | `fun <A, B> Option.Companion.toPNullable(): `[`PIso`](../-p-iso/index.html)`<Option<`[`A`](to-p-nullable.html#A)`>, Option<`[`B`](to-p-nullable.html#B)`>, `[`A`](to-p-nullable.html#A)`?, `[`B`](to-p-nullable.html#B)`?>`<br>[PIso](../-p-iso/index.html) that defines the equality between [Option](#) and the nullable platform type. |

