---
title: CompositeFailure.fromResults - arrow-streams
---

[arrow-streams](../../index.html) / [arrow.streams](../index.html) / [CompositeFailure](index.html) / [fromResults](./from-results.html)

# fromResults

`fun fromResults(first: Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, second: Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`

Builds composite failure from the results supplied.

* When any of the results are on left, then the Left(err) is returned
* When both results fail, the Left(CompositeFailure(_)) is returned
* When both results succeeds then Right(()) is returned
