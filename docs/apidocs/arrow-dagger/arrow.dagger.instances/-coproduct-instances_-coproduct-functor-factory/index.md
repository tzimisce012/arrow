---
title: CoproductInstances_CoproductFunctorFactory - arrow-dagger
---

[arrow-dagger](../../index.html) / [arrow.dagger.instances](../index.html) / [CoproductInstances_CoproductFunctorFactory](./index.html)

# CoproductInstances_CoproductFunctorFactory

`@Generated("dagger.internal.codegen.ComponentProcessor", "https://google.github.io/dagger") class CoproductInstances_CoproductFunctorFactory<F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, G : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Factory<Functor<Kind<Kind<ForCoproduct, `[`F`](index.html#F)`>, `[`G`](index.html#G)`>>>`

### Constructors

| [&lt;init&gt;](-init-.html) | `CoproductInstances_CoproductFunctorFactory(module: `[`CoproductInstances`](../-coproduct-instances/index.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`>, evProvider: Provider<`[`DaggerCoproductFunctorInstance`](../-dagger-coproduct-functor-instance/index.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`>>)` |

### Functions

| [create](create.html) | `static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, G : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> create(module: `[`CoproductInstances`](../-coproduct-instances/index.html)`<`[`F`](create.html#F)`, `[`G`](create.html#G)`>, evProvider: Provider<`[`DaggerCoproductFunctorInstance`](../-dagger-coproduct-functor-instance/index.html)`<`[`F`](create.html#F)`, `[`G`](create.html#G)`>>): `[`CoproductInstances_CoproductFunctorFactory`](./index.html)`<`[`F`](create.html#F)`, `[`G`](create.html#G)`>` |
| [get](get.html) | `fun get(): Functor<Kind<Kind<ForCoproduct, `[`F`](index.html#F)`>, `[`G`](index.html#G)`>>` |
| [provideInstance](provide-instance.html) | `static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, G : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> provideInstance(module: `[`CoproductInstances`](../-coproduct-instances/index.html)`<`[`F`](provide-instance.html#F)`, `[`G`](provide-instance.html#G)`>, evProvider: Provider<`[`DaggerCoproductFunctorInstance`](../-dagger-coproduct-functor-instance/index.html)`<`[`F`](provide-instance.html#F)`, `[`G`](provide-instance.html#G)`>>): Functor<Kind<Kind<ForCoproduct, `[`F`](provide-instance.html#F)`>, `[`G`](provide-instance.html#G)`>>` |
| [proxyCoproductFunctor](proxy-coproduct-functor.html) | `static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, G : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> proxyCoproductFunctor(instance: `[`CoproductInstances`](../-coproduct-instances/index.html)`<`[`F`](proxy-coproduct-functor.html#F)`, `[`G`](proxy-coproduct-functor.html#G)`>, ev: `[`DaggerCoproductFunctorInstance`](../-dagger-coproduct-functor-instance/index.html)`<`[`F`](proxy-coproduct-functor.html#F)`, `[`G`](proxy-coproduct-functor.html#G)`>): Functor<Kind<Kind<ForCoproduct, `[`F`](proxy-coproduct-functor.html#F)`>, `[`G`](proxy-coproduct-functor.html#G)`>>` |

