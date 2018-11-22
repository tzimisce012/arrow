---
title: MuCorecursiveInstance - arrow-instances-recursion
---

[arrow-instances-recursion](../index.html) / [arrow.recursion.instances](index.html) / [MuCorecursiveInstance](./-mu-corecursive-instance.html)

# MuCorecursiveInstance

`@extension interface MuCorecursiveInstance : Corecursive<ForMu>, `[`MuBirecursiveInstance`](-mu-birecursive-instance/index.html)

### Inherited Functions

| [cata](-mu-birecursive-instance/cata.html) | `open fun <F, A> Functor<`[`F`](-mu-birecursive-instance/cata.html#F)`>.cata(tf: Kind<ForMu, `[`F`](-mu-birecursive-instance/cata.html#F)`>, alg: Algebra<`[`F`](-mu-birecursive-instance/cata.html#F)`, Eval<`[`A`](-mu-birecursive-instance/cata.html#A)`>>): `[`A`](-mu-birecursive-instance/cata.html#A) |
| [projectT](-mu-birecursive-instance/project-t.html) | `open fun <F> Functor<`[`F`](-mu-birecursive-instance/project-t.html#F)`>.projectT(tf: Kind<ForMu, `[`F`](-mu-birecursive-instance/project-t.html#F)`>): Kind<`[`F`](-mu-birecursive-instance/project-t.html#F)`, MuOf<`[`F`](-mu-birecursive-instance/project-t.html#F)`>>` |

