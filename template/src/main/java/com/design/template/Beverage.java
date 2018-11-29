package com.design.template;

/**
 * class_name: Becerage
 * package: com.design.template
 * describe: 抽象基类
 * create_user: liyong6351@gmail.com
 * create_date: 2018/11/29
 * create_time: 14:17
 **/
public abstract class Beverage {

    /**
     * 具体的模板方法，用使用final关键字进行修饰，避免子类修改
     */
    public final void prepareBeverageTemplate() {
        //烧开水
        boilWater();
        //放在杯中
        putIntoCup();
        //加开水
        addHotWater();
        //加入调味剂
        addCondiments();

    }

    private void boilWater() {
        System.out.println("烧开水");
    }

    protected abstract void putIntoCup();

    private void addHotWater() {
        System.out.println("加水");
    }

    protected abstract void addCondiments();
}
