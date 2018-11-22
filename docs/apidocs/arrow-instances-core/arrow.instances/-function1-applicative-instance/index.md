---
title: Function1ApplicativeInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [Function1ApplicativeInstance](./index.html)

# Function1ApplicativeInstance

`@extension interface Function1ApplicativeInstance<I> : Applicative<Function1PartialOf<`[`I`](index.html#I)`>>, `[`Function1FunctorInstance`](../-function1-functor-instance/index.html)`<`[`I`](index.html#I)`>`

### Functions

| [ap](ap.html) | `open fun <A, B> Kind<Function1PartialOf<`[`I`](index.html#I)`>, `[`A`](ap.html#A)`>.ap(ff: Kind<Function1PartialOf<`[`I`](index.html#I)`>, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): (`[`I`](index.html#I)`) -> `[`B`](ap.html#B) |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): (`[`I`](index.html#I)`) -> `[`A`](just.html#A) |
| [map](map.html) | `open fun <A, B> Kind<Function1PartialOf<`[`I`](index.html#I)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): (`[`I`](index.html#I)`) -> `[`B`](map.html#B) |

### Inheritors

| [Function1MonadInstance](../-function1-monad-instance/index.html) | `interface Function1MonadInstance<I> : Monad<Function1PartialOf<`[`I`](../-function1-monad-instance/index.html#I)`>>, `[`Function1ApplicativeInstance`](./index.html)`<`[`I`](../-function1-monad-instance/index.html#I)`>` |

