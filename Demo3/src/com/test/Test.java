package com.test;

public class Test {

    public static void main(String[] args){

        Thread thread=new Thread(){
            @Override
            public void run() {
                super.run();
                System.out.println("执行线程ID=="+Thread.currentThread().getId()+"=========");
            }
        };
        thread.start();
        new Thread(){
            @Override
            public void run() {
                super.run();
                System.out.println("执行线程ID=="+Thread.currentThread().getId());
                thread.run();
//                thread.start();
            }
        }.start();
    }
}
