---
title: arrow.free - arrow-free
---

[arrow-free](../index.html) / [arrow.free](./index.html)

## Package arrow.free

### Types

| [Cofree](-cofree/index.html) | `data class Cofree<S, A> : `[`CofreeOf`](-cofree-of.html)`<`[`S`](-cofree/index.html#S)`, `[`A`](-cofree/index.html#A)`>, `[`CofreeKindedJ`](-cofree-kinded-j.html)`<`[`S`](-cofree/index.html#S)`, `[`A`](-cofree/index.html#A)`>, Functor<`[`S`](-cofree/index.html#S)`>` |
| [Coyoneda](-coyoneda/index.html) | `data class Coyoneda<F, P, A> : `[`CoyonedaOf`](-coyoneda-of.html)`<`[`F`](-coyoneda/index.html#F)`, `[`P`](-coyoneda/index.html#P)`, `[`A`](-coyoneda/index.html#A)`>, `[`CoyonedaKindedJ`](-coyoneda-kinded-j.html)`<`[`F`](-coyoneda/index.html#F)`, `[`P`](-coyoneda/index.html#P)`, `[`A`](-coyoneda/index.html#A)`>` |
| [ForCofree](-for-cofree.html) | `class ForCofree` |
| [ForCoyoneda](-for-coyoneda.html) | `class ForCoyoneda` |
| [ForFree](-for-free.html) | `class ForFree` |
| [ForFreeApplicative](-for-free-applicative.html) | `class ForFreeApplicative` |
| [ForYoneda](-for-yoneda.html) | `class ForYoneda` |
| [Free](-free/index.html) | `sealed class Free<S, out A> : `[`FreeOf`](-free-of.html)`<`[`S`](-free/index.html#S)`, `[`A`](-free/index.html#A)`>` |
| [FreeApplicative](-free-applicative/index.html) | `sealed class FreeApplicative<F, out A> : `[`FreeApplicativeOf`](-free-applicative-of.html)`<`[`F`](-free-applicative/index.html#F)`, `[`A`](-free-applicative/index.html#A)`>`<br>See [https//github.com/edmundnoble/cats/blob/6454b4f8b7c5cefd15d8198fa7d52e46e2f45fea/docs/src/main/tut/datatypes/freeapplicative.md](https//github.com/edmundnoble/cats/blob/6454b4f8b7c5cefd15d8198fa7d52e46e2f45fea/docs/src/main/tut/datatypes/freeapplicative.md) |
| [StackSafeMonadContinuation](-stack-safe-monad-continuation/index.html) | `open class StackSafeMonadContinuation<F, A> : Continuation<`[`Free`](-free/index.html)`<`[`F`](-stack-safe-monad-continuation/index.html#F)`, `[`A`](-stack-safe-monad-continuation/index.html#A)`>>, Monad<`[`F`](-stack-safe-monad-continuation/index.html#F)`>` |
| [Trampoline](-trampoline.html) | `object Trampoline : `[`TrampolineFunctions`](-trampoline-functions/index.html) |
| [TrampolineFunctions](-trampoline-functions/index.html) | `interface TrampolineFunctions` |
| [Yoneda](-yoneda/index.html) | `abstract class Yoneda<F, A> : `[`YonedaOf`](-yoneda-of.html)`<`[`F`](-yoneda/index.html#F)`, `[`A`](-yoneda/index.html#A)`>, `[`YonedaKindedJ`](-yoneda-kinded-j.html)`<`[`F`](-yoneda/index.html#F)`, `[`A`](-yoneda/index.html#A)`>` |

### Type Aliases

| [CofreeEval](-cofree-eval.html) | `typealias CofreeEval<S, A> = Kind<`[`S`](-cofree-eval.html#S)`, `[`Cofree`](-cofree/index.html)`<`[`S`](-cofree-eval.html#S)`, `[`A`](-cofree-eval.html#A)`>>` |
| [CofreeKindedJ](-cofree-kinded-j.html) | `typealias CofreeKindedJ<S, A> = HkJ2<`[`ForCofree`](-for-cofree.html)`, `[`S`](-cofree-kinded-j.html#S)`, `[`A`](-cofree-kinded-j.html#A)`>` |
| [CofreeOf](-cofree-of.html) | `typealias CofreeOf<S, A> = Kind2<`[`ForCofree`](-for-cofree.html)`, `[`S`](-cofree-of.html#S)`, `[`A`](-cofree-of.html#A)`>` |
| [CofreePartialOf](-cofree-partial-of.html) | `typealias CofreePartialOf<S> = Kind<`[`ForCofree`](-for-cofree.html)`, `[`S`](-cofree-partial-of.html#S)`>` |
| [CoyonedaKindedJ](-coyoneda-kinded-j.html) | `typealias CoyonedaKindedJ<F, P, A> = HkJ3<`[`ForCoyoneda`](-for-coyoneda.html)`, `[`F`](-coyoneda-kinded-j.html#F)`, `[`P`](-coyoneda-kinded-j.html#P)`, `[`A`](-coyoneda-kinded-j.html#A)`>` |
| [CoyonedaOf](-coyoneda-of.html) | `typealias CoyonedaOf<F, P, A> = Kind3<`[`ForCoyoneda`](-for-coyoneda.html)`, `[`F`](-coyoneda-of.html#F)`, `[`P`](-coyoneda-of.html#P)`, `[`A`](-coyoneda-of.html#A)`>` |
| [CoyonedaPartialOf](-coyoneda-partial-of.html) | `typealias CoyonedaPartialOf<F, P> = Kind2<`[`ForCoyoneda`](-for-coyoneda.html)`, `[`F`](-coyoneda-partial-of.html#F)`, `[`P`](-coyoneda-partial-of.html#P)`>` |
| [FreeApplicativeOf](-free-applicative-of.html) | `typealias FreeApplicativeOf<F, A> = Kind2<`[`ForFreeApplicative`](-for-free-applicative.html)`, `[`F`](-free-applicative-of.html#F)`, `[`A`](-free-applicative-of.html#A)`>` |
| [FreeApplicativePartialOf](-free-applicative-partial-of.html) | `typealias FreeApplicativePartialOf<F> = Kind<`[`ForFreeApplicative`](-for-free-applicative.html)`, `[`F`](-free-applicative-partial-of.html#F)`>` |
| [FreeOf](-free-of.html) | `typealias FreeOf<S, A> = Kind2<`[`ForFree`](-for-free.html)`, `[`S`](-free-of.html#S)`, `[`A`](-free-of.html#A)`>` |
| [FreePartialOf](-free-partial-of.html) | `typealias FreePartialOf<S> = Kind<`[`ForFree`](-for-free.html)`, `[`S`](-free-partial-of.html#S)`>` |
| [TrampolineF](-trampoline-f.html) | `typealias TrampolineF<A> = `[`Free`](-free/index.html)`<ForFunction0, `[`A`](-trampoline-f.html#A)`>`<br>Trampoline is often used to emulate tail recursion. The idea is to have some step code that can be trampolined itself to emulate recursion. The difference with standard recursion would be that there is no need to rewind the whole stack when we reach the end of the stack, since the first value returned that is not a trampoline would be directly returned as the overall result value for the whole function chain. That means Trampoline emulates what tail recursion does. |
| [YonedaKindedJ](-yoneda-kinded-j.html) | `typealias YonedaKindedJ<F, A> = HkJ2<`[`ForYoneda`](-for-yoneda.html)`, `[`F`](-yoneda-kinded-j.html#F)`, `[`A`](-yoneda-kinded-j.html#A)`>` |
| [YonedaOf](-yoneda-of.html) | `typealias YonedaOf<F, A> = Kind2<`[`ForYoneda`](-for-yoneda.html)`, `[`F`](-yoneda-of.html#F)`, `[`A`](-yoneda-of.html#A)`>` |
| [YonedaPartialOf](-yoneda-partial-of.html) | `typealias YonedaPartialOf<F> = Kind<`[`ForYoneda`](-for-yoneda.html)`, `[`F`](-yoneda-partial-of.html#F)`>` |

### Extensions for External Classes

| [arrow.Kind](arrow.-kind/index.html) |  |
| [arrow.typeclasses.Monad](arrow.typeclasses.-monad/index.html) |  |

### Functions

| [foldMap](fold-map.html) | `fun <M, S, A> `[`Free`](-free/index.html)`<`[`S`](fold-map.html#S)`, `[`A`](fold-map.html#A)`>.foldMap(f: FunctionK<`[`S`](fold-map.html#S)`, `[`M`](fold-map.html#M)`>, MM: Monad<`[`M`](fold-map.html#M)`>): Kind<`[`M`](fold-map.html#M)`, `[`A`](fold-map.html#A)`>` |
| [free](free.html) | `fun <S, A> `[`A`](free.html#A)`.free(): `[`Free`](-free/index.html)`<`[`S`](free.html#S)`, `[`A`](free.html#A)`>` |
| [freeAp](free-ap.html) | `fun <S, A> `[`A`](free-ap.html#A)`.freeAp(): `[`FreeApplicative`](-free-applicative/index.html)`<`[`S`](free-ap.html#S)`, `[`A`](free-ap.html#A)`>` |
| [run](run.html) | `fun <F, A> `[`Free`](-free/index.html)`<`[`F`](run.html#F)`, `[`A`](run.html#A)`>.run(M: Monad<`[`F`](run.html#F)`>): Kind<`[`F`](run.html#F)`, `[`A`](run.html#A)`>` |
| [runT](run-t.html) | `fun <A> `[`TrampolineF`](-trampoline-f.html)`<`[`A`](run-t.html#A)`>.runT(): `[`A`](run-t.html#A) |
| [step](step.html) | `tailrec fun <S, A> `[`Free`](-free/index.html)`<`[`S`](step.html#S)`, `[`A`](step.html#A)`>.step(): `[`Free`](-free/index.html)`<`[`S`](step.html#S)`, `[`A`](step.html#A)`>`<br>Takes one evaluation step in the Free monad, re-associating left-nested binds in the process. |

