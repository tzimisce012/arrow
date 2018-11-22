---
title: CoproductTraverseInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [CoproductTraverseInstance](./index.html)

# CoproductTraverseInstance

`@extension interface CoproductTraverseInstance<F, G> : Traverse<CoproductPartialOf<`[`F`](index.html#F)`, `[`G`](index.html#G)`>>`

### Functions

| [TF](-t-f.html) | `abstract fun TF(): Traverse<`[`F`](index.html#F)`>` |
| [TG](-t-g.html) | `abstract fun TG(): Traverse<`[`G`](index.html#G)`>` |
| [foldLeft](fold-left.html) | `open fun <A, B> Kind<CoproductPartialOf<`[`F`](index.html#F)`, `[`G`](index.html#G)`>, `[`A`](fold-left.html#A)`>.foldLeft(b: `[`B`](fold-left.html#B)`, f: (`[`B`](fold-left.html#B)`, `[`A`](fold-left.html#A)`) -> `[`B`](fold-left.html#B)`): `[`B`](fold-left.html#B) |
| [foldRight](fold-right.html) | `open fun <A, B> Kind<CoproductPartialOf<`[`F`](index.html#F)`, `[`G`](index.html#G)`>, `[`A`](fold-right.html#A)`>.foldRight(lb: Eval<`[`B`](fold-right.html#B)`>, f: (`[`A`](fold-right.html#A)`, Eval<`[`B`](fold-right.html#B)`>) -> Eval<`[`B`](fold-right.html#B)`>): Eval<`[`B`](fold-right.html#B)`>` |
| [traverse](traverse.html) | `open fun <H, A, B> CoproductOf<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](traverse.html#A)`>.traverse(AP: Applicative<`[`H`](traverse.html#H)`>, f: (`[`A`](traverse.html#A)`) -> Kind<`[`H`](traverse.html#H)`, `[`B`](traverse.html#B)`>): Kind<`[`H`](traverse.html#H)`, Coproduct<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`B`](traverse.html#B)`>>` |

### Inheritors

| [CoproductContext](../-coproduct-context/index.html) | `class CoproductContext<F, G> : `[`CoproductTraverseInstance`](./index.html)`<`[`F`](../-coproduct-context/index.html#F)`, `[`G`](../-coproduct-context/index.html#G)`>` |

