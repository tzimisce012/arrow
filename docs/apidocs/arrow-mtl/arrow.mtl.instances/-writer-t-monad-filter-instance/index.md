---
title: WriterTMonadFilterInstance - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances](../index.html) / [WriterTMonadFilterInstance](./index.html)

# WriterTMonadFilterInstance

`@extension interface WriterTMonadFilterInstance<F, W> : `[`MonadFilter`](../../arrow.mtl.typeclasses/-monad-filter/index.html)`<WriterTPartialOf<`[`F`](index.html#F)`, `[`W`](index.html#W)`>>, WriterTMonadInstance<`[`F`](index.html#F)`, `[`W`](index.html#W)`>`

### Functions

| [FF](-f-f.html) | `abstract fun FF(): `[`MonadFilter`](../../arrow.mtl.typeclasses/-monad-filter/index.html)`<`[`F`](index.html#F)`>` |
| [MF](-m-f.html) | `open fun MF(): Monad<`[`F`](index.html#F)`>` |
| [MM](-m-m.html) | `abstract fun MM(): Monoid<`[`W`](index.html#W)`>` |
| [empty](empty.html) | `open fun <A> empty(): WriterTOf<`[`F`](index.html#F)`, `[`W`](index.html#W)`, `[`A`](empty.html#A)`>` |

### Inherited Functions

| [bindingFilter](../../arrow.mtl.typeclasses/-monad-filter/binding-filter.html) | `open fun <B> bindingFilter(c: suspend `[`MonadFilterContinuation`](../../arrow.mtl.typeclasses/-monad-filter-continuation/index.html)`<`[`F`](../../arrow.mtl.typeclasses/-monad-filter/index.html#F)`, *>.() -> `[`B`](../../arrow.mtl.typeclasses/-monad-filter/binding-filter.html#B)`): Kind<`[`F`](../../arrow.mtl.typeclasses/-monad-filter/index.html#F)`, `[`B`](../../arrow.mtl.typeclasses/-monad-filter/binding-filter.html#B)`>`<br>Entry point for monad bindings which enables for comprehension. The underlying impl is based on coroutines. A coroutine is initiated and inside [MonadContinuation](#) suspended yielding to [flatMap](#). Once all the flatMap binds are completed the underlying monad is returned from the act of executing the coroutine |
| [mapFilter](../../arrow.mtl.typeclasses/-monad-filter/map-filter.html) | `open fun <A, B> Kind<`[`F`](../../arrow.mtl.typeclasses/-monad-filter/index.html#F)`, `[`A`](../../arrow.mtl.typeclasses/-monad-filter/map-filter.html#A)`>.mapFilter(f: (`[`A`](../../arrow.mtl.typeclasses/-monad-filter/map-filter.html#A)`) -> Option<`[`B`](../../arrow.mtl.typeclasses/-monad-filter/map-filter.html#B)`>): Kind<`[`F`](../../arrow.mtl.typeclasses/-monad-filter/index.html#F)`, `[`B`](../../arrow.mtl.typeclasses/-monad-filter/map-filter.html#B)`>`<br>A combined map and filter. Filtering is handled via Option instead of Boolean such that the output type B can be different than the input type A. |

