---
title: Focus - arrow-annotations-processor
---

[arrow-annotations-processor](../../index.html) / [arrow.optics](../index.html) / [Focus](./index.html)

# Focus

`sealed class Focus`

### Types

| [NonNull](-non-null/index.html) | `data class NonNull : `[`Focus`](./index.html) |
| [Nullable](-nullable/index.html) | `data class Nullable : `[`Focus`](./index.html) |
| [Option](-option/index.html) | `data class Option : `[`Focus`](./index.html) |

### Properties

| [className](class-name.html) | `abstract val className: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [paramName](param-name.html) | `abstract val paramName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Companion Object Functions

| [invoke](invoke.html) | `operator fun invoke(fullName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, paramName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Focus`](./index.html) |

### Extension Functions

| [lensParamName](../lens-param-name.html) | `fun `[`Focus`](./index.html)`.lensParamName(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Inheritors

| [NonNull](-non-null/index.html) | `data class NonNull : `[`Focus`](./index.html) |
| [Nullable](-nullable/index.html) | `data class Nullable : `[`Focus`](./index.html) |
| [Option](-option/index.html) | `data class Option : `[`Focus`](./index.html) |

