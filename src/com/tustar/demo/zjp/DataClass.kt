package com.tustar.demo.zjp

/**
 * Created by tustar on 17-7-27.
 */

data class Person(var name: String, var age: Int) // 定义一个数据类

fun main(args: Array<String>) {
    var person = Person("Jone", 20) // 实例化数据类
    var (name, age) = person // 解构数据类
    println("name:$name, age:$age") // 打印: name: Jone, age: 20
    /*
    其中,”var (name, age) = person”就是解构声明,实际是创建了两个变量name和age,然后将person的属性值”Jone”和20分
    别赋值给name和age。解构声明在编译时将被分解为以下代码:
    val name = person.component1()
    val age = person.component2()
     */
}

