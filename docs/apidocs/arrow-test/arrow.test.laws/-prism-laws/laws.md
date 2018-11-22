---
title: PrismLaws.laws - arrow-test
---

[arrow-test](../../index.html) / [arrow.test.laws](../index.html) / [PrismLaws](index.html) / [laws](./laws.html)

# laws

`fun <A, B> laws(prism: Prism<`[`A`](laws.html#A)`, `[`B`](laws.html#B)`>, aGen: Gen<`[`A`](laws.html#A)`>, bGen: Gen<`[`B`](laws.html#B)`>, funcGen: Gen<(`[`B`](laws.html#B)`) -> `[`B`](laws.html#B)`>, EQA: Eq<`[`A`](laws.html#A)`>, EQOptionB: Eq<Option<`[`B`](laws.html#B)`>>): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Law`](../-law/index.html)`>`