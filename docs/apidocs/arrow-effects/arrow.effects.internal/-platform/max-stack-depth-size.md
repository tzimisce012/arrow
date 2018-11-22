---
title: Platform.maxStackDepthSize - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects.internal](../index.html) / [Platform](index.html) / [maxStackDepthSize](./max-stack-depth-size.html)

# maxStackDepthSize

`const val maxStackDepthSize: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)

Establishes the maximum stack depth for `IO#map` operations.

The default is `128`, from which we substract one as an
optimization. This default has been reached like this:

* according to official docs, the default stack size on 32-bits
    Windows and Linux was 320 KB, whereas for 64-bits it is 1024 KB
* according to measurements chaining `Function1` references uses
    approximately 32 bytes of stack space on a 64 bits system;
    this could be lower if "compressed oops" is activated
* therefore a "map fusion" that goes 128 in stack depth can use
    about 4 KB of stack space
