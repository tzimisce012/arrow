package arrow.data

import arrow.core.NonEmptyList
import arrow.core.nel
import arrow.instances.eq
import arrow.instances.hash
import arrow.test.UnitSpec
import arrow.test.laws.*
import arrow.typeclasses.Eq
import io.kotlintest.KTestJUnitRunner
import org.junit.runner.RunWith

@RunWith(KTestJUnitRunner::class)
class NonEmptyListTest : UnitSpec() {
  init {

    val EQ = NonEmptyList.eq(Int.eq())
    testLaws(
      ShowLaws.laws(NonEmptyList.show(), EQ) { it.nel() },
      MonadLaws.laws(NonEmptyList.monad(), Eq.any()),
      SemigroupKLaws.laws(
        NonEmptyList.semigroupK(),
        NonEmptyList.applicative(),
        Eq.any()),
      ComonadLaws.laws(NonEmptyList.comonad(), { NonEmptyList.of(it) }, Eq.any()),
      TraverseLaws.laws(NonEmptyList.traverse(), NonEmptyList.applicative(), { n: Int -> NonEmptyList.of(n) }, Eq.any()),
      SemigroupLaws.laws(NonEmptyList.semigroup(), arrow.core.Nel(1, 2, 3), arrow.core.Nel(3, 4, 5), arrow.core.Nel(6, 7, 8), NonEmptyList.eq(Int.eq())),
      HashLaws.laws(NonEmptyList.hash(Int.hash()), EQ) { Nel.of(it) }
    )
  }
}
