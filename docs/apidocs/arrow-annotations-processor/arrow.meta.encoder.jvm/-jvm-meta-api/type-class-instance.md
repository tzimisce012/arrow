---
title: JvmMetaApi.typeClassInstance - arrow-annotations-processor
---

[arrow-annotations-processor](../../index.html) / [arrow.meta.encoder.jvm](../index.html) / [JvmMetaApi](index.html) / [typeClassInstance](./type-class-instance.html)

# typeClassInstance

`open fun `[`TypeElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/TypeElement.html)`.typeClassInstance(): `[`TypeClassInstance`](../../arrow.meta.encoder/-type-class-instance/index.html)`?`

Returns all the type information needed for type class introspection assuming
this type element is a valid type class instance:
An interface annotated with @extension with at least one type argument and extending another interface
with one type argument as the first element in its extends clause

