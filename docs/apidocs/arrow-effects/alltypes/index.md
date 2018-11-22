---
title: alltypes - arrow-effects
---

### All Types

| [arrow.effects.typeclasses.Async](../arrow.effects.typeclasses/-async/index.html) |  |
| [arrow.effects.data.internal.BindingCancellationException](../arrow.effects.data.internal/-binding-cancellation-exception/index.html) |  |
| [arrow.effects.typeclasses.Bracket](../arrow.effects.typeclasses/-bracket/index.html) |  |
| [arrow.effects.typeclasses.ConcurrentEffect](../arrow.effects.typeclasses/-concurrent-effect/index.html) |  |
| [arrow.effects.typeclasses.Disposable](../arrow.effects.typeclasses/-disposable.html) |  |
| [arrow.effects.typeclasses.Duration](../arrow.effects.typeclasses/-duration/index.html) |  |
| [arrow.effects.typeclasses.Effect](../arrow.effects.typeclasses/-effect/index.html) |  |
| [arrow.core.Either](../arrow.effects.typeclasses/arrow.core.-either/index.html) (extensions in package arrow.effects.typeclasses) |  |
| [arrow.effects.typeclasses.ExitCase](../arrow.effects.typeclasses/-exit-case/index.html) |  |
| [arrow.effects.typeclasses.Fiber](../arrow.effects.typeclasses/-fiber/index.html) | [Fiber](../arrow.effects.typeclasses/-fiber/index.html) represents the pure result of an [Async](../arrow.effects.typeclasses/-async/index.html) data type being started concurrently and that can be either joined or canceled. |
| [arrow.effects.ForIO](../arrow.effects/-for-i-o.html) |  |
| [arrow.effects.internal.ForwardCancelable](../arrow.effects.internal/-forward-cancelable/index.html) | A placeholder for a [CancelToken](#) that will be set at a later time, the equivalent of a `Deferred[IO, CancelToken]`. Used in the implementation of `bracket`, see [IOBracket](#). |
| [kotlin.Function1](../arrow.effects/kotlin.-function1/index.html) (extensions in package arrow.effects) |  |
| [arrow.effects.IO](../arrow.effects/-i-o/index.html) |  |
| [arrow.effects.internal.IOCancel](../arrow.effects.internal/-i-o-cancel/index.html) |  |
| [arrow.effects.data.internal.IOCancellationException](../arrow.effects.data.internal/-i-o-cancellation-exception.html) |  |
| [arrow.effects.internal.IOConnection](../arrow.effects.internal/-i-o-connection/index.html) | Represents a composite of functions (meant for cancellation) that are stacked. cancel() is idempotent, and all methods are thread-safe &amp; atomic. |
| [arrow.effects.IOOf](../arrow.effects/-i-o-of.html) |  |
| [arrow.effects.IOProc](../arrow.effects/-i-o-proc.html) |  |
| [kotlin.Int](../arrow.effects.typeclasses/kotlin.-int/index.html) (extensions in package arrow.effects.typeclasses) |  |
| [arrow.effects.internal.JavaCancellationException](../arrow.effects.internal/-java-cancellation-exception.html) |  |
| [arrow.Kind](../arrow.effects/arrow.-kind/index.html) (extensions in package arrow.effects) |  |
| [kotlin.Long](../arrow.effects.typeclasses/kotlin.-long/index.html) (extensions in package arrow.effects.typeclasses) |  |
| [arrow.effects.typeclasses.MonadDefer](../arrow.effects.typeclasses/-monad-defer/index.html) |  |
| [arrow.effects.typeclasses.MonadDeferCancellableContinuation](../arrow.effects.typeclasses/-monad-defer-cancellable-continuation/index.html) |  |
| [arrow.effects.OnCancel](../arrow.effects/-on-cancel/index.html) |  |
| [arrow.effects.PartiallyAppliedRef](../arrow.effects/-partially-applied-ref/index.html) | Intermediate interface to partially apply [F](../arrow.effects/-partially-applied-ref/index.html#F) to [Ref](../arrow.effects/-ref/index.html). |
| [arrow.effects.internal.Platform](../arrow.effects.internal/-platform/index.html) |  |
| [arrow.effects.typeclasses.Proc](../arrow.effects.typeclasses/-proc.html) | An asynchronous computation that might fail. |
| [arrow.effects.Promise](../arrow.effects/-promise/index.html) | When made, a [Promise](../arrow.effects/-promise/index.html) is empty. Until it is fulfilled, which can only happen once. |
| [arrow.effects.Ref](../arrow.effects/-ref/index.html) | An asynchronous, concurrent mutable reference. |




## Type Class Hierarchy

<canvas id="arrow.effects.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.effects.typeclasses-hierarchy-diagram', 'arrow.effects.typeclasses-diagram.nomnol')
</script>

