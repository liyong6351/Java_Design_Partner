package com.design.template;

import org.junit.Test;

public class Client {

    @Test
    public  void test() {
        Tea tea = new Tea();
        tea.prepareBeverageTemplate();
        System.out.println("=============================");
        Coffee coffee = new Coffee();
        coffee.prepareBeverageTemplate();
    }
}
