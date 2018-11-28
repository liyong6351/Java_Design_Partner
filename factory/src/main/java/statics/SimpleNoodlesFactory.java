package statics;

import statics.model.CqNuoodles;
import statics.model.INoodles;
import statics.model.LzNoodles;
import statics.model.PaoNoodles;

/**
 * class_name: SimpleNoodlesFactory
 * package: statics
 * describe: 简单工厂类
 * create_user: liyong6351@gmail.com
 * create_date: 2018/11/28
 * create_time: 16:39
 **/
public class SimpleNoodlesFactory {
    public static final int TYPE_LZ = 1;//兰州拉面
    public static final int TYPE_PM = 2;//泡面
    public static final int TYPE_CQ = 3;//重庆小苗

    public static INoodles createNoodles(int type) {
        switch (type) {
            case TYPE_LZ:
                return new LzNoodles();
            case TYPE_PM:
                return new PaoNoodles();
            case TYPE_CQ:
                return new CqNuoodles();
            default:
                return new CqNuoodles();
        }
    }
}
