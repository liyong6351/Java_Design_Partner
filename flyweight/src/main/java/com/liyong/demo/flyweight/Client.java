package com.liyong.demo.flyweight;

/**
 * <p> author liyong  </p>
 * <p> date 2019-05-21 14:50 </p>
 * <p> description  </p>
 **/
public class Client {
    public static void main(String[] args) {
        Shape shape1 = FlyweightFactory.getShape("红色");
        shape1.draw();

        Shape shape2 = FlyweightFactory.getShape("灰色");
        shape2.draw();

        Shape shape3 = FlyweightFactory.getShape("绿色");
        shape3.draw();

        Shape shape4 = FlyweightFactory.getShape("红色");
        shape4.draw();

        Shape shape5 = FlyweightFactory.getShape("灰色");
        shape5.draw();

        Shape shape6 = FlyweightFactory.getShape("灰色");
        shape6.draw();

        System.out.println("一共绘制了" + FlyweightFactory.getSum() + "中颜色的圆形");
    }
}
