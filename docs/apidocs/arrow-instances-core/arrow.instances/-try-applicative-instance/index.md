---
title: TryApplicativeInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [TryApplicativeInstance](./index.html)

# TryApplicativeInstance

`@extension interface TryApplicativeInstance : Applicative<ForTry>`

### Functions

| [ap](ap.html) | `open fun <A, B> Kind<ForTry, `[`A`](ap.html#A)`>.ap(ff: Kind<ForTry, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): Try<`[`B`](ap.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): Try<`[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<ForTry, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Try<`[`B`](map.html#B)`>` |

### Inheritors

| [TryApplicativeErrorInstance](../-try-applicative-error-instance/index.html) | `interface TryApplicativeErrorInstance : ApplicativeError<ForTry, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`TryApplicativeInstance`](./index.html) |

