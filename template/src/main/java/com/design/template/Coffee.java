package com.design.template;

public class Coffee extends Beverage {
    @Override
    protected void putIntoCup() {
        System.out.println("加入咖啡到水杯中!");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加入牛奶和糖!");
    }
}
