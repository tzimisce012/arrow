---
title: OptionApplicativeInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [OptionApplicativeInstance](./index.html)

# OptionApplicativeInstance

`@extension interface OptionApplicativeInstance : Applicative<ForOption>`

### Functions

| [ap](ap.html) | `open fun <A, B> Kind<ForOption, `[`A`](ap.html#A)`>.ap(ff: Kind<ForOption, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): Option<`[`B`](ap.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): Option<`[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<ForOption, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Option<`[`B`](map.html#B)`>` |

### Inheritors

| [OptionApplicativeErrorInstance](../-option-applicative-error-instance/index.html) | `interface OptionApplicativeErrorInstance : ApplicativeError<ForOption, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, `[`OptionApplicativeInstance`](./index.html) |

