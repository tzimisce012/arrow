---
title: arrow.recursion.data - arrow-recursion
---

[arrow-recursion](../index.html) / [arrow.recursion.data](./index.html)

## Package arrow.recursion.data

### Types

| [Fix](-fix/index.html) | `data class Fix<out A> : `[`FixOf`](-fix-of.html)`<`[`A`](-fix/index.html#A)`>`<br>Type level combinator for obtaining the fixed point of a type. This type is the type level encoding of primitive recursion. |
| [ForFix](-for-fix.html) | `class ForFix` |
| [ForMu](-for-mu.html) | `class ForMu` |
| [ForNu](-for-nu.html) | `class ForNu` |
| [Mu](-mu/index.html) | `abstract class Mu<out F> : `[`MuOf`](-mu-of.html)`<`[`F`](-mu/index.html#F)`>`<br>Type level combinator for obtaining the least fixed point of a type. This type is the type level encoding of cata. |
| [Nu](-nu/index.html) | `class Nu<out F> : `[`NuOf`](-nu-of.html)`<`[`F`](-nu/index.html#F)`>`<br>Type level combinator for obtaining the greatest fixed point of a type. This type is the type level encoding of ana. |

### Type Aliases

| [FixOf](-fix-of.html) | `typealias FixOf<A> = Kind<`[`ForFix`](-for-fix.html)`, `[`A`](-fix-of.html#A)`>` |
| [MuOf](-mu-of.html) | `typealias MuOf<F> = Kind<`[`ForMu`](-for-mu.html)`, `[`F`](-mu-of.html#F)`>` |
| [NuOf](-nu-of.html) | `typealias NuOf<F> = Kind<`[`ForNu`](-for-nu.html)`, `[`F`](-nu-of.html#F)`>` |

### Extensions for External Classes

| [arrow.Kind](arrow.-kind/index.html) |  |

