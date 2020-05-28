package com.test;

import java.util.concurrent.atomic.AtomicInteger;

class AtomicDemo {
    private AtomicInteger mAtomicInteger = new AtomicInteger();//如果没有指定值，默认是1

    private void doAdd() {
        for (int i = 0; i < 5; i++) {
            int value = mAtomicInteger.addAndGet(1);
            System.out.println(Thread.currentThread().getName() + "--->" + value);
        }
    }

    public static void main(String[] args) {
        AtomicDemo demo = new AtomicDemo();
        new Thread(demo::doAdd, "线程1").start();
        new Thread(demo::doAdd, "线程2").start();
    }
}

