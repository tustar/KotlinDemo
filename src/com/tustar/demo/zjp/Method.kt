package com.tustar.demo.zjp

import java.util.concurrent.locks.Lock

/**
 * Created by tustar on 17-7-27.
 */

fun doSwim(sports: String = "do swim") {
    println(sports)
}

fun register(name: String, no: Int = 1001, sex: Int) {
    println("name: $name, no: $no, sex: $sex")
}

fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) {
        result.add(t)
    }
    return result
}

tailrec fun findFixPoint(x: Double = 1.0): Double
        = if (x == Math.cos(x)) x else findFixPoint(Math.cos(x))

fun findFixPoint(): Double {
    var x = 1.0
    while (true) {
        val y = Math.cos(x)
        if (x == y) return y
        x = y
    }
}

//fun toBeSynchronized() = sharedResource.operation()
//fun lock<T>(lock: Lock, body: () -> T): T {
//    lock.lock()
//    try {
//        return body()
//    } finally {
//        lock.unlock()
//    }
//}

fun main(args: Array<String>) {
    doSwim()
    doSwim("Just do it")
    println("--------------------")
    //
    register(sex = 0, name = "x")
    println("--------------------")
    //
    val a = asList(1, 2, 3)
    val list = asList(-1, 0, a, 4)
    println(a)
    println(list)
    println("--------------------")
    //
//    val result = lock(lock, ::toBeSynchronized)
}