package com.test;

import java.util.Optional;

public class Test5 {
    /**
     * true
     * true
     *
     * @param args
     */
    public static void main(String[] args) {

        Optional<Integer> optional1 = Optional.ofNullable(1);
        Optional<Integer> optional2 = Optional.ofNullable(null);
      /*
      orElse(value)：如果optional对象保存的值不是null，则返回原来的值，否则返回value
       */
        System.out.println(optional1.orElseGet(() -> {
            return 1000;
        }) == 1);//true

        System.out.println(optional2.orElseGet(() -> {
            return 1000;
        }) == 1000);//true

    }
}
