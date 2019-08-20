package com.test;

public class Test1 {
    public String a="alex";
    public String b="jim";
    public static void main(String[] args){
        Test1 test1=new Test1();
        new Test2().test(test1);
        System.out.println(test1.toString());
    }

    @Override
    public String toString() {
        return "Test1{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }
}
