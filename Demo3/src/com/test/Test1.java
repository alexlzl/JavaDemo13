package com.test;

import java.text.NumberFormat;

public class Test1 {

    public static void main(String[] args) {
        System.out.println(String.format("%.2f", 0.00));
        System.out.println(String.format("%.2f", 10000.0));
        System.out.println(String.format("%.2f", 10000.00));
        System.out.println(String.format("%.2f", 0.02));
        System.out.println(String.format("%.2f", 0.01));
        System.out.println(String.format("%.2f", 0.123456));
        System.out.println(String.format("%.2f", 1000.02));
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);
        System.out.println(nf.format(0.00));
        System.out.println(nf.format(10000));
        System.out.println(nf.format(0.02));
        System.out.println(nf.format(0.01));
        System.out.println(nf.format(0.123456));
        System.out.println(nf.format(1000.02));
    }
}
