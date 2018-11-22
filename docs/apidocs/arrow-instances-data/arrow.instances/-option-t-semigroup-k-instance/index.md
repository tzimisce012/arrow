---
title: OptionTSemigroupKInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [OptionTSemigroupKInstance](./index.html)

# OptionTSemigroupKInstance

`@extension interface OptionTSemigroupKInstance<F> : SemigroupK<OptionTPartialOf<`[`F`](index.html#F)`>>`

### Functions

| [MF](-m-f.html) | `abstract fun MF(): Monad<`[`F`](index.html#F)`>` |
| [combineK](combine-k.html) | `open fun <A> Kind<OptionTPartialOf<`[`F`](index.html#F)`>, `[`A`](combine-k.html#A)`>.combineK(y: Kind<OptionTPartialOf<`[`F`](index.html#F)`>, `[`A`](combine-k.html#A)`>): OptionT<`[`F`](index.html#F)`, `[`A`](combine-k.html#A)`>` |

### Inheritors

| [OptionTMonoidKInstance](../-option-t-monoid-k-instance/index.html) | `interface OptionTMonoidKInstance<F> : MonoidK<OptionTPartialOf<`[`F`](../-option-t-monoid-k-instance/index.html#F)`>>, `[`OptionTSemigroupKInstance`](./index.html)`<`[`F`](../-option-t-monoid-k-instance/index.html#F)`>` |

