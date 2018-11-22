---
title: PIso.id - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics](../index.html) / [PIso](index.html) / [id](./id.html)

# id

`fun <S> id(): `[`Iso`](../-iso.html)`<`[`S`](id.html#S)`, `[`S`](id.html#S)`>`

create an [PIso](index.html) between any type and itself.
Id is the zero element of optics composition, for any optic o of type O (e.g. PLens, Prism, POptional, ...):
o compose Iso.id == o

