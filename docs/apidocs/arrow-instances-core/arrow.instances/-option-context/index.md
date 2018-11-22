---
title: OptionContext - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [OptionContext](./index.html)

# OptionContext

`object OptionContext : `[`OptionMonadErrorInstance`](../-option-monad-error-instance/index.html)`, `[`OptionTraverseInstance`](../-option-traverse-instance/index.html)

### Functions

| [map](map.html) | `fun <A, B> Kind<ForOption, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Option<`[`B`](map.html#B)`>` |

### Inherited Functions

| [exists](../-option-traverse-instance/exists.html) | `open fun <A> Kind<ForOption, `[`A`](../-option-traverse-instance/exists.html#A)`>.exists(p: (`[`A`](../-option-traverse-instance/exists.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [foldLeft](../-option-traverse-instance/fold-left.html) | `open fun <A, B> Kind<ForOption, `[`A`](../-option-traverse-instance/fold-left.html#A)`>.foldLeft(b: `[`B`](../-option-traverse-instance/fold-left.html#B)`, f: (`[`B`](../-option-traverse-instance/fold-left.html#B)`, `[`A`](../-option-traverse-instance/fold-left.html#A)`) -> `[`B`](../-option-traverse-instance/fold-left.html#B)`): `[`B`](../-option-traverse-instance/fold-left.html#B) |
| [foldRight](../-option-traverse-instance/fold-right.html) | `open fun <A, B> Kind<ForOption, `[`A`](../-option-traverse-instance/fold-right.html#A)`>.foldRight(lb: Eval<`[`B`](../-option-traverse-instance/fold-right.html#B)`>, f: (`[`A`](../-option-traverse-instance/fold-right.html#A)`, Eval<`[`B`](../-option-traverse-instance/fold-right.html#B)`>) -> Eval<`[`B`](../-option-traverse-instance/fold-right.html#B)`>): Eval<`[`B`](../-option-traverse-instance/fold-right.html#B)`>` |
| [forAll](../-option-traverse-instance/for-all.html) | `open fun <A> Kind<ForOption, `[`A`](../-option-traverse-instance/for-all.html#A)`>.forAll(p: (`[`A`](../-option-traverse-instance/for-all.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [handleErrorWith](../-option-monad-error-instance/handle-error-with.html) | `open fun <A> Kind<ForOption, `[`A`](../-option-monad-error-instance/handle-error-with.html#A)`>.handleErrorWith(f: (`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`) -> Kind<ForOption, `[`A`](../-option-monad-error-instance/handle-error-with.html#A)`>): Option<`[`A`](../-option-monad-error-instance/handle-error-with.html#A)`>` |
| [isEmpty](../-option-traverse-instance/is-empty.html) | `open fun <A> Kind<ForOption, `[`A`](../-option-traverse-instance/is-empty.html#A)`>.isEmpty(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [nonEmpty](../-option-traverse-instance/non-empty.html) | `open fun <A> Kind<ForOption, `[`A`](../-option-traverse-instance/non-empty.html#A)`>.nonEmpty(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [raiseError](../-option-monad-error-instance/raise-error.html) | `open fun <A> raiseError(e: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): Kind<ForOption, `[`A`](../-option-monad-error-instance/raise-error.html#A)`>` |
| [traverse](../-option-traverse-instance/traverse.html) | `open fun <G, A, B> Kind<ForOption, `[`A`](../-option-traverse-instance/traverse.html#A)`>.traverse(AP: Applicative<`[`G`](../-option-traverse-instance/traverse.html#G)`>, f: (`[`A`](../-option-traverse-instance/traverse.html#A)`) -> Kind<`[`G`](../-option-traverse-instance/traverse.html#G)`, `[`B`](../-option-traverse-instance/traverse.html#B)`>): Kind<`[`G`](../-option-traverse-instance/traverse.html#G)`, Option<`[`B`](../-option-traverse-instance/traverse.html#B)`>>` |

