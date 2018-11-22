---
title: FluxKTraverseInstance - arrow-effects-reactor-instances
---

[arrow-effects-reactor-instances](../../index.html) / [arrow.effects](../index.html) / [FluxKTraverseInstance](./index.html)

# FluxKTraverseInstance

`@extension interface FluxKTraverseInstance : Traverse<ForFluxK>`

### Functions

| [foldLeft](fold-left.html) | `open fun <A, B> Kind<ForFluxK, `[`A`](fold-left.html#A)`>.foldLeft(b: `[`B`](fold-left.html#B)`, f: (`[`B`](fold-left.html#B)`, `[`A`](fold-left.html#A)`) -> `[`B`](fold-left.html#B)`): `[`B`](fold-left.html#B) |
| [foldRight](fold-right.html) | `open fun <A, B> Kind<ForFluxK, `[`A`](fold-right.html#A)`>.foldRight(lb: Eval<`[`B`](fold-right.html#B)`>, f: (`[`A`](fold-right.html#A)`, Eval<`[`B`](fold-right.html#B)`>) -> Eval<`[`B`](fold-right.html#B)`>): Eval<`[`B`](fold-right.html#B)`>` |
| [map](map.html) | `open fun <A, B> Kind<ForFluxK, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): FluxK<`[`B`](map.html#B)`>` |
| [traverse](traverse.html) | `open fun <G, A, B> FluxKOf<`[`A`](traverse.html#A)`>.traverse(AP: Applicative<`[`G`](traverse.html#G)`>, f: (`[`A`](traverse.html#A)`) -> Kind<`[`G`](traverse.html#G)`, `[`B`](traverse.html#B)`>): Kind<`[`G`](traverse.html#G)`, FluxK<`[`B`](traverse.html#B)`>>` |

### Inheritors

| [FluxKContext](../-flux-k-context/index.html) | `object FluxKContext : `[`FluxKConcurrentEffectInstance`](../-flux-k-concurrent-effect-instance/index.html)`, `[`FluxKTraverseInstance`](./index.html) |

