package com.test;

import java.util.ArrayList;

public class Test {


    public static void main(String[] args) {
        Class<?> class1 = new ArrayList<String>().getClass();
        Class<?> class2 = new ArrayList<Integer>().getClass();
        System.out.println(class1);        //class java.util.ArrayList
        System.out.println(class2);        //class java.util.ArrayList
        System.out.println(class1.equals(class2));    //true

    }
}
