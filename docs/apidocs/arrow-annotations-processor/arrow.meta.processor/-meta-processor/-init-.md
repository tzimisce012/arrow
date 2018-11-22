---
title: MetaProcessor.<init> - arrow-annotations-processor
---

[arrow-annotations-processor](../../index.html) / [arrow.meta.processor](../index.html) / [MetaProcessor](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`MetaProcessor(annotation: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<`[`A`](index.html#A)`>)`

The Meta Processor provides access to the Meta Api and is meant to be extended by concrete processors.
It performs processing automatically provided the concrete processor implements:

override fun transform(annotatedElement: AnnotatedElement): FileSpec.Builder

[AnnotatedElement](-annotated-element/index.html) provides already reified `Type` instances from the Arrow meta AST
that attempts to unify as much info as possible from the annotated Kotlin code.

The Current [JvmMetaApi](../../arrow.meta.encoder.jvm/-jvm-meta-api/index.html) impl includes support for extracting information with a blend
of Kotlin Poet, TypeElement java api's and the Kotlin Metadata Library.

