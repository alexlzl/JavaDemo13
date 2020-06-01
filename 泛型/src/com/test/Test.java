package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * T和？运用的地方有点不同,?是定义在引用变量上,T是类上或方法上
 * “<T>"和"<?>"，首先要区分开两种不同的场景：
 *
 * 第一，声明一个泛型类或泛型方法。
 * 第二，使用泛型类或泛型方法。
 * 类型参数“<T>”主要用于第一种，声明泛型类或泛型方法。
 * 无界通配符“<?>”主要用于第二种，使用泛型类或泛型方法
 * @param <a>
 */
public class Test<a extends Test> {
    private List<? extends Test> list=new ArrayList<>();
    private List<?> list1;
    public <t> t test(t b){
        return b;
    }

    public void test1(Test<?> c){

    }

    public <T> List<?> getList(T a){
          return (List<?>) a;
    }
}
