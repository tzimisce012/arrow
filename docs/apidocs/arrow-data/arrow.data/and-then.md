---
title: andThen - arrow-data
---

[arrow-data](../index.html) / [arrow.data](index.html) / [andThen](./and-then.html)

# andThen

`fun <D, A, C> `[`Reader`](-reader.html)`<`[`D`](and-then.html#D)`, `[`A`](and-then.html#A)`>.andThen(o: `[`Reader`](-reader.html)`<`[`A`](and-then.html#A)`, `[`C`](and-then.html#C)`>): `[`Reader`](-reader.html)`<`[`D`](and-then.html#D)`, `[`C`](and-then.html#C)`>`

Compose with another [Reader](-reader.html) that has a dependency on the output of the computation.

### Parameters

`o` - other [Reader](-reader.html) to compose with.`fun <D, A, B> `[`Reader`](-reader.html)`<`[`D`](and-then.html#D)`, `[`A`](and-then.html#A)`>.andThen(f: (`[`A`](and-then.html#A)`) -> `[`B`](and-then.html#B)`): `[`Reader`](-reader.html)`<`[`D`](and-then.html#D)`, `[`B`](and-then.html#B)`>`

Map the result of the computation [A](and-then.html#A) to [B](and-then.html#B) given a function [f](and-then.html#arrow.data$andThen(arrow.data.Kleisli((arrow.core.ForId, arrow.data.andThen.D, arrow.data.andThen.A)), kotlin.Function1((arrow.data.andThen.A, arrow.data.andThen.B)))/f).
Alias for [map](map.html)

### Parameters

`f` - the function to apply.

**See Also**

[map](map.html)

`fun <D, A, B> `[`Reader`](-reader.html)`<`[`D`](and-then.html#D)`, `[`A`](and-then.html#A)`>.andThen(b: `[`B`](and-then.html#B)`): `[`Reader`](-reader.html)`<`[`D`](and-then.html#D)`, `[`B`](and-then.html#B)`>`

Set the result to [B](and-then.html#B) after running the computation.

