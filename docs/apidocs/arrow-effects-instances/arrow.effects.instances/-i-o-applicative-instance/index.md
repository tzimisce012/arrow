---
title: IOApplicativeInstance - arrow-effects-instances
---

[arrow-effects-instances](../../index.html) / [arrow.effects.instances](../index.html) / [IOApplicativeInstance](./index.html)

# IOApplicativeInstance

`@extension interface IOApplicativeInstance : Applicative<ForIO>`

### Functions

| [ap](ap.html) | `open fun <A, B> Kind<ForIO, `[`A`](ap.html#A)`>.ap(ff: IOOf<(`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): IO<`[`B`](ap.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): IO<`[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<ForIO, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): IO<`[`B`](map.html#B)`>` |

### Inheritors

| [IOApplicativeErrorInstance](../-i-o-applicative-error-instance/index.html) | `interface IOApplicativeErrorInstance : ApplicativeError<ForIO, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`IOApplicativeInstance`](./index.html) |

