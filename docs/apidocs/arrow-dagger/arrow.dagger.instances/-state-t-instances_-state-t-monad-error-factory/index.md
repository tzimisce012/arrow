---
title: StateTInstances_StateTMonadErrorFactory - arrow-dagger
---

[arrow-dagger](../../index.html) / [arrow.dagger.instances](../index.html) / [StateTInstances_StateTMonadErrorFactory](./index.html)

# StateTInstances_StateTMonadErrorFactory

`@Generated("dagger.internal.codegen.ComponentProcessor", "https://google.github.io/dagger") class StateTInstances_StateTMonadErrorFactory<F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, S : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Factory<MonadError<Kind<Kind<ForStateT, `[`F`](index.html#F)`>, `[`S`](index.html#S)`>, `[`S`](index.html#S)`>>`

### Constructors

| [&lt;init&gt;](-init-.html) | `StateTInstances_StateTMonadErrorFactory(module: `[`StateTInstances`](../-state-t-instances/index.html)`<`[`F`](index.html#F)`, `[`S`](index.html#S)`>, evProvider: Provider<`[`DaggerStateTMonadErrorInstance`](../-dagger-state-t-monad-error-instance/index.html)`<`[`F`](index.html#F)`, `[`S`](index.html#S)`>>)` |

### Functions

| [create](create.html) | `static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, S : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> create(module: `[`StateTInstances`](../-state-t-instances/index.html)`<`[`F`](create.html#F)`, `[`S`](create.html#S)`>, evProvider: Provider<`[`DaggerStateTMonadErrorInstance`](../-dagger-state-t-monad-error-instance/index.html)`<`[`F`](create.html#F)`, `[`S`](create.html#S)`>>): `[`StateTInstances_StateTMonadErrorFactory`](./index.html)`<`[`F`](create.html#F)`, `[`S`](create.html#S)`>` |
| [get](get.html) | `fun get(): MonadError<Kind<Kind<ForStateT, `[`F`](index.html#F)`>, `[`S`](index.html#S)`>, `[`S`](index.html#S)`>` |
| [provideInstance](provide-instance.html) | `static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, S : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> provideInstance(module: `[`StateTInstances`](../-state-t-instances/index.html)`<`[`F`](provide-instance.html#F)`, `[`S`](provide-instance.html#S)`>, evProvider: Provider<`[`DaggerStateTMonadErrorInstance`](../-dagger-state-t-monad-error-instance/index.html)`<`[`F`](provide-instance.html#F)`, `[`S`](provide-instance.html#S)`>>): MonadError<Kind<Kind<ForStateT, `[`F`](provide-instance.html#F)`>, `[`S`](provide-instance.html#S)`>, `[`S`](provide-instance.html#S)`>` |
| [proxyStateTMonadError](proxy-state-t-monad-error.html) | `static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, S : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> proxyStateTMonadError(instance: `[`StateTInstances`](../-state-t-instances/index.html)`<`[`F`](proxy-state-t-monad-error.html#F)`, `[`S`](proxy-state-t-monad-error.html#S)`>, ev: `[`DaggerStateTMonadErrorInstance`](../-dagger-state-t-monad-error-instance/index.html)`<`[`F`](proxy-state-t-monad-error.html#F)`, `[`S`](proxy-state-t-monad-error.html#S)`>): MonadError<Kind<Kind<ForStateT, `[`F`](proxy-state-t-monad-error.html#F)`>, `[`S`](proxy-state-t-monad-error.html#S)`>, `[`S`](proxy-state-t-monad-error.html#S)`>` |

