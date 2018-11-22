---
title: EvalBimonadInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [EvalBimonadInstance](./index.html)

# EvalBimonadInstance

`@extension interface EvalBimonadInstance : Bimonad<ForEval>`

### Functions

| [ap](ap.html) | `open fun <A, B> Kind<ForEval, `[`A`](ap.html#A)`>.ap(ff: Kind<ForEval, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): Eval<`[`B`](ap.html#B)`>` |
| [coflatMap](coflat-map.html) | `open fun <A, B> Kind<ForEval, `[`A`](coflat-map.html#A)`>.coflatMap(f: (Kind<ForEval, `[`A`](coflat-map.html#A)`>) -> `[`B`](coflat-map.html#B)`): Eval<`[`B`](coflat-map.html#B)`>` |
| [extract](extract.html) | `open fun <A> Kind<ForEval, `[`A`](extract.html#A)`>.extract(): `[`A`](extract.html#A) |
| [flatMap](flat-map.html) | `open fun <A, B> Kind<ForEval, `[`A`](flat-map.html#A)`>.flatMap(f: (`[`A`](flat-map.html#A)`) -> Kind<ForEval, `[`B`](flat-map.html#B)`>): Eval<`[`B`](flat-map.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): Eval<`[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<ForEval, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Eval<`[`B`](map.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> EvalOf<Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): Eval<`[`B`](tail-rec-m.html#B)`>` |

### Inheritors

| [EvalContext](../-eval-context.html) | `object EvalContext : `[`EvalBimonadInstance`](./index.html) |

