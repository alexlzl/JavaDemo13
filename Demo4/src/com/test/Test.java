package com.test;

public class Test {
    public static void main(String[] args){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("aa");
                }
            }
        }).start();
        try {
            byte[] b = new byte[1024*1024*6000];
            byte[] b1 = new byte[1024*1024*6000];
            byte[] b2 = new byte[1024*1024*6000];
            byte[] b3 = new byte[1024*1024*6000];
        } catch (Exception e) {
            System.out.println("捕获异常============");
            e.printStackTrace();

        }



    }
}
