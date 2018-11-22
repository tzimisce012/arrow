---
title: arrow.free.instances - arrow-instances-free
---

[arrow-instances-free](../index.html) / [arrow.free.instances](./index.html)

## Package arrow.free.instances

### Types

| [CofreeComonadInstance](-cofree-comonad-instance/index.html) | `interface CofreeComonadInstance<S> : Comonad<CofreePartialOf<`[`S`](-cofree-comonad-instance/index.html#S)`>>, `[`CofreeFunctorInstance`](-cofree-functor-instance/index.html)`<`[`S`](-cofree-comonad-instance/index.html#S)`>` |
| [CofreeContext](-cofree-context/index.html) | `class CofreeContext<S> : `[`CofreeComonadInstance`](-cofree-comonad-instance/index.html)`<`[`S`](-cofree-context/index.html#S)`>` |
| [CofreeContextPartiallyApplied](-cofree-context-partially-applied/index.html) | `class CofreeContextPartiallyApplied<S>` |
| [CofreeFunctorInstance](-cofree-functor-instance/index.html) | `interface CofreeFunctorInstance<S> : Functor<CofreePartialOf<`[`S`](-cofree-functor-instance/index.html#S)`>>` |
| [CoyonedaContext](-coyoneda-context/index.html) | `class CoyonedaContext<F, G> : `[`CoyonedaFunctorInstance`](-coyoneda-functor-instance/index.html)`<`[`F`](-coyoneda-context/index.html#F)`, `[`G`](-coyoneda-context/index.html#G)`>` |
| [CoyonedaContextPartiallyApplied](-coyoneda-context-partially-applied/index.html) | `class CoyonedaContextPartiallyApplied<F, G>` |
| [CoyonedaFunctorInstance](-coyoneda-functor-instance/index.html) | `interface CoyonedaFunctorInstance<F, G> : Functor<CoyonedaPartialOf<`[`F`](-coyoneda-functor-instance/index.html#F)`, `[`G`](-coyoneda-functor-instance/index.html#G)`>>` |
| [FreeApplicativeApplicativeInstance](-free-applicative-applicative-instance/index.html) | `interface FreeApplicativeApplicativeInstance<S> : Applicative<FreeApplicativePartialOf<`[`S`](-free-applicative-applicative-instance/index.html#S)`>>, `[`FreeApplicativeFunctorInstance`](-free-applicative-functor-instance/index.html)`<`[`S`](-free-applicative-applicative-instance/index.html#S)`>` |
| [FreeApplicativeContext](-free-applicative-context/index.html) | `class FreeApplicativeContext<S> : `[`FreeApplicativeApplicativeInstance`](-free-applicative-applicative-instance/index.html)`<`[`S`](-free-applicative-context/index.html#S)`>` |
| [FreeApplicativeContextPartiallyApplied](-free-applicative-context-partially-applied/index.html) | `class FreeApplicativeContextPartiallyApplied<S>` |
| [FreeApplicativeEq](-free-applicative-eq/index.html) | `interface FreeApplicativeEq<F, G, A> : Eq<Kind<FreeApplicativePartialOf<`[`F`](-free-applicative-eq/index.html#F)`>, `[`A`](-free-applicative-eq/index.html#A)`>>` |
| [FreeApplicativeFunctorInstance](-free-applicative-functor-instance/index.html) | `interface FreeApplicativeFunctorInstance<S> : Functor<FreeApplicativePartialOf<`[`S`](-free-applicative-functor-instance/index.html#S)`>>` |
| [FreeApplicativeInstance](-free-applicative-instance/index.html) | `interface FreeApplicativeInstance<S> : Applicative<FreePartialOf<`[`S`](-free-applicative-instance/index.html#S)`>>, `[`FreeFunctorInstance`](-free-functor-instance/index.html)`<`[`S`](-free-applicative-instance/index.html#S)`>` |
| [FreeContext](-free-context/index.html) | `class FreeContext<S> : `[`FreeMonadInstance`](-free-monad-instance/index.html)`<`[`S`](-free-context/index.html#S)`>` |
| [FreeContextPartiallyApplied](-free-context-partially-applied/index.html) | `class FreeContextPartiallyApplied<S>` |
| [FreeEq](-free-eq/index.html) | `interface FreeEq<F, G, A> : Eq<Kind<FreePartialOf<`[`F`](-free-eq/index.html#F)`>, `[`A`](-free-eq/index.html#A)`>>` |
| [FreeFunctorInstance](-free-functor-instance/index.html) | `interface FreeFunctorInstance<S> : Functor<FreePartialOf<`[`S`](-free-functor-instance/index.html#S)`>>` |
| [FreeMonadInstance](-free-monad-instance/index.html) | `interface FreeMonadInstance<S> : Monad<FreePartialOf<`[`S`](-free-monad-instance/index.html#S)`>>, `[`FreeApplicativeInstance`](-free-applicative-instance/index.html)`<`[`S`](-free-monad-instance/index.html#S)`>` |
| [YonedaContext](-yoneda-context/index.html) | `class YonedaContext<U> : `[`YonedaFunctorInstance`](-yoneda-functor-instance/index.html)`<`[`U`](-yoneda-context/index.html#U)`>` |
| [YonedaContextPartiallyApplied](-yoneda-context-partially-applied/index.html) | `class YonedaContextPartiallyApplied<U>` |
| [YonedaFunctorInstance](-yoneda-functor-instance/index.html) | `interface YonedaFunctorInstance<U> : Functor<YonedaPartialOf<`[`U`](-yoneda-functor-instance/index.html#U)`>>` |

### Functions

| [ForCofree](-for-cofree.html) | `fun <S> ForCofree(): `[`CofreeContextPartiallyApplied`](-cofree-context-partially-applied/index.html)`<`[`S`](-for-cofree.html#S)`>` |
| [ForCoyoneda](-for-coyoneda.html) | `fun <F, G> ForCoyoneda(): `[`CoyonedaContextPartiallyApplied`](-coyoneda-context-partially-applied/index.html)`<`[`F`](-for-coyoneda.html#F)`, `[`G`](-for-coyoneda.html#G)`>` |
| [ForFree](-for-free.html) | `fun <S> ForFree(): `[`FreeContextPartiallyApplied`](-free-context-partially-applied/index.html)`<`[`S`](-for-free.html#S)`>` |
| [ForFreeApplicative](-for-free-applicative.html) | `fun <S> ForFreeApplicative(): `[`FreeApplicativeContextPartiallyApplied`](-free-applicative-context-partially-applied/index.html)`<`[`S`](-for-free-applicative.html#S)`>` |
| [ForYoneda](-for-yoneda.html) | `fun <U> ForYoneda(): `[`YonedaContextPartiallyApplied`](-yoneda-context-partially-applied/index.html)`<`[`U`](-for-yoneda.html#U)`>` |

