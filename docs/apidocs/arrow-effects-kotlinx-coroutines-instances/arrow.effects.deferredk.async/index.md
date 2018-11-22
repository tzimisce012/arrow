---
title: arrow.effects.deferredk.async - arrow-effects-kotlinx-coroutines-instances
---

[arrow-effects-kotlinx-coroutines-instances](../index.html) / [arrow.effects.deferredk.async](./index.html)

## Package arrow.effects.deferredk.async

### Extensions for External Classes

| [arrow.Kind](arrow.-kind/index.html) |  |

### Functions

| [defer](defer.html) | `fun <A> defer(arg0: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)`, arg1: () -> Kind<ForDeferredK, `[`A`](defer.html#A)`>): DeferredK<`[`A`](defer.html#A)`>` |
| [invoke](invoke.html) | `fun <A> invoke(ctx: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)`, f: () -> `[`A`](invoke.html#A)`): DeferredK<`[`A`](invoke.html#A)`>` |
| [never](never.html) | `fun <A> never(): DeferredK<`[`A`](never.html#A)`>` |

### Companion Object Functions

| [async](async.html) | `fun DeferredK.Companion.async(): `[`DeferredKAsyncInstance`](../arrow.effects/-deferred-k-async-instance/index.html) |

