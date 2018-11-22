---
title: IorFunctorInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [IorFunctorInstance](./index.html)

# IorFunctorInstance

`@extension interface IorFunctorInstance<L> : Functor<IorPartialOf<`[`L`](index.html#L)`>>`

### Functions

| [map](map.html) | `open fun <A, B> Kind<IorPartialOf<`[`L`](index.html#L)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Ior<`[`L`](index.html#L)`, `[`B`](map.html#B)`>` |

### Inheritors

| [IorApplicativeInstance](../-ior-applicative-instance/index.html) | `interface IorApplicativeInstance<L> : Applicative<IorPartialOf<`[`L`](../-ior-applicative-instance/index.html#L)`>>, `[`IorFunctorInstance`](./index.html)`<`[`L`](../-ior-applicative-instance/index.html#L)`>` |

