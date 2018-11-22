---
title: WriterTInstances_WriterTMonadFactory.provideInstance - arrow-dagger
---

[arrow-dagger](../../index.html) / [arrow.dagger.instances](../index.html) / [WriterTInstances_WriterTMonadFactory](index.html) / [provideInstance](./provide-instance.html)

# provideInstance

`static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, W : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> provideInstance(module: `[`WriterTInstances`](../-writer-t-instances/index.html)`<`[`F`](provide-instance.html#F)`, `[`W`](provide-instance.html#W)`>, evProvider: Provider<`[`DaggerWriterTMonadInstance`](../-dagger-writer-t-monad-instance/index.html)`<`[`F`](provide-instance.html#F)`, `[`W`](provide-instance.html#W)`>>): Monad<Kind<Kind<ForWriterT, `[`F`](provide-instance.html#F)`>, `[`W`](provide-instance.html#W)`>>`