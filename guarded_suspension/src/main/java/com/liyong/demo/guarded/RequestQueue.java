package com.liyong.demo.guarded;

import java.util.LinkedList;

/**
 * <p> author liyong  </p>
 * <p> date 2019-05-21 23:10 </p>
 * <p> description  </p>
 **/
public class RequestQueue {
    private LinkedList<Request> queue = new LinkedList<>();

    public synchronized Request getRequest() {
        while (queue.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return queue.removeFirst();
    }

    public synchronized void addRequest(Request request) {
        queue.add(request);
        notifyAll();
    }
}
