package com.zbn.t1002;

/**
 * Created by lianxiang on 2017/10/2.
 */
public class SingleExample {
    private static  SingleExample s = new SingleExample();

    private  SingleExample() {

    }
    public static SingleExample getSingleEx() {
        return s;
    }
}
