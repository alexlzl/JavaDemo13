package com.test;

import java.io.UnsupportedEncodingException;

public class Test {

    public static void main(String[] args){
        String chnStr = "A";
        try {
            System.out.println("length of one Chinese character in gbk: " + chnStr.getBytes("GBK").length );
            System.out.println("length of one Chinese character in UTF-8: " + chnStr.getBytes("UTF-8").length );
            System.out.println("length of one Chinese character in Unicode: " + chnStr.getBytes("UNICODE").length );
            System.out.println(chnStr.codePointAt(0));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        char c='1';

    }
}
