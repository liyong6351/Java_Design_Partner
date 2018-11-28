package com.statics.service.impl;

import com.statics.service.IUserDao;

/**
 * class_name: UserDao
 * package: com.statics.service.impl
 * describe: 接口实现、目标对象
 * create_user: liyong6351@gmail.com
 * create_date: 2018/11/28
 * create_time: 15:06
 **/
public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("===========已经保存数据============");
    }
}
