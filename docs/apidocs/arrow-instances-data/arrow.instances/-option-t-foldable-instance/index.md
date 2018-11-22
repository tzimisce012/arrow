---
title: OptionTFoldableInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [OptionTFoldableInstance](./index.html)

# OptionTFoldableInstance

`@extension interface OptionTFoldableInstance<F> : Foldable<OptionTPartialOf<`[`F`](index.html#F)`>>`

### Functions

| [FFF](-f-f-f.html) | `abstract fun FFF(): Foldable<`[`F`](index.html#F)`>` |
| [foldLeft](fold-left.html) | `open fun <A, B> Kind<OptionTPartialOf<`[`F`](index.html#F)`>, `[`A`](fold-left.html#A)`>.foldLeft(b: `[`B`](fold-left.html#B)`, f: (`[`B`](fold-left.html#B)`, `[`A`](fold-left.html#A)`) -> `[`B`](fold-left.html#B)`): `[`B`](fold-left.html#B) |
| [foldRight](fold-right.html) | `open fun <A, B> Kind<OptionTPartialOf<`[`F`](index.html#F)`>, `[`A`](fold-right.html#A)`>.foldRight(lb: Eval<`[`B`](fold-right.html#B)`>, f: (`[`A`](fold-right.html#A)`, Eval<`[`B`](fold-right.html#B)`>) -> Eval<`[`B`](fold-right.html#B)`>): Eval<`[`B`](fold-right.html#B)`>` |

### Inheritors

| [OptionTTraverseInstance](../-option-t-traverse-instance/index.html) | `interface OptionTTraverseInstance<F> : Traverse<OptionTPartialOf<`[`F`](../-option-t-traverse-instance/index.html#F)`>>, `[`OptionTFoldableInstance`](./index.html)`<`[`F`](../-option-t-traverse-instance/index.html#F)`>` |

