---
title: ReaderContext - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [ReaderContext](./index.html)

# ReaderContext

`class ReaderContext<D> : `[`KleisliMonadInstance`](../-kleisli-monad-instance/index.html)`<ForId, `[`D`](index.html#D)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `ReaderContext()` |

### Functions

| [MF](-m-f.html) | `fun MF(): Monad<ForId>` |

### Inherited Functions

| [AF](../-kleisli-monad-instance/-a-f.html) | `open fun AF(): Applicative<`[`F`](../-kleisli-monad-instance/index.html#F)`>` |
| [ap](../-kleisli-monad-instance/ap.html) | `open fun <A, B> Kind<KleisliPartialOf<`[`F`](../-kleisli-monad-instance/index.html#F)`, `[`D`](../-kleisli-monad-instance/index.html#D)`>, `[`A`](../-kleisli-monad-instance/ap.html#A)`>.ap(ff: Kind<KleisliPartialOf<`[`F`](../-kleisli-monad-instance/index.html#F)`, `[`D`](../-kleisli-monad-instance/index.html#D)`>, (`[`A`](../-kleisli-monad-instance/ap.html#A)`) -> `[`B`](../-kleisli-monad-instance/ap.html#B)`>): Kleisli<`[`F`](../-kleisli-monad-instance/index.html#F)`, `[`D`](../-kleisli-monad-instance/index.html#D)`, `[`B`](../-kleisli-monad-instance/ap.html#B)`>` |
| [flatMap](../-kleisli-monad-instance/flat-map.html) | `open fun <A, B> Kind<KleisliPartialOf<`[`F`](../-kleisli-monad-instance/index.html#F)`, `[`D`](../-kleisli-monad-instance/index.html#D)`>, `[`A`](../-kleisli-monad-instance/flat-map.html#A)`>.flatMap(f: (`[`A`](../-kleisli-monad-instance/flat-map.html#A)`) -> Kind<KleisliPartialOf<`[`F`](../-kleisli-monad-instance/index.html#F)`, `[`D`](../-kleisli-monad-instance/index.html#D)`>, `[`B`](../-kleisli-monad-instance/flat-map.html#B)`>): Kleisli<`[`F`](../-kleisli-monad-instance/index.html#F)`, `[`D`](../-kleisli-monad-instance/index.html#D)`, `[`B`](../-kleisli-monad-instance/flat-map.html#B)`>` |
| [map](../-kleisli-monad-instance/map.html) | `open fun <A, B> Kind<KleisliPartialOf<`[`F`](../-kleisli-monad-instance/index.html#F)`, `[`D`](../-kleisli-monad-instance/index.html#D)`>, `[`A`](../-kleisli-monad-instance/map.html#A)`>.map(f: (`[`A`](../-kleisli-monad-instance/map.html#A)`) -> `[`B`](../-kleisli-monad-instance/map.html#B)`): Kleisli<`[`F`](../-kleisli-monad-instance/index.html#F)`, `[`D`](../-kleisli-monad-instance/index.html#D)`, `[`B`](../-kleisli-monad-instance/map.html#B)`>` |
| [tailRecM](../-kleisli-monad-instance/tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](../-kleisli-monad-instance/tail-rec-m.html#A)`, f: (`[`A`](../-kleisli-monad-instance/tail-rec-m.html#A)`) -> KleisliOf<`[`F`](../-kleisli-monad-instance/index.html#F)`, `[`D`](../-kleisli-monad-instance/index.html#D)`, Either<`[`A`](../-kleisli-monad-instance/tail-rec-m.html#A)`, `[`B`](../-kleisli-monad-instance/tail-rec-m.html#B)`>>): Kleisli<`[`F`](../-kleisli-monad-instance/index.html#F)`, `[`D`](../-kleisli-monad-instance/index.html#D)`, `[`B`](../-kleisli-monad-instance/tail-rec-m.html#B)`>` |

