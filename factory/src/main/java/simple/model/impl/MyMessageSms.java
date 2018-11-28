package simple.model.impl;

import simple.model.IMyMessage;
import simple.model.MyAbstractMessage;

import java.util.Map;

/**
 * class_name: MyMessageSms
 * package: simple.model.impl
 * describe: 具体的实现类
 * create_user: liyong6351@gmail.com
 * create_date: 2018/11/28
 * create_time: 17:09
 **/
public class MyMessageSms extends MyAbstractMessage {
    @Override
    public void sendMesage() throws Exception {
        System.out.println("我通过SMS发送消息");
    }
}
