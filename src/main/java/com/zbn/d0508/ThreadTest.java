package com.zbn.d0508;

/**
 * Created by lianxiang on 2017/5/8.
 */
public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread() {
            @Override
            public void run() {
                //try {
                //    sleep(1000);
                //} catch (InterruptedException e) {
                //    e.printStackTrace();
                //}
                System.out.print("pong");
            }
        };
        thread.start();
        //thread.join();
        System.out.print("ping");


        Thread t = new Thread() {
            public void run() {
                pong();
            }
        };
        t.run();
        System.out.print("ping");
    }

    static void pong() {
        System.out.print("pong");
    }

}
