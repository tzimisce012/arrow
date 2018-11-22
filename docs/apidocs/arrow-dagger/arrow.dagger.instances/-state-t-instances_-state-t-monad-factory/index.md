---
title: StateTInstances_StateTMonadFactory - arrow-dagger
---

[arrow-dagger](../../index.html) / [arrow.dagger.instances](../index.html) / [StateTInstances_StateTMonadFactory](./index.html)

# StateTInstances_StateTMonadFactory

`@Generated("dagger.internal.codegen.ComponentProcessor", "https://google.github.io/dagger") class StateTInstances_StateTMonadFactory<F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, S : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Factory<Monad<Kind<Kind<ForStateT, `[`F`](index.html#F)`>, `[`S`](index.html#S)`>>>`

### Constructors

| [&lt;init&gt;](-init-.html) | `StateTInstances_StateTMonadFactory(module: `[`StateTInstances`](../-state-t-instances/index.html)`<`[`F`](index.html#F)`, `[`S`](index.html#S)`>, evProvider: Provider<`[`DaggerStateTMonadInstance`](../-dagger-state-t-monad-instance/index.html)`<`[`F`](index.html#F)`, `[`S`](index.html#S)`>>)` |

### Functions

| [create](create.html) | `static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, S : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> create(module: `[`StateTInstances`](../-state-t-instances/index.html)`<`[`F`](create.html#F)`, `[`S`](create.html#S)`>, evProvider: Provider<`[`DaggerStateTMonadInstance`](../-dagger-state-t-monad-instance/index.html)`<`[`F`](create.html#F)`, `[`S`](create.html#S)`>>): `[`StateTInstances_StateTMonadFactory`](./index.html)`<`[`F`](create.html#F)`, `[`S`](create.html#S)`>` |
| [get](get.html) | `fun get(): Monad<Kind<Kind<ForStateT, `[`F`](index.html#F)`>, `[`S`](index.html#S)`>>` |
| [provideInstance](provide-instance.html) | `static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, S : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> provideInstance(module: `[`StateTInstances`](../-state-t-instances/index.html)`<`[`F`](provide-instance.html#F)`, `[`S`](provide-instance.html#S)`>, evProvider: Provider<`[`DaggerStateTMonadInstance`](../-dagger-state-t-monad-instance/index.html)`<`[`F`](provide-instance.html#F)`, `[`S`](provide-instance.html#S)`>>): Monad<Kind<Kind<ForStateT, `[`F`](provide-instance.html#F)`>, `[`S`](provide-instance.html#S)`>>` |
| [proxyStateTMonad](proxy-state-t-monad.html) | `static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, S : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> proxyStateTMonad(instance: `[`StateTInstances`](../-state-t-instances/index.html)`<`[`F`](proxy-state-t-monad.html#F)`, `[`S`](proxy-state-t-monad.html#S)`>, ev: `[`DaggerStateTMonadInstance`](../-dagger-state-t-monad-instance/index.html)`<`[`F`](proxy-state-t-monad.html#F)`, `[`S`](proxy-state-t-monad.html#S)`>): Monad<Kind<Kind<ForStateT, `[`F`](proxy-state-t-monad.html#F)`>, `[`S`](proxy-state-t-monad.html#S)`>>` |

