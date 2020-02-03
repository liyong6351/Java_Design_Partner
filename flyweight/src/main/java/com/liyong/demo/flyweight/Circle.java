package com.liyong.demo.flyweight;

/**
 * <p> author liyong  </p>
 * <p> date 2019-05-21 14:42 </p>
 * <p> description  </p>
 **/
public class Circle extends Shape {
    private String color;
    public Circle(String color){
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("画了一个" + color +"的圆形");
    }
}
