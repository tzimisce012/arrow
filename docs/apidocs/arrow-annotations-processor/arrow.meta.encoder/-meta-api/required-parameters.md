---
title: MetaApi.requiredParameters - arrow-annotations-processor
---

[arrow-annotations-processor](../../index.html) / [arrow.meta.encoder](../index.html) / [MetaApi](index.html) / [requiredParameters](./required-parameters.html)

# requiredParameters

`abstract val `[`TypeClassInstance`](../-type-class-instance/index.html)`.requiredParameters: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Parameter`](../../arrow.meta.ast/-parameter/index.html)`>`

The list of parameters a type class instance needs to be able to implement
the [requiredAbstractFunctions](required-abstract-functions.html)
ex: override fun MF: Monad in KleisliMonadInstance

```
fun <F, D> Companion.monad(MF: Monad<F>): KleisliMonadInstance<F, D> =
  object : arrow.instances.KleisliMonadInstance<F, D> { override fun MF(): arrow.typeclasses.Monad<F> = MF }`
```

