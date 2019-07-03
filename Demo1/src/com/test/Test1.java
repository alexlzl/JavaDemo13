package com.test;

public class Test1 {
    private static final int FLAG_HAS_FDS = 1 << 8;
    static {
        System.out.println(FLAG_HAS_FDS);
    }
    public static void main(String[] args){
        System.out.println(FLAG_HAS_FDS);
    }
}
