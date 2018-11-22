---
title: arrow.recursion - arrow-docs
---

[arrow-docs](../index.html) / [arrow.recursion](./index.html)

## Package arrow.recursion

### Types

| [Cons](-cons/index.html) | `data class Cons : `[`IntList`](-int-list.html) |
| [ConsPattern](-cons-pattern/index.html) | `data class ConsPattern<out A> : `[`IntListPattern`](-int-list-pattern.html)`<`[`A`](-cons-pattern/index.html#A)`>` |
| [ForConsPattern](-for-cons-pattern.html) | `class ForConsPattern` |
| [ForIntListPattern](-for-int-list-pattern.html) | `class ForIntListPattern` |
| [IntList](-int-list.html) | `sealed class IntList` |
| [IntListPattern](-int-list-pattern.html) | `sealed class IntListPattern<out A> : `[`IntListPatternOf`](-int-list-pattern-of.html)`<`[`A`](-int-list-pattern.html#A)`>` |
| [IntListPatternFunctorInstance](-int-list-pattern-functor-instance/index.html) | `interface IntListPatternFunctorInstance : Functor<`[`ForIntListPattern`](-for-int-list-pattern.html)`>` |
| [IntTree](-int-tree.html) | `sealed class IntTree` |
| [Leaf](-leaf/index.html) | `data class Leaf : `[`IntTree`](-int-tree.html) |
| [Nil](-nil.html) | `object Nil : `[`IntList`](-int-list.html) |
| [NilPattern](-nil-pattern.html) | `object NilPattern : `[`IntListPattern`](-int-list-pattern.html)`<`[`Nothing`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)`>` |
| [Node](-node/index.html) | `data class Node : `[`IntTree`](-int-tree.html) |

### Type Aliases

| [ConsPatternOf](-cons-pattern-of.html) | `typealias ConsPatternOf<A> = Kind<`[`ForConsPattern`](-for-cons-pattern.html)`, `[`A`](-cons-pattern-of.html#A)`>` |
| [IntListPatternOf](-int-list-pattern-of.html) | `typealias IntListPatternOf<A> = Kind<`[`ForIntListPattern`](-for-int-list-pattern.html)`, `[`A`](-int-list-pattern-of.html#A)`>` |

### Extensions for External Classes

| [arrow.Kind](arrow.-kind/index.html) |  |

### Functions

| [lift](lift.html) | `fun <A, B> lift(arg0: (`[`A`](lift.html#A)`) -> `[`B`](lift.html#B)`): (Kind<`[`ForIntListPattern`](-for-int-list-pattern.html)`, `[`A`](lift.html#A)`>) -> Kind<`[`ForIntListPattern`](-for-int-list-pattern.html)`, `[`B`](lift.html#B)`>` |

### Companion Object Functions

| [functor](functor.html) | `fun IntListPattern.Companion.functor(): `[`IntListPatternFunctorInstance`](-int-list-pattern-functor-instance/index.html) |

