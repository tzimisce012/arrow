---
title: MetaApi.kinded - arrow-annotations-processor
---

[arrow-annotations-processor](../../index.html) / [arrow.meta.encoder](../index.html) / [MetaApi](index.html) / [kinded](./kinded.html)

# kinded

`abstract val `[`ParameterizedType`](../../arrow.meta.ast/-type-name/-parameterized-type/index.html)`.kinded: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Determine if this [TypeName.ParameterizedType](../../arrow.meta.ast/-type-name/-parameterized-type/index.html) is in kinded position.
ex: `arrow.Kind<ForIO, A>` =&gt; true
ex: `IO<A>` =&gt; false

The current definition of kinded for Arrow Meta is that a parameterized kinded type is a type that:

1. Extends from arrow.Kind.
2. The type has two type arguments.
3. The first type argument is a type variable.
