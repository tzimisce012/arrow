---
title: EitherUnion - arrow-query-language
---

[arrow-query-language](../../index.html) / [arrow.aql.instances](../index.html) / [EitherUnion](./index.html)

# EitherUnion

`@extension interface EitherUnion<L> : `[`Union`](../../arrow.aql/-union/index.html)`<EitherPartialOf<`[`L`](index.html#L)`>>`

### Functions

| [foldable](foldable.html) | `open fun foldable(): Foldable<EitherPartialOf<`[`L`](index.html#L)`>>` |

### Inherited Functions

| [union](../../arrow.aql/-union/union.html) | `open infix fun <A, B, Z> `[`Query`](../../arrow.aql/-query/index.html)`<`[`F`](../../arrow.aql/-union/index.html#F)`, `[`A`](../../arrow.aql/-union/union.html#A)`, `[`Z`](../../arrow.aql/-union/union.html#Z)`>.union(query: `[`Query`](../../arrow.aql/-query/index.html)`<`[`F`](../../arrow.aql/-union/index.html#F)`, `[`B`](../../arrow.aql/-union/union.html#B)`, `[`Z`](../../arrow.aql/-union/union.html#Z)`>): `[`Query`](../../arrow.aql/-query/index.html)`<ForListK, `[`Z`](../../arrow.aql/-union/union.html#Z)`, `[`Z`](../../arrow.aql/-union/union.html#Z)`>` |

