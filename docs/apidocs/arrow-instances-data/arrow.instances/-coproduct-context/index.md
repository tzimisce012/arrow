---
title: CoproductContext - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [CoproductContext](./index.html)

# CoproductContext

`class CoproductContext<F, G> : `[`CoproductTraverseInstance`](../-coproduct-traverse-instance/index.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `CoproductContext(TF: Traverse<`[`F`](index.html#F)`>, TG: Traverse<`[`G`](index.html#G)`>)` |

### Properties

| [TF](-t-f.html) | `val TF: Traverse<`[`F`](index.html#F)`>` |
| [TG](-t-g.html) | `val TG: Traverse<`[`G`](index.html#G)`>` |

### Functions

| [TF](-t-f.html) | `fun TF(): Traverse<`[`F`](index.html#F)`>` |
| [TG](-t-g.html) | `fun TG(): Traverse<`[`G`](index.html#G)`>` |

### Inherited Functions

| [foldLeft](../-coproduct-traverse-instance/fold-left.html) | `open fun <A, B> Kind<CoproductPartialOf<`[`F`](../-coproduct-traverse-instance/index.html#F)`, `[`G`](../-coproduct-traverse-instance/index.html#G)`>, `[`A`](../-coproduct-traverse-instance/fold-left.html#A)`>.foldLeft(b: `[`B`](../-coproduct-traverse-instance/fold-left.html#B)`, f: (`[`B`](../-coproduct-traverse-instance/fold-left.html#B)`, `[`A`](../-coproduct-traverse-instance/fold-left.html#A)`) -> `[`B`](../-coproduct-traverse-instance/fold-left.html#B)`): `[`B`](../-coproduct-traverse-instance/fold-left.html#B) |
| [foldRight](../-coproduct-traverse-instance/fold-right.html) | `open fun <A, B> Kind<CoproductPartialOf<`[`F`](../-coproduct-traverse-instance/index.html#F)`, `[`G`](../-coproduct-traverse-instance/index.html#G)`>, `[`A`](../-coproduct-traverse-instance/fold-right.html#A)`>.foldRight(lb: Eval<`[`B`](../-coproduct-traverse-instance/fold-right.html#B)`>, f: (`[`A`](../-coproduct-traverse-instance/fold-right.html#A)`, Eval<`[`B`](../-coproduct-traverse-instance/fold-right.html#B)`>) -> Eval<`[`B`](../-coproduct-traverse-instance/fold-right.html#B)`>): Eval<`[`B`](../-coproduct-traverse-instance/fold-right.html#B)`>` |
| [traverse](../-coproduct-traverse-instance/traverse.html) | `open fun <H, A, B> CoproductOf<`[`F`](../-coproduct-traverse-instance/index.html#F)`, `[`G`](../-coproduct-traverse-instance/index.html#G)`, `[`A`](../-coproduct-traverse-instance/traverse.html#A)`>.traverse(AP: Applicative<`[`H`](../-coproduct-traverse-instance/traverse.html#H)`>, f: (`[`A`](../-coproduct-traverse-instance/traverse.html#A)`) -> Kind<`[`H`](../-coproduct-traverse-instance/traverse.html#H)`, `[`B`](../-coproduct-traverse-instance/traverse.html#B)`>): Kind<`[`H`](../-coproduct-traverse-instance/traverse.html#H)`, Coproduct<`[`F`](../-coproduct-traverse-instance/index.html#F)`, `[`G`](../-coproduct-traverse-instance/index.html#G)`, `[`B`](../-coproduct-traverse-instance/traverse.html#B)`>>` |

