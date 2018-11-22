---
title: Hash - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Hash](./index.html)

# Hash

`interface Hash<in F> : `[`Eq`](../-eq/index.html)`<`[`F`](index.html#F)`>`

A type class used to represent hashing for objects of type [F](index.html#F)

A hash function is a mapping of arbitrary data ([F](index.html#F)) to an output set of fixed size ([Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)). The result, a hash value, is
most commonly used in collections like HashTable as a lookup value

### Functions

| [hash](hash.html) | `abstract fun `[`F`](index.html#F)`.hash(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Produces a hash for an object of type [F](index.html#F). |

### Inherited Functions

| [eqv](../-eq/eqv.html) | `abstract fun `[`F`](../-eq/index.html#F)`.eqv(b: `[`F`](../-eq/index.html#F)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Compares two instances of [F](../-eq/index.html#F) and returns true if they're considered equal for this instance. |
| [neqv](../-eq/neqv.html) | `open fun `[`F`](../-eq/index.html#F)`.neqv(b: `[`F`](../-eq/index.html#F)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Compares two instances of [F](../-eq/index.html#F) and returns true if they're considered not equal for this instance. |

### Companion Object Functions

| [any](any.html) | `fun any(): `[`Hash`](./index.html)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?>`<br>Retrieve an instance of [Hash](./index.html) where the hash function delegates to kotlin's `Any?.hashCode()` function |
| [invoke](invoke.html) | `operator fun <F> invoke(hashF: (`[`F`](invoke.html#F)`) -> `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Hash`](./index.html)`<`[`F`](invoke.html#F)`>`<br>Construct an instance of [Hash](./index.html) from a function `(F) -> Int`. |

