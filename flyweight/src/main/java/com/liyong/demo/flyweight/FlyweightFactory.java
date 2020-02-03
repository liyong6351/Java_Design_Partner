package com.liyong.demo.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * <p> author liyong  </p>
 * <p> date 2019-05-21 14:40 </p>
 * <p> description  </p>
 **/
public class FlyweightFactory {
    static Map<String, Shape> shapes = new HashMap<String, Shape>();

    public static Shape getShape(String key) {
        Shape shape = shapes.get(key);
        //如果shape==null,表示不存在,则新建,并且保持到共享池中
        if (shape == null) {
            shape = new Circle(key);
            shapes.put(key, shape);
        }
        return shape;
    }

    public static int getSum() {
        return shapes.size();
    }
}
