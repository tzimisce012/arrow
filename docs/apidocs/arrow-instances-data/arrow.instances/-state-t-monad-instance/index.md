---
title: StateTMonadInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [StateTMonadInstance](./index.html)

# StateTMonadInstance

`@extension interface StateTMonadInstance<F, S> : Monad<StateTPartialOf<`[`F`](index.html#F)`, `[`S`](index.html#S)`>>, `[`StateTApplicativeInstance`](../-state-t-applicative-instance/index.html)`<`[`F`](index.html#F)`, `[`S`](index.html#S)`>`

### Functions

| [MF](-m-f.html) | `abstract fun MF(): Monad<`[`F`](index.html#F)`>` |
| [ap](ap.html) | `open fun <A, B> Kind<StateTPartialOf<`[`F`](index.html#F)`, `[`S`](index.html#S)`>, `[`A`](ap.html#A)`>.ap(ff: Kind<StateTPartialOf<`[`F`](index.html#F)`, `[`S`](index.html#S)`>, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): StateT<`[`F`](index.html#F)`, `[`S`](index.html#S)`, `[`B`](ap.html#B)`>` |
| [flatMap](flat-map.html) | `open fun <A, B> Kind<StateTPartialOf<`[`F`](index.html#F)`, `[`S`](index.html#S)`>, `[`A`](flat-map.html#A)`>.flatMap(f: (`[`A`](flat-map.html#A)`) -> Kind<StateTPartialOf<`[`F`](index.html#F)`, `[`S`](index.html#S)`>, `[`B`](flat-map.html#B)`>): StateT<`[`F`](index.html#F)`, `[`S`](index.html#S)`, `[`B`](flat-map.html#B)`>` |
| [map](map.html) | `open fun <A, B> Kind<StateTPartialOf<`[`F`](index.html#F)`, `[`S`](index.html#S)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): StateT<`[`F`](index.html#F)`, `[`S`](index.html#S)`, `[`B`](map.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> StateTOf<`[`F`](index.html#F)`, `[`S`](index.html#S)`, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): StateT<`[`F`](index.html#F)`, `[`S`](index.html#S)`, `[`B`](tail-rec-m.html#B)`>` |

### Inherited Functions

| [FF](../-state-t-applicative-instance/-f-f.html) | `open fun FF(): Functor<`[`F`](../-state-t-applicative-instance/index.html#F)`>` |

### Inheritors

| [StateTMonadContext](../-state-t-monad-context/index.html) | `class StateTMonadContext<S> : `[`StateTMonadInstance`](./index.html)`<ForId, `[`S`](../-state-t-monad-context/index.html#S)`>` |
| [StateTMonadErrorInstance](../-state-t-monad-error-instance/index.html) | `interface StateTMonadErrorInstance<F, S, E> : MonadError<StateTPartialOf<`[`F`](../-state-t-monad-error-instance/index.html#F)`, `[`S`](../-state-t-monad-error-instance/index.html#S)`>, `[`E`](../-state-t-monad-error-instance/index.html#E)`>, `[`StateTApplicativeErrorInstance`](../-state-t-applicative-error-instance/index.html)`<`[`F`](../-state-t-monad-error-instance/index.html#F)`, `[`S`](../-state-t-monad-error-instance/index.html#S)`, `[`E`](../-state-t-monad-error-instance/index.html#E)`>, `[`StateTMonadInstance`](./index.html)`<`[`F`](../-state-t-monad-error-instance/index.html#F)`, `[`S`](../-state-t-monad-error-instance/index.html#S)`>` |

