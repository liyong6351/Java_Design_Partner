package hungry;

import org.junit.Test;

public class Client {

    @Test
    public void HungryDemo() {
        for (int i = 0; i < 100; i++) {
            System.out.println(HungrySingleton.getHungryInstance());
        }
    }
}
