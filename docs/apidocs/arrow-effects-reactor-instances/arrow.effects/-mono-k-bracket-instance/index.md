---
title: MonoKBracketInstance - arrow-effects-reactor-instances
---

[arrow-effects-reactor-instances](../../index.html) / [arrow.effects](../index.html) / [MonoKBracketInstance](./index.html)

# MonoKBracketInstance

`@extension interface MonoKBracketInstance : Bracket<ForMonoK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`MonoKMonadThrowInstance`](../-mono-k-monad-throw-instance.html)

### Functions

| [bracketCase](bracket-case.html) | `open fun <A, B> Kind<ForMonoK, `[`A`](bracket-case.html#A)`>.bracketCase(release: (`[`A`](bracket-case.html#A)`, ExitCase<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>) -> Kind<ForMonoK, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, use: (`[`A`](bracket-case.html#A)`) -> Kind<ForMonoK, `[`B`](bracket-case.html#B)`>): MonoK<`[`B`](bracket-case.html#B)`>` |

### Extension Functions

| [catch](../../arrow.effects.monok.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForMonoK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.monok.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): MonoK<`[`A`](../../arrow.effects.monok.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [MonoKMonadDeferInstance](../-mono-k-monad-defer-instance/index.html) | `interface MonoKMonadDeferInstance : `[`MonoKBracketInstance`](./index.html)`, MonadDefer<ForMonoK>` |

