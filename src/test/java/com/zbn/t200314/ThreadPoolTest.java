package com.zbn.t200314;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
    public static void main(String[] args) {
        Executor executor = Executors.newSingleThreadExecutor();
    }
}
