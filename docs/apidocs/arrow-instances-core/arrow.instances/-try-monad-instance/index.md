---
title: TryMonadInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [TryMonadInstance](./index.html)

# TryMonadInstance

`@extension interface TryMonadInstance : Monad<ForTry>`

### Functions

| [ap](ap.html) | `open fun <A, B> Kind<ForTry, `[`A`](ap.html#A)`>.ap(ff: Kind<ForTry, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): Try<`[`B`](ap.html#B)`>` |
| [flatMap](flat-map.html) | `open fun <A, B> Kind<ForTry, `[`A`](flat-map.html#A)`>.flatMap(f: (`[`A`](flat-map.html#A)`) -> Kind<ForTry, `[`B`](flat-map.html#B)`>): Try<`[`B`](flat-map.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): Try<`[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<ForTry, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Try<`[`B`](map.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> TryOf<Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): Try<`[`B`](tail-rec-m.html#B)`>` |

### Inheritors

| [TryMonadErrorInstance](../-try-monad-error-instance/index.html) | `interface TryMonadErrorInstance : MonadError<ForTry, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`TryMonadInstance`](./index.html) |

