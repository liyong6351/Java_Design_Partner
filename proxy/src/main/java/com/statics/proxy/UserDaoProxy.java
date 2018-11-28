package com.statics.proxy;

import com.statics.service.IUserDao;
import lombok.Data;

/**
 * class_name: UserDaoProxy
 * package: com.statics.proxy
 * describe: 代理类对象
 * create_user: liyong6351@gmail.com
 * create_date: 2018/11/28
 * create_time: 15:17
 **/
@Data
public class UserDaoProxy {
    private IUserDao userDao;

    public UserDaoProxy(IUserDao target) {
        this.userDao = target;
    }

    public void save() {
        System.out.println("开始事务...");
        userDao.save();//执行目标对象的方法
        System.out.println("提交事务...");
    }
}
