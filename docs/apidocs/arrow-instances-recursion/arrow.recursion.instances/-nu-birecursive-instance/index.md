---
title: NuBirecursiveInstance - arrow-instances-recursion
---

[arrow-instances-recursion](../../index.html) / [arrow.recursion.instances](../index.html) / [NuBirecursiveInstance](./index.html)

# NuBirecursiveInstance

`@extension interface NuBirecursiveInstance : Birecursive<ForNu>`

### Functions

| [ana](ana.html) | `open fun <F, A> Functor<`[`F`](ana.html#F)`>.ana(a: `[`A`](ana.html#A)`, coalg: Coalgebra<`[`F`](ana.html#F)`, `[`A`](ana.html#A)`>): Nu<`[`F`](ana.html#F)`>` |
| [embedT](embed-t.html) | `open fun <F> Functor<`[`F`](embed-t.html#F)`>.embedT(tf: Kind<`[`F`](embed-t.html#F)`, Eval<Kind<ForNu, `[`F`](embed-t.html#F)`>>>): Now<Nu<`[`F`](embed-t.html#F)`>>` |
| [projectT](project-t.html) | `open fun <F> Functor<`[`F`](project-t.html#F)`>.projectT(tf: Kind<ForNu, `[`F`](project-t.html#F)`>): Kind<`[`F`](project-t.html#F)`, Nu<`[`F`](project-t.html#F)`>>` |

### Inheritors

| [NuCorecursiveInstance](../-nu-corecursive-instance.html) | `interface NuCorecursiveInstance : Corecursive<ForNu>, `[`NuBirecursiveInstance`](./index.html) |
| [NuRecursiveInstance](../-nu-recursive-instance.html) | `interface NuRecursiveInstance : Recursive<ForNu>, `[`NuBirecursiveInstance`](./index.html) |

