---
title: arrow.generic - arrow-docs
---

[arrow-docs](../index.html) / [arrow.generic](./index.html)

## Package arrow.generic

### Types

| [Account](-account/index.html) | `data class Account` |
| [AccountEqInstance](-account-eq-instance/index.html) | `interface AccountEqInstance : Eq<`[`Account`](-account/index.html)`>` |
| [AccountMonoidInstance](-account-monoid-instance/index.html) | `interface AccountMonoidInstance : Monoid<`[`Account`](-account/index.html)`>, `[`AccountSemigroupInstance`](-account-semigroup-instance/index.html) |
| [AccountSemigroupInstance](-account-semigroup-instance/index.html) | `interface AccountSemigroupInstance : Semigroup<`[`Account`](-account/index.html)`>` |
| [AccountShowInstance](-account-show-instance/index.html) | `interface AccountShowInstance : Show<`[`Account`](-account/index.html)`>` |
| [Car](-car/index.html) | `data class Car` |
| [CarAlreadyRegistered](-car-already-registered.html) | `object CarAlreadyRegistered : `[`RegistrationError`](-registration-error.html) |
| [CarEqInstance](-car-eq-instance/index.html) | `interface CarEqInstance : Eq<`[`Car`](-car/index.html)`>` |
| [CarMonoidInstance](-car-monoid-instance/index.html) | `interface CarMonoidInstance : Monoid<`[`Car`](-car/index.html)`>, `[`CarSemigroupInstance`](-car-semigroup-instance/index.html) |
| [CarSemigroupInstance](-car-semigroup-instance/index.html) | `interface CarSemigroupInstance : Semigroup<`[`Car`](-car/index.html)`>` |
| [CarShowInstance](-car-show-instance/index.html) | `interface CarShowInstance : Show<`[`Car`](-car/index.html)`>` |
| [CommonServerError](-common-server-error.html) | `sealed class CommonServerError` |
| [Database](-database/index.html) | `interface Database` |
| [Dealership](-dealership/index.html) | `data class Dealership` |
| [OverRequestLimit](-over-request-limit.html) | `object OverRequestLimit : `[`CommonServerError`](-common-server-error.html) |
| [Registration](-registration/index.html) | `data class Registration` |
| [RegistrationError](-registration-error.html) | `sealed class RegistrationError` |
| [Salesperson](-salesperson/index.html) | `data class Salesperson` |
| [ServerError](-server-error.html) | `object ServerError : `[`CommonServerError`](-common-server-error.html) |
| [Speed](-speed/index.html) | `data class Speed` |
| [SpeedEqInstance](-speed-eq-instance/index.html) | `interface SpeedEqInstance : Eq<`[`Speed`](-speed/index.html)`>` |
| [SpeedMonoidInstance](-speed-monoid-instance/index.html) | `interface SpeedMonoidInstance : Monoid<`[`Speed`](-speed/index.html)`>, `[`SpeedSemigroupInstance`](-speed-semigroup-instance/index.html) |
| [SpeedSemigroupInstance](-speed-semigroup-instance/index.html) | `interface SpeedSemigroupInstance : Semigroup<`[`Speed`](-speed/index.html)`>` |
| [SpeedShowInstance](-speed-show-instance/index.html) | `interface SpeedShowInstance : Show<`[`Speed`](-speed/index.html)`>` |
| [StolenCar](-stolen-car.html) | `object StolenCar : `[`RegistrationError`](-registration-error.html) |
| [SuccessfullyRegistered](-successfully-registered/index.html) | `data class SuccessfullyRegistered` |
| [UserUnauthorized](-user-unauthorized.html) | `object UserUnauthorized : `[`CommonServerError`](-common-server-error.html) |

### Extensions for External Classes

| [arrow.core.Tuple2](arrow.core.-tuple2/index.html) |  |
| [arrow.typeclasses.Applicative](arrow.typeclasses.-applicative/index.html) |  |
| [kotlin.collections.List](kotlin.collections.-list/index.html) |  |

### Functions

