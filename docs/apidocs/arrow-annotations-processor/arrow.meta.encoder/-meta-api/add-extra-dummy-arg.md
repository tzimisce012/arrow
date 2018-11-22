---
title: MetaApi.addExtraDummyArg - arrow-annotations-processor
---

[arrow-annotations-processor](../../index.html) / [arrow.meta.encoder](../index.html) / [MetaApi](index.html) / [addExtraDummyArg](./add-extra-dummy-arg.html)

# addExtraDummyArg

`abstract fun `[`Func`](../../arrow.meta.ast/-func/index.html)`.addExtraDummyArg(): `[`Func`](../../arrow.meta.ast/-func/index.html)

Appends (...argN: Unit = Unit) at the end of the parameter lists of this function.
This is frequently done to work around JVM overload clashes specially when extending kinded values
which show the same JVM signature after erasure

