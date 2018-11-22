---
title: IOMonadInstance - arrow-effects-instances
---

[arrow-effects-instances](../../index.html) / [arrow.effects.instances](../index.html) / [IOMonadInstance](./index.html)

# IOMonadInstance

`@extension interface IOMonadInstance : Monad<ForIO>`

### Functions

| [flatMap](flat-map.html) | `open fun <A, B> Kind<ForIO, `[`A`](flat-map.html#A)`>.flatMap(f: (`[`A`](flat-map.html#A)`) -> Kind<ForIO, `[`B`](flat-map.html#B)`>): IO<`[`B`](flat-map.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): IO<`[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<ForIO, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): IO<`[`B`](map.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> IOOf<Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): IO<`[`B`](tail-rec-m.html#B)`>` |

### Inheritors

| [IOMonadErrorInstance](../-i-o-monad-error-instance/index.html) | `interface IOMonadErrorInstance : MonadError<ForIO, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`IOMonadInstance`](./index.html) |

