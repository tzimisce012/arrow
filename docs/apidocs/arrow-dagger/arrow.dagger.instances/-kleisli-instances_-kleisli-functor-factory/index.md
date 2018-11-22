---
title: KleisliInstances_KleisliFunctorFactory - arrow-dagger
---

[arrow-dagger](../../index.html) / [arrow.dagger.instances](../index.html) / [KleisliInstances_KleisliFunctorFactory](./index.html)

# KleisliInstances_KleisliFunctorFactory

`@Generated("dagger.internal.codegen.ComponentProcessor", "https://google.github.io/dagger") class KleisliInstances_KleisliFunctorFactory<F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, D : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Factory<Functor<Kind<Kind<ForKleisli, `[`F`](index.html#F)`>, `[`D`](index.html#D)`>>>`

### Constructors

| [&lt;init&gt;](-init-.html) | `KleisliInstances_KleisliFunctorFactory(module: `[`KleisliInstances`](../-kleisli-instances/index.html)`<`[`F`](index.html#F)`, `[`D`](index.html#D)`>, evProvider: Provider<`[`DaggerKleisliFunctorInstance`](../-dagger-kleisli-functor-instance/index.html)`<`[`F`](index.html#F)`, `[`D`](index.html#D)`>>)` |

### Functions

| [create](create.html) | `static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, D : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> create(module: `[`KleisliInstances`](../-kleisli-instances/index.html)`<`[`F`](create.html#F)`, `[`D`](create.html#D)`>, evProvider: Provider<`[`DaggerKleisliFunctorInstance`](../-dagger-kleisli-functor-instance/index.html)`<`[`F`](create.html#F)`, `[`D`](create.html#D)`>>): `[`KleisliInstances_KleisliFunctorFactory`](./index.html)`<`[`F`](create.html#F)`, `[`D`](create.html#D)`>` |
| [get](get.html) | `fun get(): Functor<Kind<Kind<ForKleisli, `[`F`](index.html#F)`>, `[`D`](index.html#D)`>>` |
| [provideInstance](provide-instance.html) | `static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, D : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> provideInstance(module: `[`KleisliInstances`](../-kleisli-instances/index.html)`<`[`F`](provide-instance.html#F)`, `[`D`](provide-instance.html#D)`>, evProvider: Provider<`[`DaggerKleisliFunctorInstance`](../-dagger-kleisli-functor-instance/index.html)`<`[`F`](provide-instance.html#F)`, `[`D`](provide-instance.html#D)`>>): Functor<Kind<Kind<ForKleisli, `[`F`](provide-instance.html#F)`>, `[`D`](provide-instance.html#D)`>>` |
| [proxyKleisliFunctor](proxy-kleisli-functor.html) | `static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, D : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> proxyKleisliFunctor(instance: `[`KleisliInstances`](../-kleisli-instances/index.html)`<`[`F`](proxy-kleisli-functor.html#F)`, `[`D`](proxy-kleisli-functor.html#D)`>, ev: `[`DaggerKleisliFunctorInstance`](../-dagger-kleisli-functor-instance/index.html)`<`[`F`](proxy-kleisli-functor.html#F)`, `[`D`](proxy-kleisli-functor.html#D)`>): Functor<Kind<Kind<ForKleisli, `[`F`](proxy-kleisli-functor.html#F)`>, `[`D`](proxy-kleisli-functor.html#D)`>>` |

