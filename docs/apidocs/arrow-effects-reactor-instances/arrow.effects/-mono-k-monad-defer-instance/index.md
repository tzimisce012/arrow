---
title: MonoKMonadDeferInstance - arrow-effects-reactor-instances
---

[arrow-effects-reactor-instances](../../index.html) / [arrow.effects](../index.html) / [MonoKMonadDeferInstance](./index.html)

# MonoKMonadDeferInstance

`@extension interface MonoKMonadDeferInstance : `[`MonoKBracketInstance`](../-mono-k-bracket-instance/index.html)`, MonadDefer<ForMonoK>`

### Functions

| [defer](defer.html) | `open fun <A> defer(fa: () -> MonoKOf<`[`A`](defer.html#A)`>): MonoK<`[`A`](defer.html#A)`>` |

### Inherited Functions

| [bracketCase](../-mono-k-bracket-instance/bracket-case.html) | `open fun <A, B> Kind<ForMonoK, `[`A`](../-mono-k-bracket-instance/bracket-case.html#A)`>.bracketCase(release: (`[`A`](../-mono-k-bracket-instance/bracket-case.html#A)`, ExitCase<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>) -> Kind<ForMonoK, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, use: (`[`A`](../-mono-k-bracket-instance/bracket-case.html#A)`) -> Kind<ForMonoK, `[`B`](../-mono-k-bracket-instance/bracket-case.html#B)`>): MonoK<`[`B`](../-mono-k-bracket-instance/bracket-case.html#B)`>` |

### Extension Functions

| [catch](../../arrow.effects.monok.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForMonoK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.monok.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): MonoK<`[`A`](../../arrow.effects.monok.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [MonoKAsyncInstance](../-mono-k-async-instance/index.html) | `interface MonoKAsyncInstance : Async<ForMonoK>, `[`MonoKMonadDeferInstance`](./index.html) |

