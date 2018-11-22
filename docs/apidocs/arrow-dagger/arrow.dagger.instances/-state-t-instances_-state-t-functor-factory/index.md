---
title: StateTInstances_StateTFunctorFactory - arrow-dagger
---

[arrow-dagger](../../index.html) / [arrow.dagger.instances](../index.html) / [StateTInstances_StateTFunctorFactory](./index.html)

# StateTInstances_StateTFunctorFactory

`@Generated("dagger.internal.codegen.ComponentProcessor", "https://google.github.io/dagger") class StateTInstances_StateTFunctorFactory<F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, S : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Factory<Functor<Kind<Kind<ForStateT, `[`F`](index.html#F)`>, `[`S`](index.html#S)`>>>`

### Constructors

| [&lt;init&gt;](-init-.html) | `StateTInstances_StateTFunctorFactory(module: `[`StateTInstances`](../-state-t-instances/index.html)`<`[`F`](index.html#F)`, `[`S`](index.html#S)`>, evProvider: Provider<`[`DaggerStateTFunctorInstance`](../-dagger-state-t-functor-instance/index.html)`<`[`F`](index.html#F)`, `[`S`](index.html#S)`>>)` |

### Functions

| [create](create.html) | `static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, S : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> create(module: `[`StateTInstances`](../-state-t-instances/index.html)`<`[`F`](create.html#F)`, `[`S`](create.html#S)`>, evProvider: Provider<`[`DaggerStateTFunctorInstance`](../-dagger-state-t-functor-instance/index.html)`<`[`F`](create.html#F)`, `[`S`](create.html#S)`>>): `[`StateTInstances_StateTFunctorFactory`](./index.html)`<`[`F`](create.html#F)`, `[`S`](create.html#S)`>` |
| [get](get.html) | `fun get(): Functor<Kind<Kind<ForStateT, `[`F`](index.html#F)`>, `[`S`](index.html#S)`>>` |
| [provideInstance](provide-instance.html) | `static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, S : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> provideInstance(module: `[`StateTInstances`](../-state-t-instances/index.html)`<`[`F`](provide-instance.html#F)`, `[`S`](provide-instance.html#S)`>, evProvider: Provider<`[`DaggerStateTFunctorInstance`](../-dagger-state-t-functor-instance/index.html)`<`[`F`](provide-instance.html#F)`, `[`S`](provide-instance.html#S)`>>): Functor<Kind<Kind<ForStateT, `[`F`](provide-instance.html#F)`>, `[`S`](provide-instance.html#S)`>>` |
| [proxyStateTFunctor](proxy-state-t-functor.html) | `static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, S : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> proxyStateTFunctor(instance: `[`StateTInstances`](../-state-t-instances/index.html)`<`[`F`](proxy-state-t-functor.html#F)`, `[`S`](proxy-state-t-functor.html#S)`>, ev: `[`DaggerStateTFunctorInstance`](../-dagger-state-t-functor-instance/index.html)`<`[`F`](proxy-state-t-functor.html#F)`, `[`S`](proxy-state-t-functor.html#S)`>): Functor<Kind<Kind<ForStateT, `[`F`](proxy-state-t-functor.html#F)`>, `[`S`](proxy-state-t-functor.html#S)`>>` |

