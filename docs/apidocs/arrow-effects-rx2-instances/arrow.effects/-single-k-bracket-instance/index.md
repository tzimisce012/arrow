---
title: SingleKBracketInstance - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects](../index.html) / [SingleKBracketInstance](./index.html)

# SingleKBracketInstance

`@extension interface SingleKBracketInstance : Bracket<ForSingleK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`SingleKMonadThrowInstance`](../-single-k-monad-throw-instance.html)

### Functions

| [bracketCase](bracket-case.html) | `open fun <A, B> Kind<ForSingleK, `[`A`](bracket-case.html#A)`>.bracketCase(release: (`[`A`](bracket-case.html#A)`, ExitCase<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>) -> Kind<ForSingleK, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, use: (`[`A`](bracket-case.html#A)`) -> Kind<ForSingleK, `[`B`](bracket-case.html#B)`>): SingleK<`[`B`](bracket-case.html#B)`>` |

### Extension Functions

| [catch](../../arrow.effects.singlek.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForSingleK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.singlek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): SingleK<`[`A`](../../arrow.effects.singlek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [SingleKMonadDeferInstance](../-single-k-monad-defer-instance/index.html) | `interface SingleKMonadDeferInstance : MonadDefer<ForSingleK>, `[`SingleKBracketInstance`](./index.html) |

