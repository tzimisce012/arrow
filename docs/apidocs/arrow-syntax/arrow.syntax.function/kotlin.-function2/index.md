---
title: arrow.syntax.function.kotlin.Function2 - arrow-syntax
---

[arrow-syntax](../../index.html) / [arrow.syntax.function](../index.html) / [kotlin.Function2](./index.html)

### Extensions for kotlin.Function2

| [andThen](and-then.html) | `infix fun <P1, P2, IP, R> ((`[`P1`](and-then.html#P1)`, `[`P2`](and-then.html#P2)`) -> `[`IP`](and-then.html#IP)`).andThen(f: (`[`IP`](and-then.html#IP)`) -> `[`R`](and-then.html#R)`): (`[`P1`](and-then.html#P1)`, `[`P2`](and-then.html#P2)`) -> `[`R`](and-then.html#R) |
| [complement](complement.html) | `fun <P1, P2> ((`[`P1`](complement.html#P1)`, `[`P2`](complement.html#P2)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`).complement(): (`[`P1`](complement.html#P1)`, `[`P2`](complement.html#P2)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [curried](curried.html) | `fun <P1, P2, R> ((`[`P1`](curried.html#P1)`, `[`P2`](curried.html#P2)`) -> `[`R`](curried.html#R)`).curried(): (`[`P1`](curried.html#P1)`) -> (`[`P2`](curried.html#P2)`) -> `[`R`](curried.html#R) |
| [forwardCompose](forward-compose.html) | `infix fun <P1, P2, IP, R> ((`[`P1`](forward-compose.html#P1)`, `[`P2`](forward-compose.html#P2)`) -> `[`IP`](forward-compose.html#IP)`).forwardCompose(f: (`[`IP`](forward-compose.html#IP)`) -> `[`R`](forward-compose.html#R)`): (`[`P1`](forward-compose.html#P1)`, `[`P2`](forward-compose.html#P2)`) -> `[`R`](forward-compose.html#R) |
| [invoke](invoke.html) | `operator fun <P1, P2, R> ((`[`P1`](invoke.html#P1)`, `[`P2`](invoke.html#P2)`) -> `[`R`](invoke.html#R)`).invoke(p1: `[`P1`](invoke.html#P1)`, partial2: `[`Partial`](../-partial/index.html)`<`[`P2`](invoke.html#P2)`> = partial()): (`[`P2`](invoke.html#P2)`) -> `[`R`](invoke.html#R)<br>`operator fun <P1, P2, R> ((`[`P1`](invoke.html#P1)`, `[`P2`](invoke.html#P2)`) -> `[`R`](invoke.html#R)`).invoke(partial1: `[`Partial`](../-partial/index.html)`<`[`P1`](invoke.html#P1)`> = partial(), p2: `[`P2`](invoke.html#P2)`): (`[`P1`](invoke.html#P1)`) -> `[`R`](invoke.html#R) |
| [memoize](memoize.html) | `fun <P1, P2, R> ((`[`P1`](memoize.html#P1)`, `[`P2`](memoize.html#P2)`) -> `[`R`](memoize.html#R)`).memoize(): (`[`P1`](memoize.html#P1)`, `[`P2`](memoize.html#P2)`) -> `[`R`](memoize.html#R) |
| [paired](paired.html) | `fun <P1, P2, R> ((`[`P1`](paired.html#P1)`, `[`P2`](paired.html#P2)`) -> `[`R`](paired.html#R)`).paired(): (`[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<`[`P1`](paired.html#P1)`, `[`P2`](paired.html#P2)`>) -> `[`R`](paired.html#R) |
| [partially1](partially1.html) | `fun <P1, P2, R> ((`[`P1`](partially1.html#P1)`, `[`P2`](partially1.html#P2)`) -> `[`R`](partially1.html#R)`).partially1(p1: `[`P1`](partially1.html#P1)`): (`[`P2`](partially1.html#P2)`) -> `[`R`](partially1.html#R) |
| [partially2](partially2.html) | `fun <P1, P2, R> ((`[`P1`](partially2.html#P1)`, `[`P2`](partially2.html#P2)`) -> `[`R`](partially2.html#R)`).partially2(p2: `[`P2`](partially2.html#P2)`): (`[`P1`](partially2.html#P1)`) -> `[`R`](partially2.html#R) |
| [reverse](reverse.html) | `fun <P1, P2, R> ((`[`P1`](reverse.html#P1)`, `[`P2`](reverse.html#P2)`) -> `[`R`](reverse.html#R)`).reverse(): (`[`P2`](reverse.html#P2)`, `[`P1`](reverse.html#P1)`) -> `[`R`](reverse.html#R) |

