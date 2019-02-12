package arrow.kindedj.fromkindedj;

import arrow.kindedj.*;
import arrow.kindedj.fromkindedj.ForKJDataclass.*;
import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class KJDataclassTestsJava {

    private final KJDataclass1<Integer> kinded = new KJDataclass1<>(0);

    @Test
    public void hk1CanBeConvertedToArrow() {
        final Convert.FromKindedJToArrow<ForKJDataclass, Integer> hkKindedJ = Convert.fromKindedJ(kinded);
        assertEquals(KJDataclassKindedJShow.INSTANCE.show(kinded), KJDataclassArrowShow.INSTANCE.show(hkKindedJ));
    }
}
