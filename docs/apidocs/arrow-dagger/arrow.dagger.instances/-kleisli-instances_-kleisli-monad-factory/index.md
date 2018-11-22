---
title: KleisliInstances_KleisliMonadFactory - arrow-dagger
---

[arrow-dagger](../../index.html) / [arrow.dagger.instances](../index.html) / [KleisliInstances_KleisliMonadFactory](./index.html)

# KleisliInstances_KleisliMonadFactory

`@Generated("dagger.internal.codegen.ComponentProcessor", "https://google.github.io/dagger") class KleisliInstances_KleisliMonadFactory<F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, D : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Factory<Monad<Kind<Kind<ForKleisli, `[`F`](index.html#F)`>, `[`D`](index.html#D)`>>>`

### Constructors

| [&lt;init&gt;](-init-.html) | `KleisliInstances_KleisliMonadFactory(module: `[`KleisliInstances`](../-kleisli-instances/index.html)`<`[`F`](index.html#F)`, `[`D`](index.html#D)`>, evProvider: Provider<`[`DaggerKleisliMonadInstance`](../-dagger-kleisli-monad-instance/index.html)`<`[`F`](index.html#F)`, `[`D`](index.html#D)`>>)` |

### Functions

| [create](create.html) | `static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, D : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> create(module: `[`KleisliInstances`](../-kleisli-instances/index.html)`<`[`F`](create.html#F)`, `[`D`](create.html#D)`>, evProvider: Provider<`[`DaggerKleisliMonadInstance`](../-dagger-kleisli-monad-instance/index.html)`<`[`F`](create.html#F)`, `[`D`](create.html#D)`>>): `[`KleisliInstances_KleisliMonadFactory`](./index.html)`<`[`F`](create.html#F)`, `[`D`](create.html#D)`>` |
| [get](get.html) | `fun get(): Monad<Kind<Kind<ForKleisli, `[`F`](index.html#F)`>, `[`D`](index.html#D)`>>` |
| [provideInstance](provide-instance.html) | `static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, D : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> provideInstance(module: `[`KleisliInstances`](../-kleisli-instances/index.html)`<`[`F`](provide-instance.html#F)`, `[`D`](provide-instance.html#D)`>, evProvider: Provider<`[`DaggerKleisliMonadInstance`](../-dagger-kleisli-monad-instance/index.html)`<`[`F`](provide-instance.html#F)`, `[`D`](provide-instance.html#D)`>>): Monad<Kind<Kind<ForKleisli, `[`F`](provide-instance.html#F)`>, `[`D`](provide-instance.html#D)`>>` |
| [proxyKleisliMonad](proxy-kleisli-monad.html) | `static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, D : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> proxyKleisliMonad(instance: `[`KleisliInstances`](../-kleisli-instances/index.html)`<`[`F`](proxy-kleisli-monad.html#F)`, `[`D`](proxy-kleisli-monad.html#D)`>, ev: `[`DaggerKleisliMonadInstance`](../-dagger-kleisli-monad-instance/index.html)`<`[`F`](proxy-kleisli-monad.html#F)`, `[`D`](proxy-kleisli-monad.html#D)`>): Monad<Kind<Kind<ForKleisli, `[`F`](proxy-kleisli-monad.html#F)`>, `[`D`](proxy-kleisli-monad.html#D)`>>` |

