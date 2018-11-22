---
title: SetKContext - arrow-instances-data
---

[arrow-instances-data](../index.html) / [arrow.instances](index.html) / [SetKContext](./-set-k-context.html)

# SetKContext

`object SetKContext : `[`SetKFoldableInstance`](-set-k-foldable-instance/index.html)`, `[`SetKMonoidKInstance`](-set-k-monoid-k-instance/index.html)

### Inherited Functions

| [combineK](-set-k-monoid-k-instance/combine-k.html) | `open fun <A> Kind<ForSetK, `[`A`](-set-k-monoid-k-instance/combine-k.html#A)`>.combineK(y: Kind<ForSetK, `[`A`](-set-k-monoid-k-instance/combine-k.html#A)`>): SetK<`[`A`](-set-k-monoid-k-instance/combine-k.html#A)`>` |
| [empty](-set-k-monoid-k-instance/empty.html) | `open fun <A> empty(): SetK<`[`A`](-set-k-monoid-k-instance/empty.html#A)`>` |
| [foldLeft](-set-k-foldable-instance/fold-left.html) | `open fun <A, B> Kind<ForSetK, `[`A`](-set-k-foldable-instance/fold-left.html#A)`>.foldLeft(b: `[`B`](-set-k-foldable-instance/fold-left.html#B)`, f: (`[`B`](-set-k-foldable-instance/fold-left.html#B)`, `[`A`](-set-k-foldable-instance/fold-left.html#A)`) -> `[`B`](-set-k-foldable-instance/fold-left.html#B)`): `[`B`](-set-k-foldable-instance/fold-left.html#B) |
| [foldRight](-set-k-foldable-instance/fold-right.html) | `open fun <A, B> Kind<ForSetK, `[`A`](-set-k-foldable-instance/fold-right.html#A)`>.foldRight(lb: Eval<`[`B`](-set-k-foldable-instance/fold-right.html#B)`>, f: (`[`A`](-set-k-foldable-instance/fold-right.html#A)`, Eval<`[`B`](-set-k-foldable-instance/fold-right.html#B)`>) -> Eval<`[`B`](-set-k-foldable-instance/fold-right.html#B)`>): Eval<`[`B`](-set-k-foldable-instance/fold-right.html#B)`>` |
| [isEmpty](-set-k-foldable-instance/is-empty.html) | `open fun <A> Kind<ForSetK, `[`A`](-set-k-foldable-instance/is-empty.html#A)`>.isEmpty(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

