---
title: ListKMonadFilterInstance - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances](../index.html) / [ListKMonadFilterInstance](./index.html)

# ListKMonadFilterInstance

`@extension interface ListKMonadFilterInstance : `[`MonadFilter`](../../arrow.mtl.typeclasses/-monad-filter/index.html)`<ForListK>`

### Functions

| [ap](ap.html) | `open fun <A, B> Kind<ForListK, `[`A`](ap.html#A)`>.ap(ff: Kind<ForListK, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): ListK<`[`B`](ap.html#B)`>` |
| [empty](empty.html) | `open fun <A> empty(): ListK<`[`A`](empty.html#A)`>` |
| [flatMap](flat-map.html) | `open fun <A, B> Kind<ForListK, `[`A`](flat-map.html#A)`>.flatMap(f: (`[`A`](flat-map.html#A)`) -> Kind<ForListK, `[`B`](flat-map.html#B)`>): ListK<`[`B`](flat-map.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): ListK<`[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<ForListK, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): ListK<`[`B`](map.html#B)`>` |
| [map2](map2.html) | `open fun <A, B, Z> Kind<ForListK, `[`A`](map2.html#A)`>.map2(fb: Kind<ForListK, `[`B`](map2.html#B)`>, f: (Tuple2<`[`A`](map2.html#A)`, `[`B`](map2.html#B)`>) -> `[`Z`](map2.html#Z)`): ListK<`[`Z`](map2.html#Z)`>` |
| [mapFilter](map-filter.html) | `open fun <A, B> Kind<ForListK, `[`A`](map-filter.html#A)`>.mapFilter(f: (`[`A`](map-filter.html#A)`) -> Option<`[`B`](map-filter.html#B)`>): ListK<`[`B`](map-filter.html#B)`>`<br>A combined map and filter. Filtering is handled via Option instead of Boolean such that the output type B can be different than the input type A. |
| [tailRecM](tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> ListKOf<Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): ListK<`[`B`](tail-rec-m.html#B)`>` |

### Inherited Functions

| [bindingFilter](../../arrow.mtl.typeclasses/-monad-filter/binding-filter.html) | `open fun <B> bindingFilter(c: suspend `[`MonadFilterContinuation`](../../arrow.mtl.typeclasses/-monad-filter-continuation/index.html)`<`[`F`](../../arrow.mtl.typeclasses/-monad-filter/index.html#F)`, *>.() -> `[`B`](../../arrow.mtl.typeclasses/-monad-filter/binding-filter.html#B)`): Kind<`[`F`](../../arrow.mtl.typeclasses/-monad-filter/index.html#F)`, `[`B`](../../arrow.mtl.typeclasses/-monad-filter/binding-filter.html#B)`>`<br>Entry point for monad bindings which enables for comprehension. The underlying impl is based on coroutines. A coroutine is initiated and inside [MonadContinuation](#) suspended yielding to [flatMap](#). Once all the flatMap binds are completed the underlying monad is returned from the act of executing the coroutine |

