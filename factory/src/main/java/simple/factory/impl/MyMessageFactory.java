package simple.factory.impl;

import simple.factory.IMyMessageFactory;
import simple.model.IMyMessage;
import simple.model.impl.MyMessageEmail;
import simple.model.impl.MyMessageOaTodo;
import simple.model.impl.MyMessageSms;

import java.util.HashMap;
import java.util.Map;

public class MyMessageFactory implements IMyMessageFactory {
    @Override
    public IMyMessage createMessage(String messageType) {
        // 这里的方式是：消费者知道自己想要什么产品；若生产何种产品完全由工厂决定，则这里不应该传入控制生产的参数。
        IMyMessage myMessage;
        Map<String, Object> messageParam = new HashMap<>();
        // 根据某些条件去选择究竟创建哪一个具体的实现对象，条件可以传入的，也可以从其它途径获取。s
        if ("SMS".equals(messageType)) {
            myMessage = new MyMessageSms();
            messageParam.put("PHONENUM", "123456");
        } else if ("OA".equals(messageType)) {
            myMessage = new MyMessageOaTodo();
            messageParam.put("OAUSERNAME", "testUser");
        } else if ("EMAIL".equals(messageType)) {
            myMessage = new MyMessageEmail();
            messageParam.put("EMAIL", "test@test.com");
        } else {
            myMessage = new MyMessageEmail();
            messageParam.put("EMAIL", "test@test.com");
        }
        myMessage.setMessageParam(messageParam);
        return myMessage;
    }
}
