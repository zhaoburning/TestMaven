package com.zbn.t1002;

/**
 * Created by lianxiang on 2017/10/2.
 */
public class TExtend {
    public static void main(String args[]){
        A a = new B();
        test(a);//写出输出结果
    }
    public static void test(A a){
        System.out.println("test A");
        a.whoAmI();
    }
    public static void test(B b){
        System.out.println("test B");
        b.whoAmI();
    }
}
class A {
    public void whoAmI() {
        System.out.println("I am A");
    }
}
class B extends A {
    public void whoAmI() {
        System.out.println("I am B");
    }
}

