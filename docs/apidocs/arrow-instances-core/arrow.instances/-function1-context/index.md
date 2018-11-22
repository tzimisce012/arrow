---
title: Function1Context - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [Function1Context](./index.html)

# Function1Context

`class Function1Context<A> : `[`Function1MonadInstance`](../-function1-monad-instance/index.html)`<`[`A`](index.html#A)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `Function1Context()` |

### Inherited Functions

| [ap](../-function1-monad-instance/ap.html) | `open fun <A, B> Kind<Function1PartialOf<`[`I`](../-function1-monad-instance/index.html#I)`>, `[`A`](../-function1-monad-instance/ap.html#A)`>.ap(ff: Kind<Function1PartialOf<`[`I`](../-function1-monad-instance/index.html#I)`>, (`[`A`](../-function1-monad-instance/ap.html#A)`) -> `[`B`](../-function1-monad-instance/ap.html#B)`>): (`[`I`](../-function1-monad-instance/index.html#I)`) -> `[`B`](../-function1-monad-instance/ap.html#B) |
| [flatMap](../-function1-monad-instance/flat-map.html) | `open fun <A, B> Kind<Function1PartialOf<`[`I`](../-function1-monad-instance/index.html#I)`>, `[`A`](../-function1-monad-instance/flat-map.html#A)`>.flatMap(f: (`[`A`](../-function1-monad-instance/flat-map.html#A)`) -> Kind<Function1PartialOf<`[`I`](../-function1-monad-instance/index.html#I)`>, `[`B`](../-function1-monad-instance/flat-map.html#B)`>): (`[`I`](../-function1-monad-instance/index.html#I)`) -> `[`B`](../-function1-monad-instance/flat-map.html#B) |
| [map](../-function1-monad-instance/map.html) | `open fun <A, B> Kind<Function1PartialOf<`[`I`](../-function1-monad-instance/index.html#I)`>, `[`A`](../-function1-monad-instance/map.html#A)`>.map(f: (`[`A`](../-function1-monad-instance/map.html#A)`) -> `[`B`](../-function1-monad-instance/map.html#B)`): (`[`I`](../-function1-monad-instance/index.html#I)`) -> `[`B`](../-function1-monad-instance/map.html#B) |
| [tailRecM](../-function1-monad-instance/tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](../-function1-monad-instance/tail-rec-m.html#A)`, f: (`[`A`](../-function1-monad-instance/tail-rec-m.html#A)`) -> Function1Of<`[`I`](../-function1-monad-instance/index.html#I)`, Either<`[`A`](../-function1-monad-instance/tail-rec-m.html#A)`, `[`B`](../-function1-monad-instance/tail-rec-m.html#B)`>>): (`[`I`](../-function1-monad-instance/index.html#I)`) -> `[`B`](../-function1-monad-instance/tail-rec-m.html#B) |

