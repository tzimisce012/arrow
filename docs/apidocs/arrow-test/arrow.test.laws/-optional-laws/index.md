---
title: OptionalLaws - arrow-test
---

[arrow-test](../../index.html) / [arrow.test.laws](../index.html) / [OptionalLaws](./index.html)

# OptionalLaws

`object OptionalLaws`

### Functions

| [composeModify](compose-modify.html) | `fun <A, B> Optional<`[`A`](compose-modify.html#A)`, `[`B`](compose-modify.html#B)`>.composeModify(aGen: Gen<`[`A`](compose-modify.html#A)`>, funcGen: Gen<(`[`B`](compose-modify.html#B)`) -> `[`B`](compose-modify.html#B)`>, EQA: Eq<`[`A`](compose-modify.html#A)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [consistentGetOptionModifyId](consistent-get-option-modify-id.html) | `fun <A, B> Optional<`[`A`](consistent-get-option-modify-id.html#A)`, `[`B`](consistent-get-option-modify-id.html#B)`>.consistentGetOptionModifyId(aGen: Gen<`[`A`](consistent-get-option-modify-id.html#A)`>, EQOptionB: Eq<Option<`[`B`](consistent-get-option-modify-id.html#B)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [consistentModifyModifyId](consistent-modify-modify-id.html) | `fun <A, B> Optional<`[`A`](consistent-modify-modify-id.html#A)`, `[`B`](consistent-modify-modify-id.html#B)`>.consistentModifyModifyId(aGen: Gen<`[`A`](consistent-modify-modify-id.html#A)`>, funcGen: Gen<(`[`B`](consistent-modify-modify-id.html#B)`) -> `[`B`](consistent-modify-modify-id.html#B)`>, EQA: Eq<`[`A`](consistent-modify-modify-id.html#A)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [consistentSetModify](consistent-set-modify.html) | `fun <A, B> Optional<`[`A`](consistent-set-modify.html#A)`, `[`B`](consistent-set-modify.html#B)`>.consistentSetModify(aGen: Gen<`[`A`](consistent-set-modify.html#A)`>, bGen: Gen<`[`B`](consistent-set-modify.html#B)`>, EQA: Eq<`[`A`](consistent-set-modify.html#A)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [getOptionSet](get-option-set.html) | `fun <A, B> Optional<`[`A`](get-option-set.html#A)`, `[`B`](get-option-set.html#B)`>.getOptionSet(aGen: Gen<`[`A`](get-option-set.html#A)`>, EQA: Eq<`[`A`](get-option-set.html#A)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [laws](laws.html) | `fun <A, B> laws(optional: Optional<`[`A`](laws.html#A)`, `[`B`](laws.html#B)`>, aGen: Gen<`[`A`](laws.html#A)`>, bGen: Gen<`[`B`](laws.html#B)`>, funcGen: Gen<(`[`B`](laws.html#B)`) -> `[`B`](laws.html#B)`>, EQA: Eq<`[`A`](laws.html#A)`>, EQOptionB: Eq<Option<`[`B`](laws.html#B)`>>): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Law`](../-law/index.html)`>` |
| [modifyIdentity](modify-identity.html) | `fun <A, B> Optional<`[`A`](modify-identity.html#A)`, `[`B`](modify-identity.html#B)`>.modifyIdentity(aGen: Gen<`[`A`](modify-identity.html#A)`>, EQA: Eq<`[`A`](modify-identity.html#A)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setGetOption](set-get-option.html) | `fun <A, B> Optional<`[`A`](set-get-option.html#A)`, `[`B`](set-get-option.html#B)`>.setGetOption(aGen: Gen<`[`A`](set-get-option.html#A)`>, bGen: Gen<`[`B`](set-get-option.html#B)`>, EQOptionB: Eq<Option<`[`B`](set-get-option.html#B)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setIdempotent](set-idempotent.html) | `fun <A, B> Optional<`[`A`](set-idempotent.html#A)`, `[`B`](set-idempotent.html#B)`>.setIdempotent(aGen: Gen<`[`A`](set-idempotent.html#A)`>, bGen: Gen<`[`B`](set-idempotent.html#B)`>, EQA: Eq<`[`A`](set-idempotent.html#A)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

