package com.test

class Test {
     fun main(args:Array<String>){
         val arr = arrayOf("1","2",3,4,5)
         val list1 = listOf(1,2,"3",4,"5")                // 随意创建
         val list2 = listOf<String>("1","2","3","4","5")  // 确定元素的值类型
         val list3 = listOf(arr)                          // 可传入一个数组
         val list4= mutableListOf("a","b")
         list4.add("c")
           println(list4)
   }

}