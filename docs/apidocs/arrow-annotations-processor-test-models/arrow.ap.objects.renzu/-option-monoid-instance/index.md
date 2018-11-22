---
title: OptionMonoidInstance - arrow-annotations-processor-test-models
---

[arrow-annotations-processor-test-models](../../index.html) / [arrow.ap.objects.renzu](../index.html) / [OptionMonoidInstance](./index.html)

# OptionMonoidInstance

`@extension interface OptionMonoidInstance<A> : Monoid<Option<`[`A`](index.html#A)`>>, `[`OptionSemigroupInstance`](../-option-semigroup-instance/index.html)`<`[`A`](index.html#A)`>`

### Functions

| [SG](-s-g.html) | `abstract fun SG(): Semigroup<`[`A`](index.html#A)`>` |
| [empty](empty.html) | `open fun empty(): Option<`[`A`](index.html#A)`>` |

### Extension Functions

| [fix](../../arrow.ap.objects.deriving/arrow.-kind/fix.html) | `fun <A> `[`DerivingOf`](../../arrow.ap.objects.deriving/-deriving-of.html)`<`[`A`](../../arrow.ap.objects.deriving/arrow.-kind/fix.html#A)`>.fix(): `[`Deriving`](../../arrow.ap.objects.deriving/-deriving/index.html)`<`[`A`](../../arrow.ap.objects.deriving/arrow.-kind/fix.html#A)`>` |

