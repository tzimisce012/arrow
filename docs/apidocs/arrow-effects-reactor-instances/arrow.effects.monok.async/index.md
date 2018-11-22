---
title: arrow.effects.monok.async - arrow-effects-reactor-instances
---

[arrow-effects-reactor-instances](../index.html) / [arrow.effects.monok.async](./index.html)

## Package arrow.effects.monok.async

### Extensions for External Classes

| [arrow.Kind](arrow.-kind/index.html) |  |

### Functions

| [defer](defer.html) | `fun <A> defer(arg0: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)`, arg1: () -> Kind<ForMonoK, `[`A`](defer.html#A)`>): MonoK<`[`A`](defer.html#A)`>` |
| [invoke](invoke.html) | `fun <A> invoke(arg0: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)`, arg1: () -> `[`A`](invoke.html#A)`): MonoK<`[`A`](invoke.html#A)`>` |
| [never](never.html) | `fun <A> never(): MonoK<`[`A`](never.html#A)`>` |

### Companion Object Functions

| [async](async.html) | `fun MonoK.Companion.async(): `[`MonoKAsyncInstance`](../arrow.effects/-mono-k-async-instance/index.html) |

