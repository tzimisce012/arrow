---
title: ConstTraverseInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [ConstTraverseInstance](./index.html)

# ConstTraverseInstance

`@extension interface ConstTraverseInstance<X> : Traverse<ConstPartialOf<`[`X`](index.html#X)`>>, `[`ConstFoldableInstance`](../-const-foldable-instance/index.html)`<`[`X`](index.html#X)`>`

### Functions

| [map](map.html) | `open fun <T, U> Kind<ConstPartialOf<`[`X`](index.html#X)`>, `[`T`](map.html#T)`>.map(f: (`[`T`](map.html#T)`) -> `[`U`](map.html#U)`): Const<`[`X`](index.html#X)`, `[`U`](map.html#U)`>` |
| [traverse](traverse.html) | `open fun <G, A, B> ConstOf<`[`X`](index.html#X)`, `[`A`](traverse.html#A)`>.traverse(AP: Applicative<`[`G`](traverse.html#G)`>, f: (`[`A`](traverse.html#A)`) -> Kind<`[`G`](traverse.html#G)`, `[`B`](traverse.html#B)`>): Kind<`[`G`](traverse.html#G)`, ConstOf<`[`X`](index.html#X)`, `[`B`](traverse.html#B)`>>` |

### Inheritors

| [ConstContext](../-const-context/index.html) | `class ConstContext<A> : `[`ConstApplicativeInstance`](../-const-applicative-instance/index.html)`<`[`A`](../-const-context/index.html#A)`>, `[`ConstTraverseInstance`](./index.html)`<`[`A`](../-const-context/index.html#A)`>` |

