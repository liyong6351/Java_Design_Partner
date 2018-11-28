package simple.model.impl;

import simple.model.IMyMessage;
import simple.model.MyAbstractMessage;

import java.util.Map;

public class MyMessageEmail extends MyAbstractMessage {

    @Override
    public void sendMesage() throws Exception {
        System.out.println("我通过邮件发送消息");
    }
}
