---
title: OptionTInstances_OptionTMonadFactory - arrow-dagger
---

[arrow-dagger](../../index.html) / [arrow.dagger.instances](../index.html) / [OptionTInstances_OptionTMonadFactory](./index.html)

# OptionTInstances_OptionTMonadFactory

`@Generated("dagger.internal.codegen.ComponentProcessor", "https://google.github.io/dagger") class OptionTInstances_OptionTMonadFactory<F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Factory<Monad<Kind<ForOptionT, `[`F`](index.html#F)`>>>`

### Constructors

| [&lt;init&gt;](-init-.html) | `OptionTInstances_OptionTMonadFactory(module: `[`OptionTInstances`](../-option-t-instances/index.html)`<`[`F`](index.html#F)`>, evProvider: Provider<`[`DaggerOptionTMonadInstance`](../-dagger-option-t-monad-instance/index.html)`<`[`F`](index.html#F)`>>)` |

### Functions

| [create](create.html) | `static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> create(module: `[`OptionTInstances`](../-option-t-instances/index.html)`<`[`F`](create.html#F)`>, evProvider: Provider<`[`DaggerOptionTMonadInstance`](../-dagger-option-t-monad-instance/index.html)`<`[`F`](create.html#F)`>>): `[`OptionTInstances_OptionTMonadFactory`](./index.html)`<`[`F`](create.html#F)`>` |
| [get](get.html) | `fun get(): Monad<Kind<ForOptionT, `[`F`](index.html#F)`>>` |
| [provideInstance](provide-instance.html) | `static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> provideInstance(module: `[`OptionTInstances`](../-option-t-instances/index.html)`<`[`F`](provide-instance.html#F)`>, evProvider: Provider<`[`DaggerOptionTMonadInstance`](../-dagger-option-t-monad-instance/index.html)`<`[`F`](provide-instance.html#F)`>>): Monad<Kind<ForOptionT, `[`F`](provide-instance.html#F)`>>` |
| [proxyOptionTMonad](proxy-option-t-monad.html) | `static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> proxyOptionTMonad(instance: `[`OptionTInstances`](../-option-t-instances/index.html)`<`[`F`](proxy-option-t-monad.html#F)`>, ev: `[`DaggerOptionTMonadInstance`](../-dagger-option-t-monad-instance/index.html)`<`[`F`](proxy-option-t-monad.html#F)`>): Monad<Kind<ForOptionT, `[`F`](proxy-option-t-monad.html#F)`>>` |

