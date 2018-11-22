---
title: EvalContext - arrow-instances-core
---

[arrow-instances-core](../index.html) / [arrow.instances](index.html) / [EvalContext](./-eval-context.html)

# EvalContext

`object EvalContext : `[`EvalBimonadInstance`](-eval-bimonad-instance/index.html)

### Inherited Functions

| [ap](-eval-bimonad-instance/ap.html) | `open fun <A, B> Kind<ForEval, `[`A`](-eval-bimonad-instance/ap.html#A)`>.ap(ff: Kind<ForEval, (`[`A`](-eval-bimonad-instance/ap.html#A)`) -> `[`B`](-eval-bimonad-instance/ap.html#B)`>): Eval<`[`B`](-eval-bimonad-instance/ap.html#B)`>` |
| [coflatMap](-eval-bimonad-instance/coflat-map.html) | `open fun <A, B> Kind<ForEval, `[`A`](-eval-bimonad-instance/coflat-map.html#A)`>.coflatMap(f: (Kind<ForEval, `[`A`](-eval-bimonad-instance/coflat-map.html#A)`>) -> `[`B`](-eval-bimonad-instance/coflat-map.html#B)`): Eval<`[`B`](-eval-bimonad-instance/coflat-map.html#B)`>` |
| [extract](-eval-bimonad-instance/extract.html) | `open fun <A> Kind<ForEval, `[`A`](-eval-bimonad-instance/extract.html#A)`>.extract(): `[`A`](-eval-bimonad-instance/extract.html#A) |
| [flatMap](-eval-bimonad-instance/flat-map.html) | `open fun <A, B> Kind<ForEval, `[`A`](-eval-bimonad-instance/flat-map.html#A)`>.flatMap(f: (`[`A`](-eval-bimonad-instance/flat-map.html#A)`) -> Kind<ForEval, `[`B`](-eval-bimonad-instance/flat-map.html#B)`>): Eval<`[`B`](-eval-bimonad-instance/flat-map.html#B)`>` |
| [just](-eval-bimonad-instance/just.html) | `open fun <A> just(a: `[`A`](-eval-bimonad-instance/just.html#A)`): Eval<`[`A`](-eval-bimonad-instance/just.html#A)`>` |
| [map](-eval-bimonad-instance/map.html) | `open fun <A, B> Kind<ForEval, `[`A`](-eval-bimonad-instance/map.html#A)`>.map(f: (`[`A`](-eval-bimonad-instance/map.html#A)`) -> `[`B`](-eval-bimonad-instance/map.html#B)`): Eval<`[`B`](-eval-bimonad-instance/map.html#B)`>` |
| [tailRecM](-eval-bimonad-instance/tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](-eval-bimonad-instance/tail-rec-m.html#A)`, f: (`[`A`](-eval-bimonad-instance/tail-rec-m.html#A)`) -> EvalOf<Either<`[`A`](-eval-bimonad-instance/tail-rec-m.html#A)`, `[`B`](-eval-bimonad-instance/tail-rec-m.html#B)`>>): Eval<`[`B`](-eval-bimonad-instance/tail-rec-m.html#B)`>` |

