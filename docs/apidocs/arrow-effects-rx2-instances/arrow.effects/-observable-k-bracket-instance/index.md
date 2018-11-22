---
title: ObservableKBracketInstance - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects](../index.html) / [ObservableKBracketInstance](./index.html)

# ObservableKBracketInstance

`@extension interface ObservableKBracketInstance : Bracket<ForObservableK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`ObservableKMonadThrowInstance`](../-observable-k-monad-throw-instance.html)

### Functions

| [bracketCase](bracket-case.html) | `open fun <A, B> Kind<ForObservableK, `[`A`](bracket-case.html#A)`>.bracketCase(release: (`[`A`](bracket-case.html#A)`, ExitCase<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>) -> Kind<ForObservableK, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, use: (`[`A`](bracket-case.html#A)`) -> Kind<ForObservableK, `[`B`](bracket-case.html#B)`>): ObservableK<`[`B`](bracket-case.html#B)`>` |

### Extension Functions

| [catch](../../arrow.effects.observablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForObservableK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.observablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): ObservableK<`[`A`](../../arrow.effects.observablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [ObservableKMonadDeferInstance](../-observable-k-monad-defer-instance/index.html) | `interface ObservableKMonadDeferInstance : MonadDefer<ForObservableK>, `[`ObservableKBracketInstance`](./index.html) |

