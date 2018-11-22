---
title: MetaApi.requiredAbstractFunctions - arrow-annotations-processor
---

[arrow-annotations-processor](../../index.html) / [arrow.meta.encoder](../index.html) / [MetaApi](index.html) / [requiredAbstractFunctions](./required-abstract-functions.html)

# requiredAbstractFunctions

`abstract val `[`TypeClassInstance`](../-type-class-instance/index.html)`.requiredAbstractFunctions: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Func`](../../arrow.meta.ast/-func/index.html)`>`

The list of functions a type class instance needs to implement to resolve
it's hierarchical dependencies to other type classes
ex: override fun MF(): arrow.typeclasses.Monad in the KleisliMonadInstance

```
fun <F, D> Companion.monad(MF: Monad<F>): KleisliMonadInstance<F, D> =
  object : arrow.instances.KleisliMonadInstance<F, D> { override fun MF(): arrow.typeclasses.Monad<F> = MF }`
```

