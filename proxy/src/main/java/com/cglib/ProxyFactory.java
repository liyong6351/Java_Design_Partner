package com.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * class_name: ProxyFactory
 * package: com.cglib
 * describe: 基于cglib之类代理工厂
 * create_user: liyong6351@gmail.com
 * create_date: 2018/11/28
 * create_time: 15:36
 **/
public class ProxyFactory implements MethodInterceptor {
    //维护一个目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        //工具类
        Enhancer en = new Enhancer();
        //设置父类
        en.setSuperclass(target.getClass());
        en.setCallback(this);
        return en.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始事务cglib");
        Object returnValue = method.invoke(target, args);
        System.out.println("提交事务cglib");
        return null;
    }
}
