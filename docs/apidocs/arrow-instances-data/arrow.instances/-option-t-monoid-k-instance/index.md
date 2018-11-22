---
title: OptionTMonoidKInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [OptionTMonoidKInstance](./index.html)

# OptionTMonoidKInstance

`@extension interface OptionTMonoidKInstance<F> : MonoidK<OptionTPartialOf<`[`F`](index.html#F)`>>, `[`OptionTSemigroupKInstance`](../-option-t-semigroup-k-instance/index.html)`<`[`F`](index.html#F)`>`

### Functions

| [MF](-m-f.html) | `abstract fun MF(): Monad<`[`F`](index.html#F)`>` |
| [empty](empty.html) | `open fun <A> empty(): OptionT<`[`F`](index.html#F)`, `[`A`](empty.html#A)`>` |

### Inheritors

| [OptionTContext](../-option-t-context/index.html) | `class OptionTContext<F> : `[`OptionTMonadInstance`](../-option-t-monad-instance/index.html)`<`[`F`](../-option-t-context/index.html#F)`>, `[`OptionTMonoidKInstance`](./index.html)`<`[`F`](../-option-t-context/index.html#F)`>` |

