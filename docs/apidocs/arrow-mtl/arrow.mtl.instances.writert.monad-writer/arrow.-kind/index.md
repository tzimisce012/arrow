---
title: arrow.mtl.instances.writert.monadWriter.arrow.Kind - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances.writert.monadWriter](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [censor](censor.html) | `fun <F, W, A> Kind<Kind<Kind<ForWriterT, `[`F`](censor.html#F)`>, `[`W`](censor.html#W)`>, `[`A`](censor.html#A)`>.censor(f: (`[`W`](censor.html#W)`) -> `[`W`](censor.html#W)`, MF: Monad<`[`F`](censor.html#F)`>, MM: Monoid<`[`W`](censor.html#W)`>): Kind<`[`W`](censor.html#W)`, `[`A`](censor.html#A)`>` |
| [listen](listen.html) | `fun <F, W, A> Kind<Kind<Kind<ForWriterT, `[`F`](listen.html#F)`>, `[`W`](listen.html#W)`>, `[`A`](listen.html#A)`>.listen(MF: Monad<`[`F`](listen.html#F)`>, MM: Monoid<`[`W`](listen.html#W)`>): Kind<`[`W`](listen.html#W)`, Tuple2<`[`W`](listen.html#W)`, `[`A`](listen.html#A)`>>` |
| [listens](listens.html) | `fun <F, W, A, B> Kind<Kind<Kind<ForWriterT, `[`F`](listens.html#F)`>, `[`W`](listens.html#W)`>, `[`A`](listens.html#A)`>.listens(f: (`[`W`](listens.html#W)`) -> `[`B`](listens.html#B)`, MF: Monad<`[`F`](listens.html#F)`>, MM: Monoid<`[`W`](listens.html#W)`>): Kind<`[`W`](listens.html#W)`, Tuple2<`[`B`](listens.html#B)`, `[`A`](listens.html#A)`>>` |
| [pass](pass.html) | `fun <F, W, A> Kind<Kind<Kind<ForWriterT, `[`F`](pass.html#F)`>, `[`W`](pass.html#W)`>, Tuple2<(`[`W`](pass.html#W)`) -> `[`W`](pass.html#W)`, `[`A`](pass.html#A)`>>.pass(MF: Monad<`[`F`](pass.html#F)`>, MM: Monoid<`[`W`](pass.html#W)`>): Kind<`[`W`](pass.html#W)`, `[`A`](pass.html#A)`>` |

