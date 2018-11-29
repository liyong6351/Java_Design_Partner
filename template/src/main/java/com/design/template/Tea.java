package com.design.template;

public class Tea extends Beverage {
    @Override
    protected void putIntoCup() {
        System.out.println("加入茶叶到水杯中!");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加糖!");
    }
}
