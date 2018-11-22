---
title: BoxFoldable - arrow-docs
---

[arrow-docs](../../index.html) / [arrow.aql](../index.html) / [BoxFoldable](./index.html)

# BoxFoldable

`@extension interface BoxFoldable : Foldable<`[`ForBox`](../-for-box.html)`>`

### Functions

| [foldLeft](fold-left.html) | `open fun <A, B> `[`BoxOf`](../-box-of.html)`<`[`A`](fold-left.html#A)`>.foldLeft(b: `[`B`](fold-left.html#B)`, f: (`[`B`](fold-left.html#B)`, `[`A`](fold-left.html#A)`) -> `[`B`](fold-left.html#B)`): `[`B`](fold-left.html#B) |
| [foldRight](fold-right.html) | `open fun <A, B> `[`BoxOf`](../-box-of.html)`<`[`A`](fold-right.html#A)`>.foldRight(lb: Eval<`[`B`](fold-right.html#B)`>, f: (`[`A`](fold-right.html#A)`, Eval<`[`B`](fold-right.html#B)`>) -> Eval<`[`B`](fold-right.html#B)`>): Eval<`[`B`](fold-right.html#B)`>` |

