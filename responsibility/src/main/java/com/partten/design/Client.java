package com.partten.design;

/**
 * ClassName com.partten.design.Client
 * Description 测试类
 * Author liyong
 * Date 2018-12-29 11:30
 * Version 0.0.1
 **/
public class Client {


    private static AbstractLogger getContextChain() {
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.ERROR);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.DEBUG);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.INFO);
        errorLogger.nextLogger(fileLogger);
        fileLogger.nextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger logChain = getContextChain();
        logChain.logMessage(AbstractLogger.INFO, "info");
        logChain.logMessage(AbstractLogger.DEBUG, "debug");
        logChain.logMessage(AbstractLogger.ERROR, "error");
    }
}
