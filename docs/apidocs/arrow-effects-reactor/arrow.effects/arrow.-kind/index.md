---
title: arrow.effects.arrow.Kind - arrow-effects-reactor
---

[arrow-effects-reactor](../../index.html) / [arrow.effects](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [fix](fix.html) | `fun <A> `[`FluxKOf`](../-flux-k-of.html)`<`[`A`](fix.html#A)`>.fix(): `[`FluxK`](../-flux-k/index.html)`<`[`A`](fix.html#A)`>`<br>`fun <A> `[`MonoKOf`](../-mono-k-of.html)`<`[`A`](fix.html#A)`>.fix(): `[`MonoK`](../-mono-k/index.html)`<`[`A`](fix.html#A)`>` |
| [sequence](sequence.html) | `fun <A, G> `[`FluxKOf`](../-flux-k-of.html)`<Kind<`[`G`](sequence.html#G)`, `[`A`](sequence.html#A)`>>.sequence(GA: Applicative<`[`G`](sequence.html#G)`>): Kind<`[`G`](sequence.html#G)`, `[`FluxK`](../-flux-k/index.html)`<`[`A`](sequence.html#A)`>>` |
| [value](value.html) | `fun <A> `[`FluxKOf`](../-flux-k-of.html)`<`[`A`](value.html#A)`>.value(): Flux<`[`A`](value.html#A)`>`<br>`fun <A> `[`MonoKOf`](../-mono-k-of.html)`<`[`A`](value.html#A)`>.value(): Mono<`[`A`](value.html#A)`>` |

