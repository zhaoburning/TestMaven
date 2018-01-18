package com.zbn.t1012;

import org.junit.Test;

import java.util.HashMap;

public class TestCharSequence {
    @Test
    public void t1() throws Exception {
        HashMap<CharSequence, CharSequence> map = new HashMap<CharSequence, CharSequence>();
        CharSequence a = "a";
        map.put(a, "b");
        System.out.println(map.get("a"));
    }
}
