package lazy;

/**
 * class_name: LazySingleton
 * package: lazy
 * describe: 懒汉式单例
 * create_user: liyong6351@gmail.com
 * create_date: 2018/11/28
 * create_time: 15:54
 **/
public class LazySingleton {
    private static volatile LazySingleton instance = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null)
                    instance = new LazySingleton();
            }
        }
        return instance;
    }
}
