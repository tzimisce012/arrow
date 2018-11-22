---
title: bindingFilter - arrow-mtl
---

[arrow-mtl](../index.html) / [arrow.mtl.instances.writert.monadFilter](index.html) / [bindingFilter](./binding-filter.html)

# bindingFilter

`@JvmName("bindingFilter") fun <F, W, B> bindingFilter(c: suspend `[`MonadFilterContinuation`](../arrow.mtl.typeclasses/-monad-filter-continuation/index.html)`<Kind<Kind<ForWriterT, `[`F`](binding-filter.html#F)`>, `[`W`](binding-filter.html#W)`>, *>.() -> `[`B`](binding-filter.html#B)`, FF: `[`MonadFilter`](../arrow.mtl.typeclasses/-monad-filter/index.html)`<`[`F`](binding-filter.html#F)`>, MM: Monoid<`[`W`](binding-filter.html#W)`>): Kind<`[`W`](binding-filter.html#W)`, `[`B`](binding-filter.html#B)`>`