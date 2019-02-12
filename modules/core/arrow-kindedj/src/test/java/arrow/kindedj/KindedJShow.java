package arrow.kindedj;

import io.kindedj.*;

public interface KindedJShow<F> {
    <A> String show(Hk<F, A> hk);
}
