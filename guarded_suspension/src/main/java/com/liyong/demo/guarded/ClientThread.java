package com.liyong.demo.guarded;

/**
 * <p> author liyong  </p>
 * <p> date 2019-05-21 23:11 </p>
 * <p> description  </p>
 **/
public class ClientThread extends Thread {

    private RequestQueue requestQueue;

    public ClientThread(RequestQueue requestQueue, String name) {
        super(name);
        this.requestQueue = requestQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Request request = new Request("RequestID: " + i + " Thread_Name: " + Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName() + " requests " + request);
            requestQueue.addRequest(request);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("ClientThread Name is: " + Thread.currentThread().getName());
        }
        System.out.println(Thread.currentThread().getName() + "request end");
    }
}
