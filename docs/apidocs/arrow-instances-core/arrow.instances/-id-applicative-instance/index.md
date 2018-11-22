---
title: IdApplicativeInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [IdApplicativeInstance](./index.html)

# IdApplicativeInstance

`@extension interface IdApplicativeInstance : Applicative<ForId>`

### Functions

| [ap](ap.html) | `open fun <A, B> Kind<ForId, `[`A`](ap.html#A)`>.ap(ff: Kind<ForId, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): Id<`[`B`](ap.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): Id<`[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<ForId, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Id<`[`B`](map.html#B)`>` |

