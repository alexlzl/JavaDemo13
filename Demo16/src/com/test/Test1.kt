package com.test

fun main(args: Array<String>) {
    val lambda = { left: Int, right: Int
        ->
        left + right
    }
    //后面我们用 () 的形式调用这个 Lambda 表达式，其实这个 () 对应的是 invoke 方法，换句话说，我们在这里也可以这么写：
    println(lambda(2, 3))
    println(lambda.invoke(2,3))
}