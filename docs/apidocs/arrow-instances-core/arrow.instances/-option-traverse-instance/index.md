---
title: OptionTraverseInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [OptionTraverseInstance](./index.html)

# OptionTraverseInstance

`@extension interface OptionTraverseInstance : Traverse<ForOption>`

### Functions

| [exists](exists.html) | `open fun <A> Kind<ForOption, `[`A`](exists.html#A)`>.exists(p: (`[`A`](exists.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [foldLeft](fold-left.html) | `open fun <A, B> Kind<ForOption, `[`A`](fold-left.html#A)`>.foldLeft(b: `[`B`](fold-left.html#B)`, f: (`[`B`](fold-left.html#B)`, `[`A`](fold-left.html#A)`) -> `[`B`](fold-left.html#B)`): `[`B`](fold-left.html#B) |
| [foldRight](fold-right.html) | `open fun <A, B> Kind<ForOption, `[`A`](fold-right.html#A)`>.foldRight(lb: Eval<`[`B`](fold-right.html#B)`>, f: (`[`A`](fold-right.html#A)`, Eval<`[`B`](fold-right.html#B)`>) -> Eval<`[`B`](fold-right.html#B)`>): Eval<`[`B`](fold-right.html#B)`>` |
| [forAll](for-all.html) | `open fun <A> Kind<ForOption, `[`A`](for-all.html#A)`>.forAll(p: (`[`A`](for-all.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isEmpty](is-empty.html) | `open fun <A> Kind<ForOption, `[`A`](is-empty.html#A)`>.isEmpty(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [map](map.html) | `open fun <A, B> Kind<ForOption, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Option<`[`B`](map.html#B)`>` |
| [nonEmpty](non-empty.html) | `open fun <A> Kind<ForOption, `[`A`](non-empty.html#A)`>.nonEmpty(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [traverse](traverse.html) | `open fun <G, A, B> Kind<ForOption, `[`A`](traverse.html#A)`>.traverse(AP: Applicative<`[`G`](traverse.html#G)`>, f: (`[`A`](traverse.html#A)`) -> Kind<`[`G`](traverse.html#G)`, `[`B`](traverse.html#B)`>): Kind<`[`G`](traverse.html#G)`, Option<`[`B`](traverse.html#B)`>>` |

### Inheritors

| [OptionContext](../-option-context/index.html) | `object OptionContext : `[`OptionMonadErrorInstance`](../-option-monad-error-instance/index.html)`, `[`OptionTraverseInstance`](./index.html) |

