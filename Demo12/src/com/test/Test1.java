package com.test;

public class Test1 {

    public static void main(String[] args) {
       System.out.println( a(3));//5
    }

    public static int a(int b) {

        if (b <= 0) return 1;

        else {

            return a(b - 1) + a(b - 2);
        }

    }
}
