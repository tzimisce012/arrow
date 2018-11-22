---
title: TraversalLaws - arrow-test
---

[arrow-test](../../index.html) / [arrow.test.laws](../index.html) / [TraversalLaws](./index.html)

# TraversalLaws

`object TraversalLaws`

### Functions

| [composeModify](compose-modify.html) | `fun <A, B> Traversal<`[`A`](compose-modify.html#A)`, `[`B`](compose-modify.html#B)`>.composeModify(aGen: Gen<`[`A`](compose-modify.html#A)`>, funcGen: Gen<(`[`B`](compose-modify.html#B)`) -> `[`B`](compose-modify.html#B)`>, EQA: Eq<`[`A`](compose-modify.html#A)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [headOption](head-option.html) | `fun <A, B : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> Traversal<`[`A`](head-option.html#A)`, `[`B`](head-option.html#B)`>.headOption(aGen: Gen<`[`A`](head-option.html#A)`>, EQOptionB: Eq<Option<`[`B`](head-option.html#B)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [laws](laws.html) | `fun <A, B : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> laws(traversal: Traversal<`[`A`](laws.html#A)`, `[`B`](laws.html#B)`>, aGen: Gen<`[`A`](laws.html#A)`>, bGen: Gen<`[`B`](laws.html#B)`>, funcGen: Gen<(`[`B`](laws.html#B)`) -> `[`B`](laws.html#B)`>, EQA: Eq<`[`A`](laws.html#A)`>, EQOptionB: Eq<Option<`[`B`](laws.html#B)`>>, EQListB: Eq<ListK<`[`B`](laws.html#B)`>>): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Law`](../-law/index.html)`>` |
| [modifyGetAll](modify-get-all.html) | `fun <A, B> Traversal<`[`A`](modify-get-all.html#A)`, `[`B`](modify-get-all.html#B)`>.modifyGetAll(aGen: Gen<`[`A`](modify-get-all.html#A)`>, funcGen: Gen<(`[`B`](modify-get-all.html#B)`) -> `[`B`](modify-get-all.html#B)`>, EQListB: Eq<ListK<`[`B`](modify-get-all.html#B)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [modifyIdentity](modify-identity.html) | `fun <A, B> Traversal<`[`A`](modify-identity.html#A)`, `[`B`](modify-identity.html#B)`>.modifyIdentity(aGen: Gen<`[`A`](modify-identity.html#A)`>, EQA: Eq<`[`A`](modify-identity.html#A)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setIdempotent](set-idempotent.html) | `fun <A, B> Traversal<`[`A`](set-idempotent.html#A)`, `[`B`](set-idempotent.html#B)`>.setIdempotent(aGen: Gen<`[`A`](set-idempotent.html#A)`>, bGen: Gen<`[`B`](set-idempotent.html#B)`>, EQA: Eq<`[`A`](set-idempotent.html#A)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

