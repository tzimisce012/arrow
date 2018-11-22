---
title: EitherTInstances_EitherTMonadFactory - arrow-dagger
---

[arrow-dagger](../../index.html) / [arrow.dagger.instances](../index.html) / [EitherTInstances_EitherTMonadFactory](./index.html)

# EitherTInstances_EitherTMonadFactory

`@Generated("dagger.internal.codegen.ComponentProcessor", "https://google.github.io/dagger") class EitherTInstances_EitherTMonadFactory<F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, L : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Factory<Monad<Kind<Kind<ForEitherT, `[`F`](index.html#F)`>, `[`L`](index.html#L)`>>>`

### Constructors

| [&lt;init&gt;](-init-.html) | `EitherTInstances_EitherTMonadFactory(module: `[`EitherTInstances`](../-either-t-instances/index.html)`<`[`F`](index.html#F)`, `[`L`](index.html#L)`>, evProvider: Provider<`[`DaggerEitherTMonadInstance`](../-dagger-either-t-monad-instance/index.html)`<`[`F`](index.html#F)`, `[`L`](index.html#L)`>>)` |

### Functions

| [create](create.html) | `static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, L : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> create(module: `[`EitherTInstances`](../-either-t-instances/index.html)`<`[`F`](create.html#F)`, `[`L`](create.html#L)`>, evProvider: Provider<`[`DaggerEitherTMonadInstance`](../-dagger-either-t-monad-instance/index.html)`<`[`F`](create.html#F)`, `[`L`](create.html#L)`>>): `[`EitherTInstances_EitherTMonadFactory`](./index.html)`<`[`F`](create.html#F)`, `[`L`](create.html#L)`>` |
| [get](get.html) | `fun get(): Monad<Kind<Kind<ForEitherT, `[`F`](index.html#F)`>, `[`L`](index.html#L)`>>` |
| [provideInstance](provide-instance.html) | `static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, L : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> provideInstance(module: `[`EitherTInstances`](../-either-t-instances/index.html)`<`[`F`](provide-instance.html#F)`, `[`L`](provide-instance.html#L)`>, evProvider: Provider<`[`DaggerEitherTMonadInstance`](../-dagger-either-t-monad-instance/index.html)`<`[`F`](provide-instance.html#F)`, `[`L`](provide-instance.html#L)`>>): Monad<Kind<Kind<ForEitherT, `[`F`](provide-instance.html#F)`>, `[`L`](provide-instance.html#L)`>>` |
| [proxyEitherTMonad](proxy-either-t-monad.html) | `static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, L : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> proxyEitherTMonad(instance: `[`EitherTInstances`](../-either-t-instances/index.html)`<`[`F`](proxy-either-t-monad.html#F)`, `[`L`](proxy-either-t-monad.html#L)`>, ev: `[`DaggerEitherTMonadInstance`](../-dagger-either-t-monad-instance/index.html)`<`[`F`](proxy-either-t-monad.html#F)`, `[`L`](proxy-either-t-monad.html#L)`>): Monad<Kind<Kind<ForEitherT, `[`F`](proxy-either-t-monad.html#F)`>, `[`L`](proxy-either-t-monad.html#L)`>>` |

