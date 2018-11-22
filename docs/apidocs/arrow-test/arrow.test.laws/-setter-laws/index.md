---
title: SetterLaws - arrow-test
---

[arrow-test](../../index.html) / [arrow.test.laws](../index.html) / [SetterLaws](./index.html)

# SetterLaws

`object SetterLaws`

### Functions

| [composeModify](compose-modify.html) | `fun <A, B> Setter<`[`A`](compose-modify.html#A)`, `[`B`](compose-modify.html#B)`>.composeModify(aGen: Gen<`[`A`](compose-modify.html#A)`>, EQA: Eq<`[`A`](compose-modify.html#A)`>, funcGen: Gen<(`[`B`](compose-modify.html#B)`) -> `[`B`](compose-modify.html#B)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [consistentSetModify](consistent-set-modify.html) | `fun <A, B> Setter<`[`A`](consistent-set-modify.html#A)`, `[`B`](consistent-set-modify.html#B)`>.consistentSetModify(aGen: Gen<`[`A`](consistent-set-modify.html#A)`>, bGen: Gen<`[`B`](consistent-set-modify.html#B)`>, EQA: Eq<`[`A`](consistent-set-modify.html#A)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [laws](laws.html) | `fun <A, B> laws(setter: Setter<`[`A`](laws.html#A)`, `[`B`](laws.html#B)`>, aGen: Gen<`[`A`](laws.html#A)`>, bGen: Gen<`[`B`](laws.html#B)`>, funcGen: Gen<(`[`B`](laws.html#B)`) -> `[`B`](laws.html#B)`>, EQA: Eq<`[`A`](laws.html#A)`>): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Law`](../-law/index.html)`>` |
| [modifyIdentity](modify-identity.html) | `fun <A, B> Setter<`[`A`](modify-identity.html#A)`, `[`B`](modify-identity.html#B)`>.modifyIdentity(aGen: Gen<`[`A`](modify-identity.html#A)`>, EQA: Eq<`[`A`](modify-identity.html#A)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setIdempotent](set-idempotent.html) | `fun <A, B> Setter<`[`A`](set-idempotent.html#A)`, `[`B`](set-idempotent.html#B)`>.setIdempotent(aGen: Gen<`[`A`](set-idempotent.html#A)`>, bGen: Gen<`[`B`](set-idempotent.html#B)`>, EQA: Eq<`[`A`](set-idempotent.html#A)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

