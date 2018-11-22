---
title: OptionMonadInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [OptionMonadInstance](./index.html)

# OptionMonadInstance

`@extension interface OptionMonadInstance : Monad<ForOption>`

### Functions

| [ap](ap.html) | `open fun <A, B> Kind<ForOption, `[`A`](ap.html#A)`>.ap(ff: Kind<ForOption, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): Option<`[`B`](ap.html#B)`>` |
| [flatMap](flat-map.html) | `open fun <A, B> Kind<ForOption, `[`A`](flat-map.html#A)`>.flatMap(f: (`[`A`](flat-map.html#A)`) -> Kind<ForOption, `[`B`](flat-map.html#B)`>): Option<`[`B`](flat-map.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): Option<`[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<ForOption, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Option<`[`B`](map.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> OptionOf<Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): Option<`[`B`](tail-rec-m.html#B)`>` |

### Inheritors

| [OptionMonadErrorInstance](../-option-monad-error-instance/index.html) | `interface OptionMonadErrorInstance : MonadError<ForOption, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, `[`OptionMonadInstance`](./index.html) |

