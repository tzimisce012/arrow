---
title: WriterTInstances_WriterTMonadFactory - arrow-dagger
---

[arrow-dagger](../../index.html) / [arrow.dagger.instances](../index.html) / [WriterTInstances_WriterTMonadFactory](./index.html)

# WriterTInstances_WriterTMonadFactory

`@Generated("dagger.internal.codegen.ComponentProcessor", "https://google.github.io/dagger") class WriterTInstances_WriterTMonadFactory<F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, W : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Factory<Monad<Kind<Kind<ForWriterT, `[`F`](index.html#F)`>, `[`W`](index.html#W)`>>>`

### Constructors

| [&lt;init&gt;](-init-.html) | `WriterTInstances_WriterTMonadFactory(module: `[`WriterTInstances`](../-writer-t-instances/index.html)`<`[`F`](index.html#F)`, `[`W`](index.html#W)`>, evProvider: Provider<`[`DaggerWriterTMonadInstance`](../-dagger-writer-t-monad-instance/index.html)`<`[`F`](index.html#F)`, `[`W`](index.html#W)`>>)` |

### Functions

| [create](create.html) | `static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, W : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> create(module: `[`WriterTInstances`](../-writer-t-instances/index.html)`<`[`F`](create.html#F)`, `[`W`](create.html#W)`>, evProvider: Provider<`[`DaggerWriterTMonadInstance`](../-dagger-writer-t-monad-instance/index.html)`<`[`F`](create.html#F)`, `[`W`](create.html#W)`>>): `[`WriterTInstances_WriterTMonadFactory`](./index.html)`<`[`F`](create.html#F)`, `[`W`](create.html#W)`>` |
| [get](get.html) | `fun get(): Monad<Kind<Kind<ForWriterT, `[`F`](index.html#F)`>, `[`W`](index.html#W)`>>` |
| [provideInstance](provide-instance.html) | `static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, W : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> provideInstance(module: `[`WriterTInstances`](../-writer-t-instances/index.html)`<`[`F`](provide-instance.html#F)`, `[`W`](provide-instance.html#W)`>, evProvider: Provider<`[`DaggerWriterTMonadInstance`](../-dagger-writer-t-monad-instance/index.html)`<`[`F`](provide-instance.html#F)`, `[`W`](provide-instance.html#W)`>>): Monad<Kind<Kind<ForWriterT, `[`F`](provide-instance.html#F)`>, `[`W`](provide-instance.html#W)`>>` |
| [proxyWriterTMonad](proxy-writer-t-monad.html) | `static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, W : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> proxyWriterTMonad(instance: `[`WriterTInstances`](../-writer-t-instances/index.html)`<`[`F`](proxy-writer-t-monad.html#F)`, `[`W`](proxy-writer-t-monad.html#W)`>, ev: `[`DaggerWriterTMonadInstance`](../-dagger-writer-t-monad-instance/index.html)`<`[`F`](proxy-writer-t-monad.html#F)`, `[`W`](proxy-writer-t-monad.html#W)`>): Monad<Kind<Kind<ForWriterT, `[`F`](proxy-writer-t-monad.html#F)`>, `[`W`](proxy-writer-t-monad.html#W)`>>` |

