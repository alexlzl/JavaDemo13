package com.test;

public class Test3 {
  static   ThreadLocal<String> mStringThreadLocal = new ThreadLocal<>();
    public static void main(String[] args){
        mStringThreadLocal.set("main thread");
       System.out.println( mStringThreadLocal.get());
        testThreadLocal();
    }

    private static void testThreadLocal() {
        Thread t = new Thread() {


            @Override
            public void run() {
                super.run();
                mStringThreadLocal.set("droidyue.com");
               System.out.println( mStringThreadLocal.get());
            }
        };

        t.start();

        new Thread(){
            @Override
            public void run() {
                super.run();
                mStringThreadLocal.set("thread2");
                System.out.println( mStringThreadLocal.get());
            }
        }.start();
    }
}
