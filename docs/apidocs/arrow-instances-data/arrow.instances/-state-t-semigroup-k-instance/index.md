---
title: StateTSemigroupKInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [StateTSemigroupKInstance](./index.html)

# StateTSemigroupKInstance

`@extension interface StateTSemigroupKInstance<F, S> : SemigroupK<StateTPartialOf<`[`F`](index.html#F)`, `[`S`](index.html#S)`>>`

### Functions

| [FF](-f-f.html) | `abstract fun FF(): Monad<`[`F`](index.html#F)`>` |
| [SS](-s-s.html) | `abstract fun SS(): SemigroupK<`[`F`](index.html#F)`>` |
| [combineK](combine-k.html) | `open fun <A> Kind<StateTPartialOf<`[`F`](index.html#F)`, `[`S`](index.html#S)`>, `[`A`](combine-k.html#A)`>.combineK(y: Kind<StateTPartialOf<`[`F`](index.html#F)`, `[`S`](index.html#S)`>, `[`A`](combine-k.html#A)`>): StateT<`[`F`](index.html#F)`, `[`S`](index.html#S)`, `[`A`](combine-k.html#A)`>` |

