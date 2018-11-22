---
title: remove - arrow-optics
---

[arrow-optics](../index.html) / [arrow.optics.typeclasses](index.html) / [remove](./remove.html)

# remove

`fun <S, I, A> `[`At`](-at/index.html)`<`[`S`](remove.html#S)`, `[`I`](remove.html#I)`, Option<`[`A`](remove.html#A)`>>.remove(s: `[`S`](remove.html#S)`, i: `[`I`](remove.html#I)`): `[`S`](remove.html#S)

Delete a value associated with a key in a Map-like container

### Parameters

`s` - [S](remove.html#S) structure to zoom into and find focus [A](remove.html#A).

`i` - index [I](remove.html#I) to zoom into [S](remove.html#S) and find focus [A](remove.html#A)

**Receiver**
[At](-at/index.html) to provide a [Lens](../arrow.optics/-lens.html) where an [Option](#) focus can be found at index [I](remove.html#I) for a structure [S](remove.html#S).

**Return**
[S](remove.html#S) where focus [A](remove.html#A) was removed at index [I](remove.html#I)

`fun <S, I, A> `[`At`](-at/index.html)`<`[`S`](remove.html#S)`, `[`I`](remove.html#I)`, Option<`[`A`](remove.html#A)`>>.remove(i: `[`I`](remove.html#I)`): (`[`S`](remove.html#S)`) -> `[`S`](remove.html#S)

Lift deletion of a value associated with a key in a Map-like container

### Parameters

`i` - index [I](remove.html#I) to zoom into [S](remove.html#S) and find focus [A](remove.html#A)

**Receiver**
[At](-at/index.html) to provide a [Lens](../arrow.optics/-lens.html) where an [Option](#) focus can be found at index [I](remove.html#I) for a structure [S](remove.html#S).

**Return**
function that takes [S](remove.html#S) and returns a new [S](remove.html#S) where focus [A](remove.html#A) was removed at index [I](remove.html#I)

