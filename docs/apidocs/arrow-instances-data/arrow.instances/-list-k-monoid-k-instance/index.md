---
title: ListKMonoidKInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [ListKMonoidKInstance](./index.html)

# ListKMonoidKInstance

`@extension interface ListKMonoidKInstance : MonoidK<ForListK>`

### Functions

| [combineK](combine-k.html) | `open fun <A> Kind<ForListK, `[`A`](combine-k.html#A)`>.combineK(y: Kind<ForListK, `[`A`](combine-k.html#A)`>): ListK<`[`A`](combine-k.html#A)`>` |
| [empty](empty.html) | `open fun <A> empty(): ListK<`[`A`](empty.html#A)`>` |

### Inheritors

| [ListKContext](../-list-k-context/index.html) | `object ListKContext : `[`ListKMonadInstance`](../-list-k-monad-instance/index.html)`, `[`ListKTraverseInstance`](../-list-k-traverse-instance/index.html)`, `[`ListKMonoidKInstance`](./index.html) |

