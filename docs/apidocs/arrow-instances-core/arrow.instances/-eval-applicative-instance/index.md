---
title: EvalApplicativeInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [EvalApplicativeInstance](./index.html)

# EvalApplicativeInstance

`@extension interface EvalApplicativeInstance : Applicative<ForEval>`

### Functions

| [ap](ap.html) | `open fun <A, B> Kind<ForEval, `[`A`](ap.html#A)`>.ap(ff: Kind<ForEval, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): Eval<`[`B`](ap.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): Eval<`[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<ForEval, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Eval<`[`B`](map.html#B)`>` |

