---
title: SetKFoldableInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [SetKFoldableInstance](./index.html)

# SetKFoldableInstance

`@extension interface SetKFoldableInstance : Foldable<ForSetK>`

### Functions

| [foldLeft](fold-left.html) | `open fun <A, B> Kind<ForSetK, `[`A`](fold-left.html#A)`>.foldLeft(b: `[`B`](fold-left.html#B)`, f: (`[`B`](fold-left.html#B)`, `[`A`](fold-left.html#A)`) -> `[`B`](fold-left.html#B)`): `[`B`](fold-left.html#B) |
| [foldRight](fold-right.html) | `open fun <A, B> Kind<ForSetK, `[`A`](fold-right.html#A)`>.foldRight(lb: Eval<`[`B`](fold-right.html#B)`>, f: (`[`A`](fold-right.html#A)`, Eval<`[`B`](fold-right.html#B)`>) -> Eval<`[`B`](fold-right.html#B)`>): Eval<`[`B`](fold-right.html#B)`>` |
| [isEmpty](is-empty.html) | `open fun <A> Kind<ForSetK, `[`A`](is-empty.html#A)`>.isEmpty(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

### Inheritors

| [SetKContext](../-set-k-context.html) | `object SetKContext : `[`SetKFoldableInstance`](./index.html)`, `[`SetKMonoidKInstance`](../-set-k-monoid-k-instance/index.html) |

