package com.zbn.t1002;

import com.google.common.base.Stopwatch;
import com.google.common.base.Strings;
import com.sun.deploy.util.StringUtils;
import org.junit.Test;

/**
 * Created by lianxiang on 2017/10/2.
 */
public class TestGuava {
    private volatile String a = "b";
    @Test
    public void t1() throws Exception {
        TestGuava testGuava = new TestGuava();
        //SingleExample s = SingleExample.getSingleEx();
        SingleExample[] singleExamples = new SingleExample[10];
        System.out.println(testGuava.hashCode());
        for (int i = 0; i < 10; i++) {
            singleExamples[i] = SingleExample.getSingleEx();
            System.out.println(singleExamples[i].hashCode());
        }
        System.out.println(singleExamples[1].equals(singleExamples[2]));
    }

    @Test
    public void t2() throws Exception {
        Strings.emptyToNull("a");

    }
}
