---
title: FreeFunctorInstance - arrow-instances-free
---

[arrow-instances-free](../../index.html) / [arrow.free.instances](../index.html) / [FreeFunctorInstance](./index.html)

# FreeFunctorInstance

`@extension interface FreeFunctorInstance<S> : Functor<FreePartialOf<`[`S`](index.html#S)`>>`

### Functions

| [map](map.html) | `open fun <A, B> Kind<FreePartialOf<`[`S`](index.html#S)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Free<`[`S`](index.html#S)`, `[`B`](map.html#B)`>` |

### Inheritors

| [FreeApplicativeInstance](../-free-applicative-instance/index.html) | `interface FreeApplicativeInstance<S> : Applicative<FreePartialOf<`[`S`](../-free-applicative-instance/index.html#S)`>>, `[`FreeFunctorInstance`](./index.html)`<`[`S`](../-free-applicative-instance/index.html#S)`>` |

