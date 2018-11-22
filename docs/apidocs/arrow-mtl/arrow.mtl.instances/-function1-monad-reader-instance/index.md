---
title: Function1MonadReaderInstance - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances](../index.html) / [Function1MonadReaderInstance](./index.html)

# Function1MonadReaderInstance

`@extension interface Function1MonadReaderInstance<I> : `[`MonadReader`](../../arrow.mtl.typeclasses/-monad-reader/index.html)`<Function1PartialOf<`[`I`](index.html#I)`>, `[`I`](index.html#I)`>, Function1MonadInstance<`[`I`](index.html#I)`>`

### Functions

| [ask](ask.html) | `open fun ask(): (`[`I`](index.html#I)`) -> `[`I`](index.html#I)<br>Get the environment |
| [local](local.html) | `open fun <A> Kind<Function1PartialOf<`[`I`](index.html#I)`>, `[`A`](local.html#A)`>.local(f: (`[`I`](index.html#I)`) -> `[`I`](index.html#I)`): (`[`I`](index.html#I)`) -> `[`A`](local.html#A)<br>Modify the environment |

### Inherited Functions

| [reader](../../arrow.mtl.typeclasses/-monad-reader/reader.html) | `open fun <A> reader(f: (`[`D`](../../arrow.mtl.typeclasses/-monad-reader/index.html#D)`) -> `[`A`](../../arrow.mtl.typeclasses/-monad-reader/reader.html#A)`): Kind<`[`F`](../../arrow.mtl.typeclasses/-monad-reader/index.html#F)`, `[`A`](../../arrow.mtl.typeclasses/-monad-reader/reader.html#A)`>`<br>Retrieves a function of the environment |

### Inheritors

| [Function1MtlContext](../-function1-mtl-context/index.html) | `class Function1MtlContext<A> : `[`Function1MonadReaderInstance`](./index.html)`<`[`A`](../-function1-mtl-context/index.html#A)`>` |

