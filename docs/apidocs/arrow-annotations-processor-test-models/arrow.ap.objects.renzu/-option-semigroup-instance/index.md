---
title: OptionSemigroupInstance - arrow-annotations-processor-test-models
---

[arrow-annotations-processor-test-models](../../index.html) / [arrow.ap.objects.renzu](../index.html) / [OptionSemigroupInstance](./index.html)

# OptionSemigroupInstance

`@extension interface OptionSemigroupInstance<A> : Semigroup<Option<`[`A`](index.html#A)`>>`

### Functions

| [SG](-s-g.html) | `abstract fun SG(): Semigroup<`[`A`](index.html#A)`>` |
| [combine](combine.html) | `open fun Option<`[`A`](index.html#A)`>.combine(b: Option<`[`A`](index.html#A)`>): Option<`[`A`](index.html#A)`>` |

### Inheritors

| [OptionMonoidInstance](../-option-monoid-instance/index.html) | `interface OptionMonoidInstance<A> : Monoid<Option<`[`A`](../-option-monoid-instance/index.html#A)`>>, `[`OptionSemigroupInstance`](./index.html)`<`[`A`](../-option-monoid-instance/index.html#A)`>` |

