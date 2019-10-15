package com.test;

public class Test2 {

    public static void main(String[] args) {
        System.out.println(a(2));//5
    }

    public static int a(int b) {

        if (b <= 0) return 1;

        return a(b - 1);//1

    }
}
