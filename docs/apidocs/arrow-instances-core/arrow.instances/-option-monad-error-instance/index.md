---
title: OptionMonadErrorInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [OptionMonadErrorInstance](./index.html)

# OptionMonadErrorInstance

`@extension interface OptionMonadErrorInstance : MonadError<ForOption, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, `[`OptionMonadInstance`](../-option-monad-instance/index.html)

### Functions

| [handleErrorWith](handle-error-with.html) | `open fun <A> Kind<ForOption, `[`A`](handle-error-with.html#A)`>.handleErrorWith(f: (`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`) -> Kind<ForOption, `[`A`](handle-error-with.html#A)`>): Option<`[`A`](handle-error-with.html#A)`>` |
| [raiseError](raise-error.html) | `open fun <A> raiseError(e: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): Kind<ForOption, `[`A`](raise-error.html#A)`>` |

### Inheritors

| [OptionContext](../-option-context/index.html) | `object OptionContext : `[`OptionMonadErrorInstance`](./index.html)`, `[`OptionTraverseInstance`](../-option-traverse-instance/index.html) |

