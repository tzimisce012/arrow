---
title: flatTraverse - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances.either.traverse](../index.html) / [arrow.Kind](index.html) / [flatTraverse](./flat-traverse.html)

# flatTraverse

`@JvmName("flatTraverse") fun <L, G, A, B> Kind<Kind<ForEither, `[`L`](flat-traverse.html#L)`>, `[`A`](flat-traverse.html#A)`>.flatTraverse(arg1: Monad<Kind<ForEither, `[`L`](flat-traverse.html#L)`>>, arg2: Applicative<`[`G`](flat-traverse.html#G)`>, arg3: (`[`A`](flat-traverse.html#A)`) -> Kind<`[`G`](flat-traverse.html#G)`, Kind<Kind<ForEither, `[`L`](flat-traverse.html#L)`>, `[`B`](flat-traverse.html#B)`>>): Kind<`[`G`](flat-traverse.html#G)`, Kind<Kind<ForEither, `[`L`](flat-traverse.html#L)`>, `[`B`](flat-traverse.html#B)`>>`