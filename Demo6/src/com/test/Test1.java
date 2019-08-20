package com.test;

public class Test1 {

    public static void main(String[] args){
        test();
    }
    private void test1(){
        test();
    }

    private static void test() {
        try {
            double d=Double.valueOf("aba");
        }catch (Exception e){
//            System.out.println("exception");
        }
        System.out.println("last");
    }
}

