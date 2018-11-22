---
title: Function1MonadInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [Function1MonadInstance](./index.html)

# Function1MonadInstance

`@extension interface Function1MonadInstance<I> : Monad<Function1PartialOf<`[`I`](index.html#I)`>>, `[`Function1ApplicativeInstance`](../-function1-applicative-instance/index.html)`<`[`I`](index.html#I)`>`

### Functions

| [ap](ap.html) | `open fun <A, B> Kind<Function1PartialOf<`[`I`](index.html#I)`>, `[`A`](ap.html#A)`>.ap(ff: Kind<Function1PartialOf<`[`I`](index.html#I)`>, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): (`[`I`](index.html#I)`) -> `[`B`](ap.html#B) |
| [flatMap](flat-map.html) | `open fun <A, B> Kind<Function1PartialOf<`[`I`](index.html#I)`>, `[`A`](flat-map.html#A)`>.flatMap(f: (`[`A`](flat-map.html#A)`) -> Kind<Function1PartialOf<`[`I`](index.html#I)`>, `[`B`](flat-map.html#B)`>): (`[`I`](index.html#I)`) -> `[`B`](flat-map.html#B) |
| [map](map.html) | `open fun <A, B> Kind<Function1PartialOf<`[`I`](index.html#I)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): (`[`I`](index.html#I)`) -> `[`B`](map.html#B) |
| [tailRecM](tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> Function1Of<`[`I`](index.html#I)`, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): (`[`I`](index.html#I)`) -> `[`B`](tail-rec-m.html#B) |

### Inheritors

| [Function1Context](../-function1-context/index.html) | `class Function1Context<A> : `[`Function1MonadInstance`](./index.html)`<`[`A`](../-function1-context/index.html#A)`>` |

