---
title: Deriving - arrow-annotations-processor-test-models
---

[arrow-annotations-processor-test-models](../../index.html) / [arrow.ap.objects.deriving](../index.html) / [Deriving](./index.html)

# Deriving

`@deriving([Functor<*>, Applicative<*>, Monad<*>]) data class Deriving<A> : `[`DerivingOf`](../-deriving-of.html)`<`[`A`](index.html#A)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `Deriving(value: `[`A`](index.html#A)`)` |

### Properties

| [value](value.html) | `val value: `[`A`](index.html#A) |

### Functions

| [map](map.html) | `fun <B> map(f: (`[`A`](index.html#A)`) -> `[`B`](map.html#B)`): `[`Deriving`](./index.html)`<`[`B`](map.html#B)`>` |

### Companion Object Functions

| [just](just.html) | `fun <A> just(a: `[`A`](just.html#A)`): `[`Deriving`](./index.html)`<`[`A`](just.html#A)`>` |
| [tailRecM](tail-rec-m.html) | `fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> `[`DerivingOf`](../-deriving-of.html)`<Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): `[`Deriving`](./index.html)`<`[`B`](tail-rec-m.html#B)`>` |

### Extension Functions

| [fix](../arrow.-kind/fix.html) | `fun <A> `[`DerivingOf`](../-deriving-of.html)`<`[`A`](../arrow.-kind/fix.html#A)`>.fix(): `[`Deriving`](./index.html)`<`[`A`](../arrow.-kind/fix.html#A)`>` |

