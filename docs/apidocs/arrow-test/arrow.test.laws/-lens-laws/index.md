---
title: LensLaws - arrow-test
---

[arrow-test](../../index.html) / [arrow.test.laws](../index.html) / [LensLaws](./index.html)

# LensLaws

`object LensLaws`

### Functions

| [laws](laws.html) | `fun <A, B> laws(lens: Lens<`[`A`](laws.html#A)`, `[`B`](laws.html#B)`>, aGen: Gen<`[`A`](laws.html#A)`>, bGen: Gen<`[`B`](laws.html#B)`>, funcGen: Gen<(`[`B`](laws.html#B)`) -> `[`B`](laws.html#B)`>, EQA: Eq<`[`A`](laws.html#A)`>, EQB: Eq<`[`B`](laws.html#B)`>, MB: Monoid<`[`B`](laws.html#B)`>): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Law`](../-law/index.html)`>` |
| [lensComposeModify](lens-compose-modify.html) | `fun <A, B> Lens<`[`A`](lens-compose-modify.html#A)`, `[`B`](lens-compose-modify.html#B)`>.lensComposeModify(aGen: Gen<`[`A`](lens-compose-modify.html#A)`>, funcGen: Gen<(`[`B`](lens-compose-modify.html#B)`) -> `[`B`](lens-compose-modify.html#B)`>, EQA: Eq<`[`A`](lens-compose-modify.html#A)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [lensConsistentGetModifyid](lens-consistent-get-modifyid.html) | `fun <A, B> Lens<`[`A`](lens-consistent-get-modifyid.html#A)`, `[`B`](lens-consistent-get-modifyid.html#B)`>.lensConsistentGetModifyid(aGen: Gen<`[`A`](lens-consistent-get-modifyid.html#A)`>, EQB: Eq<`[`B`](lens-consistent-get-modifyid.html#B)`>, MA: Monoid<`[`B`](lens-consistent-get-modifyid.html#B)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [lensConsistentModifyModifyId](lens-consistent-modify-modify-id.html) | `fun <A, B> Lens<`[`A`](lens-consistent-modify-modify-id.html#A)`, `[`B`](lens-consistent-modify-modify-id.html#B)`>.lensConsistentModifyModifyId(aGen: Gen<`[`A`](lens-consistent-modify-modify-id.html#A)`>, funcGen: Gen<(`[`B`](lens-consistent-modify-modify-id.html#B)`) -> `[`B`](lens-consistent-modify-modify-id.html#B)`>, EQA: Eq<`[`A`](lens-consistent-modify-modify-id.html#A)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [lensConsistentSetModify](lens-consistent-set-modify.html) | `fun <A, B> Lens<`[`A`](lens-consistent-set-modify.html#A)`, `[`B`](lens-consistent-set-modify.html#B)`>.lensConsistentSetModify(aGen: Gen<`[`A`](lens-consistent-set-modify.html#A)`>, bGen: Gen<`[`B`](lens-consistent-set-modify.html#B)`>, EQA: Eq<`[`A`](lens-consistent-set-modify.html#A)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [lensGetSet](lens-get-set.html) | `fun <A, B> Lens<`[`A`](lens-get-set.html#A)`, `[`B`](lens-get-set.html#B)`>.lensGetSet(aGen: Gen<`[`A`](lens-get-set.html#A)`>, EQA: Eq<`[`A`](lens-get-set.html#A)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [lensModifyIdentity](lens-modify-identity.html) | `fun <A, B> Lens<`[`A`](lens-modify-identity.html#A)`, `[`B`](lens-modify-identity.html#B)`>.lensModifyIdentity(aGen: Gen<`[`A`](lens-modify-identity.html#A)`>, EQA: Eq<`[`A`](lens-modify-identity.html#A)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [lensSetGet](lens-set-get.html) | `fun <A, B> Lens<`[`A`](lens-set-get.html#A)`, `[`B`](lens-set-get.html#B)`>.lensSetGet(aGen: Gen<`[`A`](lens-set-get.html#A)`>, bGen: Gen<`[`B`](lens-set-get.html#B)`>, EQB: Eq<`[`B`](lens-set-get.html#B)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [lensSetIdempotent](lens-set-idempotent.html) | `fun <A, B> Lens<`[`A`](lens-set-idempotent.html#A)`, `[`B`](lens-set-idempotent.html#B)`>.lensSetIdempotent(aGen: Gen<`[`A`](lens-set-idempotent.html#A)`>, bGen: Gen<`[`B`](lens-set-idempotent.html#B)`>, EQA: Eq<`[`A`](lens-set-idempotent.html#A)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

