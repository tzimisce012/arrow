package arrow.kindedj.fromarrow;

import arrow.kindedj.*;
import io.kindedj.*;

public class KatDataclassKindedJShow implements KindedJShow<Hk<ForConvert, ForKatDataclass>> {
    private KatDataclassKindedJShow() {
    }

    @Override
    public <A> String show(Hk<Hk<ForConvert, ForKatDataclass>, A> hk) {
        final arrow.Kind<ForKatDataclass, A> cast = ConvertKt.toArrow(hk);
        return KatDataclassKt.show(cast);
    }

    public static KatDataclassKindedJShow INSTANCE = new KatDataclassKindedJShow();
}
