package lazy;

import org.junit.Test;

public class Client {
    @Test
    public void lazySingleton() {
        LazySingleton.getInstance();
        for (int i = 0; i < 100; i++) {
            System.out.println(LazySingleton.getInstance());
        }
    }
}
