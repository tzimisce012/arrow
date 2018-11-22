---
title: ListK.<init> - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [ListK](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`ListK(list: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`A`](index.html#A)`>)`

A wrapper data type also considered by the @extension mechanisms to forward type class
instance methods into both the wrapper and the wrapped data type. Ex. List#foldMap(M: Monoid)

A data type is considered a wrapper if

* It contains a single constructor with one parameter whose type is a type constructor with one type parameter
* It's a sub type of the type it wraps

The type class @extension mechanism will project then all syntax generated for the Wrapper also into the Wrapped
type constructor as extension functions.

