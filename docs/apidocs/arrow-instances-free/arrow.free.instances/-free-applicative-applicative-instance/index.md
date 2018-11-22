---
title: FreeApplicativeApplicativeInstance - arrow-instances-free
---

[arrow-instances-free](../../index.html) / [arrow.free.instances](../index.html) / [FreeApplicativeApplicativeInstance](./index.html)

# FreeApplicativeApplicativeInstance

`@extension interface FreeApplicativeApplicativeInstance<S> : Applicative<FreeApplicativePartialOf<`[`S`](index.html#S)`>>, `[`FreeApplicativeFunctorInstance`](../-free-applicative-functor-instance/index.html)`<`[`S`](index.html#S)`>`

### Functions

| [ap](ap.html) | `open fun <A, B> Kind<FreeApplicativePartialOf<`[`S`](index.html#S)`>, `[`A`](ap.html#A)`>.ap(ff: Kind<FreeApplicativePartialOf<`[`S`](index.html#S)`>, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): FreeApplicative<`[`S`](index.html#S)`, `[`B`](ap.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): FreeApplicative<`[`S`](index.html#S)`, `[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<FreeApplicativePartialOf<`[`S`](index.html#S)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): FreeApplicative<`[`S`](index.html#S)`, `[`B`](map.html#B)`>` |

### Inheritors

| [FreeApplicativeContext](../-free-applicative-context/index.html) | `class FreeApplicativeContext<S> : `[`FreeApplicativeApplicativeInstance`](./index.html)`<`[`S`](../-free-applicative-context/index.html#S)`>` |

