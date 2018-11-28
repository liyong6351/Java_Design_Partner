package com.dynamic;

import com.statics.service.IUserDao;
import com.statics.service.impl.UserDao;

/**
 * class_name: Client
 * package: com.dynamic
 * describe: 测试类
 * create_user: liyong6351@gmail.com
 * create_date: 2018/11/28
 * create_time: 15:33
 **/
public class Client {
    public static void main(String[] args) {
        IUserDao target = new UserDao();

        System.out.println(target.getClass());

        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        System.out.println(proxy.getClass());

        proxy.save();
    }
}
