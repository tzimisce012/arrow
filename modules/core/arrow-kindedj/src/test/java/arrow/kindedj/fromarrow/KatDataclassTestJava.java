package arrow.kindedj.fromarrow;

import arrow.kindedj.*;
import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;

@RunWith(JUnit4.class)
public class KatDataclassTestJava {

    private final KatDataclass1<Integer> kinded = new KatDataclass1<>(0);

    @Test
    public void hk1CanBeConvertedToArrow() {
        final Convert.FromArrowToKindedJ<ForKatDataclass, Integer> toKindedJ = Convert.toKindedJ(kinded);
        Assert.assertEquals(KatDataclassArrowShow.INSTANCE.show(this.kinded), KatDataclassKindedJShow.INSTANCE.show(toKindedJ));
    }
}
