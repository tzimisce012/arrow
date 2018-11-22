---
title: arrow.instances.coproduct.contravariant.arrow.Kind - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.coproduct.contravariant](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [contramap](contramap.html) | `fun <F, G, A, B> Kind<Kind<Kind<ForCoproduct, `[`F`](contramap.html#F)`>, `[`G`](contramap.html#G)`>, `[`A`](contramap.html#A)`>.contramap(arg1: (`[`B`](contramap.html#B)`) -> `[`A`](contramap.html#A)`, CF: Contravariant<`[`F`](contramap.html#F)`>, CG: Contravariant<`[`G`](contramap.html#G)`>): Kind<`[`G`](contramap.html#G)`, `[`B`](contramap.html#B)`>` |
| [imap](imap.html) | `fun <F, G, A, B> Kind<Kind<Kind<ForCoproduct, `[`F`](imap.html#F)`>, `[`G`](imap.html#G)`>, `[`A`](imap.html#A)`>.imap(arg1: (`[`A`](imap.html#A)`) -> `[`B`](imap.html#B)`, arg2: (`[`B`](imap.html#B)`) -> `[`A`](imap.html#A)`, CF: Contravariant<`[`F`](imap.html#F)`>, CG: Contravariant<`[`G`](imap.html#G)`>): Kind<`[`G`](imap.html#G)`, `[`B`](imap.html#B)`>` |
| [narrow](narrow.html) | `fun <F, G, A, B : `[`A`](narrow.html#A)`> Kind<Kind<Kind<ForCoproduct, `[`F`](narrow.html#F)`>, `[`G`](narrow.html#G)`>, `[`A`](narrow.html#A)`>.narrow(CF: Contravariant<`[`F`](narrow.html#F)`>, CG: Contravariant<`[`G`](narrow.html#G)`>): Kind<`[`G`](narrow.html#G)`, `[`B`](narrow.html#B)`>` |

