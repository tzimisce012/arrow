---
title: MetaDecoder - arrow-annotations-processor
---

[arrow-annotations-processor](../../index.html) / [arrow.meta.decoder](../index.html) / [MetaDecoder](./index.html)

# MetaDecoder

`interface MetaDecoder<in A : `[`Tree`](../../arrow.meta.ast/-tree.html)`>`

Provides ways to go from a [Tree](../../arrow.meta.ast/-tree.html) to [Code](../../arrow.meta.ast/-code/index.html) for the purposes of code gen and reporting

### Functions

| [decode](decode.html) | `abstract fun decode(tree: `[`A`](index.html#A)`): `[`Code`](../../arrow.meta.ast/-code/index.html) |

### Inheritors

| [TypeDecoder](../-type-decoder/index.html) | `interface TypeDecoder : `[`MetaDecoder`](./index.html)`<`[`Type`](../../arrow.meta.ast/-type/index.html)`>`<br>Type decoder that leverages Kotlin Poet to organize imports and output formatted code |

