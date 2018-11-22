---
title: Eval.Later.<init> - arrow-core
---

[arrow-core](../../../index.html) / [arrow.core](../../index.html) / [Eval](../index.html) / [Later](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`Later(f: () -> `[`A`](index.html#A)`)`

Construct a lazy Eval instance.

This type should be used for most "lazy" values. In some sense it is equivalent to using a lazy val.

When caching is not required or desired (e.g. if the value produced may be large) prefer Always. When there
is no computation necessary, prefer Now.

Once Later has been evaluated, the closure (and any values captured by the closure) will not be retained, and
will be available for garbage collection.

