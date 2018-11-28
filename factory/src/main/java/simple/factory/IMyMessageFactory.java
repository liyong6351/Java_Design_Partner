package simple.factory;

import simple.model.IMyMessage;

/**
 * class_name: IMyMessageFactory
 * package: simple.factory
 * describe: 工厂方法模式:工厂接口
 * create_user: liyong6351@gmail.com
 * create_date: 2018/11/28
 * create_time: 17:05
 **/
public interface IMyMessageFactory {
    IMyMessage createMessage(String messageType);
}
