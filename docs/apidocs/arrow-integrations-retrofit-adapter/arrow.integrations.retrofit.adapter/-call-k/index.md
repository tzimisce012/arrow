---
title: CallK - arrow-integrations-retrofit-adapter
---

[arrow-integrations-retrofit-adapter](../../index.html) / [arrow.integrations.retrofit.adapter](../index.html) / [CallK](./index.html)

# CallK

`data class CallK<R>`

### Constructors

| [&lt;init&gt;](-init-.html) | `CallK(call: Call<`[`R`](index.html#R)`>)` |

### Properties

| [call](call.html) | `val call: Call<`[`R`](index.html#R)`>` |

### Functions

| [async](async.html) | `fun <F> async(AC: Async<`[`F`](async.html#F)`>): Kind<`[`F`](async.html#F)`, Response<`[`R`](index.html#R)`>>` |
| [catch](catch.html) | `fun <F> catch(monadError: MonadError<`[`F`](catch.html#F)`, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>): Kind<`[`F`](catch.html#F)`, Response<`[`R`](index.html#R)`>>` |
| [defer](defer.html) | `fun <F> defer(defer: MonadDefer<`[`F`](defer.html#F)`>): Kind<`[`F`](defer.html#F)`, Response<`[`R`](index.html#R)`>>` |

