package statics.model;

/**
 * class_name: LzNoodles
 * package: statics.model
 * describe: 兰州拉面(具体实例)
 * create_user: liyong6351@gmail.com
 * create_date: 2018/11/28
 * create_time: 16:37
 **/
public class LzNoodles implements INoodles {
    @Override
    public void desc() {
        System.out.println("我这个是兰州拉面");
    }
}
