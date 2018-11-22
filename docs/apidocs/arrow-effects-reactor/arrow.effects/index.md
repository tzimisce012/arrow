---
title: arrow.effects - arrow-effects-reactor
---

[arrow-effects-reactor](../index.html) / [arrow.effects](./index.html)

## Package arrow.effects

### Types

| [CoroutineContextReactorScheduler](-coroutine-context-reactor-scheduler/index.html) | `object CoroutineContextReactorScheduler` |
| [FluxK](-flux-k/index.html) | `data class FluxK<A> : `[`FluxKOf`](-flux-k-of.html)`<`[`A`](-flux-k/index.html#A)`>, `[`FluxKKindedJ`](-flux-k-kinded-j.html)`<`[`A`](-flux-k/index.html#A)`>` |
| [ForFluxK](-for-flux-k.html) | `class ForFluxK` |
| [ForMonoK](-for-mono-k.html) | `class ForMonoK` |
| [MonoK](-mono-k/index.html) | `data class MonoK<A> : `[`MonoKOf`](-mono-k-of.html)`<`[`A`](-mono-k/index.html#A)`>, `[`MonoKKindedJ`](-mono-k-kinded-j.html)`<`[`A`](-mono-k/index.html#A)`>` |

### Type Aliases

| [FluxKKindedJ](-flux-k-kinded-j.html) | `typealias FluxKKindedJ<A> = Hk<`[`ForFluxK`](-for-flux-k.html)`, `[`A`](-flux-k-kinded-j.html#A)`>` |
| [FluxKOf](-flux-k-of.html) | `typealias FluxKOf<A> = Kind<`[`ForFluxK`](-for-flux-k.html)`, `[`A`](-flux-k-of.html#A)`>` |
| [MonoKKindedJ](-mono-k-kinded-j.html) | `typealias MonoKKindedJ<A> = Hk<`[`ForMonoK`](-for-mono-k.html)`, `[`A`](-mono-k-kinded-j.html#A)`>` |
| [MonoKOf](-mono-k-of.html) | `typealias MonoKOf<A> = Kind<`[`ForMonoK`](-for-mono-k.html)`, `[`A`](-mono-k-of.html#A)`>` |

### Extensions for External Classes

| [arrow.Kind](arrow.-kind/index.html) |  |
| [reactor.core.publisher.Flux](reactor.core.publisher.-flux/index.html) |  |
| [reactor.core.publisher.Mono](reactor.core.publisher.-mono/index.html) |  |

