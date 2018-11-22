---
title: ConstMtlContext - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances](../index.html) / [ConstMtlContext](./index.html)

# ConstMtlContext

`class ConstMtlContext<A> : ConstApplicativeInstance<`[`A`](index.html#A)`>, `[`ConstTraverseFilterInstance`](../-const-traverse-filter-instance/index.html)`<`[`A`](index.html#A)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `ConstMtlContext(MA: Monoid<`[`A`](index.html#A)`>)` |

### Properties

| [MA](-m-a.html) | `val MA: Monoid<`[`A`](index.html#A)`>` |

### Functions

| [MA](-m-a.html) | `fun MA(): Monoid<`[`A`](index.html#A)`>` |
| [map](map.html) | `fun <T, U> Kind<ConstPartialOf<`[`A`](index.html#A)`>, `[`T`](map.html#T)`>.map(f: (`[`T`](map.html#T)`) -> `[`U`](map.html#U)`): Const<`[`A`](index.html#A)`, `[`U`](map.html#U)`>` |

### Inherited Functions

| [traverseFilter](../-const-traverse-filter-instance/traverse-filter.html) | `open fun <G, A, B> Kind<ConstPartialOf<`[`X`](../-const-traverse-filter-instance/index.html#X)`>, `[`A`](../-const-traverse-filter-instance/traverse-filter.html#A)`>.traverseFilter(AP: Applicative<`[`G`](../-const-traverse-filter-instance/traverse-filter.html#G)`>, f: (`[`A`](../-const-traverse-filter-instance/traverse-filter.html#A)`) -> Kind<`[`G`](../-const-traverse-filter-instance/traverse-filter.html#G)`, Option<`[`B`](../-const-traverse-filter-instance/traverse-filter.html#B)`>>): Kind<`[`G`](../-const-traverse-filter-instance/traverse-filter.html#G)`, ConstOf<`[`X`](../-const-traverse-filter-instance/index.html#X)`, `[`B`](../-const-traverse-filter-instance/traverse-filter.html#B)`>>` |

