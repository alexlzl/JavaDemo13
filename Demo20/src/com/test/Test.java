package com.test;

public class Test {
    private int n;

    private void doAdd() {
        for (int i = 0; i < 5; i++) {
            n=n+1;
            System.out.println(Thread.currentThread().getName() + "--->" + n);
        }
    }

    public static void main(String[] args) {
        Test demo = new Test();
        new Thread(demo::doAdd, "线程1").start();
        new Thread(demo::doAdd, "线程2").start();
        new Thread(demo::doAdd, "线程3").start();
        new Thread(demo::doAdd, "线程4").start();
    }
}
