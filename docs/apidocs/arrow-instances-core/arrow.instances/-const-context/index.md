---
title: ConstContext - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [ConstContext](./index.html)

# ConstContext

`class ConstContext<A> : `[`ConstApplicativeInstance`](../-const-applicative-instance/index.html)`<`[`A`](index.html#A)`>, `[`ConstTraverseInstance`](../-const-traverse-instance/index.html)`<`[`A`](index.html#A)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `ConstContext(MA: Monoid<`[`A`](index.html#A)`>)` |

### Properties

| [MA](-m-a.html) | `val MA: Monoid<`[`A`](index.html#A)`>` |

### Functions

| [MA](-m-a.html) | `fun MA(): Monoid<`[`A`](index.html#A)`>` |
| [map](map.html) | `fun <T, U> Kind<ConstPartialOf<`[`A`](index.html#A)`>, `[`T`](map.html#T)`>.map(f: (`[`T`](map.html#T)`) -> `[`U`](map.html#U)`): Const<`[`A`](index.html#A)`, `[`U`](map.html#U)`>` |

### Inherited Functions

| [ap](../-const-applicative-instance/ap.html) | `open fun <T, U> Kind<ConstPartialOf<`[`A`](../-const-applicative-instance/index.html#A)`>, `[`T`](../-const-applicative-instance/ap.html#T)`>.ap(ff: Kind<ConstPartialOf<`[`A`](../-const-applicative-instance/index.html#A)`>, (`[`T`](../-const-applicative-instance/ap.html#T)`) -> `[`U`](../-const-applicative-instance/ap.html#U)`>): Const<`[`A`](../-const-applicative-instance/index.html#A)`, `[`U`](../-const-applicative-instance/ap.html#U)`>` |
| [just](../-const-applicative-instance/just.html) | `open fun <T> just(a: `[`T`](../-const-applicative-instance/just.html#T)`): Const<`[`A`](../-const-applicative-instance/index.html#A)`, `[`T`](../-const-applicative-instance/just.html#T)`>` |
| [traverse](../-const-traverse-instance/traverse.html) | `open fun <G, A, B> ConstOf<`[`X`](../-const-traverse-instance/index.html#X)`, `[`A`](../-const-traverse-instance/traverse.html#A)`>.traverse(AP: Applicative<`[`G`](../-const-traverse-instance/traverse.html#G)`>, f: (`[`A`](../-const-traverse-instance/traverse.html#A)`) -> Kind<`[`G`](../-const-traverse-instance/traverse.html#G)`, `[`B`](../-const-traverse-instance/traverse.html#B)`>): Kind<`[`G`](../-const-traverse-instance/traverse.html#G)`, ConstOf<`[`X`](../-const-traverse-instance/index.html#X)`, `[`B`](../-const-traverse-instance/traverse.html#B)`>>` |

