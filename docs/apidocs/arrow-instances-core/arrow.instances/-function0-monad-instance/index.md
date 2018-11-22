---
title: Function0MonadInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [Function0MonadInstance](./index.html)

# Function0MonadInstance

`@extension interface Function0MonadInstance : Monad<ForFunction0>`

### Functions

| [ap](ap.html) | `open fun <A, B> Kind<ForFunction0, `[`A`](ap.html#A)`>.ap(ff: Kind<ForFunction0, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): () -> `[`B`](ap.html#B) |
| [flatMap](flat-map.html) | `open fun <A, B> Kind<ForFunction0, `[`A`](flat-map.html#A)`>.flatMap(f: (`[`A`](flat-map.html#A)`) -> Kind<ForFunction0, `[`B`](flat-map.html#B)`>): () -> `[`B`](flat-map.html#B) |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): () -> `[`A`](just.html#A) |
| [map](map.html) | `open fun <A, B> Kind<ForFunction0, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): () -> `[`B`](map.html#B) |
| [tailRecM](tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> Function0Of<Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): () -> `[`B`](tail-rec-m.html#B) |

