---
title: StateTMonadContext - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [StateTMonadContext](./index.html)

# StateTMonadContext

`class StateTMonadContext<S> : `[`StateTMonadInstance`](../-state-t-monad-instance/index.html)`<ForId, `[`S`](index.html#S)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `StateTMonadContext()` |

### Functions

| [MF](-m-f.html) | `fun MF(): Monad<ForId>` |

### Inherited Functions

| [ap](../-state-t-monad-instance/ap.html) | `open fun <A, B> Kind<StateTPartialOf<`[`F`](../-state-t-monad-instance/index.html#F)`, `[`S`](../-state-t-monad-instance/index.html#S)`>, `[`A`](../-state-t-monad-instance/ap.html#A)`>.ap(ff: Kind<StateTPartialOf<`[`F`](../-state-t-monad-instance/index.html#F)`, `[`S`](../-state-t-monad-instance/index.html#S)`>, (`[`A`](../-state-t-monad-instance/ap.html#A)`) -> `[`B`](../-state-t-monad-instance/ap.html#B)`>): StateT<`[`F`](../-state-t-monad-instance/index.html#F)`, `[`S`](../-state-t-monad-instance/index.html#S)`, `[`B`](../-state-t-monad-instance/ap.html#B)`>` |
| [flatMap](../-state-t-monad-instance/flat-map.html) | `open fun <A, B> Kind<StateTPartialOf<`[`F`](../-state-t-monad-instance/index.html#F)`, `[`S`](../-state-t-monad-instance/index.html#S)`>, `[`A`](../-state-t-monad-instance/flat-map.html#A)`>.flatMap(f: (`[`A`](../-state-t-monad-instance/flat-map.html#A)`) -> Kind<StateTPartialOf<`[`F`](../-state-t-monad-instance/index.html#F)`, `[`S`](../-state-t-monad-instance/index.html#S)`>, `[`B`](../-state-t-monad-instance/flat-map.html#B)`>): StateT<`[`F`](../-state-t-monad-instance/index.html#F)`, `[`S`](../-state-t-monad-instance/index.html#S)`, `[`B`](../-state-t-monad-instance/flat-map.html#B)`>` |
| [map](../-state-t-monad-instance/map.html) | `open fun <A, B> Kind<StateTPartialOf<`[`F`](../-state-t-monad-instance/index.html#F)`, `[`S`](../-state-t-monad-instance/index.html#S)`>, `[`A`](../-state-t-monad-instance/map.html#A)`>.map(f: (`[`A`](../-state-t-monad-instance/map.html#A)`) -> `[`B`](../-state-t-monad-instance/map.html#B)`): StateT<`[`F`](../-state-t-monad-instance/index.html#F)`, `[`S`](../-state-t-monad-instance/index.html#S)`, `[`B`](../-state-t-monad-instance/map.html#B)`>` |
| [tailRecM](../-state-t-monad-instance/tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](../-state-t-monad-instance/tail-rec-m.html#A)`, f: (`[`A`](../-state-t-monad-instance/tail-rec-m.html#A)`) -> StateTOf<`[`F`](../-state-t-monad-instance/index.html#F)`, `[`S`](../-state-t-monad-instance/index.html#S)`, Either<`[`A`](../-state-t-monad-instance/tail-rec-m.html#A)`, `[`B`](../-state-t-monad-instance/tail-rec-m.html#B)`>>): StateT<`[`F`](../-state-t-monad-instance/index.html#F)`, `[`S`](../-state-t-monad-instance/index.html#S)`, `[`B`](../-state-t-monad-instance/tail-rec-m.html#B)`>` |

