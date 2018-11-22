---
title: Car - arrow-docs
---

[arrow-docs](../../index.html) / [arrow.generic](../index.html) / [Car](./index.html)

# Car

`data class Car`

### Constructors

| [&lt;init&gt;](-init-.html) | `Car(speed: `[`Speed`](../-speed/index.html)`)` |

### Properties

| [speed](speed.html) | `val speed: `[`Speed`](../-speed/index.html) |

### Extension Functions

| [combine](../combine.html) | `fun `[`Car`](./index.html)`.combine(other: `[`Car`](./index.html)`): `[`Car`](./index.html) |
| [plus](../plus.html) | `operator fun `[`Car`](./index.html)`.plus(other: `[`Car`](./index.html)`): `[`Car`](./index.html) |
| [toHList](../to-h-list.html) | `fun `[`Car`](./index.html)`.toHList(): HList1<`[`Speed`](../-speed/index.html)`>` |
| [toHListLabeled](../to-h-list-labeled.html) | `fun `[`Car`](./index.html)`.toHListLabeled(): HList1<Tuple2<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Speed`](../-speed/index.html)`>>` |

### Companion Object Extension Functions

| [eq](../eq.html) | `fun Car.Companion.eq(): Eq<`[`Car`](./index.html)`>` |
| [monoid](../monoid.html) | `fun Car.Companion.monoid(): Monoid<`[`Car`](./index.html)`>` |
| [semigroup](../semigroup.html) | `fun Car.Companion.semigroup(): Semigroup<`[`Car`](./index.html)`>` |
| [show](../show.html) | `fun Car.Companion.show(): Show<`[`Car`](./index.html)`>` |

