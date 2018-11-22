---
title: IorContext - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [IorContext](./index.html)

# IorContext

`class IorContext<L> : `[`IorMonadInstance`](../-ior-monad-instance/index.html)`<`[`L`](index.html#L)`>, `[`IorTraverseInstance`](../-ior-traverse-instance/index.html)`<`[`L`](index.html#L)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `IorContext(SL: Semigroup<`[`L`](index.html#L)`>)` |

### Properties

| [SL](-s-l.html) | `val SL: Semigroup<`[`L`](index.html#L)`>` |

### Functions

| [SL](-s-l.html) | `fun SL(): Semigroup<`[`L`](index.html#L)`>` |
| [map](map.html) | `fun <A, B> Kind<IorPartialOf<`[`L`](index.html#L)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Ior<`[`L`](index.html#L)`, `[`B`](map.html#B)`>` |

### Inherited Functions

| [ap](../-ior-monad-instance/ap.html) | `open fun <A, B> Kind<IorPartialOf<`[`L`](../-ior-monad-instance/index.html#L)`>, `[`A`](../-ior-monad-instance/ap.html#A)`>.ap(ff: Kind<IorPartialOf<`[`L`](../-ior-monad-instance/index.html#L)`>, (`[`A`](../-ior-monad-instance/ap.html#A)`) -> `[`B`](../-ior-monad-instance/ap.html#B)`>): Ior<`[`L`](../-ior-monad-instance/index.html#L)`, `[`B`](../-ior-monad-instance/ap.html#B)`>` |
| [flatMap](../-ior-monad-instance/flat-map.html) | `open fun <A, B> Kind<IorPartialOf<`[`L`](../-ior-monad-instance/index.html#L)`>, `[`A`](../-ior-monad-instance/flat-map.html#A)`>.flatMap(f: (`[`A`](../-ior-monad-instance/flat-map.html#A)`) -> Kind<IorPartialOf<`[`L`](../-ior-monad-instance/index.html#L)`>, `[`B`](../-ior-monad-instance/flat-map.html#B)`>): Ior<`[`L`](../-ior-monad-instance/index.html#L)`, `[`B`](../-ior-monad-instance/flat-map.html#B)`>` |
| [tailRecM](../-ior-monad-instance/tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](../-ior-monad-instance/tail-rec-m.html#A)`, f: (`[`A`](../-ior-monad-instance/tail-rec-m.html#A)`) -> IorOf<`[`L`](../-ior-monad-instance/index.html#L)`, Either<`[`A`](../-ior-monad-instance/tail-rec-m.html#A)`, `[`B`](../-ior-monad-instance/tail-rec-m.html#B)`>>): Ior<`[`L`](../-ior-monad-instance/index.html#L)`, `[`B`](../-ior-monad-instance/tail-rec-m.html#B)`>` |
| [traverse](../-ior-traverse-instance/traverse.html) | `open fun <G, B, C> IorOf<`[`L`](../-ior-traverse-instance/index.html#L)`, `[`B`](../-ior-traverse-instance/traverse.html#B)`>.traverse(AP: Applicative<`[`G`](../-ior-traverse-instance/traverse.html#G)`>, f: (`[`B`](../-ior-traverse-instance/traverse.html#B)`) -> Kind<`[`G`](../-ior-traverse-instance/traverse.html#G)`, `[`C`](../-ior-traverse-instance/traverse.html#C)`>): Kind<`[`G`](../-ior-traverse-instance/traverse.html#G)`, Ior<`[`L`](../-ior-traverse-instance/index.html#L)`, `[`C`](../-ior-traverse-instance/traverse.html#C)`>>` |

