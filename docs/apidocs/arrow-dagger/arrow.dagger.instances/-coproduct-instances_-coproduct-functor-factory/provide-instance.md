---
title: CoproductInstances_CoproductFunctorFactory.provideInstance - arrow-dagger
---

[arrow-dagger](../../index.html) / [arrow.dagger.instances](../index.html) / [CoproductInstances_CoproductFunctorFactory](index.html) / [provideInstance](./provide-instance.html)

# provideInstance

`static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, G : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> provideInstance(module: `[`CoproductInstances`](../-coproduct-instances/index.html)`<`[`F`](provide-instance.html#F)`, `[`G`](provide-instance.html#G)`>, evProvider: Provider<`[`DaggerCoproductFunctorInstance`](../-dagger-coproduct-functor-instance/index.html)`<`[`F`](provide-instance.html#F)`, `[`G`](provide-instance.html#G)`>>): Functor<Kind<Kind<ForCoproduct, `[`F`](provide-instance.html#F)`>, `[`G`](provide-instance.html#G)`>>`