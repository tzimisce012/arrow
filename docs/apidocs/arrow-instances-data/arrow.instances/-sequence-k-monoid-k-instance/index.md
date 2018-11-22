---
title: SequenceKMonoidKInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [SequenceKMonoidKInstance](./index.html)

# SequenceKMonoidKInstance

`@extension interface SequenceKMonoidKInstance : MonoidK<ForSequenceK>`

### Functions

| [combineK](combine-k.html) | `open fun <A> Kind<ForSequenceK, `[`A`](combine-k.html#A)`>.combineK(y: Kind<ForSequenceK, `[`A`](combine-k.html#A)`>): SequenceK<`[`A`](combine-k.html#A)`>` |
| [empty](empty.html) | `open fun <A> empty(): SequenceK<`[`A`](empty.html#A)`>` |

### Inheritors

| [SequenceKContext](../-sequence-k-context/index.html) | `object SequenceKContext : `[`SequenceKMonadInstance`](../-sequence-k-monad-instance/index.html)`, `[`SequenceKTraverseInstance`](../-sequence-k-traverse-instance/index.html)`, `[`SequenceKMonoidKInstance`](./index.html) |

