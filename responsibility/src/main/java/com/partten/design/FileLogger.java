package com.partten.design;

/**
 * ClassName com.partten.design.FileLogger
 * Description 实现类C
 * Author liyong
 * Date 2018-12-29 11:26
 * Version 0.0.1
 **/
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {




        System.out.println("File::Logger: " + message);
    }
}
