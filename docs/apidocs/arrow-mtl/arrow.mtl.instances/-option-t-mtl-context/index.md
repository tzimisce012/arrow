---
title: OptionTMtlContext - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances](../index.html) / [OptionTMtlContext](./index.html)

# OptionTMtlContext

`class OptionTMtlContext<F> : OptionTMonadInstance<`[`F`](index.html#F)`>, OptionTMonoidKInstance<`[`F`](index.html#F)`>, `[`OptionTTraverseFilterInstance`](../-option-t-traverse-filter-instance/index.html)`<`[`F`](index.html#F)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `OptionTMtlContext(MF: Monad<`[`F`](index.html#F)`>, TF: `[`TraverseFilter`](../../arrow.mtl.typeclasses/-traverse-filter/index.html)`<`[`F`](index.html#F)`>)` |

### Properties

| [MF](-m-f.html) | `val MF: Monad<`[`F`](index.html#F)`>` |
| [TF](-t-f.html) | `val TF: `[`TraverseFilter`](../../arrow.mtl.typeclasses/-traverse-filter/index.html)`<`[`F`](index.html#F)`>` |

### Functions

| [FF](-f-f.html) | `fun FF(): Monad<`[`F`](index.html#F)`>` |
| [FFF](-f-f-f.html) | `fun FFF(): `[`TraverseFilter`](../../arrow.mtl.typeclasses/-traverse-filter/index.html)`<`[`F`](index.html#F)`>` |
| [MF](-m-f.html) | `fun MF(): Monad<`[`F`](index.html#F)`>` |
| [map](map.html) | `fun <A, B> Kind<OptionTPartialOf<`[`F`](index.html#F)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): OptionT<`[`F`](index.html#F)`, `[`B`](map.html#B)`>` |

### Inherited Functions

| [FFT](../-option-t-traverse-filter-instance/-f-f-t.html) | `open fun FFT(): Traverse<`[`F`](../-option-t-traverse-filter-instance/index.html#F)`>` |
| [traverseFilter](../-option-t-traverse-filter-instance/traverse-filter.html) | `open fun <G, A, B> Kind<OptionTPartialOf<`[`F`](../-option-t-traverse-filter-instance/index.html#F)`>, `[`A`](../-option-t-traverse-filter-instance/traverse-filter.html#A)`>.traverseFilter(AP: Applicative<`[`G`](../-option-t-traverse-filter-instance/traverse-filter.html#G)`>, f: (`[`A`](../-option-t-traverse-filter-instance/traverse-filter.html#A)`) -> Kind<`[`G`](../-option-t-traverse-filter-instance/traverse-filter.html#G)`, Option<`[`B`](../-option-t-traverse-filter-instance/traverse-filter.html#B)`>>): Kind<`[`G`](../-option-t-traverse-filter-instance/traverse-filter.html#G)`, OptionT<`[`F`](../-option-t-traverse-filter-instance/index.html#F)`, `[`B`](../-option-t-traverse-filter-instance/traverse-filter.html#B)`>>` |

