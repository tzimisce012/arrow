---
title: CofreeFunctorInstance - arrow-instances-free
---

[arrow-instances-free](../../index.html) / [arrow.free.instances](../index.html) / [CofreeFunctorInstance](./index.html)

# CofreeFunctorInstance

`@extension interface CofreeFunctorInstance<S> : Functor<CofreePartialOf<`[`S`](index.html#S)`>>`

### Functions

| [map](map.html) | `open fun <A, B> Kind<CofreePartialOf<`[`S`](index.html#S)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Cofree<`[`S`](index.html#S)`, `[`B`](map.html#B)`>` |

### Inheritors

| [CofreeComonadInstance](../-cofree-comonad-instance/index.html) | `interface CofreeComonadInstance<S> : Comonad<CofreePartialOf<`[`S`](../-cofree-comonad-instance/index.html#S)`>>, `[`CofreeFunctorInstance`](./index.html)`<`[`S`](../-cofree-comonad-instance/index.html#S)`>` |

