package statics;

import org.junit.Test;
import statics.model.INoodles;

public class Client {

    @Test
    public void consumeNoodles() {
        INoodles noodles = SimpleNoodlesFactory.createNoodles(SimpleNoodlesFactory.TYPE_CQ);
        noodles.desc();
    }
}
