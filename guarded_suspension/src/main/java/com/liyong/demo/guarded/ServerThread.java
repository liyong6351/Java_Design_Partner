package com.liyong.demo.guarded;

/**
 * <p> author liyong  </p>
 * <p> date 2019-05-21 23:10 </p>
 * <p> description  </p>
 **/
public class ServerThread extends Thread {
    private RequestQueue requestQueue;

    public ServerThread(RequestQueue requestQueue, String name) {
        super(name);
        this.requestQueue = requestQueue;
    }

    @Override
    public void run() {
        while (true) {
            final Request request = requestQueue.getRequest();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " handles " + request);
        }
    }
}
