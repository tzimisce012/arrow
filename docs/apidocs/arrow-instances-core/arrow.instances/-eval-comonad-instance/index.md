---
title: EvalComonadInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [EvalComonadInstance](./index.html)

# EvalComonadInstance

`@extension interface EvalComonadInstance : Comonad<ForEval>`

### Functions

| [coflatMap](coflat-map.html) | `open fun <A, B> Kind<ForEval, `[`A`](coflat-map.html#A)`>.coflatMap(f: (Kind<ForEval, `[`A`](coflat-map.html#A)`>) -> `[`B`](coflat-map.html#B)`): Eval<`[`B`](coflat-map.html#B)`>` |
| [extract](extract.html) | `open fun <A> Kind<ForEval, `[`A`](extract.html#A)`>.extract(): `[`A`](extract.html#A) |
| [map](map.html) | `open fun <A, B> Kind<ForEval, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Eval<`[`B`](map.html#B)`>` |

