---
title: OptionTTraverseInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [OptionTTraverseInstance](./index.html)

# OptionTTraverseInstance

`@extension interface OptionTTraverseInstance<F> : Traverse<OptionTPartialOf<`[`F`](index.html#F)`>>, `[`OptionTFoldableInstance`](../-option-t-foldable-instance/index.html)`<`[`F`](index.html#F)`>`

### Functions

| [FFF](-f-f-f.html) | `open fun FFF(): Foldable<`[`F`](index.html#F)`>` |
| [FFT](-f-f-t.html) | `abstract fun FFT(): Traverse<`[`F`](index.html#F)`>` |
| [traverse](traverse.html) | `open fun <G, A, B> Kind<OptionTPartialOf<`[`F`](index.html#F)`>, `[`A`](traverse.html#A)`>.traverse(AP: Applicative<`[`G`](traverse.html#G)`>, f: (`[`A`](traverse.html#A)`) -> Kind<`[`G`](traverse.html#G)`, `[`B`](traverse.html#B)`>): Kind<`[`G`](traverse.html#G)`, OptionT<`[`F`](index.html#F)`, `[`B`](traverse.html#B)`>>` |

