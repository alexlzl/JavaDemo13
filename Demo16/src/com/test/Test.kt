package com.test

import java.util.*
fun main(args: Array<String>) {
    foo1(::bar1)
}
fun foo1(body: () -> Unit) {
    body()
}

fun bar1() {
    print("bar1")
}
class Test{



}