package com.test;

public class PossibleReordering {


    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<10000;i++){
            final int[] x = {0};
            final int[] y = {0};
            final int[] a = {0};
            final int[] b = {0};
            Thread one = new Thread(new Runnable() {
                public void run() {
                    a[0] = 1;
//                    System.out.println("执行a=1=="+"b=="+ b[0]);
                    x[0] = b[0];
//                    System.out.println("执行x = b=="+"x=="+ x[0]);
                }
            });

            Thread other = new Thread(new Runnable() {
                public void run() {
                    b[0] = 1;
//                    System.out.println("执行b=1");
                    y[0] = a[0];
//                    System.out.println("执行 y = a");
                }
            });
            one.start();
            other.start();
            one.join();
            other.join();
//            if("0,0".equals("("+ x[0] +","+ y[0] +")")){
                System.out.println("("+ x[0] +","+ y[0] +")");
//            }

        }

    }
}