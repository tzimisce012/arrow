---
title: Eval.Always.<init> - arrow-core
---

[arrow-core](../../../index.html) / [arrow.core](../../index.html) / [Eval](../index.html) / [Always](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`Always(f: () -> `[`A`](index.html#A)`)`

Construct a lazy Eval instance.

This type can be used for "lazy" values. In some sense it is equivalent to using a Function0 value.

This type will evaluate the computation every time the value is required. It should be avoided except when
laziness is required and caching must be avoided. Generally, prefer Later.

