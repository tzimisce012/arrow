---
title: EitherInstances_EitherMonadFactory - arrow-dagger
---

[arrow-dagger](../../index.html) / [arrow.dagger.instances](../index.html) / [EitherInstances_EitherMonadFactory](./index.html)

# EitherInstances_EitherMonadFactory

`@Generated("dagger.internal.codegen.ComponentProcessor", "https://google.github.io/dagger") class EitherInstances_EitherMonadFactory<L : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Factory<Monad<Kind<ForEither, `[`L`](index.html#L)`>>>`

### Constructors

| [&lt;init&gt;](-init-.html) | `EitherInstances_EitherMonadFactory(module: `[`EitherInstances`](../-either-instances/index.html)`<`[`L`](index.html#L)`>, evProvider: Provider<`[`DaggerEitherMonadInstance`](../-dagger-either-monad-instance/index.html)`<`[`L`](index.html#L)`>>)` |

### Functions

| [create](create.html) | `static fun <L : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> create(module: `[`EitherInstances`](../-either-instances/index.html)`<`[`L`](create.html#L)`>, evProvider: Provider<`[`DaggerEitherMonadInstance`](../-dagger-either-monad-instance/index.html)`<`[`L`](create.html#L)`>>): `[`EitherInstances_EitherMonadFactory`](./index.html)`<`[`L`](create.html#L)`>` |
| [get](get.html) | `fun get(): Monad<Kind<ForEither, `[`L`](index.html#L)`>>` |
| [provideInstance](provide-instance.html) | `static fun <L : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> provideInstance(module: `[`EitherInstances`](../-either-instances/index.html)`<`[`L`](provide-instance.html#L)`>, evProvider: Provider<`[`DaggerEitherMonadInstance`](../-dagger-either-monad-instance/index.html)`<`[`L`](provide-instance.html#L)`>>): Monad<Kind<ForEither, `[`L`](provide-instance.html#L)`>>` |
| [proxyEitherMonad](proxy-either-monad.html) | `static fun <L : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> proxyEitherMonad(instance: `[`EitherInstances`](../-either-instances/index.html)`<`[`L`](proxy-either-monad.html#L)`>, ev: `[`DaggerEitherMonadInstance`](../-dagger-either-monad-instance/index.html)`<`[`L`](proxy-either-monad.html#L)`>): Monad<Kind<ForEither, `[`L`](proxy-either-monad.html#L)`>>` |

