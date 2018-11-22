---
title: ValidatedContext - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [ValidatedContext](./index.html)

# ValidatedContext

`class ValidatedContext<L> : `[`ValidatedApplicativeErrorInstance`](../-validated-applicative-error-instance/index.html)`<`[`L`](index.html#L)`>, `[`ValidatedTraverseInstance`](../-validated-traverse-instance/index.html)`<`[`L`](index.html#L)`>, `[`ValidatedSemigroupKInstance`](../-validated-semigroup-k-instance/index.html)`<`[`L`](index.html#L)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `ValidatedContext(SL: Semigroup<`[`L`](index.html#L)`>)` |

### Properties

| [SL](-s-l.html) | `val SL: Semigroup<`[`L`](index.html#L)`>` |

### Functions

| [SE](-s-e.html) | `fun SE(): Semigroup<`[`L`](index.html#L)`>` |
| [map](map.html) | `fun <A, B> Kind<ValidatedPartialOf<`[`L`](index.html#L)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Validated<`[`L`](index.html#L)`, `[`B`](map.html#B)`>` |

### Inherited Functions

| [combineK](../-validated-semigroup-k-instance/combine-k.html) | `open fun <B> Kind<ValidatedPartialOf<`[`E`](../-validated-semigroup-k-instance/index.html#E)`>, `[`B`](../-validated-semigroup-k-instance/combine-k.html#B)`>.combineK(y: Kind<ValidatedPartialOf<`[`E`](../-validated-semigroup-k-instance/index.html#E)`>, `[`B`](../-validated-semigroup-k-instance/combine-k.html#B)`>): Validated<`[`E`](../-validated-semigroup-k-instance/index.html#E)`, `[`B`](../-validated-semigroup-k-instance/combine-k.html#B)`>` |
| [handleErrorWith](../-validated-applicative-error-instance/handle-error-with.html) | `open fun <A> Kind<ValidatedPartialOf<`[`E`](../-validated-applicative-error-instance/index.html#E)`>, `[`A`](../-validated-applicative-error-instance/handle-error-with.html#A)`>.handleErrorWith(f: (`[`E`](../-validated-applicative-error-instance/index.html#E)`) -> Kind<ValidatedPartialOf<`[`E`](../-validated-applicative-error-instance/index.html#E)`>, `[`A`](../-validated-applicative-error-instance/handle-error-with.html#A)`>): Validated<`[`E`](../-validated-applicative-error-instance/index.html#E)`, `[`A`](../-validated-applicative-error-instance/handle-error-with.html#A)`>` |
| [raiseError](../-validated-applicative-error-instance/raise-error.html) | `open fun <A> raiseError(e: `[`E`](../-validated-applicative-error-instance/index.html#E)`): Validated<`[`E`](../-validated-applicative-error-instance/index.html#E)`, `[`A`](../-validated-applicative-error-instance/raise-error.html#A)`>` |
| [traverse](../-validated-traverse-instance/traverse.html) | `open fun <G, A, B> Kind<ValidatedPartialOf<`[`E`](../-validated-traverse-instance/index.html#E)`>, `[`A`](../-validated-traverse-instance/traverse.html#A)`>.traverse(AP: Applicative<`[`G`](../-validated-traverse-instance/traverse.html#G)`>, f: (`[`A`](../-validated-traverse-instance/traverse.html#A)`) -> Kind<`[`G`](../-validated-traverse-instance/traverse.html#G)`, `[`B`](../-validated-traverse-instance/traverse.html#B)`>): Kind<`[`G`](../-validated-traverse-instance/traverse.html#G)`, Validated<`[`E`](../-validated-traverse-instance/index.html#E)`, `[`B`](../-validated-traverse-instance/traverse.html#B)`>>` |

