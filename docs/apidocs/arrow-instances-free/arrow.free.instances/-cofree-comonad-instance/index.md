---
title: CofreeComonadInstance - arrow-instances-free
---

[arrow-instances-free](../../index.html) / [arrow.free.instances](../index.html) / [CofreeComonadInstance](./index.html)

# CofreeComonadInstance

`@extension interface CofreeComonadInstance<S> : Comonad<CofreePartialOf<`[`S`](index.html#S)`>>, `[`CofreeFunctorInstance`](../-cofree-functor-instance/index.html)`<`[`S`](index.html#S)`>`

### Functions

| [coflatMap](coflat-map.html) | `open fun <A, B> Kind<CofreePartialOf<`[`S`](index.html#S)`>, `[`A`](coflat-map.html#A)`>.coflatMap(f: (Kind<CofreePartialOf<`[`S`](index.html#S)`>, `[`A`](coflat-map.html#A)`>) -> `[`B`](coflat-map.html#B)`): Cofree<`[`S`](index.html#S)`, `[`B`](coflat-map.html#B)`>` |
| [duplicate](duplicate.html) | `open fun <A> Kind<CofreePartialOf<`[`S`](index.html#S)`>, `[`A`](duplicate.html#A)`>.duplicate(): Kind<CofreePartialOf<`[`S`](index.html#S)`>, Cofree<`[`S`](index.html#S)`, `[`A`](duplicate.html#A)`>>` |
| [extract](extract.html) | `open fun <A> CofreeOf<`[`S`](index.html#S)`, `[`A`](extract.html#A)`>.extract(): `[`A`](extract.html#A) |

### Inheritors

| [CofreeContext](../-cofree-context/index.html) | `class CofreeContext<S> : `[`CofreeComonadInstance`](./index.html)`<`[`S`](../-cofree-context/index.html#S)`>` |

