---
title: arrow.effects.arrow.Kind - arrow-effects-rx2
---

[arrow-effects-rx2](../../index.html) / [arrow.effects](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [fix](fix.html) | `fun <A> `[`FlowableKOf`](../-flowable-k-of.html)`<`[`A`](fix.html#A)`>.fix(): `[`FlowableK`](../-flowable-k/index.html)`<`[`A`](fix.html#A)`>`<br>`fun <A> `[`MaybeKOf`](../-maybe-k-of.html)`<`[`A`](fix.html#A)`>.fix(): `[`MaybeK`](../-maybe-k/index.html)`<`[`A`](fix.html#A)`>`<br>`fun <A> `[`ObservableKOf`](../-observable-k-of.html)`<`[`A`](fix.html#A)`>.fix(): `[`ObservableK`](../-observable-k/index.html)`<`[`A`](fix.html#A)`>`<br>`fun <A> `[`SingleKOf`](../-single-k-of.html)`<`[`A`](fix.html#A)`>.fix(): `[`SingleK`](../-single-k/index.html)`<`[`A`](fix.html#A)`>` |
| [sequence](sequence.html) | `fun <A, G> `[`FlowableKOf`](../-flowable-k-of.html)`<Kind<`[`G`](sequence.html#G)`, `[`A`](sequence.html#A)`>>.sequence(GA: Applicative<`[`G`](sequence.html#G)`>): Kind<`[`G`](sequence.html#G)`, `[`FlowableK`](../-flowable-k/index.html)`<`[`A`](sequence.html#A)`>>`<br>`fun <A, G> `[`ObservableKOf`](../-observable-k-of.html)`<Kind<`[`G`](sequence.html#G)`, `[`A`](sequence.html#A)`>>.sequence(GA: Applicative<`[`G`](sequence.html#G)`>): Kind<`[`G`](sequence.html#G)`, `[`ObservableK`](../-observable-k/index.html)`<`[`A`](sequence.html#A)`>>` |
| [value](value.html) | `fun <A> `[`FlowableKOf`](../-flowable-k-of.html)`<`[`A`](value.html#A)`>.value(): Flowable<`[`A`](value.html#A)`>`<br>`fun <A> `[`MaybeKOf`](../-maybe-k-of.html)`<`[`A`](value.html#A)`>.value(): Maybe<`[`A`](value.html#A)`>`<br>`fun <A> `[`ObservableKOf`](../-observable-k-of.html)`<`[`A`](value.html#A)`>.value(): Observable<`[`A`](value.html#A)`>`<br>`fun <A> `[`SingleKOf`](../-single-k-of.html)`<`[`A`](value.html#A)`>.value(): Single<`[`A`](value.html#A)`>` |

