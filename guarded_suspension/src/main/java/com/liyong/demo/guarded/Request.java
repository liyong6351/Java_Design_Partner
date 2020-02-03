package com.liyong.demo.guarded;

/**
 * <p> author liyong  </p>
 * <p> date 2019-05-21 23:09 </p>
 * <p> description  </p>
 **/
public class Request {
    private String name;

    public Request(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "[ Request " + name + " ]";
    }
}
