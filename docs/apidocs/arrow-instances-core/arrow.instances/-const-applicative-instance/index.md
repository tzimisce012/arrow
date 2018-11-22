---
title: ConstApplicativeInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [ConstApplicativeInstance](./index.html)

# ConstApplicativeInstance

`@extension interface ConstApplicativeInstance<A> : Applicative<ConstPartialOf<`[`A`](index.html#A)`>>`

### Functions

| [MA](-m-a.html) | `abstract fun MA(): Monoid<`[`A`](index.html#A)`>` |
| [ap](ap.html) | `open fun <T, U> Kind<ConstPartialOf<`[`A`](index.html#A)`>, `[`T`](ap.html#T)`>.ap(ff: Kind<ConstPartialOf<`[`A`](index.html#A)`>, (`[`T`](ap.html#T)`) -> `[`U`](ap.html#U)`>): Const<`[`A`](index.html#A)`, `[`U`](ap.html#U)`>` |
| [just](just.html) | `open fun <T> just(a: `[`T`](just.html#T)`): Const<`[`A`](index.html#A)`, `[`T`](just.html#T)`>` |
| [map](map.html) | `open fun <T, U> Kind<ConstPartialOf<`[`A`](index.html#A)`>, `[`T`](map.html#T)`>.map(f: (`[`T`](map.html#T)`) -> `[`U`](map.html#U)`): Const<`[`A`](index.html#A)`, `[`U`](map.html#U)`>` |

### Inheritors

| [ConstContext](../-const-context/index.html) | `class ConstContext<A> : `[`ConstApplicativeInstance`](./index.html)`<`[`A`](../-const-context/index.html#A)`>, `[`ConstTraverseInstance`](../-const-traverse-instance/index.html)`<`[`A`](../-const-context/index.html#A)`>` |

