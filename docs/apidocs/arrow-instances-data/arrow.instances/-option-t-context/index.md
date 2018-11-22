---
title: OptionTContext - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [OptionTContext](./index.html)

# OptionTContext

`class OptionTContext<F> : `[`OptionTMonadInstance`](../-option-t-monad-instance/index.html)`<`[`F`](index.html#F)`>, `[`OptionTMonoidKInstance`](../-option-t-monoid-k-instance/index.html)`<`[`F`](index.html#F)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `OptionTContext(MF: Monad<`[`F`](index.html#F)`>)` |

### Properties

| [MF](-m-f.html) | `val MF: Monad<`[`F`](index.html#F)`>` |

### Functions

| [MF](-m-f.html) | `fun MF(): Monad<`[`F`](index.html#F)`>` |
| [map](map.html) | `fun <A, B> Kind<OptionTPartialOf<`[`F`](index.html#F)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): OptionT<`[`F`](index.html#F)`, `[`B`](map.html#B)`>` |

### Inherited Functions

| [ap](../-option-t-monad-instance/ap.html) | `open fun <A, B> Kind<OptionTPartialOf<`[`F`](../-option-t-monad-instance/index.html#F)`>, `[`A`](../-option-t-monad-instance/ap.html#A)`>.ap(ff: Kind<OptionTPartialOf<`[`F`](../-option-t-monad-instance/index.html#F)`>, (`[`A`](../-option-t-monad-instance/ap.html#A)`) -> `[`B`](../-option-t-monad-instance/ap.html#B)`>): OptionT<`[`F`](../-option-t-monad-instance/index.html#F)`, `[`B`](../-option-t-monad-instance/ap.html#B)`>` |
| [empty](../-option-t-monoid-k-instance/empty.html) | `open fun <A> empty(): OptionT<`[`F`](../-option-t-monoid-k-instance/index.html#F)`, `[`A`](../-option-t-monoid-k-instance/empty.html#A)`>` |
| [flatMap](../-option-t-monad-instance/flat-map.html) | `open fun <A, B> Kind<OptionTPartialOf<`[`F`](../-option-t-monad-instance/index.html#F)`>, `[`A`](../-option-t-monad-instance/flat-map.html#A)`>.flatMap(f: (`[`A`](../-option-t-monad-instance/flat-map.html#A)`) -> Kind<OptionTPartialOf<`[`F`](../-option-t-monad-instance/index.html#F)`>, `[`B`](../-option-t-monad-instance/flat-map.html#B)`>): OptionT<`[`F`](../-option-t-monad-instance/index.html#F)`, `[`B`](../-option-t-monad-instance/flat-map.html#B)`>` |
| [tailRecM](../-option-t-monad-instance/tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](../-option-t-monad-instance/tail-rec-m.html#A)`, f: (`[`A`](../-option-t-monad-instance/tail-rec-m.html#A)`) -> OptionTOf<`[`F`](../-option-t-monad-instance/index.html#F)`, Either<`[`A`](../-option-t-monad-instance/tail-rec-m.html#A)`, `[`B`](../-option-t-monad-instance/tail-rec-m.html#B)`>>): OptionT<`[`F`](../-option-t-monad-instance/index.html#F)`, `[`B`](../-option-t-monad-instance/tail-rec-m.html#B)`>` |

