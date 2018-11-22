---
title: NonEmptyListApplicativeInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [NonEmptyListApplicativeInstance](./index.html)

# NonEmptyListApplicativeInstance

`@extension interface NonEmptyListApplicativeInstance : Applicative<ForNonEmptyList>`

### Functions

| [ap](ap.html) | `open fun <A, B> Kind<ForNonEmptyList, `[`A`](ap.html#A)`>.ap(ff: Kind<ForNonEmptyList, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): NonEmptyList<`[`B`](ap.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): NonEmptyList<`[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<ForNonEmptyList, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): NonEmptyList<`[`B`](map.html#B)`>` |

