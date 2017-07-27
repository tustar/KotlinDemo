package com.tustar.demo.zjp

/**
 * Created by tustar on 17-7-27.
 */
fun main(args: Array<String>) {
    var a: String? = null
//    val b: String = a as String // 这里a是null,不能转换为string,会抛出异常
    var x: Int = 1
    val y: String? = x as? String  // 这里x不是String类型。不能转换,但会返回null赋值给y
    println(y)

    demo(1)

    demo("Hello")

    demo(arrayOf(1, 2, 5, 6))
}

fun demo(x: Any) {
    if (x is String) { // x做了是否String的判断后,x自动转换为String类型
        println(x.length)
    }

    if (x !is String || x.length == 0) {
        return
    }

    if (x is String && x.length > 0) {
        println(x.length)
    }

    when (x) { // 自动转换同样适用于when表达式->右边会自动转换为左侧的类型
        is Int -> println(x + 1)
        is String -> println(x.length + 1)
//        is Array<Int> -> print(x.sum())
    }
}