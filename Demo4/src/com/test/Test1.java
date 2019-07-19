package com.test;

public class Test1 {

    public static void main(String[] args) {
        method();
    }

    public static void method() {
        try{
            while (true) {
                method();
            }
        }catch (Exception e){

        }

    }
}
