---
title: Kleisli.andThen - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [Kleisli](index.html) / [andThen](./and-then.html)

# andThen

`fun <C> andThen(MF: Monad<`[`F`](index.html#F)`>, f: `[`Kleisli`](index.html)`<`[`F`](index.html#F)`, `[`A`](index.html#A)`, `[`C`](and-then.html#C)`>): `[`Kleisli`](index.html)`<`[`F`](index.html#F)`, `[`D`](index.html#D)`, `[`C`](and-then.html#C)`>`

Compose with another [Kleisli](index.html).

### Parameters

`o` - other [Kleisli](index.html) to compose with.

`MF` - [Monad](#) for the context [F](index.html#F).`fun <B> andThen(MF: Monad<`[`F`](index.html#F)`>, f: (`[`A`](index.html#A)`) -> Kind<`[`F`](index.html#F)`, `[`B`](and-then.html#B)`>): `[`Kleisli`](index.html)`<`[`F`](index.html#F)`, `[`D`](index.html#D)`, `[`B`](and-then.html#B)`>`

Compose with a function to transform the output of the [Kleisli](index.html) arrow.

### Parameters

`f` - the function to apply.

`MF` - [Monad](#) for the context [F](index.html#F).`fun <B> andThen(MF: Monad<`[`F`](index.html#F)`>, fb: Kind<`[`F`](index.html#F)`, `[`B`](and-then.html#B)`>): `[`Kleisli`](index.html)`<`[`F`](index.html#F)`, `[`D`](index.html#D)`, `[`B`](and-then.html#B)`>`

Set the end of the arrow to `Kind<F, B>` after running the computation.

### Parameters

`fb` - the new end of the arrow.

`MF` - [Monad](#) for the context [F](index.html#F).