---
title: compose - arrow-typeclasses
---

[arrow-typeclasses](../index.html) / [arrow.typeclasses](index.html) / [compose](./compose.html)

# compose

`fun <F, G> `[`Foldable`](-foldable/index.html)`<`[`F`](compose.html#F)`>.compose(GT: `[`Foldable`](-foldable/index.html)`<`[`G`](compose.html#G)`>): `[`ComposedFoldable`](-composed-foldable/index.html)`<`[`F`](compose.html#F)`, `[`G`](compose.html#G)`>`
`fun <F, G> `[`Traverse`](-traverse/index.html)`<`[`F`](compose.html#F)`>.compose(GT: `[`Traverse`](-traverse/index.html)`<`[`G`](compose.html#G)`>, GA: `[`Applicative`](-applicative/index.html)`<`[`G`](compose.html#G)`>): `[`Traverse`](-traverse/index.html)`<`[`Nested`](-nested.html)`<`[`F`](compose.html#F)`, `[`G`](compose.html#G)`>>`
`fun <F, G> `[`SemigroupK`](-semigroup-k/index.html)`<`[`F`](compose.html#F)`>.compose(): `[`SemigroupK`](-semigroup-k/index.html)`<`[`Nested`](-nested.html)`<`[`F`](compose.html#F)`, `[`G`](compose.html#G)`>>`
`fun <F, G> `[`MonoidK`](-monoid-k/index.html)`<`[`F`](compose.html#F)`>.compose(): `[`MonoidK`](-monoid-k/index.html)`<`[`Nested`](-nested.html)`<`[`F`](compose.html#F)`, `[`G`](compose.html#G)`>>`
`fun <F, G> `[`Invariant`](-invariant/index.html)`<`[`F`](compose.html#F)`>.compose(GF: `[`Invariant`](-invariant/index.html)`<`[`G`](compose.html#G)`>): `[`Invariant`](-invariant/index.html)`<`[`Nested`](-nested.html)`<`[`F`](compose.html#F)`, `[`G`](compose.html#G)`>>`
`fun <F, G> `[`Functor`](-functor/index.html)`<`[`F`](compose.html#F)`>.compose(GF: `[`Functor`](-functor/index.html)`<`[`G`](compose.html#G)`>): `[`Functor`](-functor/index.html)`<`[`Nested`](-nested.html)`<`[`F`](compose.html#F)`, `[`G`](compose.html#G)`>>`
`fun <F, G> `[`Contravariant`](-contravariant/index.html)`<`[`F`](compose.html#F)`>.compose(GF: `[`Contravariant`](-contravariant/index.html)`<`[`G`](compose.html#G)`>): `[`Functor`](-functor/index.html)`<`[`Nested`](-nested.html)`<`[`F`](compose.html#F)`, `[`G`](compose.html#G)`>>`
`fun <F, G> `[`Applicative`](-applicative/index.html)`<`[`F`](compose.html#F)`>.compose(GA: `[`Applicative`](-applicative/index.html)`<`[`G`](compose.html#G)`>): `[`Applicative`](-applicative/index.html)`<`[`Nested`](-nested.html)`<`[`F`](compose.html#F)`, `[`G`](compose.html#G)`>>`
`fun <F, G> `[`Alternative`](-alternative.html)`<`[`F`](compose.html#F)`>.compose(GA: `[`Applicative`](-applicative/index.html)`<`[`G`](compose.html#G)`>): `[`Alternative`](-alternative.html)`<`[`Nested`](-nested.html)`<`[`F`](compose.html#F)`, `[`G`](compose.html#G)`>>`
`fun <F, G> `[`Bifoldable`](-bifoldable/index.html)`<`[`F`](compose.html#F)`>.compose(BG: `[`Bifoldable`](-bifoldable/index.html)`<`[`G`](compose.html#G)`>): `[`Bifoldable`](-bifoldable/index.html)`<`[`Nested`](-nested.html)`<`[`F`](compose.html#F)`, `[`G`](compose.html#G)`>>`
`fun <F, G> `[`Bifunctor`](-bifunctor/index.html)`<`[`F`](compose.html#F)`>.compose(BG: `[`Bifunctor`](-bifunctor/index.html)`<`[`G`](compose.html#G)`>): `[`Bifunctor`](-bifunctor/index.html)`<`[`Nested`](-nested.html)`<`[`F`](compose.html#F)`, `[`G`](compose.html#G)`>>`