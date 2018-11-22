---
title: EitherMonadInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [EitherMonadInstance](./index.html)

# EitherMonadInstance

`@extension interface EitherMonadInstance<L> : Monad<EitherPartialOf<`[`L`](index.html#L)`>>, `[`EitherApplicativeInstance`](../-either-applicative-instance/index.html)`<`[`L`](index.html#L)`>`

### Functions

| [ap](ap.html) | `open fun <A, B> Kind<EitherPartialOf<`[`L`](index.html#L)`>, `[`A`](ap.html#A)`>.ap(ff: Kind<EitherPartialOf<`[`L`](index.html#L)`>, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): Either<`[`L`](index.html#L)`, `[`B`](ap.html#B)`>` |
| [flatMap](flat-map.html) | `open fun <A, B> Kind<EitherPartialOf<`[`L`](index.html#L)`>, `[`A`](flat-map.html#A)`>.flatMap(f: (`[`A`](flat-map.html#A)`) -> Kind<EitherPartialOf<`[`L`](index.html#L)`>, `[`B`](flat-map.html#B)`>): Either<`[`L`](index.html#L)`, `[`B`](flat-map.html#B)`>` |
| [map](map.html) | `open fun <A, B> Kind<EitherPartialOf<`[`L`](index.html#L)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Either<`[`L`](index.html#L)`, `[`B`](map.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> Kind<EitherPartialOf<`[`L`](index.html#L)`>, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): Either<`[`L`](index.html#L)`, `[`B`](tail-rec-m.html#B)`>` |

### Inheritors

| [EitherMonadErrorInstance](../-either-monad-error-instance.html) | `interface EitherMonadErrorInstance<L> : MonadError<EitherPartialOf<`[`L`](../-either-monad-error-instance.html#L)`>, `[`L`](../-either-monad-error-instance.html#L)`>, `[`EitherApplicativeErrorInstance`](../-either-applicative-error-instance/index.html)`<`[`L`](../-either-monad-error-instance.html#L)`>, `[`EitherMonadInstance`](./index.html)`<`[`L`](../-either-monad-error-instance.html#L)`>` |

