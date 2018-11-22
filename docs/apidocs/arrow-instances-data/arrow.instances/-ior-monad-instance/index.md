---
title: IorMonadInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [IorMonadInstance](./index.html)

# IorMonadInstance

`@extension interface IorMonadInstance<L> : Monad<IorPartialOf<`[`L`](index.html#L)`>>, `[`IorApplicativeInstance`](../-ior-applicative-instance/index.html)`<`[`L`](index.html#L)`>`

### Functions

| [SL](-s-l.html) | `abstract fun SL(): Semigroup<`[`L`](index.html#L)`>` |
| [ap](ap.html) | `open fun <A, B> Kind<IorPartialOf<`[`L`](index.html#L)`>, `[`A`](ap.html#A)`>.ap(ff: Kind<IorPartialOf<`[`L`](index.html#L)`>, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): Ior<`[`L`](index.html#L)`, `[`B`](ap.html#B)`>` |
| [flatMap](flat-map.html) | `open fun <A, B> Kind<IorPartialOf<`[`L`](index.html#L)`>, `[`A`](flat-map.html#A)`>.flatMap(f: (`[`A`](flat-map.html#A)`) -> Kind<IorPartialOf<`[`L`](index.html#L)`>, `[`B`](flat-map.html#B)`>): Ior<`[`L`](index.html#L)`, `[`B`](flat-map.html#B)`>` |
| [map](map.html) | `open fun <A, B> Kind<IorPartialOf<`[`L`](index.html#L)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Ior<`[`L`](index.html#L)`, `[`B`](map.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> IorOf<`[`L`](index.html#L)`, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): Ior<`[`L`](index.html#L)`, `[`B`](tail-rec-m.html#B)`>` |

### Inheritors

| [IorContext](../-ior-context/index.html) | `class IorContext<L> : `[`IorMonadInstance`](./index.html)`<`[`L`](../-ior-context/index.html#L)`>, `[`IorTraverseInstance`](../-ior-traverse-instance/index.html)`<`[`L`](../-ior-context/index.html#L)`>` |

