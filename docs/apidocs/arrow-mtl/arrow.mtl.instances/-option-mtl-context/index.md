---
title: OptionMtlContext - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances](../index.html) / [OptionMtlContext](./index.html)

# OptionMtlContext

`object OptionMtlContext : `[`OptionMonadCombineInstance`](../-option-monad-combine-instance/index.html)`, OptionTraverseInstance, OptionMonoidKInstance`

### Functions

| [combineK](combine-k.html) | `fun <A> Kind<ForOption, `[`A`](combine-k.html#A)`>.combineK(y: Kind<ForOption, `[`A`](combine-k.html#A)`>): Option<`[`A`](combine-k.html#A)`>` |
| [empty](empty.html) | `fun <A> empty(): Option<`[`A`](empty.html#A)`>` |
| [map](map.html) | `fun <A, B> Kind<ForOption, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Option<`[`B`](map.html#B)`>` |

### Inherited Functions

| [ap](../-option-monad-combine-instance/ap.html) | `open fun <A, B> Kind<ForOption, `[`A`](../-option-monad-combine-instance/ap.html#A)`>.ap(ff: Kind<ForOption, (`[`A`](../-option-monad-combine-instance/ap.html#A)`) -> `[`B`](../-option-monad-combine-instance/ap.html#B)`>): Option<`[`B`](../-option-monad-combine-instance/ap.html#B)`>` |
| [flatMap](../-option-monad-combine-instance/flat-map.html) | `open fun <A, B> Kind<ForOption, `[`A`](../-option-monad-combine-instance/flat-map.html#A)`>.flatMap(f: (`[`A`](../-option-monad-combine-instance/flat-map.html#A)`) -> Kind<ForOption, `[`B`](../-option-monad-combine-instance/flat-map.html#B)`>): Option<`[`B`](../-option-monad-combine-instance/flat-map.html#B)`>` |
| [just](../-option-monad-combine-instance/just.html) | `open fun <A> just(a: `[`A`](../-option-monad-combine-instance/just.html#A)`): Option<`[`A`](../-option-monad-combine-instance/just.html#A)`>` |
| [map2](../-option-monad-combine-instance/map2.html) | `open fun <A, B, Z> Kind<ForOption, `[`A`](../-option-monad-combine-instance/map2.html#A)`>.map2(fb: Kind<ForOption, `[`B`](../-option-monad-combine-instance/map2.html#B)`>, f: (Tuple2<`[`A`](../-option-monad-combine-instance/map2.html#A)`, `[`B`](../-option-monad-combine-instance/map2.html#B)`>) -> `[`Z`](../-option-monad-combine-instance/map2.html#Z)`): Option<`[`Z`](../-option-monad-combine-instance/map2.html#Z)`>` |
| [mapFilter](../-option-monad-combine-instance/map-filter.html) | `open fun <A, B> Kind<ForOption, `[`A`](../-option-monad-combine-instance/map-filter.html#A)`>.mapFilter(f: (`[`A`](../-option-monad-combine-instance/map-filter.html#A)`) -> Option<`[`B`](../-option-monad-combine-instance/map-filter.html#B)`>): Option<`[`B`](../-option-monad-combine-instance/map-filter.html#B)`>`<br>A combined map and filter. Filtering is handled via Option instead of Boolean such that the output type B can be different than the input type A. |
| [tailRecM](../-option-monad-combine-instance/tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](../-option-monad-combine-instance/tail-rec-m.html#A)`, f: (`[`A`](../-option-monad-combine-instance/tail-rec-m.html#A)`) -> OptionOf<Either<`[`A`](../-option-monad-combine-instance/tail-rec-m.html#A)`, `[`B`](../-option-monad-combine-instance/tail-rec-m.html#B)`>>): Option<`[`B`](../-option-monad-combine-instance/tail-rec-m.html#B)`>` |

