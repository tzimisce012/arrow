---
title: FreeApplicativeInstance - arrow-instances-free
---

[arrow-instances-free](../../index.html) / [arrow.free.instances](../index.html) / [FreeApplicativeInstance](./index.html)

# FreeApplicativeInstance

`@extension interface FreeApplicativeInstance<S> : Applicative<FreePartialOf<`[`S`](index.html#S)`>>, `[`FreeFunctorInstance`](../-free-functor-instance/index.html)`<`[`S`](index.html#S)`>`

### Functions

| [ap](ap.html) | `open fun <A, B> Kind<FreePartialOf<`[`S`](index.html#S)`>, `[`A`](ap.html#A)`>.ap(ff: Kind<FreePartialOf<`[`S`](index.html#S)`>, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): Free<`[`S`](index.html#S)`, `[`B`](ap.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): Free<`[`S`](index.html#S)`, `[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<FreePartialOf<`[`S`](index.html#S)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Free<`[`S`](index.html#S)`, `[`B`](map.html#B)`>` |

### Inheritors

| [FreeMonadInstance](../-free-monad-instance/index.html) | `interface FreeMonadInstance<S> : Monad<FreePartialOf<`[`S`](../-free-monad-instance/index.html#S)`>>, `[`FreeApplicativeInstance`](./index.html)`<`[`S`](../-free-monad-instance/index.html#S)`>` |

