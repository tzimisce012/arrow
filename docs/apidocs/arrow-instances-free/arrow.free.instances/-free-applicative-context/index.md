---
title: FreeApplicativeContext - arrow-instances-free
---

[arrow-instances-free](../../index.html) / [arrow.free.instances](../index.html) / [FreeApplicativeContext](./index.html)

# FreeApplicativeContext

`class FreeApplicativeContext<S> : `[`FreeApplicativeApplicativeInstance`](../-free-applicative-applicative-instance/index.html)`<`[`S`](index.html#S)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `FreeApplicativeContext()` |

### Inherited Functions

| [ap](../-free-applicative-applicative-instance/ap.html) | `open fun <A, B> Kind<FreeApplicativePartialOf<`[`S`](../-free-applicative-applicative-instance/index.html#S)`>, `[`A`](../-free-applicative-applicative-instance/ap.html#A)`>.ap(ff: Kind<FreeApplicativePartialOf<`[`S`](../-free-applicative-applicative-instance/index.html#S)`>, (`[`A`](../-free-applicative-applicative-instance/ap.html#A)`) -> `[`B`](../-free-applicative-applicative-instance/ap.html#B)`>): FreeApplicative<`[`S`](../-free-applicative-applicative-instance/index.html#S)`, `[`B`](../-free-applicative-applicative-instance/ap.html#B)`>` |
| [just](../-free-applicative-applicative-instance/just.html) | `open fun <A> just(a: `[`A`](../-free-applicative-applicative-instance/just.html#A)`): FreeApplicative<`[`S`](../-free-applicative-applicative-instance/index.html#S)`, `[`A`](../-free-applicative-applicative-instance/just.html#A)`>` |
| [map](../-free-applicative-applicative-instance/map.html) | `open fun <A, B> Kind<FreeApplicativePartialOf<`[`S`](../-free-applicative-applicative-instance/index.html#S)`>, `[`A`](../-free-applicative-applicative-instance/map.html#A)`>.map(f: (`[`A`](../-free-applicative-applicative-instance/map.html#A)`) -> `[`B`](../-free-applicative-applicative-instance/map.html#B)`): FreeApplicative<`[`S`](../-free-applicative-applicative-instance/index.html#S)`, `[`B`](../-free-applicative-applicative-instance/map.html#B)`>` |

