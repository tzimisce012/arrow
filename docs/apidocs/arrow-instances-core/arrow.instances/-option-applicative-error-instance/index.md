---
title: OptionApplicativeErrorInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [OptionApplicativeErrorInstance](./index.html)

# OptionApplicativeErrorInstance

`@extension interface OptionApplicativeErrorInstance : ApplicativeError<ForOption, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, `[`OptionApplicativeInstance`](../-option-applicative-instance/index.html)

### Functions

| [handleErrorWith](handle-error-with.html) | `open fun <A> Kind<ForOption, `[`A`](handle-error-with.html#A)`>.handleErrorWith(f: (`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`) -> Kind<ForOption, `[`A`](handle-error-with.html#A)`>): Option<`[`A`](handle-error-with.html#A)`>` |
| [raiseError](raise-error.html) | `open fun <A> raiseError(e: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): Option<`[`A`](raise-error.html#A)`>` |

