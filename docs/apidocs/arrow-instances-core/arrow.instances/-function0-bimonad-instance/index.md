---
title: Function0BimonadInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [Function0BimonadInstance](./index.html)

# Function0BimonadInstance

`@extension interface Function0BimonadInstance : Bimonad<ForFunction0>`

### Functions

| [ap](ap.html) | `open fun <A, B> Kind<ForFunction0, `[`A`](ap.html#A)`>.ap(ff: Kind<ForFunction0, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): () -> `[`B`](ap.html#B) |
| [coflatMap](coflat-map.html) | `open fun <A, B> Kind<ForFunction0, `[`A`](coflat-map.html#A)`>.coflatMap(f: (Kind<ForFunction0, `[`A`](coflat-map.html#A)`>) -> `[`B`](coflat-map.html#B)`): () -> `[`B`](coflat-map.html#B) |
| [extract](extract.html) | `open fun <A> Kind<ForFunction0, `[`A`](extract.html#A)`>.extract(): `[`A`](extract.html#A) |
| [flatMap](flat-map.html) | `open fun <A, B> Kind<ForFunction0, `[`A`](flat-map.html#A)`>.flatMap(f: (`[`A`](flat-map.html#A)`) -> Kind<ForFunction0, `[`B`](flat-map.html#B)`>): () -> `[`B`](flat-map.html#B) |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): () -> `[`A`](just.html#A) |
| [map](map.html) | `open fun <A, B> Kind<ForFunction0, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): () -> `[`B`](map.html#B) |
| [tailRecM](tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> Function0Of<Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): () -> `[`B`](tail-rec-m.html#B) |

### Inheritors

| [Function0Context](../-function0-context.html) | `object Function0Context : `[`Function0BimonadInstance`](./index.html) |

