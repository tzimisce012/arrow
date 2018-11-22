---
title: FreeContext - arrow-instances-free
---

[arrow-instances-free](../../index.html) / [arrow.free.instances](../index.html) / [FreeContext](./index.html)

# FreeContext

`class FreeContext<S> : `[`FreeMonadInstance`](../-free-monad-instance/index.html)`<`[`S`](index.html#S)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `FreeContext()` |

### Inherited Functions

| [ap](../-free-monad-instance/ap.html) | `open fun <A, B> Kind<FreePartialOf<`[`S`](../-free-monad-instance/index.html#S)`>, `[`A`](../-free-monad-instance/ap.html#A)`>.ap(ff: Kind<FreePartialOf<`[`S`](../-free-monad-instance/index.html#S)`>, (`[`A`](../-free-monad-instance/ap.html#A)`) -> `[`B`](../-free-monad-instance/ap.html#B)`>): Free<`[`S`](../-free-monad-instance/index.html#S)`, `[`B`](../-free-monad-instance/ap.html#B)`>` |
| [flatMap](../-free-monad-instance/flat-map.html) | `open fun <A, B> Kind<FreePartialOf<`[`S`](../-free-monad-instance/index.html#S)`>, `[`A`](../-free-monad-instance/flat-map.html#A)`>.flatMap(f: (`[`A`](../-free-monad-instance/flat-map.html#A)`) -> Kind<FreePartialOf<`[`S`](../-free-monad-instance/index.html#S)`>, `[`B`](../-free-monad-instance/flat-map.html#B)`>): Free<`[`S`](../-free-monad-instance/index.html#S)`, `[`B`](../-free-monad-instance/flat-map.html#B)`>` |
| [map](../-free-monad-instance/map.html) | `open fun <A, B> Kind<FreePartialOf<`[`S`](../-free-monad-instance/index.html#S)`>, `[`A`](../-free-monad-instance/map.html#A)`>.map(f: (`[`A`](../-free-monad-instance/map.html#A)`) -> `[`B`](../-free-monad-instance/map.html#B)`): Free<`[`S`](../-free-monad-instance/index.html#S)`, `[`B`](../-free-monad-instance/map.html#B)`>` |
| [tailRecM](../-free-monad-instance/tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](../-free-monad-instance/tail-rec-m.html#A)`, f: (`[`A`](../-free-monad-instance/tail-rec-m.html#A)`) -> FreeOf<`[`S`](../-free-monad-instance/index.html#S)`, Either<`[`A`](../-free-monad-instance/tail-rec-m.html#A)`, `[`B`](../-free-monad-instance/tail-rec-m.html#B)`>>): Free<`[`S`](../-free-monad-instance/index.html#S)`, `[`B`](../-free-monad-instance/tail-rec-m.html#B)`>` |

