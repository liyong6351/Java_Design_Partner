package com.partten.design;

/**
 * ClassName com.partten.design.AbstractLogger
 * Description 抽象类
 * Author liyong
 * Date 2018-12-29 10:26
 * Version 0.0.1
 **/
public abstract class AbstractLogger {
    static int INFO = 1;
    static int DEBUG = 2;
    static int ERROR = 3;
    int level;

    //责任链中下一个元素
    private AbstractLogger nextLogger;

    void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    protected abstract void write(String message);

    void nextLogger(AbstractLogger fileLogger) {
        this.nextLogger = fileLogger;
    }
}
