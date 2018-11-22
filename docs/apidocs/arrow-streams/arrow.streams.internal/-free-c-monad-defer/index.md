---
title: FreeCMonadDefer - arrow-streams
---

[arrow-streams](../../index.html) / [arrow.streams.internal](../index.html) / [FreeCMonadDefer](./index.html)

# FreeCMonadDefer

`@extension interface FreeCMonadDefer<F> : MonadDefer<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>>, `[`FreeCBracket`](../-free-c-bracket/index.html)`<`[`F`](index.html#F)`>`

### Functions

| [defer](defer.html) | `open fun <A> defer(fa: () -> Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`A`](defer.html#A)`>): Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`A`](defer.html#A)`>` |