| [combine](combine.html) | `fun `[`Account`](-account/index.html)`.combine(other: `[`Account`](-account/index.html)`): `[`Account`](-account/index.html)<br>`fun `[`Car`](-car/index.html)`.combine(other: `[`Car`](-car/index.html)`): `[`Car`](-car/index.html)<br>`fun `[`Speed`](-speed/index.html)`.combine(other: `[`Speed`](-speed/index.html)`): `[`Speed`](-speed/index.html) |
| [emptyAccount](empty-account.html) | `fun emptyAccount(): `[`Account`](-account/index.html) |
| [emptyCar](empty-car.html) | `fun emptyCar(): `[`Car`](-car/index.html) |
| [emptySpeed](empty-speed.html) | `fun emptySpeed(): `[`Speed`](-speed/index.html) |
| [foldLabeled](fold-labeled.html) | `fun <B> `[`Account`](-account/index.html)`.foldLabeled(f: (Tuple2<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>, Tuple2<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>) -> `[`B`](fold-labeled.html#B)`): `[`B`](fold-labeled.html#B) |
| [plus](plus.html) | `operator fun `[`Account`](-account/index.html)`.plus(other: `[`Account`](-account/index.html)`): `[`Account`](-account/index.html)<br>`operator fun `[`Car`](-car/index.html)`.plus(other: `[`Car`](-car/index.html)`): `[`Car`](-car/index.html)<br>`operator fun `[`Speed`](-speed/index.html)`.plus(other: `[`Speed`](-speed/index.html)`): `[`Speed`](-speed/index.html) |
| [toAccount](to-account.html) | `fun HList2<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>.toAccount(): `[`Account`](-account/index.html) |
| [toCar](to-car.html) | `fun HList1<`[`Speed`](-speed/index.html)`>.toCar(): `[`Car`](-car/index.html) |
| [toHList](to-h-list.html) | `fun `[`Account`](-account/index.html)`.toHList(): HList2<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>`<br>`fun `[`Car`](-car/index.html)`.toHList(): HList1<`[`Speed`](-speed/index.html)`>`<br>`fun `[`Speed`](-speed/index.html)`.toHList(): HList1<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>` |
| [toHListLabeled](to-h-list-labeled.html) | `fun `[`Account`](-account/index.html)`.toHListLabeled(): HList2<Tuple2<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>, Tuple2<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>`<br>`fun `[`Car`](-car/index.html)`.toHListLabeled(): HList1<Tuple2<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Speed`](-speed/index.html)`>>`<br>`fun `[`Speed`](-speed/index.html)`.toHListLabeled(): HList1<Tuple2<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>` |
| [toSpeed](to-speed.html) | `fun HList1<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>.toSpeed(): `[`Speed`](-speed/index.html) |
| [tupled](tupled.html) | `fun `[`Account`](-account/index.html)`.tupled(): Tuple2<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>` |
| [tupledLabeled](tupled-labeled.html) | `fun `[`Account`](-account/index.html)`.tupledLabeled(): Tuple2<Tuple2<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>, Tuple2<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>` |

### Companion Object Functions

| [eq](eq.html) | `fun Account.Companion.eq(): Eq<`[`Account`](-account/index.html)`>`<br>`fun Car.Companion.eq(): Eq<`[`Car`](-car/index.html)`>`<br>`fun Speed.Companion.eq(): Eq<`[`Speed`](-speed/index.html)`>` |
| [monoid](monoid.html) | `fun Account.Companion.monoid(): Monoid<`[`Account`](-account/index.html)`>`<br>`fun Car.Companion.monoid(): Monoid<`[`Car`](-car/index.html)`>`<br>`fun Speed.Companion.monoid(): Monoid<`[`Speed`](-speed/index.html)`>` |
| [semigroup](semigroup.html) | `fun Account.Companion.semigroup(): Semigroup<`[`Account`](-account/index.html)`>`<br>`fun Car.Companion.semigroup(): Semigroup<`[`Car`](-car/index.html)`>`<br>`fun Speed.Companion.semigroup(): Semigroup<`[`Speed`](-speed/index.html)`>` |
| [show](show.html) | `fun Account.Companion.show(): Show<`[`Account`](-account/index.html)`>`<br>`fun Car.Companion.show(): Show<`[`Car`](-car/index.html)`>`<br>`fun Speed.Companion.show(): Show<`[`Speed`](-speed/index.html)`>` |

