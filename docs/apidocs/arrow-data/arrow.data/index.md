---
title: arrow.data - arrow-data
---

[arrow-data](../index.html) / [arrow.data](./index.html)

## Package arrow.data

### Types

| [Cokleisli](-cokleisli/index.html) | `data class Cokleisli<F, A, B> : `[`CokleisliOf`](-cokleisli-of.html)`<`[`F`](-cokleisli/index.html#F)`, `[`A`](-cokleisli/index.html#A)`, `[`B`](-cokleisli/index.html#B)`>, `[`CokleisliKindedJ`](-cokleisli-kinded-j.html)`<`[`F`](-cokleisli/index.html#F)`, `[`A`](-cokleisli/index.html#A)`, `[`B`](-cokleisli/index.html#B)`>, Comonad<`[`F`](-cokleisli/index.html#F)`>` |
| [Coproduct](-coproduct/index.html) | `data class Coproduct<F, G, A> : `[`CoproductOf`](-coproduct-of.html)`<`[`F`](-coproduct/index.html#F)`, `[`G`](-coproduct/index.html#G)`, `[`A`](-coproduct/index.html#A)`>, `[`CoproductKindedJ`](-coproduct-kinded-j.html)`<`[`F`](-coproduct/index.html#F)`, `[`G`](-coproduct/index.html#G)`, `[`A`](-coproduct/index.html#A)`>` |
| [Coreader](-coreader/index.html) | `object Coreader` |
| [Day](-day/index.html) | `abstract class Day<F, G, A> : `[`DayOf`](-day-of.html)`<`[`F`](-day/index.html#F)`, `[`G`](-day/index.html#G)`, `[`A`](-day/index.html#A)`>, `[`DayKindedJ`](-day-kinded-j.html)`<`[`F`](-day/index.html#F)`, `[`G`](-day/index.html#G)`, `[`A`](-day/index.html#A)`>` |
| [EitherT](-either-t/index.html) | `data class EitherT<F, A, B> : `[`EitherTOf`](-either-t-of.html)`<`[`F`](-either-t/index.html#F)`, `[`A`](-either-t/index.html#A)`, `[`B`](-either-t/index.html#B)`>, `[`EitherTKindedJ`](-either-t-kinded-j.html)`<`[`F`](-either-t/index.html#F)`, `[`A`](-either-t/index.html#A)`, `[`B`](-either-t/index.html#B)`>`<br>[EitherT](-either-t/index.html)`<F, A, B>` is a light wrapper on an `F<`[Either](#)`<A, B>>` with some convenient methods for working with this nested structure. |
| [ForCokleisli](-for-cokleisli.html) | `class ForCokleisli` |
| [ForCoproduct](-for-coproduct.html) | `class ForCoproduct` |
| [ForDay](-for-day.html) | `class ForDay` |
| [ForEitherT](-for-either-t.html) | `class ForEitherT` |
| [ForIor](-for-ior.html) | `class ForIor` |
| [ForKleisli](-for-kleisli.html) | `class ForKleisli` |
| [ForListK](-for-list-k.html) | `class ForListK` |
| [ForMapK](-for-map-k.html) | `class ForMapK` |
| [ForMoore](-for-moore.html) | `class ForMoore` |
| [ForNonEmptyList](-for-non-empty-list.html) | `class ForNonEmptyList` |
| [ForOptionT](-for-option-t.html) | `class ForOptionT` |
| [ForSequenceK](-for-sequence-k.html) | `class ForSequenceK` |
| [ForSetK](-for-set-k.html) | `class ForSetK` |
| [ForSortedMapK](-for-sorted-map-k.html) | `class ForSortedMapK` |
| [ForStateT](-for-state-t.html) | `class ForStateT` |
| [ForStore](-for-store.html) | `class ForStore` |
| [ForSum](-for-sum.html) | `class ForSum` |
| [ForValidated](-for-validated.html) | `class ForValidated` |
| [ForWriterT](-for-writer-t.html) | `class ForWriterT` |
| [Ior](-ior/index.html) | `sealed class Ior<out A, out B> : `[`IorOf`](-ior-of.html)`<`[`A`](-ior/index.html#A)`, `[`B`](-ior/index.html#B)`>`<br>Port of https://github.com/typelevel/cats/blob/v0.9.0/core/src/main/scala/cats/data/Ior.scala |
| [Kleisli](-kleisli/index.html) | `class Kleisli<F, D, A> : `[`KleisliOf`](-kleisli-of.html)`<`[`F`](-kleisli/index.html#F)`, `[`D`](-kleisli/index.html#D)`, `[`A`](-kleisli/index.html#A)`>, `[`KleisliKindedJ`](-kleisli-kinded-j.html)`<`[`F`](-kleisli/index.html#F)`, `[`D`](-kleisli/index.html#D)`, `[`A`](-kleisli/index.html#A)`>`<br>[Kleisli](-kleisli/index.html) represents an arrow from [D](-kleisli/index.html#D) to a monadic value `Kind<F, A>`. |
| [ListK](-list-k/index.html) | `data class ListK<out A> : `[`ListKOf`](-list-k-of.html)`<`[`A`](-list-k/index.html#A)`>, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`A`](-list-k/index.html#A)`>`<br>A wrapper data type also considered by the @extension mechanisms to forward type class instance methods into both the wrapper and the wrapped data type. Ex. List#foldMap(M: Monoid) |
| [MapK](-map-k/index.html) | `data class MapK<K, out A> : `[`MapKOf`](-map-k-of.html)`<`[`K`](-map-k/index.html#K)`, `[`A`](-map-k/index.html#A)`>, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`K`](-map-k/index.html#K)`, `[`A`](-map-k/index.html#A)`>` |
| [Moore](-moore/index.html) | `data class Moore<E, V> : `[`MooreOf`](-moore-of.html)`<`[`E`](-moore/index.html#E)`, `[`V`](-moore/index.html#V)`>, `[`MooreKindedJ`](-moore-kinded-j.html)`<`[`E`](-moore/index.html#E)`, `[`V`](-moore/index.html#V)`>` |
| [NonEmptyList](-non-empty-list/index.html) | `class NonEmptyList<out A> : `[`NonEmptyListOf`](-non-empty-list-of.html)`<`[`A`](-non-empty-list/index.html#A)`>`<br>A List that can not be empty |
| [OptionT](-option-t/index.html) | `data class OptionT<F, A> : `[`OptionTOf`](-option-t-of.html)`<`[`F`](-option-t/index.html#F)`, `[`A`](-option-t/index.html#A)`>, `[`OptionTKindedJ`](-option-t-kinded-j.html)`<`[`F`](-option-t/index.html#F)`, `[`A`](-option-t/index.html#A)`>`<br>[OptionT](-option-t/index.html)`<F, A>` is a light wrapper on an `F<`[Option](#)`<A>>` with some convenient methods for working with this nested structure. |
| [ReaderApi](-reader-api/index.html) | `object ReaderApi` |
| [SequenceK](-sequence-k/index.html) | `data class SequenceK<out A> : `[`SequenceKOf`](-sequence-k-of.html)`<`[`A`](-sequence-k/index.html#A)`>, `[`Sequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.sequences/-sequence/index.html)`<`[`A`](-sequence-k/index.html#A)`>` |
| [SetK](-set-k/index.html) | `data class SetK<out A> : `[`SetKOf`](-set-k-of.html)`<`[`A`](-set-k/index.html#A)`>, `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`A`](-set-k/index.html#A)`>` |
| [SortedMapK](-sorted-map-k/index.html) | `data class SortedMapK<A : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`A`](-sorted-map-k/index.html#A)`>, B> : `[`SortedMapKOf`](-sorted-map-k-of.html)`<`[`A`](-sorted-map-k/index.html#A)`, `[`B`](-sorted-map-k/index.html#B)`>, `[`SortedMapKKindedJ`](-sorted-map-k-kinded-j.html)`<`[`A`](-sorted-map-k/index.html#A)`, `[`B`](-sorted-map-k/index.html#B)`>, `[`SortedMap`](-sorted-map.html)`<`[`A`](-sorted-map-k/index.html#A)`, `[`B`](-sorted-map-k/index.html#B)`>` |
| [StateApi](-state-api/index.html) | `object StateApi` |
| [StateT](-state-t/index.html) | `class StateT<F, S, A> : `[`StateTOf`](-state-t-of.html)`<`[`F`](-state-t/index.html#F)`, `[`S`](-state-t/index.html#S)`, `[`A`](-state-t/index.html#A)`>, `[`StateTKindedJ`](-state-t-kinded-j.html)`<`[`F`](-state-t/index.html#F)`, `[`S`](-state-t/index.html#S)`, `[`A`](-state-t/index.html#A)`>`<br>`StateT<F, S, A>` is a stateful computation within a context `F` yielding a value of type `A`. i.e. StateT&lt;EitherPartialOf, S, A&gt; = Either&lt;E, State&lt;S, A&gt;&gt; |
| [Store](-store/index.html) | `data class Store<S, V> : `[`StoreOf`](-store-of.html)`<`[`S`](-store/index.html#S)`, `[`V`](-store/index.html#V)`>, `[`StoreKindedJ`](-store-kinded-j.html)`<`[`S`](-store/index.html#S)`, `[`V`](-store/index.html#V)`>` |
| [Sum](-sum/index.html) | `data class Sum<F, G, V> : `[`SumOf`](-sum-of.html)`<`[`F`](-sum/index.html#F)`, `[`G`](-sum/index.html#G)`, `[`V`](-sum/index.html#V)`>, `[`SumKindedJ`](-sum-kinded-j.html)`<`[`F`](-sum/index.html#F)`, `[`G`](-sum/index.html#G)`, `[`V`](-sum/index.html#V)`>` |
| [Validated](-validated/index.html) | `sealed class Validated<out E, out A> : `[`ValidatedOf`](-validated-of.html)`<`[`E`](-validated/index.html#E)`, `[`A`](-validated/index.html#A)`>`<br>Port of https://github.com/typelevel/cats/blob/master/core/src/main/scala/cats/data/Validated.scala |
| [WriterT](-writer-t/index.html) | `data class WriterT<F, W, A> : `[`WriterTOf`](-writer-t-of.html)`<`[`F`](-writer-t/index.html#F)`, `[`W`](-writer-t/index.html#W)`, `[`A`](-writer-t/index.html#A)`>, `[`WriterTKindedJ`](-writer-t-kinded-j.html)`<`[`F`](-writer-t/index.html#F)`, `[`W`](-writer-t/index.html#W)`, `[`A`](-writer-t/index.html#A)`>` |

### Type Aliases

| [CokleisliFun](-cokleisli-fun.html) | `typealias CokleisliFun<F, A, B> = (Kind<`[`F`](-cokleisli-fun.html#F)`, `[`A`](-cokleisli-fun.html#A)`>) -> `[`B`](-cokleisli-fun.html#B) |
| [CokleisliKindedJ](-cokleisli-kinded-j.html) | `typealias CokleisliKindedJ<F, A, B> = HkJ3<`[`ForCokleisli`](-for-cokleisli.html)`, `[`F`](-cokleisli-kinded-j.html#F)`, `[`A`](-cokleisli-kinded-j.html#A)`, `[`B`](-cokleisli-kinded-j.html#B)`>` |
| [CokleisliOf](-cokleisli-of.html) | `typealias CokleisliOf<F, A, B> = Kind3<`[`ForCokleisli`](-for-cokleisli.html)`, `[`F`](-cokleisli-of.html#F)`, `[`A`](-cokleisli-of.html#A)`, `[`B`](-cokleisli-of.html#B)`>` |
| [CokleisliPartialOf](-cokleisli-partial-of.html) | `typealias CokleisliPartialOf<F, A> = Kind2<`[`ForCokleisli`](-for-cokleisli.html)`, `[`F`](-cokleisli-partial-of.html#F)`, `[`A`](-cokleisli-partial-of.html#A)`>` |
| [CoproductKindedJ](-coproduct-kinded-j.html) | `typealias CoproductKindedJ<F, G, A> = HkJ3<`[`ForCoproduct`](-for-coproduct.html)`, `[`F`](-coproduct-kinded-j.html#F)`, `[`G`](-coproduct-kinded-j.html#G)`, `[`A`](-coproduct-kinded-j.html#A)`>` |
| [CoproductOf](-coproduct-of.html) | `typealias CoproductOf<F, G, A> = Kind3<`[`ForCoproduct`](-for-coproduct.html)`, `[`F`](-coproduct-of.html#F)`, `[`G`](-coproduct-of.html#G)`, `[`A`](-coproduct-of.html#A)`>` |
| [CoproductPartialOf](-coproduct-partial-of.html) | `typealias CoproductPartialOf<F, G> = Kind2<`[`ForCoproduct`](-for-coproduct.html)`, `[`F`](-coproduct-partial-of.html#F)`, `[`G`](-coproduct-partial-of.html#G)`>` |
| [CoreaderT](-coreader-t.html) | `typealias CoreaderT<F, A, B> = `[`Cokleisli`](-cokleisli/index.html)`<`[`F`](-coreader-t.html#F)`, `[`A`](-coreader-t.html#A)`, `[`B`](-coreader-t.html#B)`>` |
| [DayKindedJ](-day-kinded-j.html) | `typealias DayKindedJ<F, G, A> = HkJ3<`[`ForDay`](-for-day.html)`, `[`F`](-day-kinded-j.html#F)`, `[`G`](-day-kinded-j.html#G)`, `[`A`](-day-kinded-j.html#A)`>` |
| [DayOf](-day-of.html) | `typealias DayOf<F, G, A> = Kind3<`[`ForDay`](-for-day.html)`, `[`F`](-day-of.html#F)`, `[`G`](-day-of.html#G)`, `[`A`](-day-of.html#A)`>` |
| [DayPartialOf](-day-partial-of.html) | `typealias DayPartialOf<F, G> = Kind2<`[`ForDay`](-for-day.html)`, `[`F`](-day-partial-of.html#F)`, `[`G`](-day-partial-of.html#G)`>` |
| [EitherTKindedJ](-either-t-kinded-j.html) | `typealias EitherTKindedJ<F, A, B> = HkJ3<`[`ForEitherT`](-for-either-t.html)`, `[`F`](-either-t-kinded-j.html#F)`, `[`A`](-either-t-kinded-j.html#A)`, `[`B`](-either-t-kinded-j.html#B)`>` |
| [EitherTOf](-either-t-of.html) | `typealias EitherTOf<F, A, B> = Kind3<`[`ForEitherT`](-for-either-t.html)`, `[`F`](-either-t-of.html#F)`, `[`A`](-either-t-of.html#A)`, `[`B`](-either-t-of.html#B)`>` |
| [EitherTPartialOf](-either-t-partial-of.html) | `typealias EitherTPartialOf<F, A> = Kind2<`[`ForEitherT`](-for-either-t.html)`, `[`F`](-either-t-partial-of.html#F)`, `[`A`](-either-t-partial-of.html#A)`>` |
| [ForReader](-for-reader.html) | `typealias ForReader = `[`ForReaderT`](-for-reader-t.html)<br>Alias ReaderHK for [ReaderTHK](#) |
| [ForReaderT](-for-reader-t.html) | `typealias ForReaderT = `[`ForKleisli`](-for-kleisli.html)<br>Alias ReaderTHK for [KleisliHK](#) |
| [ForState](-for-state.html) | `typealias ForState = `[`ForStateT`](-for-state-t.html)<br>Alias for StateHK |
| [Invalid](-invalid.html) | `typealias Invalid<E> = `[`Invalid`](-validated/-invalid/index.html)`<`[`E`](-invalid.html#E)`>` |
| [IorNel](-ior-nel.html) | `typealias IorNel<A, B> = `[`Ior`](-ior/index.html)`<`[`Nel`](-nel.html)`<`[`A`](-ior-nel.html#A)`>, `[`B`](-ior-nel.html#B)`>` |
| [IorOf](-ior-of.html) | `typealias IorOf<A, B> = Kind2<`[`ForIor`](-for-ior.html)`, `[`A`](-ior-of.html#A)`, `[`B`](-ior-of.html#B)`>` |
| [IorPartialOf](-ior-partial-of.html) | `typealias IorPartialOf<A> = Kind<`[`ForIor`](-for-ior.html)`, `[`A`](-ior-partial-of.html#A)`>` |
| [KleisliFun](-kleisli-fun.html) | `typealias KleisliFun<F, D, A> = (`[`D`](-kleisli-fun.html#D)`) -> Kind<`[`F`](-kleisli-fun.html#F)`, `[`A`](-kleisli-fun.html#A)`>`<br>Alias that represents an arrow from [D](#) to a monadic value `Kind<F, A>` |
| [KleisliKindedJ](-kleisli-kinded-j.html) | `typealias KleisliKindedJ<F, D, A> = HkJ3<`[`ForKleisli`](-for-kleisli.html)`, `[`F`](-kleisli-kinded-j.html#F)`, `[`D`](-kleisli-kinded-j.html#D)`, `[`A`](-kleisli-kinded-j.html#A)`>` |
| [KleisliOf](-kleisli-of.html) | `typealias KleisliOf<F, D, A> = Kind3<`[`ForKleisli`](-for-kleisli.html)`, `[`F`](-kleisli-of.html#F)`, `[`D`](-kleisli-of.html#D)`, `[`A`](-kleisli-of.html#A)`>` |
| [KleisliPartialOf](-kleisli-partial-of.html) | `typealias KleisliPartialOf<F, D> = Kind2<`[`ForKleisli`](-for-kleisli.html)`, `[`F`](-kleisli-partial-of.html#F)`, `[`D`](-kleisli-partial-of.html#D)`>` |
| [ListKOf](-list-k-of.html) | `typealias ListKOf<A> = Kind<`[`ForListK`](-for-list-k.html)`, `[`A`](-list-k-of.html#A)`>` |
| [MapKOf](-map-k-of.html) | `typealias MapKOf<K, A> = Kind2<`[`ForMapK`](-for-map-k.html)`, `[`K`](-map-k-of.html#K)`, `[`A`](-map-k-of.html#A)`>` |
| [MapKPartialOf](-map-k-partial-of.html) | `typealias MapKPartialOf<K> = Kind<`[`ForMapK`](-for-map-k.html)`, `[`K`](-map-k-partial-of.html#K)`>` |
| [MooreKindedJ](-moore-kinded-j.html) | `typealias MooreKindedJ<E, V> = HkJ2<`[`ForMoore`](-for-moore.html)`, `[`E`](-moore-kinded-j.html#E)`, `[`V`](-moore-kinded-j.html#V)`>` |
| [MooreOf](-moore-of.html) | `typealias MooreOf<E, V> = Kind2<`[`ForMoore`](-for-moore.html)`, `[`E`](-moore-of.html#E)`, `[`V`](-moore-of.html#V)`>` |
| [MoorePartialOf](-moore-partial-of.html) | `typealias MoorePartialOf<E> = Kind<`[`ForMoore`](-for-moore.html)`, `[`E`](-moore-partial-of.html#E)`>` |
| [Nel](-nel.html) | `typealias Nel<A> = `[`NonEmptyList`](-non-empty-list/index.html)`<`[`A`](-nel.html#A)`>` |
| [NonEmptyListOf](-non-empty-list-of.html) | `typealias NonEmptyListOf<A> = Kind<`[`ForNonEmptyList`](-for-non-empty-list.html)`, `[`A`](-non-empty-list-of.html#A)`>` |
| [OptionTKindedJ](-option-t-kinded-j.html) | `typealias OptionTKindedJ<F, A> = HkJ2<`[`ForOptionT`](-for-option-t.html)`, `[`F`](-option-t-kinded-j.html#F)`, `[`A`](-option-t-kinded-j.html#A)`>` |
| [OptionTOf](-option-t-of.html) | `typealias OptionTOf<F, A> = Kind2<`[`ForOptionT`](-for-option-t.html)`, `[`F`](-option-t-of.html#F)`, `[`A`](-option-t-of.html#A)`>` |
| [OptionTPartialOf](-option-t-partial-of.html) | `typealias OptionTPartialOf<F> = Kind<`[`ForOptionT`](-for-option-t.html)`, `[`F`](-option-t-partial-of.html#F)`>` |
| [Reader](-reader.html) | `typealias Reader<D, A> = `[`ReaderT`](-reader-t.html)`<ForId, `[`D`](-reader.html#D)`, `[`A`](-reader.html#A)`>`<br>[Reader](-reader.html) represents a computation that has a dependency on [D](#). `Reader<D, A>` is an alias for `ReaderT<ForId, D, A>` and `Kleisli<ForId, D, A>`. |
| [ReaderFun](-reader-fun.html) | `typealias ReaderFun<D, A> = (`[`D`](-reader-fun.html#D)`) -> `[`A`](-reader-fun.html#A)<br>Alias that represents a computation that has a dependency on [D](#). |
| [ReaderOf](-reader-of.html) | `typealias ReaderOf<D, A> = `[`ReaderTOf`](-reader-t-of.html)`<ForId, `[`D`](-reader-of.html#D)`, `[`A`](-reader-of.html#A)`>`<br>Alias ReaderKind for [ReaderTKind](#) |
| [ReaderPartialOf](-reader-partial-of.html) | `typealias ReaderPartialOf<D> = `[`ReaderTPartialOf`](-reader-t-partial-of.html)`<ForId, `[`D`](-reader-partial-of.html#D)`>`<br>Alias to partially apply type parameter [D](#) to [Reader](-reader.html). |
| [ReaderT](-reader-t.html) | `typealias ReaderT<F, D, A> = `[`Kleisli`](-kleisli/index.html)`<`[`F`](-reader-t.html#F)`, `[`D`](-reader-t.html#D)`, `[`A`](-reader-t.html#A)`>`<br>[Reader](-reader.html) represents a computation that has a dependency on [D](#) with a result within context [F](#). `ReaderT<F, D, A>` is the monad transfomer variant of [Reader](-reader.html) and an alias for `Kleisli<F, D, A>`. |
| [ReaderTFun](-reader-t-fun.html) | `typealias ReaderTFun<F, D, A> = `[`KleisliFun`](-kleisli-fun.html)`<`[`F`](-reader-t-fun.html#F)`, `[`D`](-reader-t-fun.html#D)`, `[`A`](-reader-t-fun.html#A)`>`<br>Alias that represents a computation that has a dependency on [D](#). |
| [ReaderTOf](-reader-t-of.html) | `typealias ReaderTOf<F, D, A> = `[`KleisliOf`](-kleisli-of.html)`<`[`F`](-reader-t-of.html#F)`, `[`D`](-reader-t-of.html#D)`, `[`A`](-reader-t-of.html#A)`>`<br>Alias ReaderTKind for [KleisliKind](#) |
| [ReaderTPartialOf](-reader-t-partial-of.html) | `typealias ReaderTPartialOf<F, D> = `[`KleisliPartialOf`](-kleisli-partial-of.html)`<`[`F`](-reader-t-partial-of.html#F)`, `[`D`](-reader-t-partial-of.html#D)`>`<br>Alias to partially apply type parameter [F](#) and [D](#) to [ReaderT](-reader-t.html). |
| [SequenceKOf](-sequence-k-of.html) | `typealias SequenceKOf<A> = Kind<`[`ForSequenceK`](-for-sequence-k.html)`, `[`A`](-sequence-k-of.html#A)`>` |
| [SetKOf](-set-k-of.html) | `typealias SetKOf<A> = Kind<`[`ForSetK`](-for-set-k.html)`, `[`A`](-set-k-of.html#A)`>` |
| [SortedMap](-sorted-map.html) | `typealias SortedMap<K, V> = `[`SortedMap`](http://docs.oracle.com/javase/6/docs/api/java/util/SortedMap.html)`<`[`K`](-sorted-map.html#K)`, `[`V`](-sorted-map.html#V)`>` |
| [SortedMapKKindedJ](-sorted-map-k-kinded-j.html) | `typealias SortedMapKKindedJ<A, B> = HkJ2<`[`ForSortedMapK`](-for-sorted-map-k.html)`, `[`A`](-sorted-map-k-kinded-j.html#A)`, `[`B`](-sorted-map-k-kinded-j.html#B)`>` |
| [SortedMapKOf](-sorted-map-k-of.html) | `typealias SortedMapKOf<A, B> = Kind2<`[`ForSortedMapK`](-for-sorted-map-k.html)`, `[`A`](-sorted-map-k-of.html#A)`, `[`B`](-sorted-map-k-of.html#B)`>` |
| [SortedMapKPartialOf](-sorted-map-k-partial-of.html) | `typealias SortedMapKPartialOf<A> = Kind<`[`ForSortedMapK`](-for-sorted-map-k.html)`, `[`A`](-sorted-map-k-partial-of.html#A)`>` |
| [State](-state.html) | `typealias State<S, A> = `[`StateT`](-state-t/index.html)`<ForId, `[`S`](-state.html#S)`, `[`A`](-state.html#A)`>`<br>`State<S, A>` is a stateful computation that yields a value of type `A`. |
| [StateFun](-state-fun.html) | `typealias StateFun<S, A> = `[`StateTFun`](-state-t-fun.html)`<ForId, `[`S`](-state-fun.html#S)`, `[`A`](-state-fun.html#A)`>`<br>Alias that represents stateful computation of the form `(S) -> Tuple2<S, A>`. |
| [StateFunOf](-state-fun-of.html) | `typealias StateFunOf<S, A> = `[`StateTFunOf`](-state-t-fun-of.html)`<ForId, `[`S`](-state-fun-of.html#S)`, `[`A`](-state-fun-of.html#A)`>`<br>Alias that represents wrapped stateful computation in context `Id`. |
| [StateOf](-state-of.html) | `typealias StateOf<S, A> = `[`StateTOf`](-state-t-of.html)`<ForId, `[`S`](-state-of.html#S)`, `[`A`](-state-of.html#A)`>`<br>Alias for StateKind |
| [StatePartialOf](-state-partial-of.html) | `typealias StatePartialOf<S> = `[`StateTPartialOf`](-state-t-partial-of.html)`<ForId, `[`S`](-state-partial-of.html#S)`>`<br>Alias to partially apply type parameters [S](#) to [State](-state.html) |
| [StateTFun](-state-t-fun.html) | `typealias StateTFun<F, S, A> = (`[`S`](-state-t-fun.html#S)`) -> Kind<`[`F`](-state-t-fun.html#F)`, Tuple2<`[`S`](-state-t-fun.html#S)`, `[`A`](-state-t-fun.html#A)`>>`<br>Alias that represent stateful computation of the form `(S) -> Tuple2<S, A>` with a result in certain context `F`. |
| [StateTFunOf](-state-t-fun-of.html) | `typealias StateTFunOf<F, S, A> = Kind<`[`F`](-state-t-fun-of.html#F)`, `[`StateTFun`](-state-t-fun.html)`<`[`F`](-state-t-fun-of.html#F)`, `[`S`](-state-t-fun-of.html#S)`, `[`A`](-state-t-fun-of.html#A)`>>`<br>Alias that represents wrapped stateful computation in context `F`. |
| [StateTKindedJ](-state-t-kinded-j.html) | `typealias StateTKindedJ<F, S, A> = HkJ3<`[`ForStateT`](-for-state-t.html)`, `[`F`](-state-t-kinded-j.html#F)`, `[`S`](-state-t-kinded-j.html#S)`, `[`A`](-state-t-kinded-j.html#A)`>` |
| [StateTOf](-state-t-of.html) | `typealias StateTOf<F, S, A> = Kind3<`[`ForStateT`](-for-state-t.html)`, `[`F`](-state-t-of.html#F)`, `[`S`](-state-t-of.html#S)`, `[`A`](-state-t-of.html#A)`>` |
| [StateTPartialOf](-state-t-partial-of.html) | `typealias StateTPartialOf<F, S> = Kind2<`[`ForStateT`](-for-state-t.html)`, `[`F`](-state-t-partial-of.html#F)`, `[`S`](-state-t-partial-of.html#S)`>` |
| [StoreKindedJ](-store-kinded-j.html) | `typealias StoreKindedJ<S, V> = HkJ2<`[`ForStore`](-for-store.html)`, `[`S`](-store-kinded-j.html#S)`, `[`V`](-store-kinded-j.html#V)`>` |
| [StoreOf](-store-of.html) | `typealias StoreOf<S, V> = Kind2<`[`ForStore`](-for-store.html)`, `[`S`](-store-of.html#S)`, `[`V`](-store-of.html#V)`>` |
| [StorePartialOf](-store-partial-of.html) | `typealias StorePartialOf<S> = Kind<`[`ForStore`](-for-store.html)`, `[`S`](-store-partial-of.html#S)`>` |
| [SumKindedJ](-sum-kinded-j.html) | `typealias SumKindedJ<F, G, V> = HkJ3<`[`ForSum`](-for-sum.html)`, `[`F`](-sum-kinded-j.html#F)`, `[`G`](-sum-kinded-j.html#G)`, `[`V`](-sum-kinded-j.html#V)`>` |
| [SumOf](-sum-of.html) | `typealias SumOf<F, G, V> = Kind3<`[`ForSum`](-for-sum.html)`, `[`F`](-sum-of.html#F)`, `[`G`](-sum-of.html#G)`, `[`V`](-sum-of.html#V)`>` |
| [SumPartialOf](-sum-partial-of.html) | `typealias SumPartialOf<F, G> = Kind2<`[`ForSum`](-for-sum.html)`, `[`F`](-sum-partial-of.html#F)`, `[`G`](-sum-partial-of.html#G)`>` |
| [Valid](-valid.html) | `typealias Valid<A> = `[`Valid`](-validated/-valid/index.html)`<`[`A`](-valid.html#A)`>` |
| [ValidatedNel](-validated-nel.html) | `typealias ValidatedNel<E, A> = `[`Validated`](-validated/index.html)`<`[`Nel`](-nel.html)`<`[`E`](-validated-nel.html#E)`>, `[`A`](-validated-nel.html#A)`>` |
| [ValidatedOf](-validated-of.html) | `typealias ValidatedOf<E, A> = Kind2<`[`ForValidated`](-for-validated.html)`, `[`E`](-validated-of.html#E)`, `[`A`](-validated-of.html#A)`>` |
| [ValidatedPartialOf](-validated-partial-of.html) | `typealias ValidatedPartialOf<E> = Kind<`[`ForValidated`](-for-validated.html)`, `[`E`](-validated-partial-of.html#E)`>` |
| [WriterTKindedJ](-writer-t-kinded-j.html) | `typealias WriterTKindedJ<F, W, A> = HkJ3<`[`ForWriterT`](-for-writer-t.html)`, `[`F`](-writer-t-kinded-j.html#F)`, `[`W`](-writer-t-kinded-j.html#W)`, `[`A`](-writer-t-kinded-j.html#A)`>` |
| [WriterTOf](-writer-t-of.html) | `typealias WriterTOf<F, W, A> = Kind3<`[`ForWriterT`](-for-writer-t.html)`, `[`F`](-writer-t-of.html#F)`, `[`W`](-writer-t-of.html#W)`, `[`A`](-writer-t-of.html#A)`>` |
| [WriterTPartialOf](-writer-t-partial-of.html) | `typealias WriterTPartialOf<F, W> = Kind2<`[`ForWriterT`](-for-writer-t.html)`, `[`F`](-writer-t-partial-of.html#F)`, `[`W`](-writer-t-partial-of.html#W)`>` |

### Extensions for External Classes

| [arrow.Kind](arrow.-kind/index.html) |  |
| [arrow.core.FunctionK](arrow.core.-function-k/index.html) |  |
| [arrow.core.Option](arrow.core.-option/index.html) |  |
| [arrow.core.Tuple2](arrow.core.-tuple2/index.html) |  |
| [java.util.SortedMap](java.util.-sorted-map/index.html) |  |
| [kotlin.Function1](kotlin.-function1/index.html) |  |
| [kotlin.Pair](kotlin.-pair/index.html) |  |
| [kotlin.collections.Iterator](kotlin.collections.-iterator/index.html) |  |
| [kotlin.collections.List](kotlin.collections.-list/index.html) |  |
| [kotlin.collections.Map](kotlin.collections.-map/index.html) |  |
| [kotlin.collections.Set](kotlin.collections.-set/index.html) |  |
| [kotlin.sequences.Sequence](kotlin.sequences.-sequence/index.html) |  |

### Functions

| [Reader](-reader.html) | `fun <D, A> Reader(run: `[`ReaderFun`](-reader-fun.html)`<`[`D`](-reader.html#D)`, `[`A`](-reader.html#A)`>): `[`Reader`](-reader.html)`<`[`D`](-reader.html#D)`, `[`A`](-reader.html#A)`>`<br>Constructor for [Reader](-reader.html).`fun Reader(): `[`ReaderApi`](-reader-api/index.html) |
| [State](-state.html) | `fun <S, A> State(run: (`[`S`](-state.html#S)`) -> Tuple2<`[`S`](-state.html#S)`, `[`A`](-state.html#A)`>): `[`State`](-state.html)`<`[`S`](-state.html#S)`, `[`A`](-state.html#A)`>`<br>Constructor for State. State&lt;S, A&gt; is an alias for IndexedStateT&lt;ForId, S, S, A&gt;`fun State(): `[`StateApi`](-state-api/index.html)<br>Alias for StateId to make working with `StateT<ForId, S, A>` more elegant. |
| [andThen](and-then.html) | `fun <D, A, C> `[`Reader`](-reader.html)`<`[`D`](and-then.html#D)`, `[`A`](and-then.html#A)`>.andThen(o: `[`Reader`](-reader.html)`<`[`A`](and-then.html#A)`, `[`C`](and-then.html#C)`>): `[`Reader`](-reader.html)`<`[`D`](and-then.html#D)`, `[`C`](and-then.html#C)`>`<br>Compose with another [Reader](-reader.html) that has a dependency on the output of the computation.`fun <D, A, B> `[`Reader`](-reader.html)`<`[`D`](and-then.html#D)`, `[`A`](and-then.html#A)`>.andThen(f: (`[`A`](and-then.html#A)`) -> `[`B`](and-then.html#B)`): `[`Reader`](-reader.html)`<`[`D`](and-then.html#D)`, `[`B`](and-then.html#B)`>`<br>Map the result of the computation [A](and-then.html#A) to [B](and-then.html#B) given a function [f](and-then.html#arrow.data$andThen(arrow.data.Kleisli((arrow.core.ForId, arrow.data.andThen.D, arrow.data.andThen.A)), kotlin.Function1((arrow.data.andThen.A, arrow.data.andThen.B)))/f). Alias for [map](map.html)`fun <D, A, B> `[`Reader`](-reader.html)`<`[`D`](and-then.html#D)`, `[`A`](and-then.html#A)`>.andThen(b: `[`B`](and-then.html#B)`): `[`Reader`](-reader.html)`<`[`D`](and-then.html#D)`, `[`B`](and-then.html#B)`>`<br>Set the result to [B](and-then.html#B) after running the computation. |
| [ap](ap.html) | `fun <A, B, D> `[`Ior`](-ior/index.html)`<`[`A`](ap.html#A)`, `[`B`](ap.html#B)`>.ap(SG: Semigroup<`[`A`](ap.html#A)`>, ff: `[`IorOf`](-ior-of.html)`<`[`A`](ap.html#A)`, (`[`B`](ap.html#B)`) -> `[`D`](ap.html#D)`>): `[`Ior`](-ior/index.html)`<`[`A`](ap.html#A)`, `[`D`](ap.html#D)`>``fun <D, A, B> `[`Reader`](-reader.html)`<`[`D`](ap.html#D)`, `[`A`](ap.html#A)`>.ap(ff: `[`ReaderOf`](-reader-of.html)`<`[`D`](ap.html#D)`, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): `[`Reader`](-reader.html)`<`[`D`](ap.html#D)`, `[`B`](ap.html#B)`>`<br>Apply a function `(A) -> B` that operates within the context of [Reader](-reader.html). |
| [flatMap](flat-map.html) | `fun <A, B, D> `[`Ior`](-ior/index.html)`<`[`A`](flat-map.html#A)`, `[`B`](flat-map.html#B)`>.flatMap(SG: Semigroup<`[`A`](flat-map.html#A)`>, f: (`[`B`](flat-map.html#B)`) -> `[`Ior`](-ior/index.html)`<`[`A`](flat-map.html#A)`, `[`D`](flat-map.html#D)`>): `[`Ior`](-ior/index.html)`<`[`A`](flat-map.html#A)`, `[`D`](flat-map.html#D)`>`<br>Binds the given function across [Ior.Right](-ior/-right/index.html).`fun <D, A, B> `[`Reader`](-reader.html)`<`[`D`](flat-map.html#D)`, `[`A`](flat-map.html#A)`>.flatMap(f: (`[`A`](flat-map.html#A)`) -> `[`Reader`](-reader.html)`<`[`D`](flat-map.html#D)`, `[`B`](flat-map.html#B)`>): `[`Reader`](-reader.html)`<`[`D`](flat-map.html#D)`, `[`B`](flat-map.html#B)`>`<br>FlatMap the result of the computation [A](flat-map.html#A) to another [Reader](-reader.html) for the same dependency [D](flat-map.html#D) and flatten the structure. |
| [getOrElse](get-or-else.html) | `fun <A, B> `[`Ior`](-ior/index.html)`<`[`A`](get-or-else.html#A)`, `[`B`](get-or-else.html#B)`>.getOrElse(default: () -> `[`B`](get-or-else.html#B)`): `[`B`](get-or-else.html#B) |
| [invalid](invalid.html) | `fun <E, A> `[`E`](invalid.html#E)`.invalid(): `[`Validated`](-validated/index.html)`<`[`E`](invalid.html#E)`, `[`A`](invalid.html#A)`>` |
| [invalidNel](invalid-nel.html) | `fun <E, A> `[`E`](invalid-nel.html#E)`.invalidNel(): `[`ValidatedNel`](-validated-nel.html)`<`[`E`](invalid-nel.html#E)`, `[`A`](invalid-nel.html#A)`>` |
| [leftIor](left-ior.html) | `fun <A> `[`A`](left-ior.html#A)`.leftIor(): `[`Ior`](-ior/index.html)`<`[`A`](left-ior.html#A)`, `[`Nothing`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)`>` |
| [map](map.html) | `fun <D, A, B> `[`Reader`](-reader.html)`<`[`D`](map.html#D)`, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): `[`Reader`](-reader.html)`<`[`D`](map.html#D)`, `[`B`](map.html#B)`>`<br>Map the result of the computation [A](map.html#A) to [B](map.html#B) given a function [f](map.html#arrow.data$map(arrow.data.Kleisli((arrow.core.ForId, arrow.data.map.D, arrow.data.map.A)), kotlin.Function1((arrow.data.map.A, arrow.data.map.B)))/f).`fun <S, T, P1, R> `[`State`](-state.html)`<`[`S`](map.html#S)`, `[`T`](map.html#T)`>.map(sx: `[`State`](-state.html)`<`[`S`](map.html#S)`, `[`P1`](map.html#P1)`>, f: (`[`T`](map.html#T)`, `[`P1`](map.html#P1)`) -> `[`R`](map.html#R)`): `[`State`](-state.html)`<`[`S`](map.html#S)`, `[`R`](map.html#R)`>`<br>`fun <S, T, R> `[`State`](-state.html)`<`[`S`](map.html#S)`, `[`T`](map.html#T)`>.map(f: (`[`T`](map.html#T)`) -> `[`R`](map.html#R)`): `[`State`](-state.html)`<`[`S`](map.html#S)`, `[`R`](map.html#R)`>` |
| [mapOf](map-of.html) | `fun <K, V> mapOf(vararg tuple: Tuple2<`[`K`](map-of.html#K)`, `[`V`](map-of.html#V)`>): `[`MapK`](-map-k/index.html)`<`[`K`](map-of.html#K)`, `[`V`](map-of.html#V)`>` |
| [nel](nel.html) | `fun <A> `[`A`](nel.html#A)`.nel(): `[`NonEmptyList`](-non-empty-list/index.html)`<`[`A`](nel.html#A)`>` |
| [rightIor](right-ior.html) | `fun <A> `[`A`](right-ior.html#A)`.rightIor(): `[`Ior`](-ior/index.html)`<`[`Nothing`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)`, `[`A`](right-ior.html#A)`>` |
| [run](run.html) | `fun <S, A> `[`StateT`](-state-t/index.html)`<ForId, `[`S`](run.html#S)`, `[`A`](run.html#A)`>.run(initial: `[`S`](run.html#S)`): Tuple2<`[`S`](run.html#S)`, `[`A`](run.html#A)`>`<br>Alias for [StateT.run](-state-t/run.html) `StateT<ForId, S, A>` |
| [runA](run-a.html) | `fun <S, A> `[`StateT`](-state-t/index.html)`<ForId, `[`S`](run-a.html#S)`, `[`A`](run-a.html#A)`>.runA(initial: `[`S`](run-a.html#S)`): `[`A`](run-a.html#A)<br>Alias for [StateT.runA](-state-t/run-a.html) `StateT<ForId, S, A>` |
| [runId](run-id.html) | `fun <A, B> `[`CoreaderT`](-coreader-t.html)`<ForId, `[`A`](run-id.html#A)`, `[`B`](run-id.html#B)`>.runId(d: `[`A`](run-id.html#A)`): `[`B`](run-id.html#B)`fun <D, A> `[`Reader`](-reader.html)`<`[`D`](run-id.html#D)`, `[`A`](run-id.html#A)`>.runId(d: `[`D`](run-id.html#D)`): `[`A`](run-id.html#A)<br>Alias for [Kleisli.run](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/run.html) |
| [runS](run-s.html) | `fun <S, A> `[`StateT`](-state-t/index.html)`<ForId, `[`S`](run-s.html#S)`, `[`A`](run-s.html#A)`>.runS(initial: `[`S`](run-s.html#S)`): `[`S`](run-s.html#S)<br>Alias for [StateT.runS](-state-t/run-s.html) `StateT<ForId, S, A>` |
| [updated](updated.html) | `fun <K, A> `[`MapK`](-map-k/index.html)`<`[`K`](updated.html#K)`, `[`A`](updated.html#A)`>.updated(k: `[`K`](updated.html#K)`, value: `[`A`](updated.html#A)`): `[`MapK`](-map-k/index.html)`<`[`K`](updated.html#K)`, `[`A`](updated.html#A)`>`<br>`fun <A : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`A`](updated.html#A)`>, B> `[`SortedMapK`](-sorted-map-k/index.html)`<`[`A`](updated.html#A)`, `[`B`](updated.html#B)`>.updated(k: `[`A`](updated.html#A)`, value: `[`B`](updated.html#B)`): `[`SortedMapK`](-sorted-map-k/index.html)`<`[`A`](updated.html#A)`, `[`B`](updated.html#B)`>` |
| [valid](valid.html) | `fun <E, A> `[`A`](valid.html#A)`.valid(): `[`Validated`](-validated/index.html)`<`[`E`](valid.html#E)`, `[`A`](valid.html#A)`>` |
| [validNel](valid-nel.html) | `fun <E, A> `[`A`](valid-nel.html#A)`.validNel(): `[`ValidatedNel`](-validated-nel.html)`<`[`E`](valid-nel.html#E)`, `[`A`](valid-nel.html#A)`>` |
| [zip](zip.html) | `fun <D, A, B> `[`Reader`](-reader.html)`<`[`D`](zip.html#D)`, `[`A`](zip.html#A)`>.zip(o: `[`Reader`](-reader.html)`<`[`D`](zip.html#D)`, `[`B`](zip.html#B)`>): `[`Reader`](-reader.html)`<`[`D`](zip.html#D)`, Tuple2<`[`A`](zip.html#A)`, `[`B`](zip.html#B)`>>`<br>Zip with another [Reader](-reader.html). |

