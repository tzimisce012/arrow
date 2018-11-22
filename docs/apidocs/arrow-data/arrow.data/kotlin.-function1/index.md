---
title: arrow.data.kotlin.Function1 - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [kotlin.Function1](./index.html)

### Extensions for kotlin.Function1

| [coreader](coreader.html) | `fun <A, B> ((`[`A`](coreader.html#A)`) -> `[`B`](coreader.html#B)`).coreader(): `[`CoreaderT`](../-coreader-t.html)`<ForId, `[`A`](coreader.html#A)`, `[`B`](coreader.html#B)`>` |
| [kleisli](kleisli.html) | `fun <F, D, A> `[`KleisliFun`](../-kleisli-fun.html)`<`[`F`](kleisli.html#F)`, `[`D`](kleisli.html#D)`, `[`A`](kleisli.html#A)`>.kleisli(): `[`Kleisli`](../-kleisli/index.html)`<`[`F`](kleisli.html#F)`, `[`D`](kleisli.html#D)`, `[`A`](kleisli.html#A)`>`<br>Syntax for constructing a [Kleisli](../-kleisli/index.html) |
| [reader](reader.html) | `fun <D, A> `[`ReaderFun`](../-reader-fun.html)`<`[`D`](reader.html#D)`, `[`A`](reader.html#A)`>.reader(): `[`Reader`](../-reader.html)`<`[`D`](reader.html#D)`, `[`A`](reader.html#A)`>`<br>Syntax for constructing a [Reader](../-reader.html) |
| [readerT](reader-t.html) | `fun <F, D, A> `[`ReaderTFun`](../-reader-t-fun.html)`<`[`F`](reader-t.html#F)`, `[`D`](reader-t.html#D)`, `[`A`](reader-t.html#A)`>.readerT(): `[`ReaderT`](../-reader-t.html)`<`[`F`](reader-t.html#F)`, `[`D`](reader-t.html#D)`, `[`A`](reader-t.html#A)`>`<br>Syntax for constructing a [ReaderT](../-reader-t.html) |
| [stateT](state-t.html) | `fun <F, S, A> `[`StateTFun`](../-state-t-fun.html)`<`[`F`](state-t.html#F)`, `[`S`](state-t.html#S)`, `[`A`](state-t.html#A)`>.stateT(MF: Monad<`[`F`](state-t.html#F)`>): `[`StateT`](../-state-t/index.html)`<`[`F`](state-t.html#F)`, `[`S`](state-t.html#S)`, `[`A`](state-t.html#A)`>`<br>Wrap the function with [StateT](../-state-t/index.html). |
| [toState](to-state.html) | `fun <S, A> `[`StateFun`](../-state-fun.html)`<`[`S`](to-state.html#S)`, `[`A`](to-state.html#A)`>.toState(): `[`State`](../-state.html)`<`[`S`](to-state.html#S)`, `[`A`](to-state.html#A)`>`<br>Syntax for constructing a `StateT<ForId, S, A>` from a function `(S) -> Tuple2<S, A>` |

