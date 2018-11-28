package com.statics;

import com.statics.proxy.UserDaoProxy;
import com.statics.service.impl.UserDao;
import org.junit.Test;

public class Client {

    @Test
    public void test() {
        //目标对象
        UserDao userDao = new UserDao();
        //代理对象
        UserDaoProxy proxy = new UserDaoProxy(userDao);
        //执行代理对象的方法
        proxy.save();
    }
}
