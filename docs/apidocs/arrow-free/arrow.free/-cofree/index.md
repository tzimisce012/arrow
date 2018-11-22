---
title: Cofree - arrow-free
---

[arrow-free](../../index.html) / [arrow.free](../index.html) / [Cofree](./index.html)

# Cofree

`@higherkind data class Cofree<S, A> : `[`CofreeOf`](../-cofree-of.html)`<`[`S`](index.html#S)`, `[`A`](index.html#A)`>, `[`CofreeKindedJ`](../-cofree-kinded-j.html)`<`[`S`](index.html#S)`, `[`A`](index.html#A)`>, Functor<`[`S`](index.html#S)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `Cofree(FS: Functor<`[`S`](index.html#S)`>, head: `[`A`](index.html#A)`, tail: Eval<`[`CofreeEval`](../-cofree-eval.html)`<`[`S`](index.html#S)`, `[`A`](index.html#A)`>>)` |

### Properties

| [FS](-f-s.html) | `val FS: Functor<`[`S`](index.html#S)`>` |
| [head](head.html) | `val head: `[`A`](index.html#A) |
| [tail](tail.html) | `val tail: Eval<`[`CofreeEval`](../-cofree-eval.html)`<`[`S`](index.html#S)`, `[`A`](index.html#A)`>>` |

### Functions

| [cata](cata.html) | `fun <B> cata(folder: (`[`A`](index.html#A)`, Kind<`[`S`](index.html#S)`, `[`B`](cata.html#B)`>) -> Eval<`[`B`](cata.html#B)`>, TF: Traverse<`[`S`](index.html#S)`>): Eval<`[`B`](cata.html#B)`>` |
| [cataM](cata-m.html) | `fun <F, M, A, B> `[`Cofree`](./index.html)`<`[`F`](cata-m.html#F)`, `[`A`](cata-m.html#A)`>.cataM(MM: Monad<`[`M`](cata-m.html#M)`>, TF: Traverse<`[`F`](cata-m.html#F)`>, inclusion: FunctionK<ForEval, `[`M`](cata-m.html#M)`>, folder: (`[`A`](cata-m.html#A)`, Kind<`[`F`](cata-m.html#F)`, `[`B`](cata-m.html#B)`>) -> Kind<`[`M`](cata-m.html#M)`, `[`B`](cata-m.html#B)`>): Kind<`[`M`](cata-m.html#M)`, `[`B`](cata-m.html#B)`>` |
| [coflatMap](coflat-map.html) | `fun <B> coflatMap(f: (`[`Cofree`](./index.html)`<`[`S`](index.html#S)`, `[`A`](index.html#A)`>) -> `[`B`](coflat-map.html#B)`): `[`Cofree`](./index.html)`<`[`S`](index.html#S)`, `[`B`](coflat-map.html#B)`>` |
| [duplicate](duplicate.html) | `fun duplicate(): `[`Cofree`](./index.html)`<`[`S`](index.html#S)`, `[`Cofree`](./index.html)`<`[`S`](index.html#S)`, `[`A`](index.html#A)`>>` |
| [extract](extract.html) | `fun extract(): `[`A`](index.html#A) |
| [map](map.html) | `fun <B> map(f: (`[`A`](index.html#A)`) -> `[`B`](map.html#B)`): `[`Cofree`](./index.html)`<`[`S`](index.html#S)`, `[`B`](map.html#B)`>` |
| [mapBranchingRoot](map-branching-root.html) | `fun mapBranchingRoot(fk: FunctionK<`[`S`](index.html#S)`, `[`S`](index.html#S)`>): `[`Cofree`](./index.html)`<`[`S`](index.html#S)`, `[`A`](index.html#A)`>` |
| [mapBranchingS](map-branching-s.html) | `fun <T> mapBranchingS(fk: FunctionK<`[`S`](index.html#S)`, `[`T`](map-branching-s.html#T)`>, FT: Functor<`[`T`](map-branching-s.html#T)`>): `[`Cofree`](./index.html)`<`[`T`](map-branching-s.html#T)`, `[`A`](index.html#A)`>` |
| [mapBranchingT](map-branching-t.html) | `fun <T> mapBranchingT(fk: FunctionK<`[`S`](index.html#S)`, `[`T`](map-branching-t.html#T)`>, FT: Functor<`[`T`](map-branching-t.html#T)`>): `[`Cofree`](./index.html)`<`[`T`](map-branching-t.html#T)`, `[`A`](index.html#A)`>` |
| [run](run.html) | `fun run(): `[`Cofree`](./index.html)`<`[`S`](index.html#S)`, `[`A`](index.html#A)`>` |
| [runTail](run-tail.html) | `fun runTail(): `[`Cofree`](./index.html)`<`[`S`](index.html#S)`, `[`A`](index.html#A)`>` |
| [tailForced](tail-forced.html) | `fun tailForced(): `[`CofreeEval`](../-cofree-eval.html)`<`[`S`](index.html#S)`, `[`A`](index.html#A)`>` |
| [transform](transform.html) | `fun <B> transform(f: (`[`A`](index.html#A)`) -> `[`B`](transform.html#B)`, g: (`[`Cofree`](./index.html)`<`[`S`](index.html#S)`, `[`A`](index.html#A)`>) -> `[`Cofree`](./index.html)`<`[`S`](index.html#S)`, `[`B`](transform.html#B)`>): `[`Cofree`](./index.html)`<`[`S`](index.html#S)`, `[`B`](transform.html#B)`>` |

### Companion Object Functions

| [create](create.html) | `fun <S, A> create(FS: Functor<`[`S`](create.html#S)`>, a: `[`A`](create.html#A)`, f: (`[`A`](create.html#A)`) -> Kind<`[`S`](create.html#S)`, `[`A`](create.html#A)`>): `[`Cofree`](./index.html)`<`[`S`](create.html#S)`, `[`A`](create.html#A)`>` |
| [unfold](unfold.html) | `fun <S, A> unfold(FS: Functor<`[`S`](unfold.html#S)`>, a: `[`A`](unfold.html#A)`, f: (`[`A`](unfold.html#A)`) -> Kind<`[`S`](unfold.html#S)`, `[`A`](unfold.html#A)`>): `[`Cofree`](./index.html)`<`[`S`](unfold.html#S)`, `[`A`](unfold.html#A)`>` |

### Extension Functions

| [ap](../arrow.-kind/ap.html) | `fun <S, A, B> `[`FreeOf`](../-free-of.html)`<`[`S`](../arrow.-kind/ap.html#S)`, `[`A`](../arrow.-kind/ap.html#A)`>.ap(ff: `[`FreeOf`](../-free-of.html)`<`[`S`](../arrow.-kind/ap.html#S)`, (`[`A`](../arrow.-kind/ap.html#A)`) -> `[`B`](../arrow.-kind/ap.html#B)`>): `[`Free`](../-free/index.html)`<`[`S`](../arrow.-kind/ap.html#S)`, `[`B`](../arrow.-kind/ap.html#B)`>` |
| [flatMap](../arrow.-kind/flat-map.html) | `fun <S, A, B> `[`FreeOf`](../-free-of.html)`<`[`S`](../arrow.-kind/flat-map.html#S)`, `[`A`](../arrow.-kind/flat-map.html#A)`>.flatMap(f: (`[`A`](../arrow.-kind/flat-map.html#A)`) -> `[`Free`](../-free/index.html)`<`[`S`](../arrow.-kind/flat-map.html#S)`, `[`B`](../arrow.-kind/flat-map.html#B)`>): `[`Free`](../-free/index.html)`<`[`S`](../arrow.-kind/flat-map.html#S)`, `[`B`](../arrow.-kind/flat-map.html#B)`>` |
| [foldK](../arrow.-kind/fold-k.html) | `fun <F, A> `[`FreeApplicativeOf`](../-free-applicative-of.html)`<`[`F`](../arrow.-kind/fold-k.html#F)`, `[`A`](../arrow.-kind/fold-k.html#A)`>.foldK(FA: Applicative<`[`F`](../arrow.-kind/fold-k.html#F)`>): Kind<`[`F`](../arrow.-kind/fold-k.html#F)`, `[`A`](../arrow.-kind/fold-k.html#A)`>` |
| [foldMapK](../arrow.-kind/fold-map-k.html) | `fun <M, S, A> `[`FreeOf`](../-free-of.html)`<`[`S`](../arrow.-kind/fold-map-k.html#S)`, `[`A`](../arrow.-kind/fold-map-k.html#A)`>.foldMapK(f: FunctionK<`[`S`](../arrow.-kind/fold-map-k.html#S)`, `[`M`](../arrow.-kind/fold-map-k.html#M)`>, MM: Monad<`[`M`](../arrow.-kind/fold-map-k.html#M)`>): Kind<`[`M`](../arrow.-kind/fold-map-k.html#M)`, `[`A`](../arrow.-kind/fold-map-k.html#A)`>`<br>`fun <F, G, A> `[`FreeApplicativeOf`](../-free-applicative-of.html)`<`[`F`](../arrow.-kind/fold-map-k.html#F)`, `[`A`](../arrow.-kind/fold-map-k.html#A)`>.foldMapK(f: FunctionK<`[`F`](../arrow.-kind/fold-map-k.html#F)`, `[`G`](../arrow.-kind/fold-map-k.html#G)`>, GA: Applicative<`[`G`](../arrow.-kind/fold-map-k.html#G)`>): Kind<`[`G`](../arrow.-kind/fold-map-k.html#G)`, `[`A`](../arrow.-kind/fold-map-k.html#A)`>` |
| [map](../arrow.-kind/map.html) | `fun <S, A, B> `[`FreeOf`](../-free-of.html)`<`[`S`](../arrow.-kind/map.html#S)`, `[`A`](../arrow.-kind/map.html#A)`>.map(f: (`[`A`](../arrow.-kind/map.html#A)`) -> `[`B`](../arrow.-kind/map.html#B)`): `[`Free`](../-free/index.html)`<`[`S`](../arrow.-kind/map.html#S)`, `[`B`](../arrow.-kind/map.html#B)`>` |
| [runK](../arrow.-kind/run-k.html) | `fun <F, A> `[`FreeOf`](../-free-of.html)`<`[`F`](../arrow.-kind/run-k.html#F)`, `[`A`](../arrow.-kind/run-k.html#A)`>.runK(M: Monad<`[`F`](../arrow.-kind/run-k.html#F)`>): Kind<`[`F`](../arrow.-kind/run-k.html#F)`, `[`A`](../arrow.-kind/run-k.html#A)`>` |

