---
title: ConstFoldableInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [ConstFoldableInstance](./index.html)

# ConstFoldableInstance

`@extension interface ConstFoldableInstance<A> : Foldable<ConstPartialOf<`[`A`](index.html#A)`>>`

### Functions

| [foldLeft](fold-left.html) | `open fun <T, U> Kind<ConstPartialOf<`[`A`](index.html#A)`>, `[`T`](fold-left.html#T)`>.foldLeft(b: `[`U`](fold-left.html#U)`, f: (`[`U`](fold-left.html#U)`, `[`T`](fold-left.html#T)`) -> `[`U`](fold-left.html#U)`): `[`U`](fold-left.html#U) |
| [foldRight](fold-right.html) | `open fun <T, U> Kind<ConstPartialOf<`[`A`](index.html#A)`>, `[`T`](fold-right.html#T)`>.foldRight(lb: Eval<`[`U`](fold-right.html#U)`>, f: (`[`T`](fold-right.html#T)`, Eval<`[`U`](fold-right.html#U)`>) -> Eval<`[`U`](fold-right.html#U)`>): Eval<`[`U`](fold-right.html#U)`>` |

### Inheritors

| [ConstTraverseInstance](../-const-traverse-instance/index.html) | `interface ConstTraverseInstance<X> : Traverse<ConstPartialOf<`[`X`](../-const-traverse-instance/index.html#X)`>>, `[`ConstFoldableInstance`](./index.html)`<`[`X`](../-const-traverse-instance/index.html#X)`>` |

