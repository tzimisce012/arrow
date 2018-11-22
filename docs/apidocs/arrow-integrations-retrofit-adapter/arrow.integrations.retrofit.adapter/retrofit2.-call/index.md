---
title: arrow.integrations.retrofit.adapter.retrofit2.Call - arrow-integrations-retrofit-adapter
---

[arrow-integrations-retrofit-adapter](../../index.html) / [arrow.integrations.retrofit.adapter](../index.html) / [retrofit2.Call](./index.html)

### Extensions for retrofit2.Call

| [runAsync](run-async.html) | `fun <F, A> Call<`[`A`](run-async.html#A)`>.runAsync(AC: Async<`[`F`](run-async.html#F)`>): Kind<`[`F`](run-async.html#F)`, Response<`[`A`](run-async.html#A)`>>` |
| [runSyncCatch](run-sync-catch.html) | `fun <F, A> Call<`[`A`](run-sync-catch.html#A)`>.runSyncCatch(monadError: MonadError<`[`F`](run-sync-catch.html#F)`, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>): Kind<`[`F`](run-sync-catch.html#F)`, Response<`[`A`](run-sync-catch.html#A)`>>` |
| [runSyncDeferred](run-sync-deferred.html) | `fun <F, A> Call<`[`A`](run-sync-deferred.html#A)`>.runSyncDeferred(defer: MonadDefer<`[`F`](run-sync-deferred.html#F)`>): Kind<`[`F`](run-sync-deferred.html#F)`, Response<`[`A`](run-sync-deferred.html#A)`>>` |

