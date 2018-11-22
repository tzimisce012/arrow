---
title: KleisliBracketInstance - arrow-data-instances-effects
---

[arrow-data-instances-effects](../../index.html) / [arrow.effects.instances](../index.html) / [KleisliBracketInstance](./index.html)

# KleisliBracketInstance

`@extension interface KleisliBracketInstance<F, R, E> : Bracket<KleisliPartialOf<`[`F`](index.html#F)`, `[`R`](index.html#R)`>, `[`E`](index.html#E)`>, KleisliMonadErrorInstance<`[`F`](index.html#F)`, `[`R`](index.html#R)`, `[`E`](index.html#E)`>`

### Functions

| [BF](-b-f.html) | `abstract fun BF(): Bracket<`[`F`](index.html#F)`, `[`E`](index.html#E)`>` |
| [ME](-m-e.html) | `open fun ME(): MonadError<`[`F`](index.html#F)`, `[`E`](index.html#E)`>` |
| [bracketCase](bracket-case.html) | `open fun <A, B> Kind<KleisliPartialOf<`[`F`](index.html#F)`, `[`R`](index.html#R)`>, `[`A`](bracket-case.html#A)`>.bracketCase(release: (`[`A`](bracket-case.html#A)`, ExitCase<`[`E`](index.html#E)`>) -> Kind<KleisliPartialOf<`[`F`](index.html#F)`, `[`R`](index.html#R)`>, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, use: (`[`A`](bracket-case.html#A)`) -> Kind<KleisliPartialOf<`[`F`](index.html#F)`, `[`R`](index.html#R)`>, `[`B`](bracket-case.html#B)`>): Kleisli<`[`F`](index.html#F)`, `[`R`](index.html#R)`, `[`B`](bracket-case.html#B)`>` |
| [uncancelable](uncancelable.html) | `open fun <A> Kind<KleisliPartialOf<`[`F`](index.html#F)`, `[`R`](index.html#R)`>, `[`A`](uncancelable.html#A)`>.uncancelable(): Kleisli<`[`F`](index.html#F)`, `[`R`](index.html#R)`, `[`A`](uncancelable.html#A)`>` |

