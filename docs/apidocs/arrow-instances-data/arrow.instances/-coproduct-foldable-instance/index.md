---
title: CoproductFoldableInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [CoproductFoldableInstance](./index.html)

# CoproductFoldableInstance

`@extension interface CoproductFoldableInstance<F, G> : Foldable<CoproductPartialOf<`[`F`](index.html#F)`, `[`G`](index.html#G)`>>`

### Functions

| [FF](-f-f.html) | `abstract fun FF(): Foldable<`[`F`](index.html#F)`>` |
| [FG](-f-g.html) | `abstract fun FG(): Foldable<`[`G`](index.html#G)`>` |
| [foldLeft](fold-left.html) | `open fun <A, B> Kind<CoproductPartialOf<`[`F`](index.html#F)`, `[`G`](index.html#G)`>, `[`A`](fold-left.html#A)`>.foldLeft(b: `[`B`](fold-left.html#B)`, f: (`[`B`](fold-left.html#B)`, `[`A`](fold-left.html#A)`) -> `[`B`](fold-left.html#B)`): `[`B`](fold-left.html#B) |
| [foldRight](fold-right.html) | `open fun <A, B> Kind<CoproductPartialOf<`[`F`](index.html#F)`, `[`G`](index.html#G)`>, `[`A`](fold-right.html#A)`>.foldRight(lb: Eval<`[`B`](fold-right.html#B)`>, f: (`[`A`](fold-right.html#A)`, Eval<`[`B`](fold-right.html#B)`>) -> Eval<`[`B`](fold-right.html#B)`>): Eval<`[`B`](fold-right.html#B)`>` |

