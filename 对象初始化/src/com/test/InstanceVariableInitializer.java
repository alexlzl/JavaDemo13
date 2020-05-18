package com.test;

/**
 *
 * https://cloud.tencent.com/developer/article/1177048
 * 1,5,8,5
 */
public class InstanceVariableInitializer {
    private int i = 1;
    private int j = i + 1;

    public InstanceVariableInitializer(int var) {
        System.out.println("构造函数初始化");
        System.out.println(i);
        System.out.println(j);
        this.i = var;
        System.out.println(i);
        System.out.println(j);
    }

    {       System.out.println("代码块初始化j=="+j);
        // 实例代码块
        j += 3;

    }

    public static void main(String[] args) {
        new InstanceVariableInitializer(8);
    }
}
