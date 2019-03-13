package com.xue

fun main(args: Array<String>) {
//    println("Hello")
//    Human() --> 以產生物件
//    Human().hello() //但使用完就消失
      val h = Human()//val 代表定義完這物件就不能更改他的值
      h.hello()
}
class Human{
    fun hello()
    {
        println("Hello Kotlin")

    }
}