package hungry;

/**
 * class_name: HungrySingleton
 * package: hungry
 * describe: 饱汉式单例
 * create_user: liyong6351@gmail.com
 * create_date: 2018/11/28
 * create_time: 16:03
 **/
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getHungryInstance() {
        return instance;
    }
}
