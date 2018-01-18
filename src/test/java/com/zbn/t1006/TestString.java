package com.zbn.t1006;

import org.junit.Test;

public class TestString {
    @Test
    public void t1() throws Exception {
        String str1 = "hello";
        String str2 = "he" + new String("llo");
        String str3 =  new String("hello");
        System.err.println(str1 == str2);
        System.err.println(str1 == str3);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
    }
}
