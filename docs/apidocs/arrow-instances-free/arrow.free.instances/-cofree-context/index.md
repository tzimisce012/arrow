---
title: CofreeContext - arrow-instances-free
---

[arrow-instances-free](../../index.html) / [arrow.free.instances](../index.html) / [CofreeContext](./index.html)

# CofreeContext

`class CofreeContext<S> : `[`CofreeComonadInstance`](../-cofree-comonad-instance/index.html)`<`[`S`](index.html#S)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `CofreeContext()` |

### Inherited Functions

| [coflatMap](../-cofree-comonad-instance/coflat-map.html) | `open fun <A, B> Kind<CofreePartialOf<`[`S`](../-cofree-comonad-instance/index.html#S)`>, `[`A`](../-cofree-comonad-instance/coflat-map.html#A)`>.coflatMap(f: (Kind<CofreePartialOf<`[`S`](../-cofree-comonad-instance/index.html#S)`>, `[`A`](../-cofree-comonad-instance/coflat-map.html#A)`>) -> `[`B`](../-cofree-comonad-instance/coflat-map.html#B)`): Cofree<`[`S`](../-cofree-comonad-instance/index.html#S)`, `[`B`](../-cofree-comonad-instance/coflat-map.html#B)`>` |
| [duplicate](../-cofree-comonad-instance/duplicate.html) | `open fun <A> Kind<CofreePartialOf<`[`S`](../-cofree-comonad-instance/index.html#S)`>, `[`A`](../-cofree-comonad-instance/duplicate.html#A)`>.duplicate(): Kind<CofreePartialOf<`[`S`](../-cofree-comonad-instance/index.html#S)`>, Cofree<`[`S`](../-cofree-comonad-instance/index.html#S)`, `[`A`](../-cofree-comonad-instance/duplicate.html#A)`>>` |
| [extract](../-cofree-comonad-instance/extract.html) | `open fun <A> CofreeOf<`[`S`](../-cofree-comonad-instance/index.html#S)`, `[`A`](../-cofree-comonad-instance/extract.html#A)`>.extract(): `[`A`](../-cofree-comonad-instance/extract.html#A) |

