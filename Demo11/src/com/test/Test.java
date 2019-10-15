package com.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args){
        String str="This is Regex";
        Pattern pattern=Pattern.compile("\\bis\\b");
        System.out.println(  Arrays.toString(str.split("\\bis\\b")));
        Pattern p=Pattern.compile("\\d+");
        Matcher m=p.matcher("22bb23");
     new Parent().test1();

      System.out.println(  m.matches());
    }
}
