package com.partten.design;

/**
 * ClassName com.partten.design.ErrorLogger
 * Description 实现类B
 * Author liyong
 * Date 2018-12-29 11:25
 * Version 0.0.1
 **/
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
