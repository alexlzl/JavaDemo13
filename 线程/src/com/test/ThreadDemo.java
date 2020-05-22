package com.test;

/**
 * https://blog.csdn.net/xusheng_Mr/article/details/61938216
 */
public class ThreadDemo {
    public static void main(String[] args) {
        HelloThread t = new HelloThread();
        Thread thread1 = new Thread(t, "1号窗口");
        thread1.start();
        Thread thread2 = new Thread(t, "2号窗口");
        thread2.start();
//        for(int i=0;i<100;i++){
//            Thread thread1 = new Thread(t, i+"号窗口");
//            thread1.start();
//        }
    }

}

class HelloThread implements Runnable {

    private int ticket = 5;

    public void run() {
        while (true) {
            if (ticket < 1) {
                return;
            }
            System.out.println(Thread.currentThread().getName() + (ticket--));

        }
    }

}