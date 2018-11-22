---
title: Function0Context - arrow-instances-core
---

[arrow-instances-core](../index.html) / [arrow.instances](index.html) / [Function0Context](./-function0-context.html)

# Function0Context

`object Function0Context : `[`Function0BimonadInstance`](-function0-bimonad-instance/index.html)

### Inherited Functions

| [ap](-function0-bimonad-instance/ap.html) | `open fun <A, B> Kind<ForFunction0, `[`A`](-function0-bimonad-instance/ap.html#A)`>.ap(ff: Kind<ForFunction0, (`[`A`](-function0-bimonad-instance/ap.html#A)`) -> `[`B`](-function0-bimonad-instance/ap.html#B)`>): () -> `[`B`](-function0-bimonad-instance/ap.html#B) |
| [coflatMap](-function0-bimonad-instance/coflat-map.html) | `open fun <A, B> Kind<ForFunction0, `[`A`](-function0-bimonad-instance/coflat-map.html#A)`>.coflatMap(f: (Kind<ForFunction0, `[`A`](-function0-bimonad-instance/coflat-map.html#A)`>) -> `[`B`](-function0-bimonad-instance/coflat-map.html#B)`): () -> `[`B`](-function0-bimonad-instance/coflat-map.html#B) |
| [extract](-function0-bimonad-instance/extract.html) | `open fun <A> Kind<ForFunction0, `[`A`](-function0-bimonad-instance/extract.html#A)`>.extract(): `[`A`](-function0-bimonad-instance/extract.html#A) |
| [flatMap](-function0-bimonad-instance/flat-map.html) | `open fun <A, B> Kind<ForFunction0, `[`A`](-function0-bimonad-instance/flat-map.html#A)`>.flatMap(f: (`[`A`](-function0-bimonad-instance/flat-map.html#A)`) -> Kind<ForFunction0, `[`B`](-function0-bimonad-instance/flat-map.html#B)`>): () -> `[`B`](-function0-bimonad-instance/flat-map.html#B) |
| [just](-function0-bimonad-instance/just.html) | `open fun <A> just(a: `[`A`](-function0-bimonad-instance/just.html#A)`): () -> `[`A`](-function0-bimonad-instance/just.html#A) |
| [map](-function0-bimonad-instance/map.html) | `open fun <A, B> Kind<ForFunction0, `[`A`](-function0-bimonad-instance/map.html#A)`>.map(f: (`[`A`](-function0-bimonad-instance/map.html#A)`) -> `[`B`](-function0-bimonad-instance/map.html#B)`): () -> `[`B`](-function0-bimonad-instance/map.html#B) |
| [tailRecM](-function0-bimonad-instance/tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](-function0-bimonad-instance/tail-rec-m.html#A)`, f: (`[`A`](-function0-bimonad-instance/tail-rec-m.html#A)`) -> Function0Of<Either<`[`A`](-function0-bimonad-instance/tail-rec-m.html#A)`, `[`B`](-function0-bimonad-instance/tail-rec-m.html#B)`>>): () -> `[`B`](-function0-bimonad-instance/tail-rec-m.html#B) |

