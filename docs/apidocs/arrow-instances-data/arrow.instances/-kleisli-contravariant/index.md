---
title: KleisliContravariant - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [KleisliContravariant](./index.html)

# KleisliContravariant

`@extension interface KleisliContravariant<F, D> : Contravariant<Conested<Kind<ForKleisli, `[`F`](index.html#F)`>, `[`D`](index.html#D)`>>`

### Functions

| [contramap](contramap.html) | `open fun <A, B> Kind<Conested<Kind<ForKleisli, `[`F`](index.html#F)`>, `[`D`](index.html#D)`>, `[`A`](contramap.html#A)`>.contramap(f: (`[`B`](contramap.html#B)`) -> `[`A`](contramap.html#A)`): Kind<Conested<Kind<ForKleisli, `[`F`](index.html#F)`>, `[`D`](index.html#D)`>, `[`B`](contramap.html#B)`>` |
| [contramapC](contramap-c.html) | `open fun <A, B> KleisliOf<`[`F`](index.html#F)`, `[`A`](contramap-c.html#A)`, `[`D`](index.html#D)`>.contramapC(f: (`[`B`](contramap-c.html#B)`) -> `[`A`](contramap-c.html#A)`): KleisliOf<`[`F`](index.html#F)`, `[`B`](contramap-c.html#B)`, `[`D`](index.html#D)`>` |

