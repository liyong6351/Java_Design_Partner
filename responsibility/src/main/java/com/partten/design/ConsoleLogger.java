package com.partten.design;

/**
 * ClassName com.partten.design.ConsoleLogger
 * Description 扩展类A
 * Author liyong
 * Date 2018-12-29 11:24
 * Version 0.0.1
 **/
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
