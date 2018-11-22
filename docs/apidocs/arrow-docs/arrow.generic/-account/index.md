---
title: Account - arrow-docs
---

[arrow-docs](../../index.html) / [arrow.generic](../index.html) / [Account](./index.html)

# Account

`data class Account`

### Constructors

| [&lt;init&gt;](-init-.html) | `Account(balance: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, available: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)` |

### Properties

| [available](available.html) | `val available: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [balance](balance.html) | `val balance: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

### Extension Functions

| [combine](../combine.html) | `fun `[`Account`](./index.html)`.combine(other: `[`Account`](./index.html)`): `[`Account`](./index.html) |
| [foldLabeled](../fold-labeled.html) | `fun <B> `[`Account`](./index.html)`.foldLabeled(f: (Tuple2<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>, Tuple2<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>) -> `[`B`](../fold-labeled.html#B)`): `[`B`](../fold-labeled.html#B) |
| [plus](../plus.html) | `operator fun `[`Account`](./index.html)`.plus(other: `[`Account`](./index.html)`): `[`Account`](./index.html) |
| [toHList](../to-h-list.html) | `fun `[`Account`](./index.html)`.toHList(): HList2<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>` |
| [toHListLabeled](../to-h-list-labeled.html) | `fun `[`Account`](./index.html)`.toHListLabeled(): HList2<Tuple2<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>, Tuple2<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>` |
| [tupled](../tupled.html) | `fun `[`Account`](./index.html)`.tupled(): Tuple2<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>` |
| [tupledLabeled](../tupled-labeled.html) | `fun `[`Account`](./index.html)`.tupledLabeled(): Tuple2<Tuple2<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>, Tuple2<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>` |

### Companion Object Extension Functions

| [eq](../eq.html) | `fun Account.Companion.eq(): Eq<`[`Account`](./index.html)`>` |
| [monoid](../monoid.html) | `fun Account.Companion.monoid(): Monoid<`[`Account`](./index.html)`>` |
| [semigroup](../semigroup.html) | `fun Account.Companion.semigroup(): Semigroup<`[`Account`](./index.html)`>` |
| [show](../show.html) | `fun Account.Companion.show(): Show<`[`Account`](./index.html)`>` |

