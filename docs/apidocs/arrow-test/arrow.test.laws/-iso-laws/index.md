---
title: IsoLaws - arrow-test
---

[arrow-test](../../index.html) / [arrow.test.laws](../index.html) / [IsoLaws](./index.html)

# IsoLaws

`object IsoLaws`

### Functions

| [composeModify](compose-modify.html) | `fun <A, B> Iso<`[`A`](compose-modify.html#A)`, `[`B`](compose-modify.html#B)`>.composeModify(aGen: Gen<`[`A`](compose-modify.html#A)`>, funcGen: Gen<(`[`B`](compose-modify.html#B)`) -> `[`B`](compose-modify.html#B)`>, EQA: Eq<`[`A`](compose-modify.html#A)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [consistentModifyModifyId](consistent-modify-modify-id.html) | `fun <A, B> Iso<`[`A`](consistent-modify-modify-id.html#A)`, `[`B`](consistent-modify-modify-id.html#B)`>.consistentModifyModifyId(aGen: Gen<`[`A`](consistent-modify-modify-id.html#A)`>, funcGen: Gen<(`[`B`](consistent-modify-modify-id.html#B)`) -> `[`B`](consistent-modify-modify-id.html#B)`>, EQA: Eq<`[`A`](consistent-modify-modify-id.html#A)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [consistentSetModify](consistent-set-modify.html) | `fun <A, B> Iso<`[`A`](consistent-set-modify.html#A)`, `[`B`](consistent-set-modify.html#B)`>.consistentSetModify(aGen: Gen<`[`A`](consistent-set-modify.html#A)`>, bGen: Gen<`[`B`](consistent-set-modify.html#B)`>, EQA: Eq<`[`A`](consistent-set-modify.html#A)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [consitentGetModifyId](consitent-get-modify-id.html) | `fun <A, B> Iso<`[`A`](consitent-get-modify-id.html#A)`, `[`B`](consitent-get-modify-id.html#B)`>.consitentGetModifyId(aGen: Gen<`[`A`](consitent-get-modify-id.html#A)`>, EQB: Eq<`[`B`](consitent-get-modify-id.html#B)`>, bMonoid: Monoid<`[`B`](consitent-get-modify-id.html#B)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [laws](laws.html) | `fun <A, B> laws(iso: Iso<`[`A`](laws.html#A)`, `[`B`](laws.html#B)`>, aGen: Gen<`[`A`](laws.html#A)`>, bGen: Gen<`[`B`](laws.html#B)`>, funcGen: Gen<(`[`B`](laws.html#B)`) -> `[`B`](laws.html#B)`>, EQA: Eq<`[`A`](laws.html#A)`>, EQB: Eq<`[`B`](laws.html#B)`>, bMonoid: Monoid<`[`B`](laws.html#B)`>): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Law`](../-law/index.html)`>` |
| [modifyIdentity](modify-identity.html) | `fun <A, B> Iso<`[`A`](modify-identity.html#A)`, `[`B`](modify-identity.html#B)`>.modifyIdentity(aGen: Gen<`[`A`](modify-identity.html#A)`>, EQA: Eq<`[`A`](modify-identity.html#A)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [roundTripOneWay](round-trip-one-way.html) | `fun <A, B> Iso<`[`A`](round-trip-one-way.html#A)`, `[`B`](round-trip-one-way.html#B)`>.roundTripOneWay(aGen: Gen<`[`A`](round-trip-one-way.html#A)`>, EQA: Eq<`[`A`](round-trip-one-way.html#A)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [roundTripOtherWay](round-trip-other-way.html) | `fun <A, B> Iso<`[`A`](round-trip-other-way.html#A)`, `[`B`](round-trip-other-way.html#B)`>.roundTripOtherWay(bGen: Gen<`[`B`](round-trip-other-way.html#B)`>, EQB: Eq<`[`B`](round-trip-other-way.html#B)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

