package com.tustar.demo.zjp

/**
 * Created by tustar on 17-7-27.
 */
enum class EPerson(var type: Int) {
    STUDENT(1) {
        // 因为Person声明了抽象函数 getPerson。所以每个实例都需要在其匿名类中实现这个方法
        override fun getPerson(ordinal: Int): EPerson {
            return EPerson.values()[ordinal]
        }
    },
    TEACHER(2) {
        override fun getPerson(ordinal: Int): EPerson {
            return EPerson.values()[ordinal]
        }
    }; // 这个分号是必须的

    abstract fun getPerson(ordinal: Int): EPerson
}

fun main(args: Array<String>) {
    val person = EPerson.STUDENT
    println("getPerson:${person.getPerson(1)}")
}