package com.zbn.d0508;

/**
 * Created by lianxiang on 2017/5/8.
 */
public class StringAndChar {
    public static void main(String[] args) {
        String str = "great";
        char cc = 'z';
        char[] ch = {'a', 'b', 'c'};
        exc(str, ch);
        System.out.print(str+" and");
        System.out.print(ch);
        //int i = 1;
        //Integer in = 2;
        //exc(i, in);
        //System.out.println(i+":"+in);

    }
    public  static void exc(String str, char[] ch){
              str = "all right";
              ch[0] = 'd';
        }
    //    public  static void exc(int i, Integer in){
    //          i = 3;
    //          in = 4;
    //    }
}
