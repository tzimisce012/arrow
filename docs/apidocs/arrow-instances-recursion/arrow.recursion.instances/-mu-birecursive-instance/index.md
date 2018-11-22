---
title: MuBirecursiveInstance - arrow-instances-recursion
---

[arrow-instances-recursion](../../index.html) / [arrow.recursion.instances](../index.html) / [MuBirecursiveInstance](./index.html)

# MuBirecursiveInstance

`@extension interface MuBirecursiveInstance : Birecursive<ForMu>`

### Functions

| [cata](cata.html) | `open fun <F, A> Functor<`[`F`](cata.html#F)`>.cata(tf: Kind<ForMu, `[`F`](cata.html#F)`>, alg: Algebra<`[`F`](cata.html#F)`, Eval<`[`A`](cata.html#A)`>>): `[`A`](cata.html#A) |
| [embedT](embed-t.html) | `open fun <F> Functor<`[`F`](embed-t.html#F)`>.embedT(tf: Kind<`[`F`](embed-t.html#F)`, Eval<Kind<ForMu, `[`F`](embed-t.html#F)`>>>): Eval<Mu<`[`F`](embed-t.html#F)`>>` |
| [projectT](project-t.html) | `open fun <F> Functor<`[`F`](project-t.html#F)`>.projectT(tf: Kind<ForMu, `[`F`](project-t.html#F)`>): Kind<`[`F`](project-t.html#F)`, MuOf<`[`F`](project-t.html#F)`>>` |

### Inheritors

| [MuCorecursiveInstance](../-mu-corecursive-instance.html) | `interface MuCorecursiveInstance : Corecursive<ForMu>, `[`MuBirecursiveInstance`](./index.html) |
| [MuRecursiveInstance](../-mu-recursive-instance.html) | `interface MuRecursiveInstance : Recursive<ForMu>, `[`MuBirecursiveInstance`](./index.html) |

