package com.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();

    public static void main(String... args) {
        threadLocal.set(-1);
        threadLocal.set(100);
        threadLocal.set(123);
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            final int ii = i; // i不能是final的，创建临时变量
            executor.submit(new Runnable() {
                public void run() {
                    threadLocal.set(ii);
                    System.out.println(threadLocal.get());
                }
            });
        }
        executor.shutdown();
        System.out.println(threadLocal.get());
    }

}
