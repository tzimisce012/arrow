---
title: IorApplicativeInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [IorApplicativeInstance](./index.html)

# IorApplicativeInstance

`@extension interface IorApplicativeInstance<L> : Applicative<IorPartialOf<`[`L`](index.html#L)`>>, `[`IorFunctorInstance`](../-ior-functor-instance/index.html)`<`[`L`](index.html#L)`>`

### Functions

| [SL](-s-l.html) | `abstract fun SL(): Semigroup<`[`L`](index.html#L)`>` |
| [ap](ap.html) | `open fun <A, B> Kind<IorPartialOf<`[`L`](index.html#L)`>, `[`A`](ap.html#A)`>.ap(ff: Kind<IorPartialOf<`[`L`](index.html#L)`>, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): Ior<`[`L`](index.html#L)`, `[`B`](ap.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): Ior<`[`L`](index.html#L)`, `[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<IorPartialOf<`[`L`](index.html#L)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Ior<`[`L`](index.html#L)`, `[`B`](map.html#B)`>` |

### Inheritors

| [IorMonadInstance](../-ior-monad-instance/index.html) | `interface IorMonadInstance<L> : Monad<IorPartialOf<`[`L`](../-ior-monad-instance/index.html#L)`>>, `[`IorApplicativeInstance`](./index.html)`<`[`L`](../-ior-monad-instance/index.html#L)`>` |

