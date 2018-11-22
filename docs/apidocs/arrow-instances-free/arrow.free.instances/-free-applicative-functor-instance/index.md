---
title: FreeApplicativeFunctorInstance - arrow-instances-free
---

[arrow-instances-free](../../index.html) / [arrow.free.instances](../index.html) / [FreeApplicativeFunctorInstance](./index.html)

# FreeApplicativeFunctorInstance

`@extension interface FreeApplicativeFunctorInstance<S> : Functor<FreeApplicativePartialOf<`[`S`](index.html#S)`>>`

### Functions

| [map](map.html) | `open fun <A, B> Kind<FreeApplicativePartialOf<`[`S`](index.html#S)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): FreeApplicative<`[`S`](index.html#S)`, `[`B`](map.html#B)`>` |

### Inheritors

| [FreeApplicativeApplicativeInstance](../-free-applicative-applicative-instance/index.html) | `interface FreeApplicativeApplicativeInstance<S> : Applicative<FreeApplicativePartialOf<`[`S`](../-free-applicative-applicative-instance/index.html#S)`>>, `[`FreeApplicativeFunctorInstance`](./index.html)`<`[`S`](../-free-applicative-applicative-instance/index.html#S)`>` |

