---
title: IOSemigroupInstance - arrow-effects-instances
---

[arrow-effects-instances](../../index.html) / [arrow.effects.instances](../index.html) / [IOSemigroupInstance](./index.html)

# IOSemigroupInstance

`interface IOSemigroupInstance<A> : Semigroup<IO<`[`A`](index.html#A)`>>`

### Functions

| [SG](-s-g.html) | `abstract fun SG(): Semigroup<`[`A`](index.html#A)`>` |
| [combine](combine.html) | `open fun IO<`[`A`](index.html#A)`>.combine(b: IO<`[`A`](index.html#A)`>): IO<`[`A`](index.html#A)`>` |

### Inheritors

| [IOMonoidInstance](../-i-o-monoid-instance/index.html) | `interface IOMonoidInstance<A> : Monoid<IO<`[`A`](../-i-o-monoid-instance/index.html#A)`>>, `[`IOSemigroupInstance`](./index.html)`<`[`A`](../-i-o-monoid-instance/index.html#A)`>` |

