---
title: FixBirecursiveInstance - arrow-instances-recursion
---

[arrow-instances-recursion](../../index.html) / [arrow.recursion.instances](../index.html) / [FixBirecursiveInstance](./index.html)

# FixBirecursiveInstance

`@extension interface FixBirecursiveInstance : Birecursive<ForFix>`

### Functions

| [embedT](embed-t.html) | `open fun <F> Functor<`[`F`](embed-t.html#F)`>.embedT(tf: Kind<`[`F`](embed-t.html#F)`, Eval<Kind<ForFix, `[`F`](embed-t.html#F)`>>>): Later<Fix<`[`F`](embed-t.html#F)`>>` |
| [projectT](project-t.html) | `open fun <F> Functor<`[`F`](project-t.html#F)`>.projectT(tf: Kind<ForFix, `[`F`](project-t.html#F)`>): Kind<`[`F`](project-t.html#F)`, FixOf<`[`F`](project-t.html#F)`>>` |

### Inheritors

| [FixCorecursiveInstance](../-fix-corecursive-instance.html) | `interface FixCorecursiveInstance : Corecursive<ForFix>, `[`FixBirecursiveInstance`](./index.html) |
| [FixRecursiveInstance](../-fix-recursive-instance.html) | `interface FixRecursiveInstance : Recursive<ForFix>, `[`FixBirecursiveInstance`](./index.html) |

