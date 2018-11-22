---
title: CoproductInstances_CoproductComonadFactory - arrow-dagger
---

[arrow-dagger](../../index.html) / [arrow.dagger.instances](../index.html) / [CoproductInstances_CoproductComonadFactory](./index.html)

# CoproductInstances_CoproductComonadFactory

`@Generated("dagger.internal.codegen.ComponentProcessor", "https://google.github.io/dagger") class CoproductInstances_CoproductComonadFactory<F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, G : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Factory<Comonad<Kind<Kind<ForCoproduct, `[`F`](index.html#F)`>, `[`G`](index.html#G)`>>>`

### Constructors

| [&lt;init&gt;](-init-.html) | `CoproductInstances_CoproductComonadFactory(module: `[`CoproductInstances`](../-coproduct-instances/index.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`>, evProvider: Provider<`[`DaggerCoproductComonadInstance`](../-dagger-coproduct-comonad-instance/index.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`>>)` |

### Functions

| [create](create.html) | `static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, G : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> create(module: `[`CoproductInstances`](../-coproduct-instances/index.html)`<`[`F`](create.html#F)`, `[`G`](create.html#G)`>, evProvider: Provider<`[`DaggerCoproductComonadInstance`](../-dagger-coproduct-comonad-instance/index.html)`<`[`F`](create.html#F)`, `[`G`](create.html#G)`>>): `[`CoproductInstances_CoproductComonadFactory`](./index.html)`<`[`F`](create.html#F)`, `[`G`](create.html#G)`>` |
| [get](get.html) | `fun get(): Comonad<Kind<Kind<ForCoproduct, `[`F`](index.html#F)`>, `[`G`](index.html#G)`>>` |
| [provideInstance](provide-instance.html) | `static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, G : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> provideInstance(module: `[`CoproductInstances`](../-coproduct-instances/index.html)`<`[`F`](provide-instance.html#F)`, `[`G`](provide-instance.html#G)`>, evProvider: Provider<`[`DaggerCoproductComonadInstance`](../-dagger-coproduct-comonad-instance/index.html)`<`[`F`](provide-instance.html#F)`, `[`G`](provide-instance.html#G)`>>): Comonad<Kind<Kind<ForCoproduct, `[`F`](provide-instance.html#F)`>, `[`G`](provide-instance.html#G)`>>` |
| [proxyCoproductComonad](proxy-coproduct-comonad.html) | `static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, G : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> proxyCoproductComonad(instance: `[`CoproductInstances`](../-coproduct-instances/index.html)`<`[`F`](proxy-coproduct-comonad.html#F)`, `[`G`](proxy-coproduct-comonad.html#G)`>, ev: `[`DaggerCoproductComonadInstance`](../-dagger-coproduct-comonad-instance/index.html)`<`[`F`](proxy-coproduct-comonad.html#F)`, `[`G`](proxy-coproduct-comonad.html#G)`>): Comonad<Kind<Kind<ForCoproduct, `[`F`](proxy-coproduct-comonad.html#F)`>, `[`G`](proxy-coproduct-comonad.html#G)`>>` |

