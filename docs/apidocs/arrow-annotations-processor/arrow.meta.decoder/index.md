---
title: arrow.meta.decoder - arrow-annotations-processor
---

[arrow-annotations-processor](../index.html) / [arrow.meta.decoder](./index.html)

## Package arrow.meta.decoder

### Types

| [MetaDecoder](-meta-decoder/index.html) | `interface MetaDecoder<in A : `[`Tree`](../arrow.meta.ast/-tree.html)`>`<br>Provides ways to go from a [Tree](../arrow.meta.ast/-tree.html) to [Code](../arrow.meta.ast/-code/index.html) for the purposes of code gen and reporting |
| [TypeDecoder](-type-decoder/index.html) | `interface TypeDecoder : `[`MetaDecoder`](-meta-decoder/index.html)`<`[`Type`](../arrow.meta.ast/-type/index.html)`>`<br>Type decoder that leverages Kotlin Poet to organize imports and output formatted code |

