package com.xue

fun main(args: Array<String>) {
//    println("Hello")
//    Human() --> 以產生物件
//    Human().hello() //但使用完就消失
//    var 可變 val不可變
    val h = Human()//val 代表定義完這物件就不能更改他的值

    h.hello()
    var age: Int = 19 // var age=19 會自動推斷
    age = 20
//    如建立String 之後再給值可做以下建立
    var name: String
    name = "HANK"

}

class Human {
    fun hello() {
        println("Hello Kotlin")

    }
}