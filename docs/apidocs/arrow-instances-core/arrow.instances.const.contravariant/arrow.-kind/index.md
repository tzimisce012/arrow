---
title: arrow.instances.const.contravariant.arrow.Kind - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances.const.contravariant](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [contramap](contramap.html) | `fun <A, B> Kind<Kind<ForConst, `[`A`](contramap.html#A)`>, `[`A`](contramap.html#A)`>.contramap(arg1: (`[`B`](contramap.html#B)`) -> `[`A`](contramap.html#A)`): Const<`[`A`](contramap.html#A)`, `[`B`](contramap.html#B)`>` |
| [imap](imap.html) | `fun <A, B> Kind<Kind<ForConst, `[`A`](imap.html#A)`>, `[`A`](imap.html#A)`>.imap(arg1: (`[`A`](imap.html#A)`) -> `[`B`](imap.html#B)`, arg2: (`[`B`](imap.html#B)`) -> `[`A`](imap.html#A)`): Const<`[`A`](imap.html#A)`, `[`B`](imap.html#B)`>` |
| [narrow](narrow.html) | `fun <A, B : `[`A`](narrow.html#A)`> Kind<Kind<ForConst, `[`A`](narrow.html#A)`>, `[`A`](narrow.html#A)`>.narrow(): Const<`[`A`](narrow.html#A)`, `[`B`](narrow.html#B)`>` |

