package com.test;

import java.util.Optional;
import java.util.function.Consumer;

public class Test4 {

    public static void main(String[] args) {

        Optional<Integer> optional1 = Optional.ofNullable(1);
        Optional<Integer> optional2 = Optional.ofNullable(null);

// 如果不是null,调用Consumer
        optional1.ifPresent(new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
                System.out.println("value is " + t);
            }
        });

// null,不调用Consumer
        optional2.ifPresent(new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
                System.out.println("value is== " + t);
            }
        });


    }
}
