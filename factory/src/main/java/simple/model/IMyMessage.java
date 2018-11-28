package simple.model;

import java.util.Map;

/**
 * class_name: IMyMessage
 * package: simple.model
 * describe: 工厂方法模式:产品接口
 * create_user: liyong6351@gmail.com
 * create_date: 2018/11/28
 * create_time: 17:05
 **/
public interface IMyMessage {
    Map<String, Object> getMessageParam();

    void setMessageParam(Map<String, Object> messageParam);

    void sendMesage() throws Exception;// 发送通知/消息
}
