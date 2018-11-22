---
title: WriterTContext - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [WriterTContext](./index.html)

# WriterTContext

`class WriterTContext<F, W> : `[`WriterTMonadInstance`](../-writer-t-monad-instance/index.html)`<`[`F`](index.html#F)`, `[`W`](index.html#W)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `WriterTContext(MF: Monad<`[`F`](index.html#F)`>, MW: Monoid<`[`W`](index.html#W)`>)` |

### Properties

| [MF](-m-f.html) | `val MF: Monad<`[`F`](index.html#F)`>` |
| [MW](-m-w.html) | `val MW: Monoid<`[`W`](index.html#W)`>` |

### Functions

| [FF](-f-f.html) | `fun FF(): Functor<`[`F`](index.html#F)`>` |
| [MF](-m-f.html) | `fun MF(): Monad<`[`F`](index.html#F)`>` |
| [MM](-m-m.html) | `fun MM(): Monoid<`[`W`](index.html#W)`>` |

### Inherited Functions

| [ap](../-writer-t-monad-instance/ap.html) | `open fun <A, B> Kind<WriterTPartialOf<`[`F`](../-writer-t-monad-instance/index.html#F)`, `[`W`](../-writer-t-monad-instance/index.html#W)`>, `[`A`](../-writer-t-monad-instance/ap.html#A)`>.ap(ff: Kind<WriterTPartialOf<`[`F`](../-writer-t-monad-instance/index.html#F)`, `[`W`](../-writer-t-monad-instance/index.html#W)`>, (`[`A`](../-writer-t-monad-instance/ap.html#A)`) -> `[`B`](../-writer-t-monad-instance/ap.html#B)`>): WriterT<`[`F`](../-writer-t-monad-instance/index.html#F)`, `[`W`](../-writer-t-monad-instance/index.html#W)`, `[`B`](../-writer-t-monad-instance/ap.html#B)`>` |
| [flatMap](../-writer-t-monad-instance/flat-map.html) | `open fun <A, B> Kind<WriterTPartialOf<`[`F`](../-writer-t-monad-instance/index.html#F)`, `[`W`](../-writer-t-monad-instance/index.html#W)`>, `[`A`](../-writer-t-monad-instance/flat-map.html#A)`>.flatMap(f: (`[`A`](../-writer-t-monad-instance/flat-map.html#A)`) -> Kind<WriterTPartialOf<`[`F`](../-writer-t-monad-instance/index.html#F)`, `[`W`](../-writer-t-monad-instance/index.html#W)`>, `[`B`](../-writer-t-monad-instance/flat-map.html#B)`>): WriterT<`[`F`](../-writer-t-monad-instance/index.html#F)`, `[`W`](../-writer-t-monad-instance/index.html#W)`, `[`B`](../-writer-t-monad-instance/flat-map.html#B)`>` |
| [map](../-writer-t-monad-instance/map.html) | `open fun <A, B> Kind<WriterTPartialOf<`[`F`](../-writer-t-monad-instance/index.html#F)`, `[`W`](../-writer-t-monad-instance/index.html#W)`>, `[`A`](../-writer-t-monad-instance/map.html#A)`>.map(f: (`[`A`](../-writer-t-monad-instance/map.html#A)`) -> `[`B`](../-writer-t-monad-instance/map.html#B)`): WriterT<`[`F`](../-writer-t-monad-instance/index.html#F)`, `[`W`](../-writer-t-monad-instance/index.html#W)`, `[`B`](../-writer-t-monad-instance/map.html#B)`>` |
| [tailRecM](../-writer-t-monad-instance/tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](../-writer-t-monad-instance/tail-rec-m.html#A)`, f: (`[`A`](../-writer-t-monad-instance/tail-rec-m.html#A)`) -> Kind<WriterTPartialOf<`[`F`](../-writer-t-monad-instance/index.html#F)`, `[`W`](../-writer-t-monad-instance/index.html#W)`>, Either<`[`A`](../-writer-t-monad-instance/tail-rec-m.html#A)`, `[`B`](../-writer-t-monad-instance/tail-rec-m.html#B)`>>): WriterT<`[`F`](../-writer-t-monad-instance/index.html#F)`, `[`W`](../-writer-t-monad-instance/index.html#W)`, `[`B`](../-writer-t-monad-instance/tail-rec-m.html#B)`>` |

