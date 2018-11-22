---
title: arrow.instances.either.bifunctor.arrow.Kind - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances.either.bifunctor](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [bimap](bimap.html) | `fun <A, B, C, D> Kind<Kind<ForEither, `[`A`](bimap.html#A)`>, `[`B`](bimap.html#B)`>.bimap(arg1: (`[`A`](bimap.html#A)`) -> `[`C`](bimap.html#C)`, arg2: (`[`B`](bimap.html#B)`) -> `[`D`](bimap.html#D)`): Either<`[`C`](bimap.html#C)`, `[`D`](bimap.html#D)`>` |
| [leftWiden](left-widen.html) | `fun <AA, B, A : `[`AA`](left-widen.html#AA)`> Kind<Kind<ForEither, `[`A`](left-widen.html#A)`>, `[`B`](left-widen.html#B)`>.leftWiden(): Either<`[`AA`](left-widen.html#AA)`, `[`B`](left-widen.html#B)`>` |
| [mapLeft](map-left.html) | `fun <A, B, C> Kind<Kind<ForEither, `[`A`](map-left.html#A)`>, `[`B`](map-left.html#B)`>.mapLeft(arg1: (`[`A`](map-left.html#A)`) -> `[`C`](map-left.html#C)`): Either<`[`C`](map-left.html#C)`, `[`B`](map-left.html#B)`>` |

