---
title: FreeMonadInstance - arrow-instances-free
---

[arrow-instances-free](../../index.html) / [arrow.free.instances](../index.html) / [FreeMonadInstance](./index.html)

# FreeMonadInstance

`@extension interface FreeMonadInstance<S> : Monad<FreePartialOf<`[`S`](index.html#S)`>>, `[`FreeApplicativeInstance`](../-free-applicative-instance/index.html)`<`[`S`](index.html#S)`>`

### Functions

| [ap](ap.html) | `open fun <A, B> Kind<FreePartialOf<`[`S`](index.html#S)`>, `[`A`](ap.html#A)`>.ap(ff: Kind<FreePartialOf<`[`S`](index.html#S)`>, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): Free<`[`S`](index.html#S)`, `[`B`](ap.html#B)`>` |
| [flatMap](flat-map.html) | `open fun <A, B> Kind<FreePartialOf<`[`S`](index.html#S)`>, `[`A`](flat-map.html#A)`>.flatMap(f: (`[`A`](flat-map.html#A)`) -> Kind<FreePartialOf<`[`S`](index.html#S)`>, `[`B`](flat-map.html#B)`>): Free<`[`S`](index.html#S)`, `[`B`](flat-map.html#B)`>` |
| [map](map.html) | `open fun <A, B> Kind<FreePartialOf<`[`S`](index.html#S)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Free<`[`S`](index.html#S)`, `[`B`](map.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> FreeOf<`[`S`](index.html#S)`, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): Free<`[`S`](index.html#S)`, `[`B`](tail-rec-m.html#B)`>` |

### Inheritors

| [FreeContext](../-free-context/index.html) | `class FreeContext<S> : `[`FreeMonadInstance`](./index.html)`<`[`S`](../-free-context/index.html#S)`>` |

