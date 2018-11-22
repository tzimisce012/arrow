---
title: IsoLaws.laws - arrow-test
---

[arrow-test](../../index.html) / [arrow.test.laws](../index.html) / [IsoLaws](index.html) / [laws](./laws.html)

# laws

`fun <A, B> laws(iso: Iso<`[`A`](laws.html#A)`, `[`B`](laws.html#B)`>, aGen: Gen<`[`A`](laws.html#A)`>, bGen: Gen<`[`B`](laws.html#B)`>, funcGen: Gen<(`[`B`](laws.html#B)`) -> `[`B`](laws.html#B)`>, EQA: Eq<`[`A`](laws.html#A)`>, EQB: Eq<`[`B`](laws.html#B)`>, bMonoid: Monoid<`[`B`](laws.html#B)`>): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Law`](../-law/index.html)`>`