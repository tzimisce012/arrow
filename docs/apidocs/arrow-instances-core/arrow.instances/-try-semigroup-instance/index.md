---
title: TrySemigroupInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [TrySemigroupInstance](./index.html)

# TrySemigroupInstance

`@extension interface TrySemigroupInstance<A> : Semigroup<Try<`[`A`](index.html#A)`>>`

### Functions

| [SG](-s-g.html) | `abstract fun SG(): Semigroup<`[`A`](index.html#A)`>` |
| [combine](combine.html) | `open fun Try<`[`A`](index.html#A)`>.combine(b: Try<`[`A`](index.html#A)`>): Try<`[`A`](index.html#A)`>` |

### Inheritors

| [TryMonoidInstance](../-try-monoid-instance/index.html) | `interface TryMonoidInstance<A> : Monoid<Try<`[`A`](../-try-monoid-instance/index.html#A)`>>, `[`TrySemigroupInstance`](./index.html)`<`[`A`](../-try-monoid-instance/index.html#A)`>` |

