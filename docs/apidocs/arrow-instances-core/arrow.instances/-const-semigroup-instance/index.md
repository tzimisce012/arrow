---
title: ConstSemigroupInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [ConstSemigroupInstance](./index.html)

# ConstSemigroupInstance

`@extension interface ConstSemigroupInstance<A, T> : Semigroup<ConstOf<`[`A`](index.html#A)`, `[`T`](index.html#T)`>>`

### Functions

| [SA](-s-a.html) | `abstract fun SA(): Semigroup<`[`A`](index.html#A)`>` |
| [combine](combine.html) | `open fun ConstOf<`[`A`](index.html#A)`, `[`T`](index.html#T)`>.combine(b: ConstOf<`[`A`](index.html#A)`, `[`T`](index.html#T)`>): Const<`[`A`](index.html#A)`, `[`T`](index.html#T)`>` |

### Inheritors

| [ConstMonoidInstance](../-const-monoid-instance/index.html) | `interface ConstMonoidInstance<A, T> : Monoid<ConstOf<`[`A`](../-const-monoid-instance/index.html#A)`, `[`T`](../-const-monoid-instance/index.html#T)`>>, `[`ConstSemigroupInstance`](./index.html)`<`[`A`](../-const-monoid-instance/index.html#A)`, `[`T`](../-const-monoid-instance/index.html#T)`>` |

