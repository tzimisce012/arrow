---
title: ResponseCallback - arrow-integrations-retrofit-adapter
---

[arrow-integrations-retrofit-adapter](../../index.html) / [arrow.integrations.retrofit.adapter](../index.html) / [ResponseCallback](./index.html)

# ResponseCallback

`class ResponseCallback<R> : Callback<`[`R`](index.html#R)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `ResponseCallback(proc: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, Response<`[`R`](index.html#R)`>>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)` |

### Functions

| [onFailure](on-failure.html) | `fun onFailure(call: Call<`[`R`](index.html#R)`>, throwable: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onResponse](on-response.html) | `fun onResponse(call: Call<`[`R`](index.html#R)`>, response: Response<`[`R`](index.html#R)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

