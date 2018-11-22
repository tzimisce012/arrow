---
title: MaybeKBracketInstance - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects](../index.html) / [MaybeKBracketInstance](./index.html)

# MaybeKBracketInstance

`@extension interface MaybeKBracketInstance : Bracket<ForMaybeK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`MaybeKMonadThrowInstance`](../-maybe-k-monad-throw-instance.html)

### Functions

| [bracketCase](bracket-case.html) | `open fun <A, B> Kind<ForMaybeK, `[`A`](bracket-case.html#A)`>.bracketCase(release: (`[`A`](bracket-case.html#A)`, ExitCase<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>) -> Kind<ForMaybeK, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, use: (`[`A`](bracket-case.html#A)`) -> Kind<ForMaybeK, `[`B`](bracket-case.html#B)`>): MaybeK<`[`B`](bracket-case.html#B)`>` |

### Extension Functions

| [catch](../../arrow.effects.maybek.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForMaybeK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.maybek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): MaybeK<`[`A`](../../arrow.effects.maybek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [MaybeKMonadDeferInstance](../-maybe-k-monad-defer-instance/index.html) | `interface MaybeKMonadDeferInstance : MonadDefer<ForMaybeK>, `[`MaybeKBracketInstance`](./index.html) |

