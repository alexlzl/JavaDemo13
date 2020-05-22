package com.test;

import java.util.concurrent.Semaphore;

public class Teset {
    /**
     * 线程1抢到车位
     * 线程2抢到车位
     * 线程2归还车位
     * 线程1归还车位
     * 线程3抢到车位
     * 线程0归还车位
     * 线程4抢到车位
     * 线程4归还车位
     * 线程3归还车位
     * <p>
     * Process finished with exit code 0
     *
     * @param args
     */
  static int a;
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);

        for (int i=0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    a++;
                    try {
                        semaphore.acquire();//申请资源
                        System.out.println(Thread.currentThread().getName() +"a==="+a+ "==抢到车位");
                        Thread.sleep(1000);
                        System.out.println(Thread.currentThread().getName() +"a==="+a+ "==归还车位");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        //释放资源
                        System.out.println("释放资源======"+Thread.currentThread().getName());
                        semaphore.release();
                    }

                }
            }, "线程" + i).start();
        }
    }

}
