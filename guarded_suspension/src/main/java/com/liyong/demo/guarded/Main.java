package com.liyong.demo.guarded;

/**
 * <p> author liyong  </p>
 * <p> date 2019-05-21 23:12 </p>
 * <p> description  </p>
 **/
public class Main {

    public static void main(String[] args) {
        RequestQueue requestQueue = new RequestQueue();
        for (int i = 0; i < 2; i++) {
            new ServerThread(requestQueue, "ServerThread" + i).start();
        }

        for (int i = 0; i < 10; i++) {
            new ClientThread(requestQueue, "ClientThread" + i).start();
        }
    }
}
