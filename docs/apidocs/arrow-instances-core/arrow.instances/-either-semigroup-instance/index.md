---
title: EitherSemigroupInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [EitherSemigroupInstance](./index.html)

# EitherSemigroupInstance

`@extension interface EitherSemigroupInstance<L, R> : Semigroup<Either<`[`L`](index.html#L)`, `[`R`](index.html#R)`>>`

### Functions

| [SGL](-s-g-l.html) | `abstract fun SGL(): Semigroup<`[`L`](index.html#L)`>` |
| [SGR](-s-g-r.html) | `abstract fun SGR(): Semigroup<`[`R`](index.html#R)`>` |
| [combine](combine.html) | `open fun Either<`[`L`](index.html#L)`, `[`R`](index.html#R)`>.combine(b: Either<`[`L`](index.html#L)`, `[`R`](index.html#R)`>): Either<`[`L`](index.html#L)`, `[`R`](index.html#R)`>` |

### Inheritors

| [EitherMonoidInstance](../-either-monoid-instance/index.html) | `interface EitherMonoidInstance<L, R> : Monoid<Either<`[`L`](../-either-monoid-instance/index.html#L)`, `[`R`](../-either-monoid-instance/index.html#R)`>>, `[`EitherSemigroupInstance`](./index.html)`<`[`L`](../-either-monoid-instance/index.html#L)`, `[`R`](../-either-monoid-instance/index.html#R)`>` |

